package com.lxc.state;

/**
 * ��Ʒ�������״̬
 * ˵����������activity �ı�� DispenseOutState�� �齱�����
 * @author Administrator
 *
 */
public class DispenseOutState extends State {

	// ��ʼ��ʱ��������
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("奖品发放完了，请下次在参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完了，请下次在参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完了，请下次在参加");
    }
}
