import java.util.ArrayList;

public class Ex004 {
    public static void main(String[] args) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 1; i < 102; i++) {
            newArray.add(i);
        }
        Integer firstSum = quickSum(newArray);
        newArray.add(5);
        Integer secondSum = quickSum(newArray);
        System.out.println(String.format("Искомое число %s", secondSum - firstSum));
    }

    public static Integer quickSum(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        System.out.println(sum);
        return sum;
    }
}
