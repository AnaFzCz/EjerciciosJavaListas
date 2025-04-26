import br.com.ejerciciosListasCollections.NumerosEnteros;
import br.com.ejerciciosListasCollections.Titulo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");

        NumerosEnteros numero1 = new NumerosEnteros(5);
        NumerosEnteros numero2 = new NumerosEnteros(7);
        NumerosEnteros numero3 = new NumerosEnteros(6);
        NumerosEnteros numero4 = new NumerosEnteros(4);
        NumerosEnteros numero5 = new NumerosEnteros(2);
        NumerosEnteros numero6 = new NumerosEnteros(1);
        NumerosEnteros numero7 = new NumerosEnteros(3);
        NumerosEnteros numero8 = new NumerosEnteros(8);
        NumerosEnteros numero9 = new NumerosEnteros(0);

//        ArrayList<Integer> listaNumerosEnteros = new ArrayList<>();
//        listaNumerosEnteros.add(numero1);
//        listaNumerosEnteros.add(numero2);
//        listaNumerosEnteros.add(numero3);
//        listaNumerosEnteros.add(numero4);
//        listaNumerosEnteros.add(numero5);
//        listaNumerosEnteros.add(numero6);
//        listaNumerosEnteros.add(numero7);
//        listaNumerosEnteros.add(numero8);
//        listaNumerosEnteros.add(numero9);


        ArrayList<String> listaOrdenada = new ArrayList();

        listaOrdenada.add(String.valueOf(numero1));
        listaOrdenada.add(String.valueOf(numero2));
        listaOrdenada.add(String.valueOf(numero3));
        listaOrdenada.add(String.valueOf(numero4));
        listaOrdenada.add(String.valueOf(numero5));
        listaOrdenada.add(String.valueOf(numero6));
        listaOrdenada.add(String.valueOf(numero7));
        listaOrdenada.add(String.valueOf(numero8));
        listaOrdenada.add(String.valueOf(numero9));

        Collections.sort(listaOrdenada);
        System.out.println(listaOrdenada);

        System.out.println("Ejercicio 2 ");

        Titulo titulo = new Titulo("Ana");
        Titulo titulo1 = new Titulo("Laura");
        Titulo titulo2 = new Titulo("Jose");

        ArrayList<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(titulo);
        listaTitulo.add(titulo1);
        listaTitulo.add(titulo2);

        System.out.println(listaTitulo);
        listaTitulo.sort(Comparator.comparing(Titulo::getNombre));
        System.out.println(listaTitulo);

        System.out.println("Ejercicio 3");
        List<Titulo> listaLinkedTitulo = new LinkedList<>();
        listaLinkedTitulo.add(new Titulo("ALPHA"));
        listaLinkedTitulo.add(new Titulo("OMEGA"));
        listaLinkedTitulo.add(new Titulo("GAMMA"));

        Collections.sort(listaLinkedTitulo);
        for (Titulo tit : listaLinkedTitulo) {
            System.out.println(tit.getNombre());
        }


        System.out.println("Ejercicio 4");

        List<String> listaArray = new ArrayList<>();
        listaArray.add("dato R");
        listaArray.add("dato S");
        listaArray.add("dato T");

        List<String> listLinkedArray = new ArrayList<>();
        listLinkedArray.add("dato 5");
        listLinkedArray.add("dato 4");
        listLinkedArray.add("dato 6");

        System.out.println("ArrayList"+listaTitulo);
        System.out.println("LinkedList"+listaLinkedTitulo);

        System.out.println("Ejercicio 5");

        List<String> listaPolimorfica;
        listaPolimorfica=new ArrayList<>();
        listaPolimorfica.add("dato1");
        listaPolimorfica.add("dato2");
        listaPolimorfica.add("dato3");

        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica=new LinkedList<>();
        listaPolimorfica.add("datoA");
        listaPolimorfica.add("datoB");
        listaPolimorfica.add("datoC");

        System.out.println("LinkedList: " + listaPolimorfica);




    }
}