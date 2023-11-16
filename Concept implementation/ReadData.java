import java.util.*;
import java.io.*;

class ReadData {  
    public static void main(String[] args)throws IOException {  
        // try {  
            // Create f1 object of the file to read data  
            File f1 = new File("D:shuaib1.txt");    
            Scanner dataReader = new Scanner(f1);  
            String fileData="";
            while (dataReader.hasNextLine()) {  
                 fileData = dataReader.nextLine();  
                // if(Character.isDigit(fileData)) 
            }
            int sum = 0;
            for(int i = 0;i<fileData.length();i++){
                char ch = fileData.charAt(i);
                if(Character.isDigit(ch)){
                    sum = sum+Character.getNumericValue(ch);
                }
                    
            }  
            System.out.println(sum);
            
            dataReader.close();  
        // } catch (FileNotFoundException exception) {  
        //     System.out.println("Unexcpected error occurred!");  
        //     exception.printStackTrace();  
        // }  
    }  
}  