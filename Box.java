package Lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> arrayList;

    public Box(){
        arrayList = new ArrayList<T>();
    }

    public float getWeigth(){
        float sumWeight = 0f;
        for (int i = 0; i < arrayList.size(); i++) {
            sumWeight += arrayList.get(i).getWeigth();
        }
        return sumWeight;
    }
    public void add(T fruit){
        this.arrayList.add(fruit);
    }
    public ArrayList<T> getArrayList(){
        return arrayList;
    }

    public boolean compare(Box<? extends Fruit> box){ //IDE преложила добавить в даймонд "extends Fruit" но как это работает я так до конца и не понял
        return this.getWeigth() == box.getWeigth();
    }

    public void moveToAnotherBox(Box<T> box){
        box.getArrayList().addAll(arrayList);
        arrayList.clear();
    }


}
