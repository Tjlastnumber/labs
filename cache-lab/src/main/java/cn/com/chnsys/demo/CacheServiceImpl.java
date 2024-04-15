package cn.com.chnsys.demo;

import org.springframework.cache.annotation.Cacheable;

public class CacheServiceImpl implements WorkService {

    private final WorkService workService;

    public CacheServiceImpl(WorkService workService) {
        this.workService = workService;
    };

    @Override
    @Cacheable(cacheNames = "work", key = "#key")
    public String getName(String key) {
        return "cache success";
    }
}
