import java.util.*;
class Example2{
    static boolean anagram(String str,String str2){
        if(str.length()!=str2.length())
            return false;
        
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i)!=str2.charAt(i))
                    return false;
            }
            return true;
    }
    public static void main(String[] args){
        String str = "hello";
        String str2 = "olleh";

        char []ch = str.toCharArray();
        char []ch2 = str2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        str = new String(ch);
        str2 = new String(ch2);

        // System.out.println(str);
        // System.out.println(str2);

        if(anagram(str,str2)){
            System.out.println("anagram");
        }
        else
        System.out.println(" not a anagram");

        boolean ans = Arrays.equals(ch,ch2);
        if(ans)
            System.out.println("anagram");
        else    
            System.out.println("not anagram");
    }
}