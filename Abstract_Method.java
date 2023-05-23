abstract class Parent{
    public Parent(){
        System.out.println("i am constructor of Parent class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
}
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("i m gud");
    }

}
public class Abstract_Method {
    public static void main(String[] args) {
//        Parent p = new Parent();
        Child1 c1 = new Child1();
//        Child2 c2 = new Child2();

        }
    }

