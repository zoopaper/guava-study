package org.guava.study.cache;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.Maps;
import org.guava.study.model.User;

import java.util.Map;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/4/2
 * Time: 15:59
 */
public class UserCacheLoader extends CacheLoader<Integer, User> {

    private static Map<Integer, User> map = Maps.newHashMap();

    static {

        for (int i = 1; i <= 100000; i++) {
            User user = new User();
            user.setUserId(i);
            user.setUserName("Name" + i);
            map.put(i, user);
        }

    }

    @Override
    public User load(Integer integer) throws Exception {
        System.out.println("load key="+integer);
        return map.get(integer);
    }


}
