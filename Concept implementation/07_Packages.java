// make 2 files 
// command of compile these files : javac -d . Student.java (same for example file)
//  for run this file : java pack1.Example


// file1
package pack2;|
public class Student{
    private int rollno;
    private String name;
    public void setRollno(int r)
        { rollno=r; }
    public void setName(String n)
    { name=n; }
    public int getRollno()
    { return (rollno); }
    public String getName()
    { return (name); }
}



// file 2
package pack1;
import pack2. Student;
public class Example{
public static void main(String [] args){
    Student sl-new Student ();
    s1.setRollno (100);
    s1.setName("Saurabh");
    System.out.println("Rool No: "+s1.getRollno());
    system.out.println("Name: "+s1.getName());
    }
}