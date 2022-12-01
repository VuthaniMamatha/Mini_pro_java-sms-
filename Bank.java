/*Create a Bank Management System( Console based mini project)*/
import java.util.*;
class Admin
{
    private String accno;
    private String name;
    private long balance;
    Scanner sc1=new Scanner(System.in);
    //method to open an account
    void openAccount()
    {
        System.out.println("Enter Account Number:");
         accno=sc1.next();//we can use next() or nextLine()
        System.out.println("Enter the Name:");
         name=sc1.next();
        System.out.println("Enter the Balance:");
        balance=sc1.nextLong();
    }
    //method to display account details
    void displayAccount()
    {
        System.out.println("*Displaying your details......*");
        System.out.println("--------------------------------");
        System.out.println("->Account Number :"+accno);
        System.out.println("->Name : "+name);
        System.out.println("->Balance : "+balance);
        
    }
    //method to deposit money
    void depositMoney()
    {
        System.out.println("Enter the amount to be deposited:");
        long deptamt=sc1.nextLong();
        balance=balance+deptamt;//adding deposited amount to the balance
    }
    //method to withdraw money
    void withdrawMoney()
    {
        System.out.println("Enter the amount to be withdrawn:");
        long wdamt=sc1.nextLong();
        if(wdamt>=balance)
        {
           System.out.println("INSUFFICIENT BALANCE!!!!!!!");
        }
        else
        {
           balance=balance-wdamt; 
        }
    }
    //method to search an account number
    boolean search(String acn)
    {
        if(accno.equals(acn))
        {
            displayAccount();
            return true;
        }
        return (false);
    }
}
public class Bank
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //create initial account
        System.out.println("How many customers:");
        int n=sc.nextInt();
        Admin C[]=new Admin[n];//5
        for(int i=0;i<C.length;i++)//12345
        {
            C[i]=new Admin();//C[0],C[1],C[2],C[3],C[4]
            C[i].openAccount();//accno,name,balance of 5 users
            
        }
        //run the loop until 5 is not pressed
        int ch;
        do
        { 
            System.out.println("Main Menu\n1.Display All\n2.Search by account\n3.Deposit\n4.Withdraw\n5.Exit");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();//Switch value
            switch(ch)
            {
                case 1:
                    for(int i=0;i<C.length;i++)
                    {
                        C[i].displayAccount();
                    }
                    break;
                case 2:
                    System.out.println("Enter account that have to search");
                    String acn=sc.next();
                    boolean found=false;
                    for(int i=0;i<C.length;i++)
                    {
                        found=C[i].search(acn);
                        if(found)
                        {
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Search failed!!");
                    }
                    break;
                    case 3:
                        System.out.println("Enter a/c number:");
                        acn=sc.next();
                        found=false;
                        for(int i=0;i<C.length;i++)
                        {
                            found=C[i].search(acn);
                            if(found)
                            {
                             C[i].depositMoney();
                             break;
                            }
                        }
                        if(!found)
                        {
                            System.out.println("Sorry..account doesnot exit!!!");
                        }
                        break;
                        case 4:
                        System.out.println("Enter a/c number:");
                        acn=sc.next();
                        found=false;
                        for(int i=0;i<C.length;i++)
                        {
                            found=C[i].search(acn);
                            if(found)
                            {
                             C[i].withdrawMoney();
                             break;
                            }
                        }
                        if(!found)
                        {
                            System.out.println("Sorry..account doesnot exit!!!");
                        }
                        break;
                        case 5:
                            System.out.println("Good bye!");
                            break;
                    }
        }while(ch!=0);
    }
}
