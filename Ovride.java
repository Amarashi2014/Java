
class Parent{
    public void sayHello(){
        System.out.println("Hello from Parent");
    }
    }
class Child extends Parent{
    @Override
    public void sayHello(){
        System.out.println("Hello from Child");
    }
    } 
public class Ovride
    {
    public static void main(String[] args)
    {
        Parent p = new Child();
        //Parent p = new Parent();
        p.sayHello(); // This will call the overridden method in Child
    }
    }

