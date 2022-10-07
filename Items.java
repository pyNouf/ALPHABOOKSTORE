package bookstoreproject;
public class Items {
    
//instance variables     
 String title;
private String publisher;
public int itemID;
private int publicationYear;
 double price;


public Items(){
    
}
public Items(String title, int itemID, String publisher, int publicationYear, double price){
this.title= title; this.itemID= itemID; this.publisher = publisher; this.publicationYear= publicationYear; this.price= price;
}


public String getpublisher() {
      return publisher;
   }

public int getpublicationYear() {
      return publicationYear;
   }





public void setpublisher(String publisher) {
      this.publisher= publisher;
   }

public void setpublicationYear(int publicationYear){
      this.publicationYear= publicationYear;
   }
      

}



//sub class 
class Magazines extends Items {

//instance variables 
private String productType;
private String editor;



    public Magazines( ) {
    }

    public Magazines(String productType, String editor, String title, String publisher, int itemID, int publicationYear, double price) {
        super(title, itemID, publisher, publicationYear, price);
        this.productType = productType;
        this.editor = editor;
    }


 public String getproductType() {
       return productType;
   }
 
public String geteditor() {
       return editor;
}

public void setproductType(String productType) {
       this.productType= productType;
   }

public void seteditor(String editor) {
    this.editor=editor;
    }
}




//sub class
class Books extends Items {

//instance variables 
private String isbn;
private String author;
private String publicationPlace;

public Books() {};

    public Books(String isbn,String author ,String publicationPlace , String title , String publisher, int itemID , int publicationYear , double price) {
        super(title, itemID, publisher, publicationYear, price);
        this.isbn = isbn;
        this.author = author;
        this.publicationPlace = publicationPlace;
    }



//methods

public String getisbn() {
       return isbn;
   }

public String getauthor() {
       return author;
   }

public String getpublicationPlace(){ 
    return publicationPlace; 
}

public void setisbn(String isbn){ 
    this.isbn=isbn;
}

public void setauthor(String author){ 
    this.author=author;
}

public void setpublicationPlace(String publicationPlace){ 
    this.publicationPlace=publicationPlace; 
}

}