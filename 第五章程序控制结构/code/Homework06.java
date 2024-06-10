/**
 * 输出1-100之间不能被5整除的数,每5个一行
 * 1. 化繁为简
 * 1) 先输出1-100的所有数,for循环
 * 2) 然后过滤出 不能被5整除的数 i % 5 != 0
 * 3) 每5个一行,使用int count 统计输出个数,当count % 5 == 0说吗输出了5个,这时,我们输出一个换行即可
 * 
 * 
*/

public class Homework06 {

	// 编写一个main方法
	public static void main(String[] args) {
		int count = 0; // 注意count需要定义在循环外,要不然每次都会被重置为0
		for (int i = 1; i <= 100; i++) {
			// 不能被5整除
			if (i % 5 != 0) {
				count++;
				System.out.print(i + "\t");//使用置表位对齐

				// 判断,每满5个就输出一个换行
				if (count % 5 == 0) {
					System.out.println(""); // 之前是count == 5,输出,这样还要重置count不方便
				}

			}
		}
	}

}
