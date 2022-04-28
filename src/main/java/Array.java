import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
//        One Dimensional Array
        String[] joe = {"Ella","cake","parry"};
        System.out.println(joe[0]);
        joe[0] = "Audrey";
        System.out.println(joe[0]);
         for (int i = 0; i <joe.length; i++){
             System.out.println(joe[i]);
         }

//         two Dimensional Array
        int[][] bet = {{1,4,2},{5,2,5}};
        System.out.println(bet[0][0]);
        bet[0][2] = 6;
        System.out.println(bet[0][2]);
        System.out.println(bet[1][2]);
        for(int i = 0; i<bet.length; i++) {
            for(int b = 0; b<bet[i].length; b++){
                System.out.println("---------");
                System.out.println(bet[i][b]);
            }
        }
        System.out.println(bet.length);



        int numbers[] ={1,2,3,4,5,6,7,8,9,10};
        int[] arr = new int[10];
        int value = 10;
         for(int b = 0; b < arr.length; b++){
             arr[b] = value;
             value += 10;

         }
        System.out.println(Arrays.toString(arr));


        //Take 10 integer inputs from user and store them in an array and print them on screen.
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("enter number :");
        for(int i= 0; i< a.length; i++){
             a[i] = s.nextInt();

        }
        System.out.println(Arrays.toString(a));


//        Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
//        Now, tell user whether that number is present in array or not.

        int[] b = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 10 digits :");
        for(int i= 0; i< b.length; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(b));
        System.out.println("Enter a number :");
        Scanner sn = new Scanner(System.in);
        int ui = sn.nextInt();
        boolean numexist = false;
        for(int v : b){
            if(v == ui){
                numexist = true;
            }
        }
        if(numexist){
            System.out.println("number exist");
        }
        else{
            System.out.println("Sorry the number doesn't exist");
        }

//        Take 20 integer inputs from user and print the following:
//        number of positive numbers
//        number of negative numbers
//        number of odd numbers
//        number of even numbers
//        number of 0s.

        int[] wholeNumbers = new int [5];
        Scanner zn = new Scanner(System.in);
        System.out.println(" enter 5 numbers : ");
        for(int i = 0; i<wholeNumbers.length; i++){
             wholeNumbers[i] = zn.nextInt();
        }
        System.out.println(Arrays.toString(wholeNumbers));
        for(int i : wholeNumbers){
            if(i > 0){
                System.out.println("positive numbers : " + i);
            }
            if(i < 0){
                System.out.println("negative numbers : " + i);
            }
            if(i % 2 != 0){
                System.out.println("odd numbers :" + i);
            }
            if(i % 2 == 0){
                System.out.println("even numbers : " + i);
            }
            if(i == 0) {
                System.out.println("zero numbers : " + i );

            }

        }

    }



    }

