/**
 * 判断一个年份是否为闰年
 * 1. 化繁为简
 * 1) 定义一个Scanner,接受输入的变量为year
 * 2) 满足闰年的条件:
 * 	year 可以被4整除但是不能被100整除
 * 	year可以被100整除同时可以被400整除?
*/
import java.util.Scanner;
public class Homework03 {

	// 方法用于判断年份是否为闰年
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	// 编写一个main方法
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入一个年份: ");
		int year = myScanner.nextInt();

		// 检查该年份是否为闰年并输出结果
        if (isLeapYear(year)) {
            System.out.println(year + " 是闰年");
        } else {
            System.out.println(year + " 不是闰年");
        }

        // 关闭Scanner对象
        myScanner.close();



	}

}
