//School management system
import java.util.*;
class Admin
{
    public String schname="MOTHER THERESA SCHOOL";
    public String address="Palamaner";
    public int code=416508;
    //teachers details
    public String t1="Mr.Ramakrishna";
    public String s1="English";
    public String t2="Mr.Ramesh";
    public String s2="Mathematics";
    public String t3="Mrs.Sumathi";
    public String s3="Science";
    public String t4="Mr.Suresh";
    public String s4="Social Studies";
    //students details
    public String n1="Ravi";
    public String r1="1";
    public String n2="Hari";
    public String r2="2";
    public String n3="Suma";
    public String r3="3";
    public String n4="Nithesh";
    public String r4="4";
    public String n5="likitha";
    public String r5="5";
    //students percentages
    public float p1=90.6f;
    public float p2=87.4f;
    public float p3=89.5f;
    public float p4=85.9f;
    public float p5=95.0f;
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
        System.out.println(""+t1+" ==>"+s1);
        System.out.println(""+t2+"      ==>"+s2);
        System.out.println(""+t3+"    ==>"+s3);
        System.out.println(""+t4+"      ==>"+s4);
    }
    //method to view Student details
   
     void displayStudent()
    {
        System.out.println("\nDisplaying Students details.");
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
         System.out.println("NAME    RollNo");
         System.out.println("----    ------");
        System.out.println(""+n1+"     -->"+r1);
        System.out.println(""+n2+"     -->"+r2);
        System.out.println(""+n3+"     -->"+r3);
        System.out.println(""+n4+"  -->"+r4);
        System.out.println(""+n5+"  -->"+r5);
    }//method to view students percentages
     void displayStudentp()
    {
        System.out.println("\nDisplaying Students percentage");
        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
         System.out.println("NAME  PERCENTAGE");
         System.out.println("----  ----------");
        System.out.println(""+n1+"   -->"+p1);
        System.out.println(""+n2+"   -->"+p2);
        System.out.println(""+n3+"   -->"+p3);
        System.out.println(""+n4+"-->"+p4);
        System.out.println(""+n5+"-->"+p5);
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
            System.out.println("\n              ***MOTHER THERESA SCHOOL***\n1.Display School details\n2.School Timings\n3.Display faculty details\n4.Display Student details\n5.Students percentage\n6.Pay the fee\n7.Exit\n");
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
                    if(id>5)
                        System.out.println("Invalid ID!!!");
                    else
                     a.feeDetails();
                    break;
                case 7:
                    System.out.println("Exiting.......!");
                    break;
                    }
        }while(ch!=7);
    }
}
