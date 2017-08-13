package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 * Input:
 *   [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 * Output:
 *   [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */
public class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
    	Arrays.sort(people, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]!=o2[0]?-o1[0]+o2[0]:o1[1]-o2[1];
			}    		
		});  
    	List<int[]> peopleList = new LinkedList<int[]>();
    	for(int[] person:people) peopleList.add(person[1], person);
        return peopleList.toArray(new int[people.length][]);
    }
    
    public static void main(String[] args) {
		QueueReconstructionByHeight queueReconstructionByHeight = new QueueReconstructionByHeight();
		int[][] people = new int[][] {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		queueReconstructionByHeight.reconstructQueue(people);
		for(int[] person:people) System.out.println("["+person[0]+","+person[1]+"]");
	}
}
