package java_module.collections.question;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class GenericsExercise {
    /*
        Write a class to wrap a list of numbers and compute the max and min value.

        Do not modify this method - for testing only

        Expected output:

            Max of listWrapper1: 8
            Min of listWrapper1: -9
            Max of listWrapper2: 5
            Min of listWrapper2: 1

     */
    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, -9));
        ListWrapper<Integer> listWrapper1 = new ListWrapper<>(numbers1);
        System.out.println("Max of listWrapper1: " + listWrapper1.max());
        System.out.println("Min of listWrapper1: " + listWrapper1.min());

        List<BigDecimal> numbers2 = new ArrayList<>(Arrays.asList(
                new BigDecimal("1"),
                new BigDecimal("2"),
                new BigDecimal("3"),
                new BigDecimal("4"),
                new BigDecimal("5")
        ));
        ListWrapper<BigDecimal> listWrapper2 = new ListWrapper<>(numbers2);
        System.out.println("Max of listWrapper2: " + listWrapper2.max());
        System.out.println("Min of listWrapper2: " + listWrapper2.min());
    }
}

/*
    Update this class to implement the max() and min() methods
 */
class ListWrapper<E extends Number & Comparable<E>> {
    /*
        Do not modify the fields, constructor and getter method
     */
    private final List<E> list;

    public ListWrapper(List<E> list) {
        this.list = list;
    }

    public List<E> getList() {
        return list;
    }

    public E max() {
        // TODO: implement this method
        if ( list.get(0) instanceof Integer ) {
            Comparator<E> comparatorForInt = Comparator.comparingInt(n -> (Integer) n);
            list.sort(comparatorForInt);
            return list.get(list.size() - 1);
        } else if ( list.get(0) instanceof BigDecimal ){
            Comparator<E> comparatorForBigDecimal = Comparable::compareTo;
            list.sort(comparatorForBigDecimal);
            return list.get(list.size() - 1);
        }

        return null;
    }

    public E min() {
        // TODO: implement this method
        if (list.get(0) instanceof Integer) {
            Comparator<E> comparator = Comparator.comparingInt(n -> (Integer) n);
            list.sort(comparator);
            return list.get(0);
        } else if (list.get(0) instanceof BigDecimal) {
            Comparator<E> comparatorForBigDecimal = Comparable::compareTo;
            list.sort(comparatorForBigDecimal);
            return list.get(0);
        }

        return null;
    }

    /*
        Utility method - Do not modify
     */
    public boolean isNullOrEmpty() {
        return Objects.isNull(list) || list.isEmpty();
    }
}
