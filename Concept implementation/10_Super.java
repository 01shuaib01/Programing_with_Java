
class A{
    int z;
     void f1(){
      
        System.out.println("A class method" + z);
    }
}

class B extends A{
    int z;
    void f1(){
        System.out.println(" B class Method "+z);
    }
    void f2(){
        int z;
        z = 2;
        this.z = 3;
        super.z = 7;

        super.f1();
       
    }
}

public class Super{
    public static void main(String[] args){
        System.out.println("Hello");
        B obj = new B();
        obj.f2();
    }
}