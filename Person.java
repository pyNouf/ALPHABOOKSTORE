
package bookstoreproject;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

//super class 
public class Person {
public static Scanner input = new Scanner (System.in);    

    //instance variables 
    public String name;
    public String password;
    public String phoneNum;
    public String email;
    public String id;
    public static int numOfUsers;
    
    
    //methods 
    public Person(){}
     
    public Person(String name, String id, String email, String phoneNum, String password) {
        //method body
        
        this.name=name;
        this.id= id;
        this.email=email;
        this.phoneNum= phoneNum;
        this.password= password;
    }
}
    

    
//sub class    
class Customer extends Person{
   
   //instance variables 

public ArrayList <Order> customerOrder = new ArrayList()  ;
public int numOfOrders;

   //methods
   public Customer(){
       //method body 
   }
   


    public Customer(String name, String id, String email, String phoneNum, String password) {
        super(name, id, email, phoneNum, password);
 
    }

 
   
 public void setOrder( Order ord){
 
 customerOrder.add(ord);
  numOfOrders= customerOrder.size();
 }
 

 

}




//sub class
class Employee extends Person { 
    
   //instance variables  
   private final double SAL_PER_HOUR = 75;
   public int hoursWorked;

   
   //methods
   public Employee(){
   }



   public Employee (String name,String id, String email, String phoneNum, String password, int hoursWorked){
      
        super(name,id,email,phoneNum,password);
       this.hoursWorked= hoursWorked;
       
       
   }
   
   public double calcSalary (){
  
       double salary;
       salary= SAL_PER_HOUR * hoursWorked;
       return salary;
   }



}


//sub class 
class Manager extends Person { 

//instance variables 
   private final double SAL_PER_HOUR = 100;
   public int hoursWorked;

//methods 
   public Manager(){
   }
   

   public Manager (String name,String id, String email, String phoneNum, String password, int hoursWorked){
      
        super(name,id,email,phoneNum,password);
       this.hoursWorked= hoursWorked;
       
       
   }
    
   
   
   public double calcSalary (int hoursWorked){
       
       double salary;
       salary= SAL_PER_HOUR * hoursWorked;
       return salary;
   } 
   
}