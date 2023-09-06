
import java.util.*;
import java.lang.*;

class Example5{
    public static void main(String[] args){
        // System.out.println("Hello");

        // String str = "shuaib";
        // int arr[] = {5,4,3,2,1};
        // Arrays.sort(arr);
        // for(int ele : arr)
        //     System.out.println(ele);

        // char []ch = str.toCharArray();

        // for(int i = 0;i<ch.length;i++)
        //     System.out.println(ch[i]);

        // Arrays.sort(ch);

        // str = new String(ch);
        // System.out.println(str);

        // String str = "Hello geeks";
        // String str2 = "Hello geeks";
        // String str3 = "Hello geeks";
        // String s = new String("Hello geeks");
        // System.out.println(str.length());
        // System.out.println(str.indexOf('l'));
        // System.out.println(str.indexOf('l',3));
        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());

        // System.out.println(str.equals(str2));
        // System.out.println(str.equals(str3));
        // System.out.println(str==str3);
        // System.out.println(str==s);
        // System.out.println(str.equals(s));

        // for(int i = 0;i<str.length();i++)
        //     System.out.println(str.charAt(i));

        String s = "shuaib1234Hello15";
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                count++;
            }
        }
        System.out.println(count);



    }
}