package com.lanan.test.Mapper;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * FIFO
 *  - 特性：先进先出
 *  - 机制：每次淘汰最先进来的
 *  - 缺点：命中率降低，热点数据位于第一个，仍然会被淘汰
 * LRU
 *  - 特性：最近最少使用
 *  - 机制：每次淘汰队首，每次被访问的存放队尾
 *  - 缺点：无法处理时间段，热点数据突然一段时间没访问，将可能置于队首，仍然会被淘汰
 * LFU
 *  - 特性：最近最少使用频率
 *  - 机制：开辟额外空间记录每个key使用频率，删除频率最低的
 *  - 缺点：FIFO -> LRU -> LFU  命中率越高，实现成本越高
 *
 *  synchronized 过于笨重
 * @author LanAn
 * @date 2022/9/24-13:16
 */
public class LRUMap extends LinkedHashMap<Object, Object> {
    private final int max;
    private final Object lock;

    public LRUMap(int max, Object lock) {
        super((int) (max * 1.4f), 0.75f, true);
        this.max = max;
        this.lock = lock;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Object, Object> eldest) {
        return size() > max;
    }

    public Object getVal(Object key) {
        synchronized (lock) {
            return get(key);
        }
    }

    public void putVal(Object key, Object value) {
        synchronized (lock) {
            put(key, value);
        }
    }

    public boolean removeVal(Object key) {
        synchronized (lock) {
            return remove(key) != null;
        }
    }

    public boolean removeAll(Object key) {
        clear();
        return true;
    }
}
