package org.guava.study.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LoadingCache;
import org.guava.study.model.User;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/4/2
 * Time: 15:55
 */
public class DataService {

    public static void main(String[] args) {

        LoadingCache<Integer, User> cache = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .build(new UserCacheLoader());


        try {
            cache.get(2);
            cache.get(1);
            cache.get(3);
            cache.getUnchecked(22);
            cache.get(10010);

            cache.get(2);
            cache.get(2);
            cache.get(2);
            long cacheSize = cache.size();
            CacheStats cs = cache.stats();
            ConcurrentMap<Integer, User> total = cache.asMap();
            System.out.println(cacheSize);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


}
