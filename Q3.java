//统计一位数的个数
public class Q3 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		int[] counts = new int[10];
		int i = 0;
		for(i = 0;i<numbers.length;i++) {
			numbers[i] = (int)(Math.random()*10);
			System.out.print(numbers[i]+" ");
			counts[numbers[i]]++;
		}
		System.out.println(" ");
		for(int j = 0;j<counts.length;j++)
			System.out.printf("数字%d在数组中出现了%d次\n",j,counts[j]);
	}
}
