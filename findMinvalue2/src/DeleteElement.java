import java.util.Arrays;

public class DeleteElement {

    public static void main(String[] args) {
        int[] myArr = new int[]{10, 4, 6, 7, 8, 6};
        int[] newArr = deleteElement(myArr, 7);
        System.out.println("Your new array is: " + Arrays.toString(newArr));
    }


    public static int[] deleteElement(int[]arr, int element){
        int[] myNewArr = new int[arr.length-1];
        int elementIndex = 0;
        for (int i=0; i< arr.length; i++){
            if(arr[i] == element){
                elementIndex = i ;
            }
        }
        for (int i = 0, j=0; i < arr.length; i++) {
            if (i == elementIndex) {
                continue;
            }
            myNewArr[j++] = arr[i];
        }
        return myNewArr;

        }
    }

