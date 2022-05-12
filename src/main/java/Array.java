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


//        Take 10 integer inputs from user and store them in an array and print them on screen.
        int[] a = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("enter number :");
        for(int i= 0; i< a.length; i++){
             a[i] = s.nextInt();

        }
        System.out.println(Arrays.toString(a));


//        Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
//        Now, tell user whether that number is present in array or not.
        int[] b = new int[5];
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
        int pos = 0;
        int neg = 0;
        int zero= 0;
        int even = 0;
        int odd = 0;
        System.out.println("enter numbers :");
        for(int i = 0; i<wholeNumbers.length; i++){
             wholeNumbers[i] = zn.nextInt();
            if(wholeNumbers[i] > 0){
                pos++;
            }
            else if(wholeNumbers[i] < 0){
                neg++;
            }
            else {
                zero++;
            }
            if(wholeNumbers[i]% 2 != 0){
                odd++;
            }
            else{
                even++;
            }
        }
        System.out.println("posNum:" +pos+"\nnegNum:" +neg+"\nzeroNum:"+zero+"\noddNum:"+odd+"\nevenNum:"+even);


//        Take 5 integer inputs from user and store them in an array.
//        Now, copy all the elements in an array but in reverse order.
        int[] yaw = new int[5];
        int temp = 0;
        Scanner y = new Scanner(System.in);
        System.out.println("Please enter 5 number:");
         for(int i= 0;i < yaw.length; i++){
             yaw[i] = y.nextInt();
         }
        System.out.println(Arrays.toString(yaw));
        for(int i= 0;i < yaw.length; i++)
            for(int j = i+1; j< yaw.length; j++){
                if (yaw[i] < yaw[j]){
                    temp = yaw[i];
                    yaw[i] = yaw[j];
                     yaw[j] = temp ;
                }
            }
        System.out.println(Arrays.toString(yaw));

//        Write a program to find the sum and product of all elements of an array.
        int[] array = {1,2,3,5,7};
        int sum = 0;
        int product = 1;
        for(int i = 0;i < array.length; ++i){
            System.out.println(sum += array[i]);
        }
        System.out.println("------------------------");

        for(int i = 0;i < array.length; ++i){
            System.out.println(product *= array[i]);
        }
    }



    }

