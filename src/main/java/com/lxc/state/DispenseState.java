package com.lxc.state;

/**
 * 发放奖品状态
 * @author Administrator
 *
 */
public class DispenseState extends State {

	 // 初始化是传入活动引用，发放奖品后改变其状态
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }
    
    //

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    //���Ž�Ʒ
    @Override
    public void dispensePrize() {
        if(activity.getCount() > 0){
            System.out.println("��ϲ�н���");
            // �ı�״̬Ϊ���ܳ齱
            activity.setState(activity.getNoRafflleState());
        }else{
            System.out.println("���ź�����Ʒ��������");
            // �ı�״̬Ϊ��Ʒ�������, �������ǾͲ����Գ齱
            activity.setState(activity.getDispensOutState());
            //System.out.println("�齱�����");
            //System.exit(0);
        }

    }
}
