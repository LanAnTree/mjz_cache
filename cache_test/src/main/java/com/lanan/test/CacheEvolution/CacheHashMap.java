package com.lanan.test.CacheEvolution;

import com.lanan.test.Mapper.HashMapMapper;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 内存限制
 * @author LanAn
 * @date 2022/9/24-12:32
 */
public class CacheHashMap {
    private ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
    private HashMapMapper mapMapper;

    public String getVal(String name) {
        String val = map.get(name);
        if (val == null) {
            val = mapMapper.get(name);
            map.put(name, val);
        }
        return val;
    }
}
