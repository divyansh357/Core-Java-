package Object_Oriented;
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

public class Oops {
    public static void main(String[] args) throws ClassNotFoundException {
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

        // Inheritence 
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(5, 2);
        int r2 = obj.sub(5, 2);
        int r3 = obj.multi(5, 2);
        int r4 = obj.div(5, 2);
        double r5 = obj.power(3,2);
        System.out.println(r1 + " " + r2 + " "+ r3 + " " + r4 + " " + r5);
        







        

    }

}

