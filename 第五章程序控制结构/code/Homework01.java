/**
某人有100,000元,每经过一次路口,需要缴费.规则如下:
1) 当现金>50000时,每次交5%
2) 当现金<=50000时,每次交1000
编程计算该人可以经过多少次路口,要求:使用while break方式完成
*/

/*
思路分析:
1. 化繁为简:
1) 定义金额money = 100,000表示现在还剩多少钱;定义number = 0表示经过的次数
2) 根据题的要求,我们分析出三种情况
	money > 50000
	money >= 1000 && money <= 50000
	money < 1000
3) 使用多分支,if-elseif-else
4) while + break(money < 1000),同时使用一个变量count来保存通过路口

*/

public class Homework01 {

	// 编写一个main方法
	public static void main(String[] args) {
		double money = 100000;
		int count = 0;

		while (true) { // 无限循环
			if (money > 50000) {
				money -= money * 0.05;
				count++;
			} else if (money >= 1000) {
				money -= 1000;
				count++;
			} else { // 钱不够1000
				break;
			}
		}
		System.out.println("该人可以经过的路口次数为: " + count + "次");
		System.out.println("还剩: " + money);
	}

}
