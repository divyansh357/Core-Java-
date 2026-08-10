package oops;
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
public class Oops {
    public static void main(String[] args) {
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
        Human h2 = new Human("Asmi");
        System.out.println(h2.getAge());
        System.out.println(h2.getName());



        

    }

}

