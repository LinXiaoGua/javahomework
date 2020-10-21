//显示0和1构成的矩阵
import java.util.Random;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		System.out.println("请输入矩阵边长：");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		Random r = new Random();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(r.nextInt(2)+" ");
			}
			System.out.println(" ");
		}
	}
}
