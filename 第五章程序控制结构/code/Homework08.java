/**
 * 求出 1- 1/2 + 1/3 - 1/4...1/100的和
 * 思路分析
 * 1.化繁为简
 * 1) 分析:
 * 		a. 1/1 - 1/2 + 1/3 - 1/4 + ...- 1/100的和
 * 		+1/奇数 - 1/偶数
 * 		1-100的奇数和偶数怎么表示?
 * 		n = 1
 * 		2 * n , n <= 50, for循环
 * 		2 * n - 1,n <= 50
 * 		b. 求和
 * 		定义一个变量sum. 奇树+,偶数-.也可以用if-else判断奇数偶数,不用2i和2i - 1表示
 * 	2) 注意这里有一个重大bug,1/1 - 1/2 + 1/3 - 1/4 + ...- 1/100,如果直接用/的话,1/1等于1,后面都是0,所以这里要用1.0/才能得到精确小数
*/

public class Homework08 {

	// 编写一个main方法
	public static void main(String[] args) {
		double sum = 0;

		for (int i = 1; i <= 50; i++) {
			sum += 1.0/(2 * i - 1);
			sum -= 1.0/(2 * i);
		}
		System.out.println("总和为: " + sum);

	}

}
