import java.util.*;

//Student Class (Encapsulation)

class Student
{
    private String Name;
    private int Age;
    private char Grade;
    public Student(String n,int a,char g)
    {
        this.Name=n;
        this.Age=a;
        this.Grade=g;
    }
    public void displayStudent()
    {
        System.out.println("Name:"+Name);
        System.out.println("Age"+Age);
        System.out.println("Grade:"+Grade);
    }
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Nmae:");
        String n=scan.nextLine();
        System.out.println("Enter Age:");
        int a=scan.nextInt();
        System.out.println("Enter Grade:");
        char g=scan.next().charAt(0);
        Student obj=new Student(n,a,g);
        obj.displayStudent();
    }
}

//Parameterized Constructor

class Book
{
    String Title;
    String Author;
    float Price;
    public Book(String t,String a,float p)
    {
        Title=t;
        Author=a;
        Price=p;
    }
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Title:");
        String t=scan.nextLine();
        System.out.println("Enter Author:");
        String a=scan.nextLine();
        System.out.println("Enter price:");
        float p=scan.nextFloat();
        Book obj=new Book(t,a,p);
        System.out.println("Title:"+obj.Title);
        System.out.println("Author:"+obj.Author);
        System.out.println("Price:$"+obj.Price);
    }
}

//Address Book Mini-Projects (ArrayList)

class Address
{
    String Name;
    String PhoneNo;
    Address(String n,String phno)
    {
        this.Name=n;
        this.PhoneNo=phno;
    }
}
class book
{
    Scanner scan;
    ArrayList<Address> contact;
    public book()
    {
        contact=new ArrayList<>();
        scan=new Scanner(System.in);
    }
    public void addContact()
    {
        System.out.println("Name:");
        String n= scan.nextLine();
        System.out.println("Phone:");
        String phno=scan.nextLine();
        contact.add(new Address(n,phno));
    }
    public void viewContact()
    {
        for(Address b:contact)
        {
            System.out.println("Contacts");
            System.out.println(b.Name+" - "+b.PhoneNo);
        }
    }
    public void searchContact()
    {
        for(Address b:contact)
        {
            System.out.println("");
            String Name=scan.nextLine();
            if(b.Name.equalsIgnoreCase(Name))
            {
                System.out.println("Available");
            }
            else
            {
                System.out.println("Not available");
            }
        }
    }
}
class AddressBook
{
    public static void main(String[] args) 
    {
        Scanner scan =new Scanner(System.in);
        book obj =new book();
        obj.addContact();
        obj.viewContact();
        obj.searchContact();
        System.out.println("Enter choice" );
        boolean n=true;
        while(n) 
        {
            int choice =scan.nextInt();
            switch (choice)
            {
                case 1:
                obj.addContact();
                break;
                case 2:
                obj.viewContact();
                break;
                case 3:
                obj.searchContact();
                case 4:
                scan.close();
                break;
                default:
                System.out.println("Exit");
                break;
            }
        }
    }
}

//Employee Class (Encapsulation)

class Employee
{
    private String Name;
    private String Position;
    private int Salary;
    public Employee(String n,String p,int s)
    {
        this.Name=n;
        this.Position=p;
        this.Salary=s;
    }
    public void displayEmployee()
    {
        System.out.println("Name:"+Name);
        System.out.println("Psition"+Position);
        System.out.println("Salary:$"+Salary);
    }
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Nmae:");
        String n=scan.nextLine();
        System.out.println("Enter Position:");
        String p=scan.nextLine();
        System.out.println("Enter Salary:");
        int s=scan.nextInt();
        Employee obj=new Employee(n,p,s);
        obj.displayEmployee();
    }  
}

//Rectangle Class (Compiletime Pholymorphism-Overloading)

class Rectangle
{
    public int area(int length,int width)
    {
        int area=length*width;
        return area;
    }
    public double area(double length,double width)
    {
        double area=length*width;
        return area;
    }
    public int perimeter(int length,int width)
    {
        int perimeter=2*(length+width);
        return perimeter;    
    }
    public double perimeter(double length,double width)
    {
        double perimeter=2*(length+width);
        return perimeter;    
    }
    public static void main(String[] args)
    {
        //Overload
        Rectangle obj=new Rectangle();
        System.out.println("Area:"+obj.area(5,10));
        System.out.println("Perimeter:"+obj.perimeter(5,10));
    }
}

//Circle Class (Compiletime Pholymorphism-Overloading)

class Circle
{
    public int area(int radius)
    {
        int area=22/7*radius*radius;
        return area;
    }
    public double area(double radius)
    {
        double area=3.14*radius*radius;
        return area;
    }
    public int circumference(int radius)
    {
        int circumference=2*22/7*radius;
        return circumference;    
    }
    public double circumference(double radius)
    {
        double circumference=2*(3.14)*radius;
        return circumference;    
    }
    public static void main(String[] args)
    {
        //Overload
        Circle obj=new Circle();
        System.out.println("Area:"+obj.area(7.00));
        System.out.println("ircumference:"+obj.circumference(7.00));
    }
}

//Bank Account Class (Encapsulation)

class Account
{ 
    private int AccountNumber;
    private String HolderName;
    private int Balance;
    public Account(int a,String h,int b) 
    {
        this.AccountNumber = a;
        this.HolderName = h;
        this.Balance = b;
    }
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            Balance += amount;
        }
    }
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= Balance) 
        {
            Balance -= amount;
        } 
    }
    public void Balance() 
    {
        System.out.println("Balance=" + Balance);
    }
    public static void main(String[] args) 
    {
        Account account = new Account(12345, "Jhon",500);
        account.deposit(1000);
        account.withdraw(500);
        account.Balance();
    }
}

