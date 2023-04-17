package com.lanan.api.cache;

/**
 * @author LanAn
 * @date 2022/9/24-14:06
 * @since 0.0.1
 * @param <K> key
 * @param <V> value
 */
public interface ICacheEvictContext<K, V> {

    /**
     * 新增 key
     **/
    K key();

    /**
     * 缓存方式
     **/
    ICache<K, V> cache();

    /**
     * 占用容量
     **/
    int size();
}
