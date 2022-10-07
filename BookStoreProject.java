package bookstoreproject;
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Iterator;



public class BookStoreProject {
    
    public static String userinput;
    static ArrayList<Books> book= new ArrayList<>();
    static  ArrayList<Magazines> magazines= new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       
        ArrayList<Manager> mang= new ArrayList<>();
        mang.add( new Manager("Noura","220321" , "Noura@gmail.com" , "0501874983" , "N333", 8));
         mang.add( new Manager("Refan","220666" , "Refan@gmail.com" , "0505478965" , "Ref222", 8));
        
        ArrayList<Employee> emp= new ArrayList<>();
        emp.add(new Employee("Ahmed", "221038","ahmed@hotmail.com", "0507835697","A1234",9));
        emp.add(new Employee("Asma", "221763","asma@hotmail.com", "0509735678","asma2",4));
        emp.add( new Employee("Sara","221432" , "Sara@hotmail.com" , "067843456789" , "S543", 12));
        
        
        ArrayList<Customer> cust= new ArrayList<>();
        cust.add(new Customer("warda", "Warda1", "warda@hotmail.com", "0506748935", "Warda123"));
       cust.add(new Customer("Abdulaziz", "azoz3", "Abdulaziz@hotmail.com", "0506162712", "azoz321"));
       cust.add(new Customer("Susan", "Susan_3", "Susan@hotmail.com", "0506748935", "3728229"));
       cust.add(new Customer("Saleh", "Saleh44", "Saleh@hotmail.com", "0506748935", "ser22"));
       
        
        book.add(new Books("92647562235", "Oprah Winfrey", "London UK" ,"what i know for sure"  , "Pan MacMillan", 1 , 2015 , 91.02));
        book.add(new Books("92271653421", "Eckhart Tolle", "London UK" ,"A new earth"  , "Penguin Books Ltd", 2 , 2009 , 87.41));        
        book.add(new Books("12266352416", "Oli Doyle", "London UK" ,"Mindful relationships "  , "Orion publishing Co", 3 , 2019 , 67.82));
        book.add(new Books("76255534251", "Eckhart Tolle", "London UK" ,"The power of now"  , "New world library", 4 , 2004 , 73.41));
        book.add(new Books("44336251738", "Mind", "London UK" ,"Take a moment"  , "Micheal O'Mara Books Ltd", 5 , 2019 , 74.14));
        
        magazines.add(new Magazines("living", "Martha Stewart" , "meatless" , " Random House USA Inc" , 6 , 2013 , 118.48));
        magazines.add(new Magazines("living", "Irene Smit" , "Creativity takes courage" , "Work man publishing" , 7 , 2018 , 111.31));
        magazines.add(new Magazines("Fashion", "Kristie Clements" , "The vogue factor" , "Chronicle Books (CA)" , 8 , 2014 , 63.57));
        magazines.add(new Magazines("Art", "editors to do magazine" , "New guide to coloring " , " Design originals" , 9 ,2016  ,87.42 ));
        
      
        int user;
        int ch ; 
        boolean access= false; 
         

        
        System.out.println("\t\t \t----------------------------------------------");
        System.out.println("\t\t \t          WELCOME TO ALPHA BOOKSTORE");
        System.out.println("\t\t \t----------------------------------------------");
        System.out.println("\t\n\n\n");
        
