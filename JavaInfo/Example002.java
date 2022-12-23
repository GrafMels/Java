import java.util.ArrayList;
public class Example002 {
    public static void main(String[] args) {  
        ArrayList<Integer> nameList = new ArrayList<Integer>();
        for(int i = 0 ; i < 100 ; i++){
            nameList.add(i*(11));
        }
        
        for (int i = 0; i < 100; i++) {
            System.out.println(nameList.get(i));
         }
        
    }
}

