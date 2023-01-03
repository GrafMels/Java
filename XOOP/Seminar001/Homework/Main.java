
/** 
 * 
 */
public class Main {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        Controller.contr();
        
        System.out.println(System.currentTimeMillis() - time + " ms");
    }
    
}
