package com.lxc.responsibilityChain;

/**
 * @author Frank_lin
 * @date 2022/7/18
 */
public abstract class Handler {

    // 下一个处理者
    Handler handler;
    String name;

    public Handler(String name) {
        this.name = name;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    // 处理审批请求的方法，得到一个请求，处理事子类完成，因此该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public void process(PurchaseRequest purchaseRequest) {
        if (support(purchaseRequest)) {
            processRequest(purchaseRequest);
        }else {
            handler.process(purchaseRequest);
        }
    }


    public abstract boolean support(PurchaseRequest purchaseRequest);

}
