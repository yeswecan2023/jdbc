package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortMainClass {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(5);
		num.add(60);
		num.add(1);
		
		Collections.sort(num);
		
		System.out.println(num);
		
		Comparator<Integer> com = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer i, Integer j) {
				
				if (i%10 > j%10) {
					return 1;
				} else {
					return -1;
				}
				
				
			}
		};
		
		List<Integer> newNum = new ArrayList<Integer>();
		newNum.add(534);
		newNum.add(531);
		newNum.add(60);
		newNum.add(113);
		Collections.sort(newNum,com);
		System.out.println(newNum);

	}

}
