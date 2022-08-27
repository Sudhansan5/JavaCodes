import java.util.ArrayList;
import java.util.Arrays;

public class Recursion {
    int arr[]={1,2,3,4,5};
    String name;

    ArrayList<Integer> arrayList= new ArrayList<Integer>(Arrays.asList(1,2,3));
    int n = arrayList.size();

    public void setName(String name) {
        this.name = name;
    }

    void printOneToN(int i, int n){
        if(i==n){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printOneToN(i+1,n);
        return;
    }
    void printNToOne(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNToOne(n-1);
        return;
    }

    int sumOfN(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfN(n-1);
    }

    void reverseArray(int l,int r){
        if(l>r){
            return;
        }
        int temp;
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverseArray(l+1,r-1);
    }

    boolean palindrome(int l,int r){
       if(l>=r){
           return true;
       }
       if(name.charAt(l)!=name.charAt(r)){
           return false;
       }
       return palindrome(l+1,r-1);

    }

    void printSubsequence(int i, ArrayList<Integer> arrList){
        if(i==n){
            System.out.println(arrList);
            return;
        }

        arrList.add(arrayList.get(i));
        printSubsequence(i+1,arrList);
        arrList.remove(arrList.size()-1);
        printSubsequence(i+1,arrList);

    }


    public static void main(String[] args) {
       Recursion r= new Recursion();
//        r.printOneToN(1,5);
        System.out.println();
//        r.printNToOne(10);
//        int sum=r.sumOfN(5);
//        System.out.println(sum);


//        r.reverseArray(0,r.arr.length-1);  // reverse array
//        for (int val:r.arr) {
//            System.out.println(val);
//        }
//        String name="madam";     // palindrome
//        r.setName(name);
//        System.out.println( r.palindrome(0,name.length()-1));
//        System.out.println();
        ArrayList<Integer> arrList= new ArrayList<>();
          r.printSubsequence(0,arrList);
    }
}
