import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Task1();
        Task2();
    }

    public static void Task1() {
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        List<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            if ((array.get(i) % 2 == 0) && (array.get(i) != 0)) {
                array.remove(array.get(i));
            }
        }
        System.out.println(array);
    }
    public static void Task2() {
        // Задан целочисленный список ArrayList.
        // Найти минимальное, максимальное и среднее арифметическое из этого списка. (Collections.max())
        List<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        System.out.println(array);

        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int min = Collections.min(array);
        int max = Collections.max(array);
        double average = sum / array.size();

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("average: " + average);
    }
}
