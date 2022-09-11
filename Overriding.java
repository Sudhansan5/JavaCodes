
class Parent{
    void show(){
        System.out.println("inside Parent");

    }
    void parentMethod(){

        System.out.println("parent method");
    }
}
class Child extends Parent {
    @Override
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
        Child obj2=new Child();
        obj2.show();

    }
    }



