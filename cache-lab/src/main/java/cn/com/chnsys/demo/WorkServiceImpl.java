package cn.com.chnsys.demo;

public class WorkServiceImpl implements WorkService {

    @Override
    public String getName(String key) throws InterruptedException {
        Thread.sleep(1_000);
        return "Work service cache test";
    }
}
