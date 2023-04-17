package com.lanan.api.cache;

/**
 * @author LanAn
 * @date 2022/9/24-14:01
 */
public interface ICacheEvict<K, V> {

    ICacheEntry<K, V> evict(ICacheEvictContext<K, V> context);
}
