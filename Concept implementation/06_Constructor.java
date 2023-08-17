// t is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method that is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.

//  two types of constructor
    //  1. default constructor
    //  2. parameterized constructor

public class Constructor{
    private int a;

    //  1. default constructor
    Constructor(){
        System.out.println("default constructor");
    }

    //  2. parameterized constructor
    Constructor(int a){
        this.a = a;
    }

    public static void main(String[] args){
        Constructor obj = new Constructor();
        Constructor obj2 = new Constructor(10);     // pasing value in constructor
        System.out.println("value of parameterized constructor "+obj2.a);   

    }
}