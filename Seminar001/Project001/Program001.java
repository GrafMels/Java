public class Program001 {
    
// import java.util.Scanner;
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        // boolean flag = iScanner.hasNextInt();
        //     if (flag == true){
        //         int с = iScanner.nextInt();
        //     }
           
        // iScanner.close(); 
        int a = 1;
        int b = 7;
        int c = 2;
        int d = 1;
        if(a < 0){
            System.out.print("Число a должно быть больше или равно нулю."); 
        }else if(b < 1){
            System.out.print("Число b должно быть больше нуля.");
        }else if(a >= b){
            System.out.print("Число a должно быть меньше b.");
        }else{
            String[] code = new String[1000];
            int x = 0;
            for(int i=0;i<1000 | x == 10;i++){
                String marks = code_do(a, b, c, d);
                for(int j=0;j<1000;j++){
                    if(marks == code[j]){
                        marks = "false";
                    }

                }
                code[i] = marks;
              
            }
            String[] new_code = new String[1000];
            int y = 0;
            for(int i=0;i<code.length-1;i++){
                if(code[i]!="false"){
                    new_code[y] = code[i];
                    y++;
                }
                System.out.println(code[y]);
            }
            for(int i=0;i<new_code.length-1;i++){
                System.out.println(code[i]);
            }
            
            
        }

    }
    static String code_do(int a, int b, int c, int d){
        String code = "";
        for(;a < b;){
            double random = Math.random();
            if(a<b){
                if(random<0.5){
                    a = a + d;
                    code = code + "1";
                }else{
                    a = a * c;
                    code = code + "0";
                }
            }
        }
        if(a == b){
            return code;
        }else{
            return "Error 404";
        }

    }
    static boolean code_check(int i, String marks, String[] code){
        for(int j = 0;j<i;j++)
        {
            if(marks == code[j]){
                return true;
            }
        }
        return false;
    }    
}
