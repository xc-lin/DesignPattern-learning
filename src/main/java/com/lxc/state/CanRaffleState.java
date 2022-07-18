package com.lxc.state;

import java.util.Random;

/**
 * ���Գ齱��״̬
 * @author Administrator
 *
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //�Ѿ��۳��˻��֣������ٿ�
    @Override
    public void deductMoney() {
        System.out.println("已经扣过积分了");
    }

    //可以抽奖，根据实际修改状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖请稍等");
        Random r = new Random();
        int num = r.nextInt(10);
        // 10%�н�����
        if(num == 0){
            // �ı�״̬Ϊ���Ž�Ʒ context
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾没有抽中奖品");
            // �ı�״̬Ϊ���ܳ齱
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

    // ���ܷ��Ž�Ʒ
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
