public class Sample{
    public static void main(String [] args){
        String word = "ARsenalzZ";

        for(int i=0; i< word.length(); i++){

            int a = word.charAt(i);
            System.out.print(a+" ");
        }
    }



    public static void replaceWhite(String word){
        char[] array = word.toCharArray();
        for(char c: array){
            int cha = c;
            if(cha == 32){

            }
        }

    }



}