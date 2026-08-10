package Array_Strings;
class Student{
    String name;
    int roll_no;
    int marks;
}
public class Arrays {
    public static void main(String[] args) {
        // int nums[] = new int[4];
        // nums[0] = 3;
        // nums[1] = 7;
        // nums[2] = 2;
        // nums[3] = 4;

        // for(int i=0;i<4;i++){
        //     System.out.println(nums[i]);
        // }
        // //System.out.println(nums[1]);

        // Multi-dimensional Array
        //int nums[][] = new int[3][4];

        // jagged Array - internal arrays have different sizes
        // int nums[][] = new int[3][];

        // nums[0] =  new int[3];
        // nums[1] =  new int[4];
        // nums[2] =  new int[2];

        // // 3d array 
        // //int nums[][][] = new int[3][4][5];


        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         nums[i][j] = (int)(Math.random()*10);
        //     }
        // }
        
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         System.out.print(nums[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

        // Enhanced for loop
        // for(int n[] : nums){
        //     for(int m : n){
        //         System.out.print(m+ " ");
        //     }
        //     System.out.println();
        // }


        // Array Of Objects
        Student s1 = new Student();
        s1.name = "Divyansh";
        s1.marks = 100;
        s1.roll_no = 42;

        Student s2 = new Student();
        s2.name = "Ram";
        s2.marks = 200;
        s2.roll_no = 7;

        Student s3 = new Student();
        s3.name = "Shyam";
        s3.marks = 200;
        s3.roll_no = 7;

        Student student[] = new Student[3];

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        //System.out.println(s1);

        // for(int i=0;i<student.length;i++){
        //     System.out.println(student[i].name + " : "+student[i].marks);
        // }

        for(Student stud : student){
             System.out.println(stud.name + " : "+stud.marks);   
        }

        // Strings - they are classes 
        String name = new String("Divyansh");

        System.out.println("Hello "+ name);
        System.out.println(name.hashCode()); // prints the hashCode 
        System.out.println(name.concat("Gupta")); // adds at the end of the string
    }
}