      do{  
        System.out.println("\n\n\t \t  Dear user, \n\t \t  From the list below, choose what you represent for alpha Bookstore:"); 
        System.out.println("\n\t \tα 1- I'm a Manager in ALPHA Bookstore.");
        System.out.println("\t \tα 2- I'm a Employee in ALPHA Bookstore.");
        System.out.println("\t \tα 3- I'm a Customer in ALPHA Bookstore.");
        System.out.println("\t \tα 999- To Exit.");
        user=userInput(); 
      
        
        
        
switch (user){
    
  //Manger
    case 1: {
             System.out.print("\n\t \tΔ Enter your ID: ");
             String id=input.next();
             System.out.print("\t \tΔ Enter your Password: ");
             String pass=input.next();
             
             

        for (Manager i : mang){

            
            if(i.id.equalsIgnoreCase(id) && i.password.equals(pass))
             {  
             access=true; 
                        
            
               
               do {
                    System.out.println("\n\n\t \t  Hi Manager "+ i.name+"!");
                    System.out.println("\t \t  Dear Manager, Pleas Choose a Number From the List Below:");
                    System.out.println("\t \tα 1- Add an Employee.");
                    System.out.println("\t \tα 2- Search for an Employee.");
                    System.out.println("\t \tα 3- Remove an Emoloyee.");
                    System.out.println("\t \tα 4- Edit an Emoloyee Data.");
                    System.out.println("\t \tα 5- Print All Emoloyees Data.");
                    System.out.println("\t \tα 6- Show items.");
                    System.out.println("\t \tα 7- Modify items.");
                    System.out.println("\t \tα 8- Print Customer Data");
                    System.out.println("\t \tα 666- To Exit.");
                    ch= userInput();; 
             switch (ch) {
                case 1:   addEmployee(emp);
                break; 
                case 2:  searchEmployee(emp);
                break; 
                case 3:  removeEmployee(emp);
                break; 
                case 4:   editEmployee(emp);
                break;
                case 5:   printEmployee(emp);
                break;
                 case 6: PrintAllBooks(book) ;PrintAllMagazines(magazines);
                 break; 
                 case 7:  modifyItems(book, magazines);
                 break; 
                 case 8:    PrintCustomer(cust);
                 break;
                case 666:   System.out.println("\n\n\t \tα Have a Good Day.");
                break; 
                default:
                 System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 
                         
               }  }         
               while(ch != 666); 
                }
              
            
            
        }     if (!access) 
                System.out.println("\n\t \tΨ Sorry The ID/Password was incorrect. Please try again! \n\n\n");  }
              access= false; 
    
    
    break; 
    
    
   
    case 2: { 
             System.out.print("\n\t \tΔ Enter your ID: ");
             String id=input.next();
             System.out.print("\t \tΔ Enter your Password: ");
             String pass=input.next();
             
        for (Employee i : emp){
     
            if(i.id.equalsIgnoreCase(id)&& i.password.equals(pass))
             {  access=true;   
                  do {
                    System.out.println("\n\n\t\t  Hi " + i.name + "!");
                    System.out.println("\t \t  Dear Employee, Pleas Choose a Number From the List Below::");
                    System.out.println("\t \tα 1- Show items.");
                    System.out.println("\t \tα 2- Modify items.");
                    System.out.println("\t \tα 3- Print Customer Data");
                    System.out.println("\t \tα 666- To Exit.");
                    ch= userInput(); 
             switch (ch) {
                 case 1: PrintAllBooks(book) ;PrintAllMagazines(magazines);
                 break; 
                 case 2:  modifyItems(book, magazines);
                 break; 
                 case 3:    PrintCustomer(cust);
                 break;
                 case 666:   System.out.println("\n\n\t \tα Have a Good Day.");
                 break; 
                 default: 
                     System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n");      
               }  }        
               while(ch != 666); 
                }
              
            
            
        }  if (!access) 
                 System.out.println("\n\t \tΨ Sorry The ID/Password was incorrect. Please try again! \n\n\n"); 
                 access=false;
    }
    break;
    
    
    //Customer 
    case 3: {
          
            Order ord = null; 
            Payment pay= new Payment (ord);
            System.out.println("\n\n\t \t  Dear Customer, choose the list below:");
            System.out.println("\t \tα 1- Login (alredy have an account).");
            System.out.println("\t \tα 2- Sign up (New accounct).");
                    int log = userInput();
                    
            if (log==2) {
                System.out.println("\n\t\tCreat A New Account :");
                addCustomer(cust );
                
            }
             
            
            if (log ==1 || log ==2)   
            {
             System.out.print("\n\t \tΔ Enter your Username: ");
             String id=input.next();
             System.out.print("\t \tΔ Enter your Password: ");
             String pass=input.next();
             
             

        for (Customer i : cust)

            
            if(i.id.equalsIgnoreCase(id) && i.password.equals(pass))
             {  
             access=true; 
                        
              
                 System.out.println("\n\n\t \t  Dear Customer "+  i.name);
                 System.out.println("\t \t  ALPHA Bookstore Offer two service Delivery and Pickup.");
                 System.out.println("\n\n \t \t  Dear Customer, Pleas Choose a Number From the List Below:");
                 System.out.println("\t \tα 1- Delivery Using Aramex Co. (Delivery price 30). " );
                 System.out.println("\t \tα 2- Pickup from library branch in Dammam, Al-Nakheel Mall, Gate 1.");
                 System.out.println("\t \tα 3- Update your personal information.");
                 System.out.println("\t \tα 4- Sign out.");
                 int ordertype=userInput();
                 
                 if (ordertype ==1){
                     ord=new Delivery() ;
                     getCustomerAddress(i, ord);
                 }
                  if (ordertype==2)   
                      ord=new Pickup();
                                      
                  if(ordertype==1 || ordertype==2){
               do {
                    System.out.println("\n\n\t \t  Hi Customer "+ i.name+"!");
                    System.out.println("\t \t  Dear Customer, Pleas Choose a Number From the List Below:");
                    System.out.println("\t \tα 1- Add a new item to the cart.");
                    System.out.println("\t \tα 2- Remove an Item from the cart.");
                    System.out.println("\t \tα 3- Print All Item in Cart.");
                    System.out.println("\t \tα 4- Print All Item in stock.");
                    System.out.println("\t \tα 5- Print Bill.");
                    System.out.println("\t \tα 6- Checkout & Payment.");
                    System.out.println("\t \tα 8- Sign out.");
                    ch= userInput();
             switch (ch) {
                case 1:   additem(ord,book,magazines);
                break; 
                case 2:  removeitem(ord);
                break; 
                case 3:  printCustomerCart(ord); 
                break; 
                case 4:  PrintAllBooks(book); 
                         PrintAllMagazines(magazines);
                break; 
                case 5:  pay.bill(ord);
                  break;   
                case 6:  pay.bill(ord);
                         payment(pay,ord);
                         i.setOrder(ord);
                break; 
                  case 8: System.out.println("\n\n\t \tα Have a Good Day.");  
                  break; 
                default:
                 System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 
                         
               }  }         
               while(ch != 6 && ch !=8); }
                  
                  
                   else if (ordertype==3)
                   editCustomerData(i);
                  
                   else if (ordertype==4)
                  System.out.println("\n\n\t \tα Have a Good Day.");  
                  
                   else 
                    System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 
               }              
            }
            
           
            
             if (!access) 
                System.out.println("\n\t \tΨ Sorry The ID/Password was incorrect. Please try again! \n\n\n");  
                access= false; }
    
    
    
    break; 
    
    case 999: System.out.println("\t \tα Have a Good Day.");
    break;
    
    
 
    default: 
    System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 


    } }
      
while (user!=999);
    
      }
    

   
    
    
    
    
    //manger methode 
    
 public static void addEmployee ( ArrayList<Employee> employee)
    {
        String emp_name, emp_id, emp_phoneNum, emp_password, emp_email ; 
               int emp_hoursWorked;
        
        System.out.print("\n\t \tΔ Enter the employee's name: ");
        emp_name= input.next();
        System.out.print("\n\t \tΔ Enter the employee's ID: ");
        emp_id= input.next();
        System.out.print("\n\t \tΔ Enter the employee's email: ");
        emp_email= input.next();
        System.out.print("\n\t \tΔ Enter the employee's phone number: ");
        emp_phoneNum= input.next();
        System.out.print("\n\t \tΔ Enter the employee's password: ");
        emp_password= input.next();
        System.out.print("\n\t \tΔ Enter the employee's Work hours: ");
        emp_hoursWorked= Input();
        
      employee.add(new Employee (emp_name,emp_id,emp_email,emp_phoneNum,emp_password ,emp_hoursWorked ));
     
     System.out.println("\n\t\tΠ The Employee has been added to the team! ");
     
    }
    
 
  
 public static boolean searchEmployee ( ArrayList<Employee> employee) // search employee by id
 {
     boolean found;
     found = false;
     
     
     System.out.print("\n\t \tΔ Enter Emolyee ID: ");
     String id=input.next();
     for (int i = 0 ; i < employee.size() ; i++)
     {
         if (employee.get(i).id.equalsIgnoreCase(id))
         {
             found = true;
             System.out.println("\t \t  The employee with the ID: "+ id + " is on the team!");
             System.out.println("\t \t  Name: " +  employee.get(i).name + "\n\t \t  Email address: "  +   employee.get(i).email   + "\n\t \t  Phone number" + employee.get(i).phoneNum  +  "\n\t \t  Salary " + employee.get(i).calcSalary());
         }
           }
         if (! found)
             System.out.println("\n\t \tΨ The employee with ID: "+ id + " is not on the team..");

       
     return found;
 }
 
 
    static void removeEmployee( ArrayList<Employee> employeelist){
        boolean removed = false;
        String id;
        Employee emp1=new Employee();
        Iterator<Employee> itr= employeelist.iterator();
        System.out.print("\n\t \tΔ Enter the id of the Employee you want to remove: ");
        id=input.next();

        while(itr.hasNext()){
            emp1=itr.next();
            if(id.equalsIgnoreCase(emp1.id)){
                removed = true;
                itr.remove();
                System.out.println("\n\t\tΠ Employee removed.");
            }
        }
        if (!removed )
              System.out.println("\n\t \tΨ The employee with ID: "+ id + " is not on the team..");
    }
    
    
    static void editEmployee( ArrayList<Employee> Employeelist){
        boolean edited=false;
        String id;
        int att;
        String mod;
        Employee emp1=new Employee();
        Iterator<Employee> itr= Employeelist.iterator();
        System.out.print("\n\t \tΔ Enter the Employee id to Edit his/her profile: ");
        id=input.next();

        while(itr.hasNext()){
            emp1=itr.next();
            if(id.equalsIgnoreCase(emp1.id)){
                edited=true;
                System.out.println("\t \t  Pleas Choose a Number From the List Below:");
                System.out.println("\t \tα 1- to change email address.");
                System.out.println("\t \tα 2- to change phone number.");
                System.out.println("\t \tα 3- to change name.");
                System.out.println("\t \tα 4- to change password.");;
                att=userInput();
                switch(att){
                    case 1:
                        System.out.print("\n\t \tΔ Enter the new email address: ");
                        mod=input.next();
                        emp1.email=mod;
                        System.out.println("\n\t\tΠ Email address has been successfully changed.");
                        break;
                    case 2:
                        System.out.print("\n\t \tΔ Enter the new phone number: ");
                        mod=input.next();
                        emp1.phoneNum=mod;
                        System.out.println("\n\t\tΠ Phone number has been successfully changed.");
                        break;
                    case 3:
                        System.out.print("\n\t \tΔ Enter right name: ");
                        mod=input.next();
                        emp1.name=mod;
                        System.out.println("\n\t\tΠ Name has been successfully changed.");
                        break;
                    case 4:
                        System.out.print("\n\t \tΔ Enter the new password: ");
                        mod=input.next();
                        emp1.password=mod;
                        System.out.println("\n\t\tΠ Password has been successfully changed.");
                        break;
                    default: System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 
                }
                
            }  
        }
        if (!edited)
           System.out.println("\n\t \tΨ The employee with ID: "+ id + " is not on the team..");
    }
    
  
    
    static void printEmployee( ArrayList<Employee> employeelist){
        
        System.out.println("\t\t All Employees: ");
        System.out.println("\t\t ------------------------------------------------------------------");
        System.out.println("\t\t N°   Name         email         Phone number      Salary      ID   ");
        System.out.println("\t\t ------------------------------------------------------------------");
        employeelist.forEach((i) -> {
            System.out.println("\t \t α"+ (employeelist.indexOf(i)+1)+ " " + i.name+"  " + i.email+"   "+ i.phoneNum +"   "+ i.calcSalary()+ "   "+ i.id);
        });
    }
        
    
    
    


    //employee methodes
    static void PrintAllBooks(ArrayList<Books> book){
         System.out.println("\n\n\t \t Available Books: ");
         System.out.println("\t\t -------------------------------------------------------------------------");
         System.out.println("\t\t Item ID       Author                 Title                 Price");
         System.out.println("\t\t -------------------------------------------------------------------------");
           for (Books i : book) 
               System.out.println("\t \t α"+ i.itemID +"      "+i.getauthor()+"           "+i.title+"        "+ i.price+ "SR" );
            
        
     }
       static void PrintAllMagazines(ArrayList<Magazines> magazines){
           
           System.out.println("\n\n\t \t Available Magazines: ");
           System.out.println("\t\t -------------------------------------------------------------------------");
           System.out.println("\t\t Item ID          Editor             Title                      Price");
           System.out.println("\t\t -------------------------------------------------------------------------");
           for (Magazines i : magazines)
               System.out.println("\t \t α"+i.itemID +"     "+i.geteditor()+"        "+i.title+"      "+ i.price+ "SR" );
        
     } 

       
      
       
