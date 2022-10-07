package bookstoreproject;
import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
//super class
public class Order {
    
//instance variables     
    public static int numOfOrders=0;
    protected String orderID;
    protected Date date_before = new Date (); 
    protected String date;
    protected ArrayList<Books> bookProducts = new ArrayList<> () ; 
    protected ArrayList<Magazines> magazineProducts = new ArrayList<> () ; 
    protected double totalPrice;   
    protected int numOfItems = bookProducts.size() + magazineProducts.size();
    protected final double VAT =0.15; 

  
         
    public Order(){
        numOfOrders++;
        orderID=String.valueOf(numOfOrders);
        this.date = date_before.toString();  
}

 

  
    
    public void setBooks ( Books books ) {
        this.bookProducts.add( books); 
     
 
    }
   
    public void getBooks(){
        System.out.println("\n\n\t \t Items: ");
                                
         System.out.println("\t\t ----------------------------------");
         System.out.println("\t\t ITEM ID     NAME            Price     ");
         System.out.println("\t\t ----------------------------------");
         
        for (Books i: bookProducts ){
            System.out.printf("\t \t  α%s     %s  %fSR" , i.itemID , i.title ,i.price ); 
            System.out.println("");  
        } 
    }

    public void setMagazine ( Magazines magazine  ){
          this.magazineProducts.add(magazine);
    }

    public void getMagazine(){
        for (Magazines i:magazineProducts) {    
            System.out.printf("\t \t  α%s     %s  %fSR" , i.itemID , i.title ,i.price ); 
            System.out.println("");  
        } 
    }

    public String getOrderID() {
        return orderID;
    }



    public String getDate() {
        
        return date;
    }

  

    public double calPrice() { 
       
       totalPrice = itemsPrice() * (1+VAT); 
               return totalPrice;
    }



//delete Book
    public void deleteBook(  int ID){
        boolean remove=false;
        Books b1= new Books ();
        Iterator<Books> itr= bookProducts.iterator();
        while(itr.hasNext()){
            b1=itr.next();
            if(ID==b1.itemID ){
                itr.remove(); 
             System.out.println("\n\t\tΠ Book: "+ b1.itemID +" has been Removed from the cart successfully.");
             remove=true;
             break;
        }}
        
        if(!remove)
         System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 
    }
    
    
    
    
    
    //delete mag
    public void deleteMagazine(  int ID){
        boolean remove=false;
        Magazines m1=new Magazines();
        Iterator<Magazines> itr= magazineProducts.iterator();
              while(itr.hasNext()){
            m1=itr.next();
            if(ID==m1.itemID ) {
                itr.remove();
             System.out.println("\n\t\tΠ Item: "+ m1.itemID +" has been Removed from the cart successfully.");
       remove=true;
        break;
     }}
        if(!remove)
         System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 
    }
    
    

    public int getNumOfItems() {
        numOfItems = bookProducts.size() + magazineProducts.size();
        return numOfItems;
    }

    
    public double getVAT() {
        
    
        double VAT1;
        double magazinesPrice =0.0;
        double booksPrice =0.0;
       
       for (Magazines i:magazineProducts)
             magazinesPrice= magazinesPrice +i.price;  
       
            for (Books i:bookProducts)
             booksPrice= booksPrice +i.price;  
       
       VAT1 = (booksPrice + magazinesPrice) * (VAT); 
               return VAT1;
               }

    
    
    public double itemsPrice() {
        double itemsPrice;
       double magazinesPrice =0.0;
       double booksPrice =0.0;
       
       for (Magazines i:magazineProducts)
             magazinesPrice= magazinesPrice +i.price;  
       
            for (Books i:bookProducts)
             booksPrice= booksPrice +i.price;  
       
       itemsPrice = (booksPrice + magazinesPrice) ; 
               return itemsPrice;
    }
}

//sub class
class Delivery extends Order {

private String street; 
    private String city;   
    protected  static final String DELIVERY_COMPANY= "ARAMX"; 
    private String  country; 
    private int postalCode;
    private String  deliveryID;
     protected final int DELIVERY_PRICE = 30; 

    public Delivery(String street, String city, String country, int postalCode,  String deliveryID) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
              this.deliveryID = deliveryID;
  }

    public Delivery() { 
    }

  

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

  

    public String getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }

  

    @Override
    public double calPrice() {

       
        totalPrice = (itemsPrice() * (1+VAT)) + DELIVERY_PRICE ; 
            return totalPrice ;
        }
   
}








class Pickup extends Order {
    
    
   public Pickup (){
      
       
   }

   public static void adreess ()
           
   {System.out.println("\n\n\t \t Pickup from Dammam, Al-Nakheel Mall, door 1");
   }
}





