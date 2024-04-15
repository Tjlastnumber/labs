package cn.com.chnsys.demo;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.Collections;

@EnableCaching
@SpringBootApplication
@Import(DefaultLoader.class)
public class CacheLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheLabApplication.class, args);
    }

    @Bean
    public CacheManager cacheManager() {
        SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
        simpleCacheManager.setCaches(Collections.singleton(new CaffeineCache("work",
                Caffeine.newBuilder()
                        .recordStats()
                        .build())));
        return simpleCacheManager;
    }

    @Bean
    public WorkService workService() {
        return new CacheServiceImpl(new WorkServiceImpl());
    }

}
