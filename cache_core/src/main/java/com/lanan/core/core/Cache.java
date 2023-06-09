package com.lanan.core.core;

import com.lanan.api.cache.ICache;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author LanAn
 * @date 2022/9/24-14:14
 */
public class Cache<K, V> implements ICache<K, V> {

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        return ICache.super.getOrDefault(key, defaultValue);
    }

    @Override
    public void forEach(BiConsumer<? super K, ? super V> action) {
        ICache.super.forEach(action);
    }

    @Override
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
        ICache.super.replaceAll(function);
    }

    @Override
    public V putIfAbsent(K key, V value) {
        return ICache.super.putIfAbsent(key, value);
    }

    @Override
    public boolean remove(Object key, Object value) {
        return ICache.super.remove(key, value);
    }

    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        return ICache.super.replace(key, oldValue, newValue);
    }

    @Override
    public V replace(K key, V value) {
        return ICache.super.replace(key, value);
    }

    @Override
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        return ICache.super.computeIfAbsent(key, mappingFunction);
    }

    @Override
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return ICache.super.computeIfPresent(key, remappingFunction);
    }

    @Override
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return ICache.super.compute(key, remappingFunction);
    }

    @Override
    public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        return ICache.super.merge(key, value, remappingFunction);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
