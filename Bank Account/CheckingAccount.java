//Rand,1911336.stu@uj.edu.sa,(10889),(C1)
package Bank;

public class CheckingAccount extends Account {
  //declare variables
    private String CardNo;
    //constructor
   public CheckingAccount(String Name, String AccountType,double Amount,String CardNo){
   super(Name,AccountType,Amount);
   this.CardNo=CardNo;}
   
   //4 methodes
   public String set_CardNo(String CardNo){
       return this.CardNo=CardNo;} 
   
   public double withdraw(double Amount){
       if (Amount<0.0)throw new IllegalArgumentException("Amount must be >0.0");
       double variable = super.get_Amount();
      
      return variable-=Amount ;
     }
   
   public String get_CardNo(){return CardNo;} 
   
   @Override
   public String printInfo(){
return super.printInfo()+"\nCarnNo:"+get_CardNo();}
   
    
    
    
    
    
    
    
    
    
}
