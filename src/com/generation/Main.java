package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Colecciones en JAVA

        // Arreglo declarado en multilinea.
        //String universidades[];
        //universidades = new String[5];

        // Arreglo declarado en una línea.
        // Arreglo con valores inicializados.
        //String universidades[] = new String[]{"UNAM", "TUA", "UAM", "UADM", "ITVH"};
        /*
        universidades[0] = "UNAM";
        universidades[1] = "TUA";
        universidades[2] = "UAM";
        universidades[3] = "UADM";
        universidades[4] = "ITVH";
        */
        /*
        for(String universidad : universidades){
            System.out.println(universidad);
        }
        */

        System.out.println("-------------------HashSet--------------------");
        Set<String> frutas = new HashSet(2);
        // Características principales de Set.
        /*
        * No puede contener elementos duplicados
        * */
        // El orden de los elementos puede variar.
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Guayaba");
        frutas.add("Sandia");
        frutas.add("Arándano");
        frutas.add("Limón");

        for(String fruta : frutas){
            System.out.println(fruta);
        }

        System.out.println("-------------------TreeSet--------------------");

        Set<String> frutas2 = new TreeSet<>();
        // Es más lento que el HashSet
        // Ordena los elementos(alfabéticamente).
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Guayaba");
        frutas2.add("Sandia");
        frutas2.add("Arándano");
        frutas2.add("Limón");

        for(String fruta : frutas2){
            System.out.println(fruta);
        }

        System.out.println("----------------LinkedHashSet-----------------");

        Set<String> frutas3 = new LinkedHashSet<>(4);
        // Almacena los valores en orden de inserción.
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Guayaba");
        frutas3.add("Sandia");
        frutas3.add("Arándano");
        frutas3.add("Limón");

        for(String fruta : frutas3){
            System.out.println(fruta);
        }

        System.out.println("------------------ArrayList-------------------");
        List<String> frutas4 = new ArrayList<>();
        //List si admite elementos duplicados.

        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Guayaba");
        frutas4.add("Sandia");
        frutas4.add("Arándano");
        frutas4.add("Limón");

        for(String fruta : frutas4){
            System.out.println(fruta);
        }

        System.out.println("------------Elemento ArrayList-------------");
        System.out.println(frutas4.get(3));
        int indice = frutas4.indexOf("Arándano");

        System.out.println(frutas4.get(indice));

        System.out.println("----------------LinkedList-----------------");
        List<String> frutas5 = new LinkedList<>();

        frutas5.add("Mango");
        frutas5.add("Fresa");
        frutas5.add("Guayaba");
        frutas5.add("Sandia");
        frutas5.add("Arándano");
        frutas5.add("Limón");

        for(String fruta : frutas5){
            System.out.println(fruta);
        }
        System.out.println("--------------------Map--------------------");
        Map<Integer,String> colores = new HashMap<Integer, String>();
        // Asocia claves con valores.
        // No puede
        colores.put(1, "Azul");
        colores.put(2, "Amarillo");
        colores.put(3, "Magenta");
        colores.put(4, "Dorado");
        colores.put(5, "Aqua");

        for (Map.Entry<Integer, String> color : colores.entrySet()) {
            System.out.println("clave=" + color.getKey() + ", valor=" + color.getValue());
        }


            System.out.println(colores.get(3));



    }
}
