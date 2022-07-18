package com.lxc.flyingWeight;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 网站工厂类
 */
public class WebsiteFactory {
    // 集合 充当池的作用
    private Map<String,ConcreteWebsite> pool =new HashMap<>();
    // 根据网站类型，返回一个网站，如果没有就创建一个网站
    public Website getWebsite(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    public int getWebsiteCount(){
        return pool.size();
    }
}
