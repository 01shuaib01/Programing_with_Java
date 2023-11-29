import java.io.*;
public class Serial{
    public static void main(String[] args){
       
        try{
             // create object of student
        Student student  = new Student("Shuaib",23);

        //Write data to file
        FileOutputStream fos = new FileOutputStream("ob.txt");

        //Conversion byte stream
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //How to serialize
        oos.writeObject(student);

        oos.close();
        fos.close();

        System.out.println("Object state is transfered to ob");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}