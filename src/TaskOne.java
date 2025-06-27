import java.util.Arrays;

public class TaskOne {
//TODO: Напишите обобщенный метод, который сравнивает два массива одного типа и возвращает true,
// если они равны (имеют одинаковые значения в одном и том же порядке) и false в противном случае.
    public static void main(String[] args) {

        Integer[] firstIntArray = {1, 5, 3, 5};
        Integer[] secondIntArray = {1, 5, 3, 5};
        String isCompare = comparingArrays(firstIntArray, secondIntArray) ? "равны" : "не равны";
        System.out.println("Два массива " + isCompare);

        String[] firstStrArray = {"First", "Second"};
        String[] secondStrArray = {"Second", "First"};
        isCompare = comparingArrays(firstStrArray, secondStrArray) ? "равны" : "не равны";
        System.out.println("Два массива " + isCompare);

    }

    public static <T> boolean comparingArrays(T[] firstArray, T[] secondArray) {
        return Arrays.equals(firstArray,secondArray);
    }
}


