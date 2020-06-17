package lesson1.task3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private final ArrayList<T> boxList = new ArrayList<>();

    public Box() {
    }

    public void addFruit(T fruit) {
        boxList.add(fruit);

        System.out.println("Добавлено 1 " + boxList.get(0).getClass().getSimpleName() +
                ". В коробке " + boxList.size() + " " + boxList.get(0).getClass().getSimpleName());
    }

    public void addFruit(T fruit, int count) {
        for (int i = 0; i < count; i++) {
            boxList.add(fruit);
        }

        System.out.println("Добавлено " + count + " " +  boxList.get(0).getClass().getSimpleName() +
                ". В коробке " + boxList.size() + " " + boxList.get(0).getClass().getSimpleName());
    }

    public float getWeight() {
        float weightBox = 0;

        for (T t : boxList) {
            weightBox += t.getWeight();
        }

        return weightBox;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void putAll(Box<T> dstBox) {
        if (!this.equals(dstBox)) {
            dstBox.boxList.addAll(boxList);
            boxList.clear();
        }
        else {
            System.out.println("Нельзя пересыпать из самой в себя");
        }
    }
}
