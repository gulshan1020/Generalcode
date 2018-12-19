package mypack1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Sorttest {

	public static void main(String args[]){
        int a[] = {2,3,4,2,8,1,1,2};
        
        System.out.println("Before Sorting");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }
        
        manipulateArray(a);
        
        System.out.println("\nAfter Sorting");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }
    }

    static int[] manipulateArray(int[] inputArray) {
         Map<Integer, Integer> map = new TreeMap<> ();
        
       /* Logic to place the elements to Map */
       for(int i=0; i<inputArray.length; i++){
           if(map.get(inputArray[i]) == null){
               map.put(inputArray[i], 1);
            }
           else{
               int frequency = map.get(inputArray[i]);
               map.put(inputArray[i], frequency+1);
           }
       }
       
       //System.out.println(map);
       
       List list = new LinkedList(map.entrySet());
       
       /* Sort the list elements based on frequency */
       Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object obj1, Object obj2) {
               return ((Comparable) ((Map.Entry) (obj1)).getValue())
                  .compareTo(((Map.Entry) (obj2)).getValue());
            }
       });

         int count=0;
       
       /* Place the elements in to the array based on frequency */
       for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            
            int key = (int)entry.getKey();
            int val = (int)entry.getValue();
            
            for(int i=0; i < val; i++){
                inputArray[count] = key;
                count++;
            }            
       } 
    }

}
