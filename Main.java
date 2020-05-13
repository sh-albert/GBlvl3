package Lesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String arrayOfStrings[] = {"one", "two", "tree", "four", "five"};
        elementsSwitcher(arrayOfStrings, 0, 4);
        ArrayList<String> arrayList = new ArrayList(arrayToArraylist(arrayOfStrings));
        /** Задание 3 */
        Box<Orange> orangesBox = new Box<>();
        Box<Apple> applesBox = new Box<>();
        for (int i = 0; i < 10; i++) {
            orangesBox.add(new Orange());
        }
        for (int i = 0; i < 15; i++) {
            applesBox.add(new Apple());
        }

    }

    /**Задание 1
     * Если можно, объясните для чего нужно ставить <T> перед void, в начале следующего урока
     * Казалось бы простой пример смог решить только с помощью гугла именно из-за этого момента
     */
    public static <T> void elementsSwitcher(T[] array, int index1, int index2){
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /** Задание 2 */
    public static <V> ArrayList<V> arrayToArraylist(V[] array){
        ArrayList<V> arrayList= new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
}
