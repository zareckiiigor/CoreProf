package lesson1.task3;

public class Main {

    public static void main(String[] args) {

        Box<Apple> boxApple1 = new Box<>();
        Box<Apple> boxApple2 = new Box<>();

        Box<Orange> boxOrange3 = new Box<>();
        Box<Orange> boxOrange4 = new Box<>();

//        System.out.println("Вес коробки 1: " + boxApple1.getWeight());   //проверка веса коробки до добавления фруктов

        boxApple1.addFruit(new Apple());
        boxApple1.addFruit(new Apple(), 9);
        boxApple2.addFruit(new Apple(), 6);
        boxOrange3.addFruit(new Orange(), 4);
        boxOrange4.addFruit(new Orange(), 8);

        System.out.println("Вес коробки 1: " + boxApple1.getWeight());
        System.out.println("Вес коробки 2: " + boxApple2.getWeight());
        System.out.println("Вес коробки 3: " + boxOrange3.getWeight());
        System.out.println("Вес коробки 4: " + boxOrange4.getWeight());

        System.out.println("Сравнене весов. Коробка 1 и коробка 2: "
                + boxApple1.compare(boxApple2));
        System.out.println("Сравнене весов. Коробка 2 и коробка 3: "
                + boxApple2.compare(boxOrange3));

        System.out.println("Пересыпали из коробки 1 в коробку 2");
        boxApple1.putAll(boxApple2);

        System.out.println("Вес коробки 1: " + boxApple1.getWeight());
        System.out.println("Вес коробки 2: " + boxApple2.getWeight());

        System.out.println("Пересыпали из коробки 4 в коробку 3");
        boxOrange4.putAll(boxOrange3);

        System.out.println("Вес коробки 3: " + boxOrange3.getWeight());
        System.out.println("Вес коробки 4: " + boxOrange4.getWeight());

        System.out.println("Пробуем пересыпать из коробки в себя же.");
        boxOrange3.putAll(boxOrange3);
        System.out.println("Вес коробки 3: " + boxOrange3.getWeight());
        System.out.println("Вес коробки 4: " + boxOrange4.getWeight());
    }
}
