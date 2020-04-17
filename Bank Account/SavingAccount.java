//Rand,1911336.stu@uj.edu.sa,(10889),(C1)
package Bank;

public class SavingAccount extends Account {
    //declare variable
    private String SerialNo;
    
public SavingAccount(String Name, String AccountType,double Amount,String SerialNo){
    super(Name,AccountType,Amount);
    this.SerialNo=SerialNo;}   
        
//write 3 methods
public String set_SerialNo(String SerialNo){
   return this.SerialNo=SerialNo;}

public String get_SerialNo(){ return SerialNo;}

@Override
public String printInfo(){
return super.printInfo()+ "\nSerial:"+get_SerialNo();}
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
