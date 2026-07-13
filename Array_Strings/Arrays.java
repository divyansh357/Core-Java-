package Array_Strings;

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
        int nums[][] = new int[3][];

        nums[0] =  new int[3];
        nums[1] =  new int[4];
        nums[2] =  new int[2];

        // 3d array 
        //int nums[][][] = new int[3][4][5];


        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }
        
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         System.out.print(nums[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

        // Enhanced for loop
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m+ " ");
            }
            System.out.println();
        }
    }
}
