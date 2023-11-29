import java.io.*;
// implements Serializable
public class Student implements Serializable{
    private String Name;
    // private int age;
    transient private int age;

    public Student(String Name,int age){
        this.Name = Name;
        this.age = age;
    }


    public String getName(){
        return Name;
    }
    public int getAge(){
        return age;
    }

    public void displayName(){
        System.out.println("hi my Name is "+this.Name);
    }

}