package com.lxc.flyingWeight;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */

/**
 * 内部状态 可以作为成员变量
 * 外部状态 方法内部的临时变量
 *
 * 需要缓冲池的场景
 */
public class Client {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();
        Website website = websiteFactory.getWebsite("新闻");
        website.use(new User("1"));

        Website website2 = websiteFactory.getWebsite("博客");
        website2.use(new User("2"));

        Website website3 = websiteFactory.getWebsite("博客");
        website3.use(new User("3"));

        System.out.println(websiteFactory.getWebsiteCount());
    }
}
