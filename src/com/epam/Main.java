package com.epam;

import java.util.*;

/**
 * Created by Hrinchenko on 17.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i <= 10; i++) {

            arrayList.add("num_" + i);
            linkedList.add("numL_" + i);

        }



        Iterator<String> itrArr = arrayList.iterator();
        while (itrArr.hasNext()) {
            System.out.print(itrArr.next() + ",");
        }
        System.out.println();
        Iterator<String> itrLink = linkedList.iterator();
        while (itrLink.hasNext()) {
            System.out.print(itrLink.next() + ",");
        }
        System.out.println();
        ListIterator<String> listit = linkedList.listIterator();

        while (listit.hasNext()) {
            int md = arrayList.size() / 2;
            arrayList.add(md, listit.next());
        }
        System.out.println("modify arrayList" + arrayList);

        arrayList.removeAll(linkedList);// for good look!!

        while (listit.hasPrevious()) {

            arrayList.add(listit.previous());
        }

        System.out.println("New Modify arrayList"+arrayList);
    }


    public static <E> void printElements(Collection<E> collection) {
        Iterator<E> iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }

}
