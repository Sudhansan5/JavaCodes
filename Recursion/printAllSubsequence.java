package Recursion;

import java.util.ArrayList;
import java.util.List;

public class printAllSubsequence {
    // print all subsequences
     List<Integer> list= new ArrayList<Integer>();
     void printSubsequence(int index,List<Integer> newList){
        if (index>=list.size()){
            System.out.println(newList);
            return;
        }
        newList.add(list.get(index));
        printSubsequence(index+1,newList);
        newList.remove(newList.size()-1);
        printSubsequence(index+1,newList);
    }

     boolean printOneSubsequence(int index,List<Integer> newList,int sum,int currSum){
         // print any subsequence with sum==k
         if(index>=list.size()){
             if(currSum==sum){
                 System.out.println(newList);
                 return true;
             }
              return false;
         }
         newList.add(list.get(index));
         currSum+=list.get(index);
         if(printOneSubsequence(index+1,newList,sum,currSum)){
             return true;
         }
         newList.remove(newList.size()-1);
         currSum-=list.get(index);
         if(printOneSubsequence(index+1,newList,sum,currSum)){
             return true;
         }
         return false;
     }

     int subsequenceCount(int index,List<Integer> newList,int sum,int currSum){
         // count of subsequence with sum==k
         if(index>= list.size()){
             if(currSum==sum){
                 return 1;
             }
             else return 0;
         }
         newList.add(list.get(index));
         currSum+=list.get(index);
         int left = subsequenceCount(index+1,newList,sum,currSum);

         newList.remove(newList.size()-1);
         currSum-=list.get(index);
         int right=subsequenceCount(index+1,newList,sum,currSum);

         return left+right;
     }
    public static void main(String[] args) {
        printAllSubsequence obj= new printAllSubsequence();

        obj.list.add(1);
        obj.list.add(2);
        obj.list.add(3);
        List<Integer> newList= new ArrayList<Integer>();
//        obj.printSubsequence(0,newList);  // print all subsequences
//        System.out.println(obj.printOneSubsequence(0,newList,5,0));  // print any subsequence with sum==k

        System.out.println(obj.subsequenceCount(0,newList,3,0));   // count of subsequence with sum==k
    }
}
