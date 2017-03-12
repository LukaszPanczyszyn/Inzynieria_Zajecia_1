package Zadanie1;

import java.util.Comparator;

/**
 * Created by Łukasz on 06.03.2017.
 */
public class Main  {
    public static <T implements Comparable> void  wyszukajMaks(T[] tab){
        int max;
        for(int i=1;i<tab.length;i++){
            tab[i].compareTo(tab[i-1]);
        }

    }
    public static void main(String[] args){

    }
}