public static void modifyItems(ArrayList<Books> book ,ArrayList<Magazines> magazines )
    {
           
    System.out.println("\t \t  Please Choose a Number From the List Below:");
    System.out.println("\t \tα 1- Modify books.");
    System.out.println("\t \tα 2- Modify magazines.");
    int c = userInput();
    System.out.println("\t \t  Please Choose a Number From the List Below:");
    System.out.println("\t \tα 1- Add item.");
    System.out.println("\t \tα 2- Delete item.");
    System.out.println("\t \tα 3- Edit item.");
    int x= userInput();
    input.nextLine(); 
    switch (x)
    {
        case 1:
             if(c ==1)
        {    
            String isbn , author , place, title , publisher; int id , year; double price;
           
            System.out.print("\n\t \tΔ Enter isbn: "); isbn = input.nextLine();  
            System.out.print("\n\t \tΔ Enter author: "); author = input.nextLine();
            System.out.print("\n\t \tΔ Enter publication place: "); place = input.nextLine();
            System.out.print("\n\t \tΔ Enter book's title: "); title = input.nextLine();
            System.out.print("\n\t \tΔ Enter publisher: "); publisher = input.nextLine();
            System.out.print("\n\t \tΔ Enter item ID: "); id = Input();
            System.out.print("\n\t \tΔ Enter publication year: "); year = Input();
            System.out.print("\n\t \tΔ Enter price: "); price = inputdouble();
            book.add(new Books(isbn , author , place , title , publisher, id , year ,price));
            System.out.println("\n\t\tΠ The Book has been added to the list successfully!");
            PrintAllBooks(book);
        }
        else if (c==2)
        { String type ,  editor , title, publisher; int id , year; double price;
                  
         System.out.print("\n\t \tΔ Enter product's type: "); type = input.nextLine();
         System.out.print("\n\t \tΔ Enter editor's name: "); editor = input.nextLine();
         System.out.print("\n\t \tΔ Enter title: "); title = input.nextLine();
         System.out.print("\n\t \tΔ Enter publisher: "); publisher = input.nextLine();
         System.out.print("\n\t \tΔ Enter item ID: "); id = Input();
         System.out.print("\n\t \tΔ Enter publishation year: "); year = Input();
         System.out.print("\n\t \tΔ Enter price: "); price = inputdouble();
        magazines.add(new Magazines(type, editor , title ,publisher , id , year , price));
        System.out.println("\n\t\tΠ The Magazine has been added to the list successfully!");
        PrintAllMagazines(magazines);
        }
       
        else System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n");
          break;
         
        case 2:
            if (c==1)
            {
                String isbn; int dID;
                System.out.print("\n\t \tΔ Enter the item's id you want to delete: ");
                dID = Input();
                System.out.print("\n\t \tΔ Enter isbn: ");
                isbn = input.next();
                delete(dID, book, isbn);
                PrintAllBooks(book); 
 
            }
            else if (c==2)
            {
              String isbn; int dID;
              System.out.print("\n\t \tΔ Enter the item's id you want to delete: ");
              dID = Input();
              delete(dID, magazines);
              PrintAllMagazines(magazines);
 
            }
           else
                System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n");
            break;
           
            
        case 3:
            if (c==1)
        { PrintAllBooks(book);
          Edit_books(book);
        }
            
        else if
                (c==2){
        PrintAllMagazines(magazines);
        Edit_magazines(magazines);
        }
        else
            System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n");
        break;
       
        default: System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n");
            break;
    }
  
    }


      
  
  
    public static void delete(int dID ,ArrayList<Books> book, String isbn )
    {
       boolean deleted=false;
        Books b1=new Books();
        Iterator<Books> itr= book.iterator();
 
        while(itr.hasNext()){
            b1=itr.next();
            if(dID==b1.itemID && (isbn.equals(b1.getisbn() )) ){
                itr.remove();
                deleted=true;
                System.out.println("\n\t\tΠ Book removed successfully!");
            }
        }
        if (!deleted)
            System.out.println("\n\t \tΨ Dear Employee, The Book Not Found");
    }
   
    
    
       public static void delete(int dID ,ArrayList<Magazines> magazines )
    {
         boolean deleted=false;
        Magazines m1=new Magazines();
        Iterator<Magazines> itr= magazines.iterator();
       
              while(itr.hasNext()){
            m1=itr.next();
            if(dID==m1.itemID ) {
                itr.remove();
                deleted=true;
                System.out.println("\n\t\tΠ Magazine removed successfully!");
            }
        }
     if (!deleted)
            System.out.println("\n\t \tΨ Dear Employee, The Magazine Not Found");
    } 
       
       
      static void Edit_books( ArrayList<Books> book ){
           int ID;
           boolean access=false;
            System.out.print("\n\t \tΔ Enter Book ID you want to Edit");
            ID = Input(); 
 
             for(Books i : book) {
         if(ID==i.itemID){
             access=true;
            
                System.out.println("\t \t  Pleas Choose a Number From the List Below:");
                System.out.println("\t \tα 1- Change isbn.");
                System.out.println("\t \tα 2- Change author. ");
                System.out.println("\t \tα 3- Change publication place.  ");
                System.out.println("\t \tα 4- Change title. ");
                System.out.println("\t \tα 5- Change publisher. ");
                System.out.println("\t \tα 6- Change item's id.");
                System.out.println("\t \tα 7- Change publication year.");
                System.out.println("\t \tα 8- Change price.");
               int x = userInput();
               input.nextLine(); 
                switch(x){
                    case 1:
                        
                        System.out.print("\n\t \tΔ Enter the new ISBN: "); 
                        String n = input.nextLine();
                        i.setisbn(n);
                        System.out.println("\n\t\tΠ ISBN has been successfully changed.");
                        break;
                    case 2:
                      
                        System.out.print("\n\t \tΔ Enter the new author: ");
                        n = input.nextLine();
                        i.setauthor(n);
                        System.out.println("\n\t\tΠ Author has been successfully changed.");
                        break;
                    case 3:
                        
                        System.out.print("\n\t \tΔ Enter the new publication place: ");
                         n = input.nextLine();
                       i.setpublicationPlace(n);
                       System.out.println("\n\t\tΠ Publication place has been successfully changed.");
                        break;
                    case 4:
                      
                        System.out.print("\n\t \tΔ Enter the new title: ");
                         n = input.nextLine();
                       i.title= n;
                       System.out.println("\n\t\tΠ Title has been successfully changed.");
                       break;
                    case 5: 
                        
                        System.out.print("\n\t \tΔ Enter the new publisher: ");
                         n = input.nextLine();
                        i.setpublisher(n);
                        System.out.println("\n\t\tΠ publisher has been successfully changed.");
                        break;
                    case 6:  
                        System.out.print("\n\t \tΔ Enter the new item ID: ");
                        int y = Input();
                        i.itemID=y;
                        System.out.println("\n\t\tΠ Item ID has been successfully changed.");
                        break;
                    case 7:
                        System.out.print("\n\t \tΔ Enter the new publication year: ");
                         y = Input();
                        i.setpublicationYear(y); 
                        System.out.println("\n\t\tΠ publisher year has been successfully changed.");
                        break;
                    case 8:
                        System.out.print("\n\t \tΔ Enter the new item price: ");
                        double z =inputdouble();
                        i.price=z;
                        System.out.println("\n\t\tΠ Item price has been successfully changed.");
                        break;
                    default: 
                        System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 

                    
                }                            PrintAllBooks(book);  
 
       }
               }  
             if (!access)  {
                System.out.println("\n\t \tΨ Dear Employee, The Book Not Found");
                 Edit_books(book);}
      
}
       
       
       
       
       static void Edit_magazines( ArrayList<Magazines> magazines){
           int ID;
           boolean access=false;
        System.out.print("\n\t \tΔ Enter Magazine ID you want to Edit");
            ID = Input(); 

             for(Magazines i : magazines)
         { if(ID==i.itemID){
               access =true;
               
                System.out.println("\t \t  Pleas Choose a Number From the List Below:");
                System.out.println("\t \tα 1- Change product type.");
                System.out.println("\t \tα 2- Change editor. ");
                System.out.println("\t \tα 3- Change title.  ");
                System.out.println("\t \tα 4- Change publisher. ");
                System.out.println("\t \tα 5- Change item's id. ");
                System.out.println("\t \tα 6- publication year .");
                System.out.println("\t \tα 7- Change price.");
               int x = userInput(); 
               input.nextLine();
               
                switch(x){
                    
                    case 1:
                        System.out.print("\n\t \tΔ Enter the new product type: ");
                        String n = input.nextLine();
                        i.setproductType(n);
                        System.out.println("\n\t\tΠ Product type has been successfully changed.");
                        break;
                    case 2:
                        System.out.print("\n\t \tΔ Enter the new editor: ");
                         n = input.nextLine();
                        i.seteditor(n);
                        System.out.println("\n\t\tΠ Editor has been successfully changed.");
                        break;
                    case 3:
                        System.out.print("\n\t \tΔ Enter the new title: ");
                         n = input.nextLine();
                        i.title=n;
                        System.out.println("\n\t\tΠ Title has been successfully changed.");
                        break;
                    case 4:
                        System.out.print("\n\t \tΔ Enter the new publisher: ");
                         n = input.nextLine();
                        i.setpublisher(n);
                        System.out.println("\n\t\tΠ Publisher has been successfully changed.");
                        break;
                    case 5:  
                        System.out.print("\n\t \tΔ Enter the new item ID: ");
                        int y = Input();
                        i.itemID=y;
                        System.out.println("\n\t\tΠ Item ID has been successfully changed.");
                        break;
                    case 6:
                        System.out.print("\n\t \tΔ Enter the new publication year: ");
                         y = Input();
                        i.setpublicationYear(y);
                        System.out.println("\n\t\tΠ Publication year has been successfully changed.");
                        break;
                    case 7:
                        System.out.print("\n\t \tΔ Enter the new item price: ");
                        double z = inputdouble();
                        i.price=z;
                        System.out.println("\n\t\tΠ Item price has been successfully changed.");
                        break;
                    default: 
                        System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 

                }                            PrintAllMagazines(magazines);
}
                
            } 
              if (!access){
                  System.out.println("\n\t \tΨ Dear Employee, The Magazine Not Found");
                  Edit_magazines(magazines);}
        }

         
    	    static void PrintCustomer( ArrayList<Customer> customerlist){
    	        
    	        System.out.println("\n\n\t \t All Customers: ");
                System.out.println("\t\t -------------------------------------------------------------------------");
                System.out.println("\t\t         Name           Email          Phone number              Order N°");
                System.out.println("\t\t -------------------------------------------------------------------------");
    	     
    	        customerlist.forEach((i) -> {
    	            System.out.println("\t \t α"+(customerlist.indexOf(i)+1) +"   "+i.name+" | "+i.email+" | "+ i.phoneNum + " | "+ i.numOfOrders );
    	        });
    	    }
       
       
       
       //customer methods
