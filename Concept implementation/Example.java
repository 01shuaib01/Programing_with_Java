import java.io.*;
public class Example{
    public static void main(String[] args){

    //     try {  
    //         // Creating an object of a file  
    //         File f0 = new File("D:FileOperationExample.txt");   
    //         if (f0.createNewFile()) {  
    //                    System.out.println("File " + f0.getName() + " is created successfully.");  
    //         } else {  
    //                    System.out.println("File is already exist in the directory.");  
    //         }  
    //       } catch (IOException exception) {  
    //                System.out.println("An unexpected error is occurred.");  
    //                exception.printStackTrace();  
    //    }  
    
    
    try{
        FileWriter obj = new FileWriter("D:myFile.txt");
        // if(obj.createNewFile()){
        //     System.out.println("created");
        // }
        // else{
        //     System.out.println("Already");
        // }
        obj.write("Hello World");
        obj.close();
    }
    catch(IOException e){
        System.out.println("Excepiton"+e.getMessage());
    }

    // File obj = new File("D:myFile.txt");
    // if(obj.exists()){
    //     System.out.println(obj.getName());
    //     System.out.println(obj.getAbsolutePath());
    //     System.out.println(obj.canWrite());
    //     System.out.println(obj.length());
    // }
    // else{
    //     System.out.println("not exist");
    // }
    }
}