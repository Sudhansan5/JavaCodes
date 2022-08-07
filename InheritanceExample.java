class A{
    static int id=5;
    void display(){
        System.out.println("Inside A");
    }
    void printData(){
        System.out.println("Print A");
    }
}

class B extends A{

    void display() {
//        super.display();
        System.out.println("Inside B");
    }
}

class C extends B{

    void display() {

        System.out.println("Inside C");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        A a =new B();
        B b=new B();
        a.display();

    }
}