package Exercise;

import java.util.Random;

public class FindCommonStrings {
// given 4 arrays that may contain both numbers and strings
// return a new array with the numbers and/or strings that appear in all 4 arrays
// duplicates are only counted once;
// for example == given the following input

    // var array1 = [1,4,6,7,'ferret',12,12,99,2000,'dog','dog',99,1000];
    // var array2  = [15,9,9,'ferret',9,26,12,12,'dog'];
    // var array3 = [23,12,12,77,'ferret',9,88,100,'dog'];
    // var array4 = ['ferret',12,12,45,9,66,77,78,2000];

// your output would be [ 12, 'ferret']

    // if there are no common numbers or strings return the string "Nothing in Common!"
    public static void main(String [] args){

        int [] array1 = new int[10];
        int [] array2 = new int[10];
        Random rand = new Random(10);

        for(int i =0; i < array1.length; i++){
            array1[i] = rand.nextInt(10)+1;
            array2[i] = rand.nextInt(10)+1;


        }

    }

    public static void duplicates(){}


}
