/**
 * 输出小写的a-z以及大写的Z-A
 * 1. 化繁为简
 * 1) 定义两个变量char1,char2表示输出的字符
 * 2) 小写的a-z
 *  a) 我们知道char的本质是ascii码,所以a+1=b,依此类推,+23=z,for循环输出
 *  b) 大写的Z-A,同理,Z - 1 = Y,Z - 23 = A,for循环输出
*/

public class Homework07 {

	// 编写一个main方法
	public static void main(String[] args) {
		char char1 = 'a';

		for (;char1 <= 'z'; char1++) { // 注意for循环的初始化和变量迭代可以写在其他地方,但两边的分号不能省略
			System.out.print(char1 + "");
		}

		System.out.println("");

		char char2 = 'Z';
		for (;char2 >= 'A'; char2--) {
			System.out.print(char2 + "");			
		}
		System.out.println("");
	}

}
