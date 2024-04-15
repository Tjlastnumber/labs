package com.learn.consistenthashing;

import org.junit.jupiter.api.Test;

import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

class ConsistentHashTest {
    Formatter formatter = new Formatter(System.out);

    @Test
    public void test() {
        Map<String, Integer> distribution = new HashMap<>();
        ConsistentHash consistentHash = new ConsistentHash();
        for (int i = 0; i < 90; ++i) {
            consistentHash.addNode("192.168.0." + i, 32);
        }

        for (int i = 0; i < 90_0000; i++) {
            String key = "key#" + i;
            if (!distribution.containsKey(consistentHash.getNode(key))) {
                distribution.put(consistentHash.getNode(key), 1);
            }
            distribution.put(consistentHash.getNode(key),
                    distribution.get(consistentHash.getNode(key)) + 1);
        }

        formatter.format("%-15s %-10s\n", "Node", "Count"); // 输出表头
        formatter.format("%-15s %-10s\n", "----------", "----------");
        distribution.forEach((k, v) -> formatter.format("%-15s %-10s\n", k, v)); // 输出结果

        int min = distribution.values().stream().min(Integer::compareTo).orElse(0); // 获取最小值
        int max = distribution.values().stream().max(Integer::compareTo).orElse(0); // 获取最大值
        Double[] d = distribution.values().stream().map(Integer::doubleValue).toArray(Double[]::new);
        double v = calculateVariance(d); // 计算方差
        double s = Math.sqrt(v); // 计算标准差
        double mean = calculateMean(d); // 计算均值

        System.out.println("================================");

        formatter.format("%-10s %-10s %-20s %-20s %-10s\n", "min", "max", "σ^2", "σ", "mean");
        formatter.format("%-10s %-10s %-20s %-20s %-10s\n", "----------", "----------", "----------", "----------", "----------");
        formatter.format("%-10s %-10s %-20s %-20s %-10s\n", min, max, v, s, mean);
    }

    public static double calculateVariance(Double[] data) {
        // Step 1: 计算均值
        double mean = calculateMean(data);

        // Step 2: 对每个数据点与均值的差值求平方
        double sumSquaredDifferences = 0;
        for (double value : data) {
            double difference = value - mean;
            sumSquaredDifferences += difference * difference;
        }

        // Step 3: 将平方值求平均值，得到方差

        return sumSquaredDifferences / data.length;
    }

    private static double calculateMean(Double[] data) {
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        return sum / data.length;
    }
}
