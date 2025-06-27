public class TaskThree {
    //TODO: Напишите обобщенный метод для поиска элемента в массиве.
    // Метод должен принимать массив и элемент для поиска,
    // а затем возвращать индекс этого элемента в массиве.
    // Если элемент не найден, вернуть -1.
    public static void main(String[] args) {

        Integer[] integerArray = {1, 4, 2, -14, 0, 100, -8};
        System.out.println("Индекс искомого элемента массива - " + searchIndex(integerArray, 0));


        Double[] doubleArray = {1.5, 7.999, -0.13, 61.010101, 0.0};
        System.out.println("Индекс искомого элемента массива - " + searchIndex(doubleArray, 7.999));

    }

    public static <T> int searchIndex(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}