//Car Class (Encapsulation)

class Car
{
    String Make;
    String Model;
    int Year;
    public Car()
    {
        this.Make="Toyota";
        this.Model="Corolla";
        this.Year=2020;
    }
    public void display()
    {
        System.out.println("Car:"+Make+" "+Model+'('+Year+')');
    }
    public static void main(String[] args)
    {
        Car Obj=new Car();
        Obj.display();
    }    
}

//Inventory Managament System (Runtime-Polymorphism-Overriding)

class Product
{
    protected String Name;
    protected int Quantity;
    protected int Price;
    public Product(String n,int q,int p)
    {
        this.Name=n;
        this.Quantity=q;
        this.Price=p;
    }
    public void displayProduct()
    {
        System.out.println("Product:"+Name);
        System.out.println("Quantity:"+Quantity);
        System.out.println("Price:$:"+Price);
    }
}
class Newproduct extends Product
{
    public Newproduct(String n,int q,int p)
    {
        super(n,q,p);
    }
    //Override
    public void displayProduct()
    {
        System.out.println("Product:"+Name);
        System.out.println("Quantity:"+Quantity);
        System.out.println("Price:$:"+Price);
    }
}
class InventoryManagement
{
    public static void main(String[] args) 
    {
        Newproduct obj=new Newproduct("Laptop",5,800);
        obj.displayProduct();
    }
}

//Library Management System (ArrayList)

class Library
{
    String Title;
    String Author;
    Library(String t,String a)
    {
        this.Title=t;
        this.Author=a;
    }
}
class Manage
{
    Scanner scan;
    ArrayList<Library> books;
    public Manage()
    {
        books= new ArrayList<>();
        scan =new Scanner(System.in);
    }
    public void addBook()
    {
        System.out.println("Enter book title");
        String Name= scan.nextLine();
        System.out.println("Enter Author name");
        String Author=scan.nextLine();
        books.add(new Library(Name,Author));
        System.out.println("Book added Suceesfully");   
    }
    public void displayBook()
    {
        for(Library b:books)
        {
            System.out.println("Book:"+b.Author+" by "+b.Title);
        }
    }
    public void searchBook()
    {
        for(Library b:books)
        {
            System.out.println("Enter book name");
            String Name=scan.nextLine();
            if(b.Title.equalsIgnoreCase(Name))
            {
                System.out.println("Available");
            }
            else
            {
                System.out.println("Not available");
            }
        }
    }
}
class LibraryManagement
{
    public static void main(String[] args) 
    {
        Scanner scan =new Scanner(System.in);
        Manage obj =new Manage();
        obj.addBook();
        obj.displayBook();
        obj.searchBook();
        System.out.println("Enter choice" );
        boolean n=true;
        while(n) 
        {
            int choice =scan.nextInt();
            switch (choice) 
            {
                case 1:
                obj.addBook();
                break;
                case 2:
                obj.displayBook();
                break;
                case 3:
                obj.searchBook();
                case 4:
                scan.close();
                break;
                default:
                System.out.println("Enter correct choice");
                break;
            }
        }
    }
}

//Student Marks Class (Single-Inheritance)

//Parent Class
class Students
{
    protected int Math;
    protected int Science;
    protected int English;
    public Students(int m,int s,int e)
    {
        this.Math=m;
        this.Science=s;
        this.English=e;
    }
}
//Child Class
class Marks extends Students
{
    public Marks(int m,int s,int e)
    {
        super(m,s,e);
    }
    public int displayMarks()
    {
        return (Math+Science+English)/3;
    }
}
class StudentMark
{
    public static void main(String[] args)
    {
        Marks obj=new Marks(80,70,90);
        System.out.println(obj.displayMarks());
    }
}

//Travel Agency System (abstract)

abstract class Package
{
    protected String Destination;
    protected int Days;
    protected int Cost;
    public Package(String dn,int d,int c)
    {
        this.Destination=dn;
        this.Days=d;
        this.Cost=c;
    }
    abstract void displayPackage();
    public void Update(String dn,int d,int c)
    {
        this.Destination=dn;
        this.Days=d;
        this.Cost=c;
    }
}
class Travelpackage extends Package
{ 
    public Travelpackage(String dn,int d,int c)
    {
        super(dn,d,c);
    }
    //Abstract Method Override
    void displayPackage()
    {
        System.out.println("Package:"+Destination+','+Days+"Days,$"+Cost);
    }
}
class TravelAgency
{
    public static void main(String[] args)
    {
        Travelpackage obj=new Travelpackage("Paris",7,1400);
        obj.Update("Paris",7,1500);
        obj.displayPackage();
    }
}

//Shop Billing System (Interface)

interface Bill
{
    int Calculate();
}
class Shopbill implements Bill
{ 
    private String Item;
    private int Quantity;
    private int Priceperunit;
    public Shopbill(String i,int q,int p)
    {
        this.Item=i;
        this.Quantity=q;
        this.Priceperunit=p;
    }
    //Interface Class Method Overriding
    public int Calculate()
    {
        return Quantity*Priceperunit;
    }
}
class ShopBilling
{
    public static void main(String[] args)
    {
        Shopbill obj=new Shopbill("Pen",10,2);
        System.out.println("Total:$"+obj.Calculate());
    }
}