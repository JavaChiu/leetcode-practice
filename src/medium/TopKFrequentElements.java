package medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
    	HashMap<Integer,Integer> numberMap = new HashMap<>();
    	for(int i:nums) { 
    		numberMap.put(i, numberMap.get(i)==null?1:numberMap.get(i)+1);
    	}
    	
    	PriorityQueue<Map.Entry<Integer, Integer>> numberPQ = new PriorityQueue<>(new Comparator<Map.Entry<Integer,Integer>>(    			
    			) {
					@Override
					public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
						return o2.getValue()-o1.getValue();
					}
		});
    	
    	numberPQ.addAll(numberMap.entrySet());
    	
    	
    	LinkedList<Integer> res = new LinkedList<>();
    	for(int i=0;i<k;i++) {
    		res.add(numberPQ.poll().getKey());
    	}
    	
    	return res;
    }
	
	public static void main(String[] args) {
		TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
		List<Integer> testList = topKFrequentElements.topKFrequent(new int[] {1,1,1,2,2,3}, 3);
		for(int i:testList) {
			System.out.println(i);
		}
	}
}
