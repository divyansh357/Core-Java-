package oops;
class Calculator{
    public int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
}
public class Oops {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }

}

