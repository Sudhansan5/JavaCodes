
class Parent{
    void show(){
        System.out.println("inside Parent");
    }
    void parentMethod(){
        System.out.println("parent method");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("Inside Child");
    }
    void childMethod(){
        System.out.println("child method");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Parent obj1=new Parent();
        Parent obj2 = new Child();
//        obj2.show();
        Child obj3= new Child();
        obj3.show();

    }
    }



