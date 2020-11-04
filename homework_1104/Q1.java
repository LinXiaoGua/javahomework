//9.3（使用日期类Date）
package 第三次作业;

import java.util.Date;

public class Q1 {
	public static void main(String[] args) {
		Date date = new Date();
		for(int i=0; i<8;i++) {
			long time = (long)(10000 * Math.pow(10, i));
			date.setTime(time);
			System.out.println(date.toString());
		}
	}
}

