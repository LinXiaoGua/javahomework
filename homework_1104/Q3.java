//13.3（排序ArrayList）
package 第三次作业;
import java.util.ArrayList;

public class Q3 {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Number>();
		list.add(1);
		list.add(16);
		list.add(10);
		list.add(8);
		list.add(9);
		sort(list);
	}
	
	public static void sort(ArrayList<Number> list) {
		for(int i=0; i<list.size(); i++) {
			Number min = list.get(i);
			
			for(int j=i+1; j<list.size();j++) {
				if(list.get(j).doubleValue() < min.doubleValue()) {
					Number n;
					n = min;
					min = list.get(j);
					list.set(j, n);
					list.set(i,min);
				}
			}
		}
		System.out.println(list);
	}
}
