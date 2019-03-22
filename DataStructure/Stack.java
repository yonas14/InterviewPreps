package DataStructure;
import org.omg.CORBA.INTERNAL;

import java.util.*;

public class Stack {
   static ArrayList<Integer> array;
    int popIndex= 0;

    public static void main(String[] args){

        Random rand = new Random();
        array = new ArrayList<Integer>();
        for(int i =0; i <= 10; i++){
            push(rand.nextInt(100)+1);

        }
        print();
        pop();
        pop();
    }


    public static void push(int value){
        array.add(value);
    }


    public static void pop(){

        if(!array.isEmpty()){
            System.out.println("Popped " +  array.remove(array.size()-1));

        }
    }

    public static void print(){

        for(int i =0; i < array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
        System.out.println();

    }

}
