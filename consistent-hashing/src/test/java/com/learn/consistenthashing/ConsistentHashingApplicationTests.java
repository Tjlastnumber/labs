package com.learn.consistenthashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.function.Function;

public class ConsistentHashingApplicationTests {

    @Test
    public void test() {
        long maxValue = (1L << 32) - 1;
        System.out.println("maxValue = " + maxValue);

        long overflow = 1L << 32;
        System.out.println("overflow = " + overflow);

        BigInteger bigInteger = BigInteger.valueOf(maxValue);
        System.out.println("bigInteger = " + bigInteger);

        BigInteger bigInteger1 = BigInteger.valueOf(overflow);
        System.out.println("bigInteger1 = " + bigInteger1);

        Function<Long, Long> uInt32 = (Long l) -> l & 0x00000000ffffffffL;
        System.out.println("uInt32.apply(overflow) = " + uInt32.apply(overflow + 1));

        Assertions.assertEquals(uInt32.apply(overflow + 1), (overflow + 1) % overflow);
    }


    @Test
    public void shortTest() {
        byte[] bytes = new byte[]{-64, -88, 1, 1};
        ByteBuffer buffer = ByteBuffer.allocate(4).put(bytes);
        buffer.position(0);
        short s = buffer.getShort();
        System.out.println("s = " + s);
    }

    @Test
    public void ipv4Test() throws UnknownHostException {
        // 获取本机IP地址
        String ipAddress = "192.168.1.1";
        InetAddress localHost = Inet4Address.getByName(ipAddress);
        String host = localHost.getHostAddress();
        byte[] address = localHost.getAddress();
        Function<byte[], Long> bytes2Int = (byte[] bytes) -> {
            long result = 0L;
            for (byte b : bytes) {
                result = (result << 8) | (b & 0xFF);
            }
            return result;
        };
        long ipv4Int = bytes2Int.apply(address);

        System.out.println("bytes = " + Arrays.toString(address));
        System.out.println("address = " + host);
        System.out.println("ipv4Int = " + ipv4Int);
        System.out.println("uInt32(ipv4Int) = " + uInt32(ipv4Int));
        System.out.println("hash1.1 = " + uInt32("192.168.1.1#1a".hashCode()));
        System.out.println("hash1.2 = " + uInt32("192.168.1.1#2b".hashCode()));
        System.out.println("hash1.3 = " + uInt32("192.168.1.1#3c".hashCode()));
        System.out.println("hash3 = " + uInt32("192.168.2.1#1a".hashCode()));
        System.out.println("hash4 = " + uInt32("192.168.2.1#2b".hashCode()));
        System.out.println("hash5 = " + uInt32("192.168.3.1#1a".hashCode()));
        System.out.println("hash6 = " + uInt32("192.168.3.1#2b".hashCode()));
    }

    private long uInt32(long l) {
        return l & 0x00000000ffffffffL;
    }

    private long uInt32(byte[] bytes) {
        return uInt32(bytes, 0);
    }

    private short uInt32(byte[] bytes, int offset) {
        ByteBuffer buffer = ByteBuffer.allocate(4).put(bytes);
        buffer.position(offset);
        return buffer.getShort();
    }

    @Test
    public void binary2IntTest() {
        String binaryString = "11000000";
        int decimalNumber = Short.parseShort(binaryString, 2);
        System.out.println("Decimal representation: " + decimalNumber);
    }

    @Test
    public void int2Binary() {
        int decimalNumber = 192;
        String binaryString = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary representation: " + binaryString);
    }
}
