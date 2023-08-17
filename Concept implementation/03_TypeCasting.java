
public class UseOfThisKeyWord{
    public static void main(String[] args){
        //  1. Widening Conversion or implicit Conversion
        int a = 5;
        double num = a;
        
        System.out.println("value of num is "+num);

        // 2. Narrowing Conversion or Explicit Conversion
        double d = 10.5;
        int n = (int)d;
        System.out.println("value of num is "+num);
    }   
}