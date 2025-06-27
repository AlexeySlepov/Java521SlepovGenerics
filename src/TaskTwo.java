import java.util.Arrays;

public class TaskTwo {
    //TODO: Напишите обобщенный метод для слияния двух массивов одного типа в один.
    public static void main(String[] args) {
        Integer[] firstIntArray = {1, 5, 3, 5};
        Integer[] secondIntArray = {2, 1, 31, 500, -45, 0};
        Integer[] resultIntArray = mergeArrays(firstIntArray, secondIntArray);
        System.out.println(Arrays.toString(resultIntArray));

        String[] firstStrArray = {"First", "Second"};
        String[] secondStrArray = {"Pool", "Base"};
        String[] resultStrArray = mergeArrays(firstStrArray, secondStrArray);
        System.out.println(Arrays.toString(resultStrArray));
    }

    public static <T> T[] mergeArrays(T[] firstArray, T[] secondArray) {
        T[] resultArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        for (int i = firstArray.length, j = 0; i < firstArray.length + secondArray.length; i++, j++) {
            resultArray[i] = secondArray[j];
        }
        return resultArray;
    }
}
