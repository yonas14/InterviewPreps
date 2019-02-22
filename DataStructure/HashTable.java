package DataStructure;
import java.util.*;


public class HashTable {


    public static void main(String args []){

        String word = "abcdefga";
        int [] array = new int[word.length()];
        for (int i = 0; i < word.length(); i++){
            int index = hascode(word.charAt(i));
            array[index] = array[index] + 1;

        }
        for (int i=0; i< array.length; i++){
            if (array[i] > 1){
                System.out.print("Word is not composed of unique Char");
                break;
            }else if (i == array.length -1) {
                System.out.print("Word is fully Composed of unique Char ");
            }

        }







    }

    public static int hascode(char c){

        int index;
        index = (int)c - 'a';
        return index;
    }

}
