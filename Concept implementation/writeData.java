
import java.io.*;

public class Ex{
    public static void main(String[] args)throws IOException{

        // try{
        //     File obj = new File("D:hello2.txt");
        //     if(obj.createNewFile()){
        //         System.out.println("file created ");
        //     }
        //     else{
        //         System.out.println("Already Created");
        //     }
        // }catch(IOException e){
        //     System.out.println("Exception"+e.getMessage());
        // }

        // FileWriter obj = new File("D:hello2.txt");
        // if(obj.exists()){
        //     System.out.println(obj.getName());
        //     System.out.println(obj.getAbsolutePath());
        //     System.out.println(obj.canWrite());
        //     System.out.println(obj.length());
        // }
        // else{
        //     System.out.println("not exist");
        // }

        // try{
        //     FileWriter obj = new FileWriter("D:myFile3.txt");
        //     // if(obj.createNewFile()){
        //     //     System.out.println("created");
        //     // }
        //     // else{
        //     //     System.out.println("Already");
        //     // }
        //     obj.write("Hello World");
        //     obj.close();
            
        // }
        // catch(IOException e){
        //     System.out.println("Excepiton"+e.getMessage());
        // }


        //  FileWriter obj = new File("D:hello2.txt");
        // if(obj.exists()){
        //     System.out.println(obj.getName());
        //     System.out.println(obj.getAbsolutePath());
        //     System.out.println(obj.canWrite());
        //     System.out.println(obj.length());
        // }
        // else{
        //     System.out.println("not exist");
        // }
        
        // File obj = new File("D:hello2.txt");
        // System.out.println(obj.getName());
        // System.out.println(obj.getAbsolutePath());
        // System.out.println(obj.canWrite());
        // System.out.println(obj.length());

        // File obj = new File("D:shuaib.txt");
        // obj.createNewFile();
        // System.out.println("Exist "+obj.exists());
        // System.out.println("length "+obj.length());
        
        // System.out.println("length "+obj.getName());
        // System.out.println("length "+obj.getAbsolutePath());

        FileOutputStream obj = new FileOutputStream("D:shuaib.txt",true);
        String s = " shuaib";

        char ch[] = s.toCharArray();
        for(int i = 0;i<ch.length;i++)
            obj.write(ch[i]);
        obj.close();

        // FileWriter obj = new FileWriter("D:shuaib.txt");
        // obj.write(" Bhai");
        // obj.close();

    }
}
