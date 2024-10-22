// TreeMap natural and custom sorting

package ac_lamdaexpressionswithcollections;

import java.util.TreeMap;

public class Test6 {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		m.put(100, "A");m.put(300, "C");
		m.put(200, "B");m.put(600, "D");
		System.out.println(m); //{100=A, 200=B, 300=C, 600=D}
		
		TreeMap<Integer, String> m1 = new TreeMap<Integer, String>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		m1.put(100, "A");m1.put(300, "C");
		m1.put(200, "B");m1.put(600, "D");
		System.out.println(m1); //{600=D, 300=C, 200=B, 100=A}
		
	}
}
