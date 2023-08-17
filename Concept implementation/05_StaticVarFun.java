
class Example{
    // we have static member variable and member function

    private String name;     // instance variable
    private static String last_name; // static variable

    public void fun()    //  instance member function    
    {
     // some code    
    }

    public static void fun2()    // static member function
    {
         // some code
    }
}

public class StaticVarFun{
    public static void main(String[] args){
        Example obj = new Example();
        Example obj2 = new Example();
        
        Example.last_name = "abc";  //initialize values in static variable
        Example.fun2();     // calling static function
    }   
}