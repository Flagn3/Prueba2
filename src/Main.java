import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hola\n");

        List<Integer> lista=new ArrayList<>();
        lista.add(8);
        lista.add(16);
        lista.add(1);
        lista.add(3);

        System.out.println(lista.toString());

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}