package com.lxc.responsibilityChain;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public class ViceSchoolMasterHandler extends Handler {

    public ViceSchoolMasterHandler(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        System.out.println("请求id=" + purchaseRequest.getId() + "被" + this.name + "处理");
    }

    @Override
    public boolean support(PurchaseRequest purchaseRequest) {
        return purchaseRequest.getPrice() > 10000 && purchaseRequest.getPrice() <= 30000;
    }
}
