import java.util.LinkedList;

/**
 * Model
 */
public class Model {
    public static void WorkPrint(){
        for (int index = 0; index < 200; index++) {
            System.out.println(View.fullInform.get(index));
        }
    }

    public static void WorkPrint(LinkedList<Integer> Class){
        Integer num = PrintMe.whatPrint();

        for (int index = 0; index < 200; index++) {
            if(num.compareTo(Class.get(index)) == 0){
                System.out.println(View.fullInform.get(index));
            }
            
        }
    }
    public static void WorkPrint(LinkedList<Integer> classNumber, LinkedList<String> classLetteer){
        Integer num = PrintMe.whatPrint();
        String letter = PrintMe.whatPrint(" ");
        for (int index = 0; index < 200; index++) {
            if(num.compareTo(classNumber.get(index)) == 0){
                if(letter.equals(classLetteer.get(index))){
                    System.out.println(View.fullInform.get(index));
                }
            }
            
        }
    }
    
}
