package medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
    	if(s==null || s.equals("")) return String.valueOf("");
    	
    	HashMap<Character, Integer> charMap = new HashMap<Character,Integer>();
    	
    	int maxValue=0;
    	for(int i=0;i<s.length();i++) {
    		if(charMap.containsKey(s.charAt(i))) {
    			Integer temp = charMap.get(s.charAt(i));
    			charMap.put(s.charAt(i), temp+1);
    			if(temp+1>maxValue) maxValue = temp+1;
    		}else {
    			charMap.put(s.charAt(i), 1);
    		}
    	}
    	if(maxValue==0) return s;
    	
    	StringBuffer stringBuffer = new StringBuffer();
    	    	
    	/*
    	 * great solution with priority queue 
    	 *
		PriorityQueue<Map.Entry<Character, Integer>> charPrioriyQueue = new PriorityQueue<>(
				new Comparator<Map.Entry<Character, Integer>>() {

					@Override
					public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
						return o2.getValue() - o1.getValue();
					}
				});
		charPrioriyQueue.addAll(charMap.entrySet());
		*/
    	
    	while(maxValue>0) {
    		Iterator<Map.Entry<Character, Integer>> it = charMap.entrySet().iterator();
    		while(it.hasNext()) {
    			Map.Entry<Character, Integer> curEntry = it.next();
    			if(curEntry.getValue()==maxValue)
    				for(int i=0;i<maxValue;i++) stringBuffer.append(curEntry.getKey());
    		}
    		maxValue--;
    	}
    	return stringBuffer.toString();
    }
    
    public static void main(String[] args) {
		SortCharactersByFrequency sortCharactersByFrequency = new SortCharactersByFrequency();
		System.out.println(sortCharactersByFrequency.frequencySort("tree"));
	}
}
