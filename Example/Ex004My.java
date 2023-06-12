import java.util.ArrayList;

public class Ex004My {
    public static void main(String[] args) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 1; i < 102; i++) {
            newArray.add(i);
        }
        newArray.add(5);
        newArray = quickSort(newArray, 0, newArray.size() - 1);
        for (int i = 0; i < newArray.size() - 1; i++) {
            if (newArray.get(i) == newArray.get(i + 1)) {
                System.out.println(String.format("Повторяется число %d", newArray.get(i)));
            }
        }
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> array, int leftIndex, int rightIndex) {
        var i = leftIndex;
        var j = rightIndex;
        var pivot = array.get(leftIndex);
        while (i <= j) {
            while (array.get(i) < pivot) {
                i++;
            }

            while (array.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
            }
        }

        if (leftIndex < j)
            quickSort(array, leftIndex, j);
        if (i < rightIndex)
            quickSort(array, i, rightIndex);
        return array;
    }
}
