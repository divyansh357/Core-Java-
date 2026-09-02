package Basics;
import java.util.*;
public class Hello {
    int marks = 6;
    protected int p = 89;
     public void printMultiplication(int number)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(number+"*"+i+"="+number*i);
        }
    }
    public static void main(String a[]){
        //System.out.println("Hello World");

        // Variables
        // int num1 = 3;
        // int num2 = 5;
        // int result = num1+num2;
        // System.out.println(result);
        // long l = 8523l;
        // System.out.println(l);
        // short s = 234;
        // char c = 'd';
        // float r = 3.4f;
        // boolean b = true; 

        // Literals

        // int num1 = 0b101; // binary format 
        // System.out.println(num1);
        // int num2 = 0x7e; // hexadecimal format 
        // System.out.println(num2);
        
        // int num3 = 1000_000_000; // can put underscores
        // System.out.println(num3);

        // double num4 = 12e10;
        // System.out.println(num4);

        // char c = 'a';
        // c++;
        // System.out.println(c);

        //Type Coversion
        //  int a = 25;
        //  long b = a;
        //  System.out.println(b); // It works as both two conditions are satisfied 

        // long a = 25;
        // int b = a;
        // System.out.println(b); // error: incompatible types: possible lossy conversion from long to int, second condition is not satisfied

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextFloat(); // error: incompatible types: possible lossy conversion from float to int
        // System.out.println(a);
 
        
        // Type Casting = Carrying out a lossy conversion

        //  float a = 25.12f;
        //  int b = (int)a;
        //  System.out.println(b);

        //  float marks = 99.99f;
        //  int marks2 = (int)marks;
        //  System.out.println(marks2);

        // char ch = 'a';
        // char ch2 ='b';
        // int number = ch;
        // int number2 = ch2;
        // System.out.println(number);
        // System.out.println(number2); // Type Conversion of char to number is possible in java (ASCII Values)

        // Type Promotion 

        // char a = 'a';
        // char b = 'b';
        // //char c = a-b ; // possible lossy conversion from int to char
        // System.out.println((int)b);
        // System.out.println((int)a);
        // System.out.println(b-a);
        // System.out.println(b+a);
        // System.out.println(a);

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte) (a+b+c);
        // System.out.println(bt);

        // int a = 10;
        // float b =20.25f;
        // long c = 25;
        // double d = 30;
        // // int ans = a+b+c+d; //possible lossy conversion from double to int
           //double ans = a+b+c+d;
        // System.out.println(ans);

        // byte b = 5;
        // // byte a = b*2; //possible lossy conversion from int to byte
        // byte a = (byte) (b*2);
        // System.out.println(a);   

        //Problems

        //q1
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // float b = sc.nextFloat();
        // double c = sc.nextDouble();
        // float avg = (float)(a+b+c)/3;
        // System.out.println(avg);

        //q2
        // Scanner sc = new Scanner(System.in);
        // float side = sc.nextFloat();
        // float area = side*side;
        // System.out.println(area);

        //q3
        // Scanner sc = new Scanner(System.in);
        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // float bill = pencil + pen + eraser;
        // float bill_with_gst = bill + (bill* 0.18f);
        // System.out.println("Total bill is:"+ bill + "\n Bill with 18% tax:"+bill_with_gst);
        
        //q4
        // byte b = 4;
        // char c ='a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;
        // double result = (f*b)+ (i%c) - (d*s); // Promoted to largest datatype present
        // System.out.println(result);

        //q5
        // int $ = 5;
        // System.out.println($);
        

        //If Else Statement
        // int age = 22;
        // if(age>=18)
        // {
        //     System.out.println("Adult : Drive, Vote");
        // }
        // if(age>13 &&age<18)
        // {
        //     System.out.println("Teenager");
        // }
        // else
        // {
        //     System.out.println("Not adult.");
        //     System.out.println();
        // }
        // Largest of 2 numbers
        // int a =1;
        // int b =5;
        // if(a>=b)
        // {
        //     System.out.println("A is greatest.");
        // }
        // else
        // {
        //     System.out.println("B is greatest.");
        // }

        // Even or Odd
        // Scanner s = new Scanner(System.in);
        // int num = s.nextInt();
        // if(num%2==0)
        // {
        //     System.out.println("Even");
        // }
        // else
        // {
        //     System.out.println("Odd");
        // }
        // s.close();

        // Else if Statements
        // int age= 13;
        // if(age>=18)
        // {
        //     System.out.println("Adult");
        // }
        // else if(age>=13 && age<18)
        // {
        //     System.out.println("Teenager");
        // }
        // else
        // {
        //     System.out.println("Child");
        // }

        // Income tax calculator
        // Scanner s = new Scanner(System.in);
        // int income = s.nextInt();
        // int tax;
        // if(income<500000)
        // {
        //     tax=0;
        // }
        // else if(income>=500000 && income<1000000)
        // {
        //     tax = (int)(income*0.2);
        // }
        // else
        // {
        //     tax = (int)(income*0.3);
        // }
        // System.out.println("Your tax is:"+ tax);
        // s.close();

        // Largest of 3 numbers
        // Scanner s = new Scanner(System.in);
        // int a = s.nextInt();
        // int b = s.nextInt();
        // int c = s.nextInt();
        // if(a>=b && a>=c)
        // {
        //     System.out.println("A is largest.");
        // }
        // else if(b>=c)
        // {
        //     System.out.println("B is greatest.");
        // }
        // else
        // {
        //     System.out.println("C is greatest.");
        // }
        // s.close();

        // Ternary Operator
        //Used for writing if else in one line 

        // int number =3;
        // String type =((number%2)==0)? "even":"odd";
        // System.out.println(type);

        // boolean larger = (5<3)?true:false;
        // System.out.println(larger);

        // pass or fail 
        // Scanner s = new Scanner(System.in);
        // int marks = s.nextInt();
        // String report = (marks>=33)? "Pass":"Fail";
        // System.out.println(report);
        // s.close();

        // Switch Statement
        // int a=2; // any data type could be taken like character, float
        // switch(a)
        // {
        //     case 1 : System.out.println("Samosa");
        //               break;
        //     case 2 : System.out.println("Burger");
        //               break;
        //     case 3 : System.out.println("Mango Shake");
        //               break;
        //     default : System.out.println("We wake up");
        // }

        // After Java 14 , break is no more a burden 
        // Used as a statement (no return value)
