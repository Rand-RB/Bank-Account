//Rand,1911336.stu@uj.edu.sa,(10889),(C1)
package Bank;
import java.util.ArrayList;
import java.util.Scanner;
public class TestAplication {

    public static void main(String[] args) {
   
System.out.println("--------------------Configuration: <Default>--------------------\n");
//creating a saving account for "Ahmad" with 10,000$ and print account info 
Account Ahmad=new SavingAccount ("Ahmad","Saving",10000,"43");
System.out.print(Ahmad.printInfo());
System.out.println("\n=====================================\n\n");

//deposit 50000 to ahmad account.and print account info
Ahmad.deposit(50000);
//"Account Information after depositing:
System.out.print("Account Information after depositing: 50000\n"+Ahmad.printInfo());
System.out.println("\n=====================================\n\n");

//creating a checking account for "Ali" with 20,000$
//printing the information of the checking account of Ali
CheckingAccount Ali=new CheckingAccount ("Ali","Checking",20000,"0021");
System.out.print(Ali.printInfo());
System.out.println("\n=====================================\n\n");
//Deposite 70000 to Ali account and print account information
Ali.deposit(70000);
System.out.print("Account Information after depositing: 70000\n"+Ali.printInfo());
//withdraw(3000) from Ali account and print account information
Ali.withdraw(3000);
Ali.set_Amount ( Ali.get_Amount() - 3000 );
System.out.println("\n=====================================");
System.out.print("=====================================\n Account Information after withdrawal: 3000\n"+Ali.printInfo());
System.out.println("\n=====================================\n\n");

//creating a checking account for "Mona" with 15,000
Account Mona=new CheckingAccount ("Mona","Checking",15000,"0033");
System.out.print(Mona.printInfo());
System.out.println("\n=====================================");
//printing the information of the saving account done befor

System.out.println("++++++++++++++++++++++++++++++++++++++++++ \n"
        + "Printing Information for all Objects in the ArrayList:");
//Create an ArrayList of Account
ArrayList<Account>AccountList=new ArrayList<>();
// Add the accounts of Ahmad, Ali and Mona to the ArrayList check the ArrayList
AccountList.add(Ahmad);
AccountList.add(Ali);
AccountList.add(Mona);
/*Add a new SavingAccount object for "Lama" with an amount of 1500$ and serialNo 64 to the
ArrayList*/
AccountList.add(new SavingAccount("Lama","saving",1500,"64"));

/*Add a new SavingsAccount object for “Amani” with an amount of 1500$ and serialNo 55 to
the ArrayList*/
AccountList.add(new SavingAccount("Amani","saving",1500,"55"));

//Print all objects in the ArrayList using the "print" method
for(Account A:AccountList){
   
     System.out.println(A.printInfo()+"\n\n");     
}
System.out.println("++++++++++++++++++++++++++++++++++++++++++ \n"
        + "=====================================\n\n");

  //Withdraw 100$ from all checking accounts. 
Ali.withdraw(100);
Ali.set_Amount ( Ali.get_Amount() - 100);
System.out.print(" Account Information after withdrawal: 100\n"+Ali.printInfo());
((CheckingAccount)Mona).withdraw(100);
Mona.set_Amount ( Mona.get_Amount() - 100);
System.out.print("\n=====================================\n==========================================\n\n"
        + "Account Information after withdrawal: 100\n"+Mona.printInfo());

checking(3000,AccountList);
report(AccountList);
}
    
/* Create Static method in the TestApplication class to check the availability of clients by its ID
and aske the user if he want check about the availability*/
    
 public static void checking(int ID,ArrayList<Account>AccountList){
      Scanner enter=new Scanner(System.in);  
System.out.println("\n=============================================\n"
        + "=======================================================\n do you want to check the availability of client ID? (y \\ n)");
char value=enter.next().charAt(0);
if(value=='y'||value=='Y'){
    System.out.println("enter ID to check about availability:");
    ID=enter.nextInt();
     switch(ID){
     case 3000: System.out.println(AccountList.get(0).printInfo()+"\n");break;
     case 3001:System.out.println(AccountList.get(1).printInfo()+"\n");break;
     case 3002:System.out.println(AccountList.get(2).printInfo()+"\n");break;
     case 3003:System.out.println(AccountList.get(3).printInfo()+"\n");break;
     case 3004:System.out.println(AccountList.get(4).printInfo()+"\n");break;
     default:System.out.println("Wrong entry");}}}








 /*Create Static method in the TestApplication class to make report about the clients depending on
their account type (Make menu for the user as in the sample output) and aske the user if he
want to print the report or not.*/

    public static void report(ArrayList<Account>AccountList){
     Scanner enter=new Scanner(System.in);
     System.out.println("\n==========================================\n"
             + "==================================================\n"
             + "do you want to make report about the clinets?(y \\ n)\n");
 char value2=enter.next().charAt(0);
 if(value2=='y'||value2=='Y'){
    System.out.println("Which clints do you want to print\n1-saving account clients\n" +
"2-chacking account clients\n");
 int num=enter.nextInt();
 if(num==1){System.out.println(AccountList.get(0).printInfo());
 System.out.println(AccountList.get(3).printInfo()+"\n");
 System.out.println(AccountList.get(4).printInfo()+"\n");}
else if(num==2){
    System.out.println(AccountList.get(1).printInfo()+"\n");
    System.out.println(AccountList.get(2).printInfo()+"\n");}
          
 else {System.out.print("wrong entry");}   }
System.out.println("Process completed.");}        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
