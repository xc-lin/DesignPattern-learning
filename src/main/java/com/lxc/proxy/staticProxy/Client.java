package com.lxc.proxy.staticProxy;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDaoProxy(new TeacherDao());
        teacherDao.teach();
    }
}
