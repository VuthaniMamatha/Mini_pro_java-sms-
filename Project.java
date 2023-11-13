//School management system
import java.util.*;
class Admin
{
    public String schname="SARADHA VIJAY SCHOOL";
    public String address="BANGARUPALYAM";
    public int code=517416;
    //teachers details
	public String[] teachers={"Mr.Ramakrishna","Mr.Ramesh","Mrs.Sumathi","Mr.Suresh"};
	public String[] subjects={"English","Mathematics","Science","Social Studies"};
    //students details
	public String students[]={"Ravi","Hari","Suma","Nithesh","Likhitha"};
	public int[] rolls={101,102,103,104,105};
    //students percentages
	public float[] gpa={90.6f,79.8f,90.0f,55.5f,98.0f};
    //fee details
    public int tf=10000;
    public int bf=8000;
    public int hf=12000;
    Scanner sc1=new Scanner(System.in);
    //method to display school details
    void displaySchool()
    {
        System.out.println("\nDisplaying School details");
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        System.out.println("\n********"+schname);
        System.out.println("\t"+address);
        System.out.println("\t"+code+"*********\n\n");
   }
    //method to display school timings
    void timing()
    {   System.out.println("\nTimings.");
        System.out.println("*=*=*=*=*");
        System.out.println("Start at==> 9.00AM");
        System.out.println("Clasess ==>09.30AM-11.00AM");
        System.out.println("Break   ==>11.00AM-11>15AM");
        System.out.println("Lunch   ==> 1.00PM- 2.00PM");
        System.out.println("Break   ==> 3.30PM- 3.40PM");
        System.out.println("Ends at ==>4.30PM");
    }
    //method to display teachers details
    void displayTeacher()
    {
        System.out.println("\nDisplaying Teachers details");
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
         System.out.println("NAME           SUBJECT");
         System.out.println("----           ------");
        System.out.println(""+teachers[0]+" ==>"+subjects[0]+"\n"+teachers[1]+"      ==>"+subjects[1]+"\n"+teachers[2]+"    ==>"+subjects[2]+"\n"+teachers[3]+"      ==>"+subjects[3]);
    }
    //method to view Student details
   
     void displayStudent()
    {
        System.out.println("\nDisplaying Students details.");
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
         System.out.println("NAME    RollNo");
         System.out.println("----    ------");
        System.out.println(""+students[0]+"     -->"+rolls[0]+"\n"+students[1]+"     -->"+rolls[1]+"\n"+students[2]+"     -->"+rolls[2]+"\n"+students[3]+"  -->"+rolls[3]+"\n"+students[4]+"  -->"+rolls[4]);
    }//method to view students percentages
     void displayStudentp()
    {
        System.out.println("\nDisplaying Students percentage");
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
         System.out.println("NAME  PERCENTAGE");
         System.out.println("----  ----------");
        System.out.println(""+students[0]+"   -->"+gpa[0]+"\n"+students[1]+"   -->"+gpa[1]+"\n"+students[2]+"   -->"+gpa[2]+"\n"+students[3]+"-->"+gpa[3]+"\n"+students[4]+"-->"+gpa[4]);
    }
    //method to view fee details 
    void feeDetails()
    {  
        System.out.println("Type of Student(if dayscholar--type->ds....if hosteller type-->h)");
        String s=sc1.nextLine();//if dayscholar--type->ds....if hosteller type-->h
        switch(s)
        {
            case "ds"://dayscholar
                System.out.println("Tuition fee = "+tf);
                System.out.println("Bus fee = "+bf);
                System.out.printf("The fees to be paid by the student is Rs.%d\n",(tf+bf));
                break;
            case "h"://hosteller
                System.out.println("Tuition fee = "+tf);
                System.out.println("Enter hostel fee = "+hf);
                System.out.printf("The fees to be paid by the student is Rs.%d\n",(tf+hf));
                break;
        }
    }
    
}
public class Project
{
    public static void main(String args[])
    {   Admin a=new Admin();
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        { 
            System.out.println("\n              ***SARADHA VIJAY SCHOOL***\n1.Display School details\n2.School Timings\n3.Display faculty details\n4.Display Student details\n5.Students percentage\n6.Pay the fee\n7.Exit\n");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();//Switch value
            switch(ch)
            {
                case 1:
                    a.displaySchool();
                    break;
                case 2:
                    a.timing();
                    break;
                case 3:
                    a.displayTeacher();
                    break;
                case 4:
                    a.displayStudent();
                    break;
                case 5:
                    a.displayStudentp();
                    break;
                case 6:
                    System.out.println("Enter the id no:");
                    int id=sc.nextInt();
                    if(id<101 || id>105)
                        System.out.println("Invalid ID!!!");
                    else
                     a.feeDetails();
                    break;
                case 7:
                    System.out.println("Thanks for visiting.......!");
                    break;
                    }
        }while(ch!=7);
    }
}
