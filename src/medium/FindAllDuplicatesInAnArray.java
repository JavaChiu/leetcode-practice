package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
//    public List<Integer> findDuplicates(int[] nums) {
//        Arrays.sort(nums);
//        List<Integer> returnList = new LinkedList<Integer>();
//        for(int i=1;i<nums.length;i++)
//            if(nums[i]==nums[i-1]) returnList.add(nums[i]);
//        return returnList;
//    }
    
    /*
     * online solution with the criteria that input array value between 1 ≤ a[i] ≤ n
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
       if(nums == null)
           return result;
       for(int i=0; i<nums.length; i++){
           int location = Math.abs(nums[i])-1;
           if(nums[location] < 0){
               result.add(Math.abs(nums[i]));
           }else{
               nums[location] = -nums[location];
           }
       }
       for(int i=0; i<nums.length; i++)
           nums[i] = Math.abs(nums[i]);
      
       return result;
   }    
    
    public static void main(String[] args) {
        FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();
        List<Integer> list = findAllDuplicatesInAnArray.findDuplicates(new int[]{4,3,2,7,100,2,3,1});
        for(Integer i:list) System.out.println(i);
    }
}
