package com.lxc.state;

/**
 * ״̬ģʽ������
 * @author Administrator
 *
 */

/**
 * 对象有很多状态，状态模式相互转换，对不同状态有不同行为的时候，可以考虑使用状态模式
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建活动，奖品一个
        RaffleActivity activity = new RaffleActivity(1);

        //
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // �μӳ齱����һ������۳�����
            activity.debuctMoney();

            // �ڶ����齱
            activity.raffle();
        }
	}

}
