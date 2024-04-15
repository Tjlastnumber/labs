package com.learn.consistenthashing;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class ConsistentHash {
    private final SortedMap<Long, String> hashRing;
    private final List<String> nodeList;

    private static final long MOD = 1L << 32;
    private static final long MAX_SIZE = MOD - 1;
    private static final int MAX_VIRTUAL_NODES = 3;

    public ConsistentHash() {
        hashRing = new TreeMap<>();
        nodeList = new ArrayList<>();
    }

    public void addNode(String node) {
        for (int i = 0; i < MAX_VIRTUAL_NODES; ++i) {
            long hash = hash(node + "#" + i);
            hashRing.put(hash, node);
        }
        nodeList.add(node);
    }

    public void addNode(String node, int virtualNodeSize) {
        for (int i = 0; i < virtualNodeSize; ++i) {
            long hash = hash(node + "#" + i);
            hashRing.put(hash, node);
        }
        nodeList.add(node);
    }

    public void removeNode(String node) {
        for (int i = 0; i < MAX_VIRTUAL_NODES; ++i) {
            long hash = hash(node + "#" + i);
            hashRing.remove(hash);
        }
        nodeList.remove(node);
    }

    public String getNode(String key) {
        if (hashRing.isEmpty()) {
            return null;
        }
        long hash = hash(key);
        if (!hashRing.containsKey(hash)) {
            SortedMap<Long, String> tailMap = hashRing.tailMap(hash);
            hash = tailMap.isEmpty() ? hashRing.firstKey() : tailMap.firstKey();
        }
        return hashRing.get(hash);
    }

    public List<String> getNodes() {
        return nodeList;
    }

    public SortedMap<Long, String> getHashRing() {
        return hashRing;
    }

    private long hash(String node) {
        long hashCode = MurMurHash.hashcode(node);
        return getMod(hashCode);
    }

    private long getMod(long hash) {
        return hash % MOD;
    }
}
