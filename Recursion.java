public class Recursion {
   void printOneToN(int i,int n){
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
    public static void main(String[] args) {
       Recursion r= new Recursion();
//        r.printOneToN(1,5);
        System.out.println();
//        r.printNToOne(10);
        int sum=r.sumOfN(5);
        System.out.println(sum);
    }
}
