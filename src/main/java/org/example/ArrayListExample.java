package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){

//        // Предположим
//        int [] x = new int[3];
//
//        for(int i=0; i<4; i++){
//            x[i] = i; // Exception: Index 3 out of bounds for length 3
//        }

        // Именно эту проблему решает класс ArrayList


        // В ArrayList мы можем указывать только ссылочные типы, но не приимитив
        // В ArrayList мы также не указываем сколько элементов должно быть, ArrayList сам
        // подстраивается под то количество элементов, которую мы помещаем
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Добавление элементов
        for(int i = 0; i < 10; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList.toString()); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        // Получение элементов по индексу
        System.out.println(arrayList.get(0)); //Получаем первый элемент
        System.out.println(arrayList.get(9)); //Получаем последний элемент

        // Получить размер(количество элементов
        System.out.println(arrayList.size()); // 10

        // Удаление элементов
        // Удаление элементов с помощью метода remove занимает много времени и поэтому для этого следует использовать LinkedList
        arrayList.remove(0); // Удаление первого элемента
        System.out.println(arrayList.toString()); //[1, 2, 3, 4, 5, 6, 7, 8, 9]

        // Согласно конвенции, рекомендуется использовать интерфейсы для объявления переменных, например, List,
        // что обеспечивает большую гибкость. Это позволяет легко изменить реализацию (например, заменить ArrayList на LinkedList),
        // не затрагивая остальной код, который работает с этим объектом.
        List<Integer>arrayList2 = new ArrayList<>();


    }

}
