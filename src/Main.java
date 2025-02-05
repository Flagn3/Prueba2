import java.util.*;

public class Main {
    private static List<Integer> lista=new ArrayList<>();
    public static void main(String[] args) {
        System.out.printf("Hola\n");


        lista.add(8);
        lista.add(16);
        lista.add(1);
        lista.add(3);
        lista.add(38);
        lista.add(111);
        lista.add(11);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(12);

        Persona p1=new Persona("Juan", 29, "Cádiz");
        Persona p2=new Persona("Pepe", 19, "Chiclana");

        System.out.println(p1+"\n"+p2);
        System.out.println(lista.toString());

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        sumarLista(lista);
    }

    private static void sumarLista(List<Integer> lista) {
        int suma=0;

        for(int i: lista){
            suma+=i;
        }
        System.out.println(suma);
    }


}