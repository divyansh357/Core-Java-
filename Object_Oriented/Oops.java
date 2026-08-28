package Object_Oriented;
import Basics.Hello; // importing Hello class from basics package 
class Calculator{
    int num = 5; // instance variable
    public int add(int n1, int n2){
        return n1 + n2; // local variable
    }
    public int add(int n1,int n2, int n3){
        return n1 + n2 + n3 ;
    }
    public double add(double n1 , double n2 , double n3){
        return n1 + n2 + n3 ;
    }
}
class Computer{
    public void listenMusic(){
        System.out.println("Listening to Music..");
    }
    public String getMeAPen(int cost){
        if (cost>=10) {
            return "Pen";
        }
        return "Nothing";
    }
}

// Encapsulation
class Human{
    private int age;
    private String name;
    public Human(){ // default Constructor 
        age = 15;
        name = "Chhavi";
    }
    public Human(int age , String name){ // Parameterized Constructor
        this.name = name ;
        this.age = age;
    }
    public Human(String name){
        this.name = name ;
    }
    public void setAge(int age){ // Setter
        this.age = age; // this keyword refers to object that called setAge() 
    }
    public int getAge(){    //Getter
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
// static keyword and static block
class Mobile{
    String company;
    int price;
    static String name;
    static{
        name = "Ship";
        System.out.println("In static block");
        System.out.println(name);
    }
    public Mobile(String company, int price){
        this.company = company;
        this.price = price;
        System.out.println("In constrcutor");
    } 
    public void show(){
        System.out.println(name + " : " + company + " : " + price);
    } 
    static public void show1(Mobile obj){ // Indirect access of non-static variables through object refernce
        System.out.println(name + " : "+ obj.company + " : "+obj.price);
    }

}
//Anonymous Objects
class A{
    A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("in A's show");
    }
 }

 // this and super();
 class B extends Object{ // it do this implicitly
    public B(){
        super(); // calling the constructor of Object Class
        System.out.println("in B");
    } 
    public B(int a){
        super();
        System.out.println("in int B");
    }
 }
 class C extends B{
    public C(){
        super(5);
        System.out.println("in C");
    }
    public C(int a){
        this(); // executes the constructor of same Class - undertaker
        System.out.println("in int C");
    }
 }

 //Protected Access Modifier
 class M{

