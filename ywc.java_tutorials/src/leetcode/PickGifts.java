package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PickGifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =4;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> (b-a));
		maxHeap.addAll(Arrays.asList(25,64,9,4,100));
		
		while (k-- > 0) {
			 maxHeap.add((int) Math.floor(Math.sqrt(maxHeap.poll())));
		}
		
		long ans = 0; 
		
		while (maxHeap.size() > 0) {
			ans+=maxHeap.poll();
		}
		
		System.out.println(ans);
	}

}
