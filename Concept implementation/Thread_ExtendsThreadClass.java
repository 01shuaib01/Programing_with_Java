
class A extends Thread{
    public void run(){
        int i;
        for(i = 0;i<10;i++)
            System.out.println("Thread A->"+i);
    }
}

class B extends Thread{
    public void run(){
        int i;
        for(i = 0;i<10;i++)
            System.out.println("Thread B->"+i);
    }
}

public class Example{
    public static void main(String[] args){
        A obj = new A();
        B obj2 = new B();

        obj.start();
        obj2.start();
    }
}