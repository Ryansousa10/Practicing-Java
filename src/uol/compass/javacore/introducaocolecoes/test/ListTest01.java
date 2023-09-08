package uol.compass.javacore.introducaocolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        List<String> nomes2 = new ArrayList();

        nomes.add("Ryan");
        nomes.add("Sousa");
        nomes.add("Silva");

        nomes2.add("Sousa");
        nomes2.add("Silva");
        nomes2.add("Ryan");

        nomes.addAll(nomes2);

        for (String nome : nomes
        ) {
            System.out.println(nome);
        }
    }
}
