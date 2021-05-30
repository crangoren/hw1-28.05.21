package Lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //task 1

        String[] strArr = new String[2];
        strArr[0] = "1";
        strArr[1] = "2";

        System.out.println(Arrays.deepToString(strArr));

        elementSwap(strArr, 0, 1);

        System.out.println(Arrays.deepToString(strArr));

        // task 2

        ArrayList<String> arrList = toArrayList(strArr);
//        System.out.println(arrList);

        // task 3

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
//        System.out.println(box1.getWeight());
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);

        Box<Apple> box4 = new Box<Apple>();

        box4.add(apple4, apple5, apple6);


        System.out.println(box1.compare(box2));


        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);
        box1.transfer(box4);

//        System.out.println(box4.getWeight());

//        System.out.println(box3.getWeight());
    }

//    public static void elementSwap(Object[] arr, int index1, int index2) {
//        Object tmp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = tmp;
//    }

    private static <T> void elementSwap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));

    }
}
