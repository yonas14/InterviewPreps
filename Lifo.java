import java.util.*;

public class Lifo {


   static int [] array;
   static int popIndex= -1;

    public static void main(String[] args){

        Random rand = new Random();
        array = new int[10];
        for(int i=0; i<array.length; i++){
            push(rand.nextInt(100)+1);
        }
        System.out.println("Before pop");

        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + ",");
        }
        System.out.println();

        pop();
        System.out.println("After pop");

        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + ",");
        }

    }


    public static void push(int value){
        popIndex++;
        if((array.length-1) >= popIndex){
            array[popIndex] = value;

        }else {
            System.out.println("Stack full fooo!!");
        }

    }

    public static void pop(){

        if(array[popIndex] == 0 || popIndex == -1){
            System.out.println("Empty");
        }else
        {
            System.out.println("popped" + array[popIndex]);
            array[popIndex] = 0;
            popIndex--;
        }

    }

    public static boolean isEmpty(int index)
    {
        if(array[index] == 0){

        }

        return true;
    }
}