// switch (day) {
//     case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
//     case TUESDAY                -> System.out.println(7);
//     case THURSDAY, SATURDAY     -> System.out.println(8);
//     case WEDNESDAY              -> System.out.println(9);
//     default                     -> System.out.println(0);
// }

        // Calculator
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter a:");
        // int a = s.nextInt();
        // System.out.println("Enter b:");
        // int b = s.nextInt();
        // System.out.println("Enter operation:");
        // char operator = s.next().charAt(0);
        // switch(operator)
        // {
        //     case '+' : System.out.println(a+b);
        //     break;
        //     case '-' : System.out.println(a-b);
        //     break;
        //     case '*' : System.out.println(a*b);
        //     break;
        //     case '/' : System.out.println(a/b);
        //     break;
        //     case '%' : System.out.println(a%b);
        //     break;
        //     default : System.out.println("Invalid input");
        //     s.close();
        // }

        // Practice Problems
        //q1
        // Scanner s = new Scanner(System.in);
        // int a = s.nextInt();
        // if(a>0)
        // {
        //     System.out.println("Positive");
        // }
        // else
        // {
        //     System.out.println("Negative");
        // }
        // s.close();

        //q2
        // double temp= 103.5;
        // if(temp>100)
        // {
        //     System.out.println("You have fever.");
        // }
        // else
        // {
        //     System.out.println("You don't have fever.");
        // }

        //q3
        // Scanner s = new Scanner(System.in);
        // int number = s.nextInt();
        // switch(number)
        // { 
        //     case 1:System.out.println("Monday");
        //     break;
        //     case 2:System.out.println("Tuesday");
        //     break;
        //     case 3:System.out.println("Wednesday");
        //     break;
        //     case 4:System.out.println("Thursday");
        //     break;
        //     case 5:System.out.println("Friday");
        //     break;
        //     case 6:System.out.println("Saturday");
        //     break;
        //     case 7:System.out.println("Sunday");
        //     break;
        //     default: System.out.println("Invalid input");
        // }
        // s.close();

        //q4
        // int a=63, b=36;
        // boolean x = (a<b)? true :false;
        // int y = (a>b)? a:b;
        // System.out.println(x);
        // System.out.println(y);

        //q5
        //Leap Year
        // Scanner s = new Scanner(System.in);
        // int year = s.nextInt();
        // if(year%4==0)
        // {
        //     if(year%100==0)
        //     {
        //         if(year%400==0)
        //         {
        //             System.out.println("Leap year");
        //         }
        //         else
        //         {
        //             System.out.println("Not a leap year.");
        //         }
        //     }
        //     else
        //     {
        //         System.out.println("Leap year");
        //     }
        // }
        // else
        // {
        //     System.out.println("Not a leap year.");
        // }
        // s.close();


        // While loops
        //int counter=0;
        // while(counter<100)
        // {
        //     System.out.println("Hello World");
        //     counter++;
        // }

        // while(true)
        // {
        //     System.out.println("Hello");
        // }

        //System.out.println("hello");

        // Print numbers from 1 to 10
        
        // int counter=1;
        // while(counter<=10)
        // {
        //     System.out.print(counter+" ");
        //     counter++;
        // }

        // Print numbers from 1 to n 
        // Scanner s = new Scanner(System.in);
        // int counter=1;
        // int range = s.nextInt();
        // while(counter<=range)
        // {
        //     System.out.print(counter+" ");
        //     counter++;
        // }
        // s.close();

        // Sum of n natural numbers
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int sum=0;
        // int i=1;
        // while(i<=n)
        // {
        //     sum+=i;
        //     i++;
        // }
        // System.out.println("Sum is="+sum);
        // s.close(); 

        //For loop
        // for(int i=1;i<=10;i++)
        // {
        //     System.out.println("Hello World");
        // }

        //Square Pattern
        // for(int i=1;i<=4;i++)
        // {
        //     System.out.println("****");
        // }

        // int line=1;
        // while(line<=4)
        // {
        //     System.out.println("****");
        //     line++;
        // }

        //Print reverse of a number 
        // Scanner s = new Scanner(System.in);
        // int num = s.nextInt();
        // int lastdigit;
        // while(num>0)
        // {
        //     lastdigit=num%10;
        //     System.out.print(lastdigit);
        //     num/=10;
        // }
        // s.close();

        //Reverse the og number
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int rev=0, last_digit=0;
        // while(n>0)
        // {
        //     last_digit= n%10;
        //     rev =(rev*10)+last_digit;
        //     n=n/10;        
        // }
        // System.out.println(rev);
        // s.close();

        // Do While Loop
        // int counter =1;
        // do
        // {
        //     System.out.println("Hello World");
        //     counter++;
        // }while(counter<=10);

        //break statement

        // for(int i=1;i<=5;i++)
        // {
        //     if(i==3)
        //     {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("Loop escaped");

        //question (Scanner for multiple of 10)

        // Scanner s = new Scanner(System.in);
        // while(true)
        // {
        //     int number = s.nextInt();
        //     if(number%10==0)
        //     {
        //         break;
        //     }
        //     System.out.println("Number="+number);
        // }
        // System.out.println("Loop escaped");
        // s.close();

        // Countinue Keyword
        // for(int i=1;i<=5;i++)
        // {
        //     if(i==3)
        //     {
        //       continue;
        //     }
        //     System.out.println(i);
        // }

        // 
        // Scanner s = new Scanner(System.in);
        // do
        // {
        //     System.out.print("Enter your number :");
        //     int number = s.nextInt();
        //     if(number%10==0)
        //     {
        //         continue;
        //     }
        //     System.out.println("Number was="+number);
        // }while(true);

        // Prime number Checker
        // Scanner s = new Scanner(System.in);
        // int num = s.nextInt();
        // if(num==2)
        // {
        //     System.out.println("Prime number");
        // }
        // else
        // {
        //     boolean isPrime = true;
        //     for(int i=2;i<=Math.sqrt(num);i++) // Using  math class to find square root
        //     {
        //         if(num%i==0) // n is multiple of i (i is not equal to 1 or n)
        //         {
        //             isPrime = false;
        //         }
        //     }

        //     if(isPrime==true)
        //     {
        //         System.out.println("Prime Number.");
        //     }
        //     else
        //     {
        //         System.out.println("Not a prime number.");
        //     }
        // }
        // s.close();

        // Questions 
        //q1
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println("Hello");
        //     i+=2;
        // }

        //q2
        // Scanner sc = new Scanner(System.in);
        // int choice,temp,sum_even=0,sum_odd=0;
        // do
        // {
        //     System.out.print("Enter a number:");
        //     temp=sc.nextInt();
        //     if(temp%2==0)
        //     {
        //         sum_even+=temp;
        //     }
        //     else
        //     {
        //         sum_odd+=temp;
        //     }
        //     System.out.print("Do you want continue ? Press 1 for yes and 0 for no:");
        //     choice = sc.nextInt();
        
        // }while(choice==1);
        // System.out.println("Sum of even terms:"+sum_even);
        // System.out.println("Sum of odd terms:"+sum_odd);
        // sc.close();

        //q3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:");
        // int num = sc.nextInt(); 
        // int factorial=1;
        // while (num>0) 
        // {
        //     factorial*=num;
        //     num--;
        // }      
        // System.out.println("Factorial="+factorial);

        //q4

        // printMultiplication(8);

        // q5

        // for(int i=0;i<=5;i++)
        // {
        //     System.out.println(i);
        // }
        // System.out.println("i after loop is:"+i);// i cannot be used here as scope of i ends after for loop.
        

        

     }
}
    



