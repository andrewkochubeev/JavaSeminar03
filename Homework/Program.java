package Homework;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Пусть дан произвольный список целых чисел.
 * 
 * 1) Нужно удалить из него чётные числа
 * 2) Найти минимальное значение
 * 3) Найти максимальное значение
 * 4) Найти среднее значение
 */
public class Program {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = (int) (Math.random() * 6 + 10);
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 21 - 10));
        }
        System.out.println("Массив: " + arrayList);        
        System.out.println("Без четных чисел: " + notEven(arrayList));
        System.out.println("Минимальное значение: " + Collections.min(arrayList));
        System.out.println("Максимальное значение: " + Collections.max(arrayList));
        System.out.printf("Среднее значение: %.2f", average(arrayList));
        
    }

    static ArrayList<Integer> notEven(ArrayList<Integer> arrLst) {
        ArrayList<Integer> arrLstNotEven = new ArrayList<>();
        for (int i = 0; i < arrLst.size(); i++) {
            if ((int)arrLst.get(i) % 2 != 0){
               arrLstNotEven.add(arrLst.get(i));
            }
        }
        return arrLstNotEven;
    }
    static double average(ArrayList<Integer> arrLst){
        double avg;
        double sum = 0;
        for (Integer elm : arrLst) {
            sum += elm;
        }
        avg = sum / arrLst.size();
        return avg;
    }
}