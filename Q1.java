//反向显示一个整数

import java.util.Scanner;
import java.util.ArrayList;

public class Q1 {
	public static void main(String[] args) {
		System.out.println("请输入一个整数：");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		reverse(num);
	}
	
	public static void reverse(int number) {
		int num=0;
		while(number!=0) {
			num = num *10 + number%10;
			number /= 10;
		}
		System.out.println("该数的反序数为："+num);	
	}
}
