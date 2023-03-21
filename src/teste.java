import Metodos.Numeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class teste {

    public static <b> void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex");
        printList(myStrs);

    }

    private static void printList(List<?> list) {
        for(Object obj : list){
            System.out.println(obj);
        }
    }

}
