package Project001;
import java.util.LinkedList;

/**
 * Program001
 */
public class Program001 {
    public static int[] array = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,6,7,7,1,1};
    public static LinkedList<Integer> list = new LinkedList<Integer>();
    public static LinkedList<String> list_string = new LinkedList<String>();
    public static int lengthArray = array.length;
    public static void main(String[] args) {
        for (int i = 0; i < lengthArray; i++) {
            seach(i);
        }
        
    }
    public static void seach(int i) {
        int in = array[i];
        int numberOfRepetitions = 0;
        String Y = "Y";
        

        if(i!=0){
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j) == in){
                    Y = "N"; 
                }
            }

            for (int j = 0; j < lengthArray; j++) {
                if(array[j] == in){
                    numberOfRepetitions++;
                }
            }
            list.add(i);
            list_string.add(i + " " + numberOfRepetitions);
        }else{
            for (int j = 0; j < lengthArray; j++) {
                if(array[j] == in){
                    numberOfRepetitions++;
                }
            }
            list.add(i);
            list_string.add(i + " " + numberOfRepetitions);
        }
    }
    
}