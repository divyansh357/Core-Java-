package oops;
class Calculator{
    int num; // instance variable
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
public class Oops {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int num3 = 7;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2,num3);
        System.out.println(result);
        // Computer com = new Computer();
        // com.listenMusic();
        // String str = com.getMeAPen(2);   
        // System.out.println(str);

    }

}

