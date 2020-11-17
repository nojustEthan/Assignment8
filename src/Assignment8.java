import java.lang.reflect.Array;
import java.util.Scanner;

public class Assignment8 {

    static Scanner request = new Scanner(System.in);

    public static int[] convert(int[][] arr){

        int[] newArray = new int[arr.length * arr[0].length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                newArray[i + (j * arr.length)] = arr[i][j];
            }
        }
        return newArray;
    }

    public static int[] sort(int[] arr){
        int temp;

        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < (arr.length - i); j++){
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArr(int[] arr){
        System.out.print("|");
        for (int l = 0; l < arr.length; l++){
            System.out.print(arr[l] + "|");
        }
    }

    public static void main(String[] args){

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.println("Array 1 slot ("+i+","+j+"):");
                arr1[i][j] = request.nextInt();
            }
        }

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println("");
        }

        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                System.out.println("Array 2 slot ("+i+","+j+"):");
                arr2[i][j] = request.nextInt();
            }
        }

        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println("");
        }

        int[] newArr1 = convert(arr1);
        int[] newArr2 = convert(arr2);

        newArr1 = sort(newArr1);
        newArr2 = sort(newArr2);

        printArr(newArr1);
        System.out.println("");
        printArr(newArr2);
        System.out.println("");

        /*
        this doesnt wanna work
        if (newArr1.equals(newArr2)){
            System.out.println("Arrays are equivalent.");
        } else {
            System.out.println("Arrays are not equivalent.");
        }
        */

        boolean equiv = true;

        for (int i = 0; i < newArr1.length; i++){
            if (newArr1[i] != newArr2[i]){
                equiv = false;
            }
        }

        if (equiv){
            System.out.println("Arrays are equivalent.");
        } else {
            System.out.println("Arrays are not equivalent.");
        }


    }


}
