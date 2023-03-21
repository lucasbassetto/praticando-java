package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


//      Set<String> set = new HashSet<>(); HashSet é extremamente rápido, porém, não matém a ordem.
//      Set<String> set = new TreeSet<>(); Ordena os dados.
        Set<String> set = new LinkedHashSet<>(); // Mantém a ordem em que os elementos foram inseridos.

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("TV"));

//        set.remove("TV"); Remove um elemento

//        set.removeIf(x -> x.charAt(0) == 'T'); Remove todos elementos que começam com a letra T.

        for(String p: set) {
            System.out.println(p);
        }


    }
}