static void addCustomer( ArrayList<Customer> customer){
        String name;
        String email;
        String phoneNum;
        String password;
        String id; 
        System.out.print("\n\t \tΔ Enter your name: ");
        name=input.next();
        System.out.print("\n\t \tΔ Enter your email address: ");
        email=input.next();
        System.out.print("\n\t \tΔ Enter your phone number: ");
        phoneNum=input.next();
        System.out.print("\n\t \tΔ Enter your username: ");
        id=input.next();
        System.out.print("\n\t \tΔ Enter your password: ");
        password=input.next();
    customer.add(new Customer( name,  id,  email,  phoneNum,  password) )  ;
        System.out.println("\n\t\tΠ Your Account has been successfully Created!");
    }

public static void getCustomerAddress(Customer i, Order ord){
Delivery ord1=(Delivery) ord;
String street,  city,  country,   deliveryID;
int postalCode; 
        

input.nextLine(); 

System.out.print("\n\t \tΔ Enter street: ");
street=input.nextLine();        

System.out.print("\n\t \tΔ Enter city: ");
city=input.nextLine();  

System.out.print("\n\t \tΔ Enter country: ");
country=input.nextLine(); 
System.out.print("\n\t \tΔ Enter postalCode: ");
postalCode=Input();  


String postalCodeString=String.valueOf(postalCode);
deliveryID=city.concat(postalCodeString);
ord1=new Delivery( street,  city,  country,  postalCode,  deliveryID);

System.out.println("\n\t\tΠ Delivery address added successfully ");
}




