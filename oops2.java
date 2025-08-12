public class oops2 {
 static class Counter{
       int number = 10;

        void increment(){
            number=number+1;

    }
  }
 public static void main(String[] args){
   Counter obj1 =new Counter();
    Counter obj2 = new Counter();
    Counter obj3= new Counter();
    obj1.increment();
    obj2.increment();
    obj3.increment(); 
    
    System.out.print(obj1.number);
    System.out.print(obj2.number);
    System.out.print(obj3.number);
  }

}
