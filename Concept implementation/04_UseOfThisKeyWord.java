
public class UseOfThisKeyWord{
    private String name;
    private int age;

    public void setName(String name){
           this.name = name ;
    }
    public void setAge(int age){
           this.age = age;
    }
    public static void main(String[] args){
        UseOfThisKeyWord obj = new UseOfThisKeyWord();
        obj.setName("ABC");
        obj.setAge(21);
        System.out.println("name is "+obj.name);
        System.out.println("name is "+obj.age);

    }   
}