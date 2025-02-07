package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateSquare {

	public static void main(String[] args) {
		Map<Double, ArrayList<int[]>> map = new HashMap<Double, ArrayList<int[]>>();
		List<int[]> points = new ArrayList<int[]>();
		points.add(new int[] {2,3});
		points.add(new int[] {6,3});
		points.add(new int[] {6,7});
		points.add(new int[] {2,7});
		
		for(int i=0; i<points.size(); i++) {
			for(int j = i+1; j <points.size(); j++) {
				double d = Math.sqrt( Math.pow(points.get(j)[0] - points.get(i)[0],2) + Math.pow( points.get(j)[1] - points.get(i)[1],2));
				if (d > 0) {
					if (!map.containsKey(d)) {
						map.put(d, new ArrayList<int[]>());
						map.get(d).add(points.get(i));
						map.get(d).add(points.get(j));
					} else {
						continue;
					}
				}
			}
		}
		if(map.size() == 2 ) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
