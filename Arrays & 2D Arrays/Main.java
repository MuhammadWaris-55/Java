import java.util.*;
// import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        System.out.println("Learning arrays");

        //1D Array

        // int[] age = new int[3];
        // age[0] = 20;
        // age[1] = 15;
        // age[2] = 18;

        // System.out.println(age[0]);
        // System.out.println(age[1]);
        // System.out.println(age[2]);

        //OR
        // int age[] = {20, 15, 18};

        // for(int i = 0; i<3 ; i++){
        //     System.out.println(age[i]);
        // }

        //2D Arrays

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //loops for taking input
        //outer loop controls the rows and inner loop controls the columns
        for(int i = 0; i<rows ; i++){

            for(int j = 0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //loop for output
        for(int i = 0; i<rows ; i++){
            for(int j = 0; j<cols; j++){
                System.out.println(numbers[i][j] + " ");
            }
              System.out.println();
        }

    }
}