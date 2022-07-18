package com.lxc.responsibilityChain;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 200, 1);
        DepartmentHandler departmentHandler = new DepartmentHandler("张主任");
        CollegeHandler collegeHandler = new CollegeHandler("李院长");
        ViceSchoolMasterHandler viceSchoolMasterHandler = new ViceSchoolMasterHandler("王副校长");
        SchoolMasterHandler schoolMasterHandler = new SchoolMasterHandler("校长");

        // 将各个审批的级别的人设置好 (处理人构成环形)
        departmentHandler.setHandler(collegeHandler);
        collegeHandler.setHandler(viceSchoolMasterHandler);
        viceSchoolMasterHandler.setHandler(schoolMasterHandler);
        schoolMasterHandler.setHandler(departmentHandler);

        departmentHandler.process(purchaseRequest);
    }
}
