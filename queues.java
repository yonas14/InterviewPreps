import java.util.Random;

public class queues {

    static int [] array = new int[10];
    static int first, last;

    public static void main(String [] args){
        Random rand = new Random();
        for (int  i =0; i < array.length; i++)
        {
            enqueue(rand.nextInt(100)+1);

        }
        for (int  i =0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int  i =0; i < array.length-1; i++)
        {
            dequeue();
        }
        for (int  i =0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void enqueue(int value){

        array[last] = value;
        last++;
    }

    public static void dequeue(){

        array[first] = 0;
        first++;

    }



}
