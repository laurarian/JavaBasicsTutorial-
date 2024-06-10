/**
 * 求1+ (1+2) + (1+2+3) + (1+2+3+4)+...(1+2+4+..+100)的结果
 * 思路分析
 * 1.化繁为简
 * a) 分析式子
 * 有多少层? 100层 - 外层for循环
 * 每层组成? 
 * 		第1层: 1
 * 		第2层: 1+2
 * 		第3层: 1+2+3 
 * 		第n层: 1+2+...+j - 内层for循环遍历没个数,直到i
 * 		...
 * 		第100项: 1+2+...+100
 * b) 求和
 * 	定义一个sum = 0
 *  定义一个levelSum表示每层和
*/

public class Homework09 {

	// 编写一个main方法
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {// i正好是当前项的最后一个数
            int levelSum = 0;
            for (int j = 1; j <= i; j++) { // 内层循环对1-i进行循环
                levelSum += j;
            }
            sum += levelSum;
		}
		System.out.println("总和为: " + sum);
	}

}
