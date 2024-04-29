package com.labs;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class SseEmitterController {

    private Map<String, SseEmitter> emitters = new ConcurrentHashMap<>();

    @GetMapping(value = "/process", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter sseEmitter() {
        SseEmitter emitter = new SseEmitter();
        emitter.onCompletion(() -> emitters.remove(emitter));
        emitter.onTimeout(() -> emitters.remove(emitter));
        emitter.onError(e -> emitters.remove(emitter));
        emitters.put(emitter.toString(), emitter);
        return emitter;
    }

    public void send(String message) {
        emitters.values().forEach(emitter -> {
            try {
                emitter.send(SseEmitter.event().data(message));
            } catch (IOException e) {
                emitter.completeWithError(e);
                throw new RuntimeException(e);
            }
        });
    }

}
