package com.lxc.proxy.staticProxy;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target ;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.target = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");
        target.teach();
        System.out.println("代理结束");
    }
}
