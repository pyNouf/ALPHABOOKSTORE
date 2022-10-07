package bookstoreproject;
import static bookstoreproject.BookStoreProject.Input;
import static bookstoreproject.BookStoreProject.InputLong;
import java.util.Scanner; 
public class Payment{
       
//instance variables     
private String paymentType;

private Order order;
Scanner input = new Scanner(System.in);
 

//methods 
public Payment() {

    }

    public Payment(Order order) {
             this.order = order;
    }

 

public  void bill(Order order) {
       System.out.println("\n\n\t \tα Order Date: "+ order.getDate());
       System.out.println("\t \tα Order ID: "+ order.getOrderID());
       order.getBooks();
       order.getMagazine();
       System.out.println("\n\t \tα Number of Items: " + order.getNumOfItems());
       System.out.println("\t \tα Item Price =" + order.itemsPrice());
       System.out.println("\t \tα VAT =" + order.getVAT());
       System.out.println("\t \tα Total Price =" + order.calPrice());   
}

    public String getPaymentType() {
        return paymentType;
    }

    
    
    
    public void setPaymentType( int paymentType) {
        boolean cradNumberDigit=false;
        boolean dayDigit=false;
        boolean yearDigit=false;
        boolean cvvDigit=false;
        
        if(paymentType==1){
          
        this.paymentType = "Cash";
        System.out.println("\n\t \t  Dear Customer, your order has been approved with cash payment type."); 
        System.out.println("\t \t  Dear Customer To pick up your Order go to our Bookstore after 30min from order approvel");
        System.out.println("\t \t  Address: Dammam,  Al-Nakheel Mall, door 1 || OPEN 24/7 ");
        System.out.println("\t \tα Thank you for choosing ALPHA bookstore.");}
        
        if(paymentType==2){
        this.paymentType = "Visa";
        
        do{
            System.out.print("\n\t \t  Card Number: ");
             long cardNum=InputLong(); 
             
                         
             if ( String.valueOf(cardNum).length()== 16)
             cradNumberDigit=true;
             
            System.out.print("\n\t \t  Expiry Data: "); 
            System.out.print("\n\t \t  MM: "); 
            int day=Input();
            if (String.valueOf(day).length()==2)
             dayDigit=true;
            
            System.out.print("\t \t  YY: ");
            int year=Input();
            if (String.valueOf(year).length()==2)
             yearDigit=true;
            
            System.out.print("\n\t \t  CVV Code: ");
            int cvv=Input();
            if (String.valueOf(cvv).length()==3)
             cvvDigit=true;
            
            if(!cradNumberDigit || !dayDigit || !yearDigit || !cvvDigit)
                System.out.println("\n\t \tΨ Dear Customer VISA info you entered is invalid. Please try again! \n\n\n");
        }
        while(!cradNumberDigit || !dayDigit || !yearDigit || !cvvDigit);
        System.out.println("\n\t \t  Dear Customer, your order has been approved with VISA payment type."); 
        System.out.println("\t \tα Thank you for choosing ALPHA bookstore.");
    }
    }
        

    
}
