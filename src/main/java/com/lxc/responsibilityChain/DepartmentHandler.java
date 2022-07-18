package com.lxc.responsibilityChain;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public class DepartmentHandler extends Handler{

    public DepartmentHandler(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()<=5000){
            System.out.println("请求id="+purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            handler.processRequest(purchaseRequest);
        }
    }
}
