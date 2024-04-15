package cn.com.chnsys.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheType;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCache;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.cache.Cache.ValueWrapper;

@SpringBootTest
@AutoConfigureCache(cacheProvider = CacheType.CAFFEINE)
class CacheLabApplicationTests {

    private final WorkService workService;

    private final CaffeineCache cache;


    CacheLabApplicationTests(@Autowired WorkService workService, @Autowired CacheManager cacheManager) {
        this.workService = workService;
        this.cache = (CaffeineCache) cacheManager.getCache("work");
    }

    @Test
    void cacheTest() throws InterruptedException {
        String name = this.workService.getName("01");
        assertThat(name).isNotNull();
        ValueWrapper valueWrapper = this.cache.get("01");
        assertThat(valueWrapper).isNotNull();
        assertThat(valueWrapper.get()).isInstanceOf(String.class);
        System.out.println("stats = " + cache.getNativeCache().stats());
    }

}
