public class Program002 {
    public static int a = 1;
    public static int b = 7;
    public static int c = 2;
    public static int d = 1;
    public static int codeSize = 1000;
    public static String[] code = new String[codeSize];

    public static void main(String[] args) {
        fillCode();
        for (int i = 0; i < codeSize; i++) {
            System.out.println(i + ": " + code[i]);
        }
    }

    public static void fillCode() {
        int counterErrors = 0;
        for (int i = 0; i < codeSize & counterErrors < 500; i++) {
            String element = codeDo(a, b, c, d);
            if (element.equals("Error 404")) {
                counterErrors++;
                i--;
            } else {
                String mark = "Y";
                for (int j = 0; j < i; j++) {
                    if(code[j].equals(code[i])){
                        mark = "N";
                    }
                }
                if(mark.equals("Y")){
                    code[i] = element;
                }else{
                    counterErrors++;
                    i--;
                }
            }
        }
    }

    public static String codeDo(int a, int b, int c, int d) {
        String code = "";
        for (; a < b;) {
            double random = Math.random();
            if (a < b) {
                if (random < 0.5) {
                    a = a + d;
                    code = code + "1";
                } else {
                    a = a * c;
                    code = code + "0";
                }
            }
        }
        if (a == b) {
            return code;
        } else {
            return "Error 404";
        }

    }
}