    protected int q = 7;
    // public void show(){
    //     System.out.println(p); // diff pakage non-subclass not accessible 
    // }
}

class G extends Hello{
    public void abc(){
        System.out.println(p);
    }
}

//Dynamic Method Dispatch
class Z {
    public void show(){
        System.out.println("in Z show");
    }
    public void add(){
        System.out.println("in add of Z class");
    }
}
class X extends Z{
    public void show(){
        System.out.println("in X show");
    }
    public void sub(){
        System.out.println("in sub of X class");
    }
}

class V extends Z{
    public void show(){
        System.out.println("in V show");
    }
}

// final class  and methods 

// final class Calcu {
//     final public void show(){
//         System.out.println("By Divyansh");
//     }
//     public void add(int a , int b){
//         System.out.println(a+b);
//     }
// }

// class AdvCalcu extends Calcu{  // The type AdvCalcu cannot subclass the final class Calcu
// public void show(){ // Cannot override the final method from Calcu
//     System.out.println("By Harshit");
// }
// }

// Object Class
class Laptop extends Object {// every class extends Object class implicitly
    String model;
    int price;
    int serial;
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    
}

//UpCasting
class K {
    public void show1(){
        System.out.println("in K show");
    }
}
class J extends K {
    public void show2(){
        System.out.println("in J show");
    }
}

public class Oops {
    public static void main(String[] args) throws ClassNotFoundException {
        // Method Oveloading and local and instance variables
        // int num1 = 4; // local variable
        // int num2 = 5;
        // int num3 = 7;
        // Calculator calc = new Calculator();
        // int result = calc.add(num1, num2,num3);
        // System.out.println(result);
        // Computer com = new Computer();
        // com.listenMusic();
        // String str = com.getMeAPen(2);   
        // System.out.println(str);

        // Encpasulation, Getter & Setters
        //Human h = new Human();
        // h.setAge(21);
        // h.setName("Divyansh Gupta");
        // System.out.println(h.getAge());
        // System.out.println(h.getName());

        // Constructor
        //Human h1= new Human(10, "Divyansh");
        // Human h2 = new Human("Asmi");
        // System.out.println(h2.getAge());
        // System.out.println(h2.getName());

        // static keyword
        // Mobile  c1 = new Mobile("Hyundai",100000);
        // Mobile.name = "Four-Wheel";
        // c1.show();
        // Mobile c2 = new Mobile("Honda",90000);
        // Mobile.name = "Two-Wheel";
        // c2.show();
        // c1.show(); // Static varible name also changed for c1 when changed later in code as it is shared by all objects 

        // // static method 
        // Mobile.show1(c1);

        // static block 
        // Mobile c3 = new Mobile("Tata", 100000);
        // c3.show();

        // Mobile c4 = new Mobile("Suzuki", 50000);
        // c4.show();

        //Loading some class explicitly without object craetion  - this throws an exception
        //Class.forName("oops.Mobile");

        // Anonymous Objects 
        // new A().show();

        // Inheritence - Single lvl and multi-lvl
        // VeryAdvCalc obj = new VeryAdvCalc();
        // int r1 = obj.add(5, 2);
        // int r2 = obj.sub(5, 2);
        // int r3 = obj.multi(5, 2);
        // int r4 = obj.div(5, 2);
        // double r5 = obj.power(3,2);
        // System.out.println(r1 + " " + r2 + " "+ r3 + " " + r4 + " " + r5);
        
        // java doesnt support multiple inheritence because of ambuguity they just the just problem rather than solving it - java things 

        // this and super();
        //super(); is present in the top of every constructor to implicitly call the super class default constructor , if want to make some changes we can explicity mention it , for example calling a parameterized constructor 
        // C obj = new C(5);

        // Method Overriding - child method overriding parent method
        // Using Cal and  AdvCalc
        // AdvCalc obj = new AdvCalc();
        // int a = obj.add(5, 6);
        // System.out.println(a);

        // Packages 
        // Using a method from Hello class from Basics pakage by importing it 
        // Hello obj = new Hello();
        // obj.printMultiplication(10);

        // Access Modifiers
        // Hello obj = new Hello();
        //System.out.println(obj.marks); // default cannot be accessed in diff package 

        // Calc obj1  = new Calc();;
        // System.out.println(obj1.add(5, 6));
        //System.out.println(obj1.num); // private cannot be  accessible from a class in same package 
        //System.out.println(obj1.a); // default can be accessed in the same pakage anywhere 

        //Protected

        // M obj  = new M();
        // System.out.println(obj.q); // same pkg non sub-class - protected accessible
        // G obj = new G();
        // obj.abc(); // diff package subclass 


        //Dynamic method Dispatch - whatever the type of reference it will call method according to the object of the class it is 
        
        //- Inheritence is must to a reference of parent class to point to a child object 
        //reference of Z
        // Z obj = new Z(); // Pointing to Z 
        // obj.show();

        // obj = new X(); // pointing to X 
        // obj.show();
        // //obj.sub(); // The method sub() is undefined for the type Z

        // obj = new V(); // pointing to V
        // obj.show();

        //final variable 
        // final int num = 8;
        // //num = 9; cannot reassign
        // System.out.println(num);

        // Final class and methods
        // AdvCalc obj = new AdvCalc();
        // obj.add(1,2);

        // Object Class
        // Laptop obj1 = new Laptop();
        // obj1.model ="Lenovo Yoga";
        // obj1.price = 1000;

        // Laptop obj2 = new Laptop();
        // obj2.model ="Lenovo Yoga";
        // obj2.price = 1000;
        // System.out.println(obj1); //Whenever we print the object, obj.toString() is called implicitly
        // // equals()
        // System.out.println(obj1.equals(obj2)); // overriden equals is being called 

        //UpCasting 
        K obj = (K) new J(); // creating an object of child class and referencing it with an variable of parent class type - so it can only call parents methods and variables 
        obj.show1();
        //obj.show2(); // The method show2() is undefined for the type K

        // DownCasting
        J obj1 =  (J) obj; 
        obj1.show2();

        







    }

}



