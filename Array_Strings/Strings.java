package Array_Strings;
public class Strings {
    public static void main(String[] args) {
         // String - this is class 
        // String name = new String("Divyansh");

        // System.out.println("Hello "+ name);
        // System.out.println(name.hashCode()); // prints the hashCode 
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat(" Gupta")); // adds at the end of the string

        // // String Constant Pool and Immutability Of Strings 
        // name = "Mr " + name; //  new memory assigned(new object created) , address updated to 103 , now 105 is eligible for garbage collection  : see in notes 
        // System.out.println("Hello "+ name);

        // String s1 = "Navin";
        // String s2 = "Navin";
        // String s3 = new String("Navin");
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);

        //StringBuffer 
        StringBuffer sb = new StringBuffer("Divyansh");
        System.out.println(sb.capacity()); // Shows Capacity
        //System.out.println(sb.length()); // Shows Length
        //sb.deleteCharAt(3);// To delete a specific character at index
        sb.insert(8," Java"); // Insert at specific index
        sb.append(" Gupta"); // Appends at end 
        sb.setLength(30);// Sets length to 100 
        sb.ensureCapacity(100);// Ensures a minimum capacity of given and keeps the empty at end 
        String str = sb.toString(); // Converts StringBuffer to String
        System.out.println(str);





    }
}
