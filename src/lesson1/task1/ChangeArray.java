package lesson1.task1;

public class ChangeArray {

    private static <T> void changeTwoElements(T[] arr, int element1, int element2) {
        T tempElement;

        if (element1 >= 0 && element1 < arr.length && element2 >= 0 && element2 < arr.length) {
            System.out.println("Замена элементов с индексами (" +element1 +"<->" + element2 + ")");
            tempElement = arr[element1];
            arr[element1] = arr[element2];
            arr[element2] = tempElement;
        }
        else
            System.out.println("Неверные индексы элементов (" +element1 +", " + element2 + "). Элементы не поменяны!");
    }

    private static <T> void printArray(T[] arr) {
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

    public static void main(String[] args) {
//        Integer[] arrayI = { 1, 2, 3, 4, 5 };     //для проверки примитивных типпов
//        Float[] arrayF = {1f, 2f, 3f, 4f, 5f};
        String[] arrayS = {"a", "b", "c", "d", "e"};

        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Object[] arrayObj = {obj1, obj2, obj3};

//        printArray(arrayI);                   //для проверки примитивных типпов
//        changeTwoElements(arrayI, 2, 3);
//        printArray(arrayI);
//
//        printArray(arrayF);
//        changeTwoElements(arrayF, 1, 6);
//        printArray(arrayF);

        printArray(arrayS);
        changeTwoElements(arrayS, 0, 2);
        printArray(arrayS);

        printArray(arrayObj);
        changeTwoElements(arrayObj, 2, 1);
        printArray(arrayObj);

    }
}
