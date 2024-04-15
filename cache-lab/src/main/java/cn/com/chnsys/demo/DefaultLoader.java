package cn.com.chnsys.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultLoader {

    private final WorkService workService;

    public DefaultLoader(WorkService workService) {
        this.workService = workService;
        try {
            String val = load();
            System.out.println("val = " + val);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String load() throws InterruptedException {
        return workService.getName("01");
    }
}
