//求矩阵主对角线元素的和
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		double[][] a = new double[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=in.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(a));
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0.0; 
		for(int i=0;i<m.length;i++) {
			sum = sum+m[i][i];
		}
		return sum;
	}
}
