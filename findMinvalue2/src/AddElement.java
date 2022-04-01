import java.util.Arrays;
import java.util.Scanner;

public class AddElement {

    public static void main(String[] args) {
        int[] myArr = new int[]{10, 4, 6, 7, 8, 6};
        Scanner input = new Scanner (System.in);
        int value;
        int position;
        System.out.println("Enter value of element you want to add:");
        value = input.nextInt();
        do {
            System.out.println("Enter position you want to add (start at 0):");
            position = input.nextInt();
            if (position < 0 || position >= myArr.length) {
                System.out.println("Position not exist. Try again !!! ");
            } else {
                break;
            }
        } while (true);

        System.out.println("--***-- Your new array after adding: " + Arrays.toString(AddElementToArray(value,position,myArr)) );
    }

    public static int [] AddElementToArray(int value, int index, int[]array){
        int[] newArray = new int[array.length +1];
        for ( int i=0; i < newArray.length; i++){
            if (i < index){
                newArray[i] = array[i];
            } else if (i == index){
                newArray[i] = value;
            }else {
                newArray[i] = array[i-1];
            }
    }
        return newArray;
    }
}
