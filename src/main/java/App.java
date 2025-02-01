import binarysearch.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        // Проверка бинарного поиска для массива byte
        byte[] byteArray = {1, 3, 5, 7, 9, 11};
        System.out.println("Поиск в byte array элемента 5: " + MyArrays.binarySearch(byteArray, (byte) 5));
        System.out.println("Поиск в byte array элемента 8: " + MyArrays.binarySearch(byteArray, (byte) 8));
        // Проверка бинарного поиска для части массива byte
        System.out.println("Поиск в byte array (fromIndex=1, toIndex=4) элемента 3: " + MyArrays.binarySearch(byteArray, 1, 4, (byte) 3));
        System.out.println("Поиск в byte array (fromIndex=1, toIndex=4) элемента 8: " + MyArrays.binarySearch(byteArray, 1, 4, (byte) 8));

        // Проверка бинарного поиска для массива char
        char[] charArray = {'a', 'c', 'e', 'g', 'i', 'k'};
        System.out.println("Поиск в char array элемента 'e': " + MyArrays.binarySearch(charArray, 'e'));
        System.out.println("Поиск в char array элемента 'h': " + MyArrays.binarySearch(charArray, 'h'));
        // Проверка бинарного поиска для части массива char
        System.out.println("Поиск в char array (fromIndex=1, toIndex=4) элемента 'g': " + MyArrays.binarySearch(charArray, 1, 4, 'g'));
        System.out.println("Поиск в char array (fromIndex=1, toIndex=4) элемента 'h': " + MyArrays.binarySearch(charArray, 1, 4, 'h'));

        // Проверка бинарного поиска для массива int
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println("Поиск в int array элемента 20: " + MyArrays.binarySearch(intArray, 20));
        System.out.println("Поиск в int array элемента 60: " + MyArrays.binarySearch(intArray, 60));
        // Проверка бинарного поиска для части массива int
        System.out.println("Поиск в int array (fromIndex=1, toIndex=4) элемента 30: " + MyArrays.binarySearch(intArray, 1, 4, 30));
        System.out.println("Поиск в int array (fromIndex=1, toIndex=4) элемента 60: " + MyArrays.binarySearch(intArray, 1, 4, 60));

        // Проверка бинарного поиска для массива long
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        System.out.println("Поиск в long array элемента 200: " + MyArrays.binarySearch(longArray, 200L));
        System.out.println("Поиск в long array элемента 600: " + MyArrays.binarySearch(longArray, 600L));

        // Проверка бинарного поиска для части массива long
        System.out.println("Поиск в long array (fromIndex=1, toIndex=4) элемента 300: " + MyArrays.binarySearch(longArray, 1, 4, 300L));
        System.out.println("Поиск в long array (fromIndex=1, toIndex=4) элемента 600: " + MyArrays.binarySearch(longArray, 1, 4, 600L));

        // Проверка бинарного поиска для массива short
        short[] shortArray = {1, 2, 3, 4, 5};
        System.out.println("Поиск в short array элемента 4: " + MyArrays.binarySearch(shortArray, (short) 4));
        System.out.println("Поиск в short array элемента 6: " + MyArrays.binarySearch(shortArray, (short) 6));

        // Проверка бинарного поиска для части массива short
        System.out.println("Поиск в short array (fromIndex=1, toIndex=4) элемента 4: " + MyArrays.binarySearch(shortArray, 1, 4, (short) 4));
        System.out.println("Поиск в short array (fromIndex=1, toIndex=4) элемента 6: " + MyArrays.binarySearch(shortArray, 1, 4, (short) 6));

        // Проверка бинарного поиска для массива double
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Поиск в double array элемента 4.4: " + MyArrays.binarySearch(doubleArray, 4.4));
        System.out.println("Поиск в double array элемента 6.6: " + MyArrays.binarySearch(doubleArray, 6.6));

        // Проверка бинарного поиска для части массива double
        System.out.println("Поиск в double array (fromIndex=1, toIndex=4) элемента 3.3: " + MyArrays.binarySearch(doubleArray, 1, 4, 3.3));
        System.out.println("Поиск в double array (fromIndex=1, toIndex=4) элемента 6.6: " + MyArrays.binarySearch(doubleArray, 1, 4, 6.6));

        // Проверка бинарного поиска для массива float
        float[] floatArray = {0.5f, 1.5f, 2.5f, 3.5f, 4.5f};
        System.out.println("Поиск в float array элемента 3.5: " + MyArrays.binarySearch(floatArray, 3.5f));
        System.out.println("Поиск в float array элемента 6.5: " + MyArrays.binarySearch(floatArray, 6.5f));

        // Проверка бинарного поиска для части массива float
        System.out.println("Поиск в float array (fromIndex=1, toIndex=4) элемента 2.5: " + MyArrays.binarySearch(floatArray, 1, 4, 2.5f));
        System.out.println("Поиск в float array (fromIndex=1, toIndex=4) элемента 5.5: " + MyArrays.binarySearch(floatArray, 1, 4, 5.5f));

        // Проверка бинарного поиска для массива объектов с Comparator
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        Comparator<String> stringComparator = String::compareTo;
        System.out.println("Поиск в string array элемента 'cherry': " + MyArrays.binarySearch(stringArray, "cherry", stringComparator));
        System.out.println("Поиск в string array элемента 'grape': " + MyArrays.binarySearch(stringArray, "grape", stringComparator));

        // Проверка бинарного поиска для части обобщенного массива с использованием Comparator
        System.out.println("Поиск в string array (fromIndex=1, toIndex=4) элемента 'date': " + MyArrays.binarySearch(stringArray, 1, 4, "date", stringComparator));
        System.out.println("Поиск в string array (fromIndex=1, toIndex=4) элемента 'grape': " + MyArrays.binarySearch(stringArray, 1, 4, "grape", stringComparator));


        // Создаем тестовый список для проверки методов бинарного поиска
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10); // Добавляем значения: 0, 10, 20, 30, ...
        }

        // Проверяем метод binarySearch с естественным порядком
        Integer element = new Integer(30);
        System.out.println("Тестирование binarySearch с естественным порядком:");
        int index = MyCollections.binarySearch(list, element);
        System.out.println("Индекс элемента 30: " + index); // Должно быть: 3

        Integer newElement = new Integer(35);
        index = MyCollections.binarySearch(list, newElement);
        System.out.println("Индекс элемента " + newElement + " (не найден): " + index); // Должно быть: -5 (место вставки)

        // Проверяем метод binarySearch с переданным компаратором
        System.out.println("Тестирование binarySearch с пользовательским компаратором:");
        Comparator<Integer> reverseOrder = Comparator.reverseOrder();
        List<Integer> reverseList = new ArrayList<>(list);
        reverseList.sort(reverseOrder);

        index = MyCollections.binarySearch(reverseList, element, reverseOrder);
        System.out.println("Индекс элемента " + element + " в обратном порядке: " + index); // Должно быть: 6

        index = MyCollections.binarySearch(reverseList, newElement, reverseOrder);
        System.out.println("Индекс элемента " + newElement + " в обратном порядке (не найден): " + index); // Должно быть: -8 (место вставки)


    }
}
