
/**
 * Controller
 */
public class Controller {
    public static void contr() {
        View.read();
        
        String out = "N";
        for (; out.equals("N"); ) {
            String answer = View.whatWork();
            if (answer.equals("0")) {
                Model.WorkPrint();
            } else if (answer.equals("1")) {
                Model.WorkPrint(View.classNumber);
            } else if (answer.equals("2")) {
                Model.WorkPrint(View.classNumber, View.classLetter);
            } else if (answer.equals("3")) {
                System.out.println("13");
            } else if (answer.equals("4")) {
                System.out.println("14");
            } else if (answer.equals("5")) {
                System.out.println("15");
            } else if (answer.equals("6")) {
                System.out.println("16");
            } else if (answer.equals("7")) {
                System.out.println("17");
            } else if (answer.equals("8")) {
                System.out.println("18");
            } else if (answer.equals("9")) {

                out = "Y";
            } else{
                System.out.println("20");
            } 
        }
        
    }
    
}
