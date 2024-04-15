package com.learn.consistenthashing;

import java.nio.ByteBuffer;

public class UInt32 {

    private long value;

    public UInt32(long value) {
        this.value = long2UInt32(value);
    }

    public UInt32(byte[] bytes) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4).put(bytes);
        byteBuffer.position(0);
        this.value = byteBuffer.getLong();
    }

    public long getValue() {
        return this.value;
    }

    private long long2UInt32(long l) {
        return l & 0x00000000ffffffffL;
    }
}
