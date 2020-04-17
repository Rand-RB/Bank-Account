//Rand,1911336.stu@uj.edu.sa,(10889),(C1)
package Bank;
 import java.util.ArrayList;

public class Account{ 
 // declare variables 
 private String AccountType;  
 private  String Name;
 private  double  Amount; 
 private  long ID=2999;
 private static int count=0;
 
 //<constructor
 public Account(String Name, String AccountType,double Amount){
     this.Name=Name;
     this.AccountType=AccountType;
     if (Amount<0.0)throw new IllegalArgumentException("Amount must be >0.0");
     this.Amount=Amount;
     count++;
    ID=ID+count;

    
 }
 
 
 
 

 
 
 
 
 
 //7 methods of the class
 public double deposit(double Amount){
     if (Amount<0.0)throw new IllegalArgumentException("Amount must be >0.0");
     return this.Amount+=Amount; }
 
 public String get_Name(){return Name;}
 public String get_AccountType(){return AccountType;}
 public long get_ID(){return ID;} 
     
 public double set_Amount(double Amount){
   if (Amount<0.0)throw new IllegalArgumentException("Amount must be >0.0"); 
   this.Amount=Amount;
   return Amount;}
 
public double get_Amount(){return Amount;} 
 

//@Override
  public String printInfo(){
return 
       "Name:"+get_Name()+"\nID:"+get_ID()+"\nAccount Type:"+get_AccountType()+
        "\nAmount:"+get_Amount();}
 
 
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
