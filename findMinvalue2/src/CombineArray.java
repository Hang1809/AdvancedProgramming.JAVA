

import java.util.Arrays;
import java.util.Scanner;

public class CombineArray {

    public static double[] createArray(){
        Scanner input = new Scanner(System.in);
        int size;
        do{
            System.out.println("Enter size of the array: ");
            size = input.nextInt();
            if (size < 1 ){
                System.out.println("Size is not less than 1. Try again");
            }
        }while ( size <1 );

        double[] arr = new double[size];
        for (int i =0; i < size; i++){
            System.out.printf("Enter value of element %d: ", i+1);
            arr[i] = input.nextDouble();
        }
        return arr;
    }

    public static double[] combineArrays(double[][]array){
        int total =0;
        for (int i=0; i< array.length; i++){
            total+= array[i].length;
        }

        double[] newArray = new double[total];
        int k=0;
        for (int i=0; i< array.length; i++){
            for (int j=0; j<array[i].length; j++){
                newArray[k++] = array[i][j];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the number of arrays that you want to combine (number array > 1): ");
        int quantity = input.nextInt();
        double[][]allMyArrays = new double[quantity][];

        for (int i=0; i < quantity; i++){
            System.out.printf("\nCreate Array %d: ", i + 1);
            double[] getArray = createArray();
            allMyArrays[i] = getArray;
        }

        System.out.printf("---*---\nAll your arrays :\n");
        for(double[]Array: allMyArrays){
            System.out.println(Arrays.toString(Array));
        }
        String finalArray = Arrays.toString(combineArrays(allMyArrays));
        System.out.printf("-----*----- \nYour new Arrays after combining :%s", finalArray);
    }

}
