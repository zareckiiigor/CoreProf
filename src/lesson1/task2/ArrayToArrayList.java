package lesson1.task2;


import java.util.*;

public class ArrayToArrayList {

    public static void main(String[] args) {
        Integer[] arrayI = { 1, 2, 3, 4, 5 };
        Float[] arrayF =  {1f, 2f, 3f, 4f, 5f};
        String[] arrayS ={"a", "b", "c", "d", "e"};

        printArray(arrayI);
        printList(arrayToList(arrayI));

        printArray(arrayF);
        printList(arrayToList(arrayF));

        printArray(arrayS);
        printList(arrayToList(arrayS));
    }

    public static <E> List<E> arrayToList(E[] arr) {
        List<E> list = new ArrayList<>();
        Collections.addAll(list, arr);
        return list;

    }

    private static <E> void printArray(E[] arr) {
        System.out.print("Массив: [");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            }
            else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    private static <E> void printList(List<E> list) {
        System.out.print("Лист: [");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + ", ");
            }
            else {
                System.out.print(list.get(i));
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