public static void additem(Order ord, ArrayList<Books> book , ArrayList<Magazines> magazines ){
    boolean add=false; 
    System.out.println("\n\t \t  Dear Customer Choose item type that you want to add:");
    System.out.println("\t \tα 1- Add a Book");
    System.out.println("\t \tα 2- Add a Magazine");
    int itemtype=userInput();
    if (itemtype==1){
        PrintAllBooks(book); 
        
        
        System.out.print("\n\t \tΔ Enter Book ID/Number you want to add: ");
        int item_ID=Input();
         for(Books i : book) {
        if(item_ID==i.itemID){
        ord.setBooks(i);
             System.out.println("\n\t\tΠ Item: "+ i.itemID +" has been added to the cart successfully");
             add=true;
         } }}
        
        
        
        
    else if(itemtype ==2) {
    PrintAllMagazines(magazines);
     System.out.print("\n\t \tΔ Enter Magazine ID/Number you want to add: ");
        int item_ID=Input();
         for(Magazines i : magazines) {
        if(item_ID==i.itemID){
        ord.setMagazine(i);
             System.out.println("\n\t\tΠ Item: "+ i.itemID +" has been added to the cart successfully");
             add=true;
         } }
    }
    
    
    
    if(!add)
    System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 
 
}


public static void removeitem(Order ord){
        
    printCustomerCart( ord);
        
    System.out.println("\n\t \t  Dear Customer Choose item type that you want to Remove:");
    System.out.println("\t \tα 1- Remove a Book");
    System.out.println("\t \tα 2- Remove a Magazine");
    int itemtype=userInput();
    
         if(itemtype==1 || itemtype==2){
             
        
            
        System.out.print("\n\t \tΔ Enter item ID/Number you want to Remove: ");
        int itemtID=Input();
        
        if(itemtype==1)
        ord.deleteBook(itemtID);
        
        else if(itemtype==2) 
        ord.deleteMagazine(itemtID);
        
         } 
         else 
             System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 
    }
    
    
         
  public static void  printCustomerCart(Order ord) {
  ord.getBooks();
  ord.getMagazine();}
  
  
  
   public static void   payment(Payment pay, Order ord){
       int paymentType = 0;
       
       do {
          System.out.println("\n\n\t \t  Dear Customer, From the list below, choose what payment type you prefer:");
                    System.out.println("\t \tα 1- Cash.");
                    System.out.println("\t \tα 2- Visa.");
                    paymentType=userInput();
                    if(paymentType==1|| paymentType==2)
                    pay.setPaymentType(paymentType);
      
                    else 
                    System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n");     
                 
       }
                    while (paymentType !=1 && paymentType!=2);
   }
   
   
   //for the menu
   public static int userInput( ){
      boolean isNumber; 
      int num = 0;
   do {
   System.out.print("\n\t \tΔ Enter a number from the list: ");
   
   if (input.hasNextInt()){
       num=input.nextInt();
    isNumber=true;
   }
      
   
   else {
       isNumber=false;
       System.out.println("\n\t \tΨ INVALID ENTRY");
       input.next();
   }
           
       
   }
       while(!isNumber);
   
   return num;}
   
   
   
   
   
   public static void editCustomerData(Customer cusotmer ){
         boolean edited=false;
         int att; 
         String  mod; 
                edited=true;
                System.out.println("\t \t  Pleas Choose a Number From the List Below:");
                System.out.println("\t \tα 1- to change email address.");
                System.out.println("\t \tα 2- to change phone number.");
                System.out.println("\t \tα 3- to change name.");
                System.out.println("\t \tα 4- to change username.");
                System.out.println("\t \tα 5- to change password.");;
                att=userInput();
                switch(att){
                    case 1:
                        System.out.print("\n\t \tΔ Enter the new email address: ");
                        mod=input.next();
                        cusotmer.email=mod;
                        System.out.println("\n\t\tΠ Email address has been successfully changed.");
                        break;
                    case 2:
                        System.out.print("\n\t \tΔ Enter the new phone number: ");
                        mod=input.next();
                        cusotmer.phoneNum=mod;
                        System.out.println("\n\t\tΠ Phone number has been successfully changed.");
                        break;
                    case 3:
                        System.out.print("\n\t \tΔ Enter right name: ");
                        mod=input.next();
                        cusotmer.name=mod;
                        System.out.println("\n\t\tΠ Name has been successfully changed.");
                        break;
                    case 4:
                        System.out.print("\n\t \tΔ Enter the new username: ");
                        mod=input.next();
                        cusotmer.id=mod;
                        System.out.println("\n\t\tΠ username has been successfully changed.");
                        break;
                    case 5:
                        System.out.print("\n\t \tΔ Enter the new password: ");
                        mod=input.next();
                        cusotmer.password=mod;
                        System.out.println("\n\t\tΠ Password has been successfully changed.");
                        break;
                    default: System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 
                
                
             input.nextInt();
        }
        if (!edited)
           System.out.println("\n\t \tΨ Sorry The input was incorrect. Please try again! \n\n\n"); 
    }


       
       
   
   
   
   
   
   
   //error handling 
   
   //for data input
    public static int Input( ){
      boolean isNumber; 
      int num = 0;
   do {
     System.out.print("\n\t \tΔ Enter a number: ");
      if (input.hasNextInt()){
       num=input.nextInt();
    isNumber=true;
   }
      
   
   else {
       isNumber=false;
       System.out.println("\n\t \tΨ INVALID ENTRY");
       input.next();
   }
           
       
   }
       while(!isNumber);
   
   return num;}
    
    
   
      
   //for long 
    public static long InputLong(){
      boolean isNumber; 
      long num = 0;
   do {
     System.out.print("\n\t \tΔ Enter a number: ");
      if (input.hasNextLong()){
       num=input.nextLong();
    isNumber=true;
   }
      
   
   else {
       isNumber=false;
       System.out.println("\n\t \tΨ INVALID ENTRY");
       input.next();
   }
           
       
   }
       while(!isNumber);
   
  
   return num;}

    
       //for double 
    public static double inputdouble(){
      boolean isNumber; 
      double num = 0;
   do {
     System.out.print("\n\t \tΔ Enter a number: ");
      if (input.hasNextDouble()){
       num=input.nextDouble();
    isNumber=true;
   }
      
   
   else {
       isNumber=false;
       System.out.println("\n\t \tΨ INVALID ENTRY");
       input.next();
   }
           
       
   }
       while(!isNumber);
   
   return num;}
}





