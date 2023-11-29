import java.io.*;
public class Deserial{
    public static void main(String[] args){

        try{

            FileInputStream fis = new FileInputStream("ob.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student = (Student)ois.readObject();
            
            // student.displayName();
            System.out.println("Name is "+student.getName());
            System.out.println("Age is "+student.getAge());

        }catch(IOException ex){
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }

    }
}