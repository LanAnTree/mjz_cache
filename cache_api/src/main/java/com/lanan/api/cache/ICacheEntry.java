package com.lanan.api.cache;

/**
 * @author LanAn
 * @date 2022/9/24-14:02
 * @since 0.0.1
 * @param <K> key
 * @param <V> value
 */
public interface ICacheEntry<K, V> {

    /**
     * entry key
     **/
    K key();

    /**
     * entry value
     **/
    V value();
}
