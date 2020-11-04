//找出最小元素下标
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		System.out.println("请输入数组中的10个数字：");
		Scanner in = new Scanner(System.in);
		double[] numbers = new double[10];
		for(int i=0;i<numbers.length;i++) 
			numbers[i]=in.nextDouble();
		System.out.println("该数组中最小元素的下标为："+indexOfSmallestElement(numbers));
	}
	
	public static int indexOfSmallestElement(double[] array) {
		int j=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]< array[j]) 
				j=i;
		}
		return j;
	}
}
