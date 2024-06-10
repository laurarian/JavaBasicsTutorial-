/**
 * 判断一个整数是否为水仙花数.三位数,其各个位上数字立方和等于其本身. 153 = 1*1*1 + 3*3*3 + 5*5*5
 * 1. 化繁为简
 * 1) 判断是不是三位数
 * 	定义一个number, 100 <= number < 999
 * 2) 各个位上的数的立方和等于其本身
 * 	a) 各个位上的数
 * 		百位 hundred = (number / 100)
 * 		十位 ten = (number % 100) / 10
 * 		个位 unit = number % 10 
 *  b) 立方和 == 本身
 * 		cubeSum = (unit * unit * unit) + (ten * ten * ten) + (hundred * hundred * hundred) == number
*/
import java.util.Scanner;
public class Homework04 {

	// 编写一个main方法
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输出一个整数: ");
		int number = myScanner.nextInt();

		// 提取各个位上的数
		int unit = number % 10 ;
		int ten = (number % 100) / 10;
		int hundred = (number / 100);

		// 立方和 == 本身
		int cubeSum = (unit * unit * unit) + (ten * ten * ten) + (hundred * hundred * hundred);

		if (cubeSum == number) {
			System.out.println(number + " 是一个水仙花数");
		} else {
			System.out.println(number + " 不是一个水仙花数");
		}

	}

}
