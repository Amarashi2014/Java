public class studentdata {
    class  Parent{
        int age ,id;
        String name;
        void naming(String name)
        {
             System.out.print("Name : " + name);
        }
    }
    class Child extends Parent
    {
        void ageN(int age)
        {
            System.out.println("Age of the student is  : " +age);

        }
    }
  
     public static void main(String [] args)
            {
                studentdata outer = new studentdata();
                Child s = outer.new Child();
                s.naming("Aashish");
                s.ageN(14);
            }
        
    
}
