package domain;

import static domain.Ejercicio5.maxLength;

public class Ejercicio6 {
    public static void main(String[] args) {
        String personas[] = new String[5];
        personas[0] = "Federico";
        personas[1] = "Maga";
        personas[2] = "Lucia";
        personas[3] = "Cris";
        personas[4] = "Juan";

        lNormalize(personas,'x');
    }


    public static void lNormalize(String arr[], char c) {
        int max = 0, min = 0, cont = 0;
        int maximo = maxLength(arr); // me trae el maximo de los elemntos
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            String nombre2 = arr[i];
            for (int j = 0; j < nombre2.length(); j++) {
                count2++;
            }
            String agregar;
            int elementoQ = count2;
            count2 = 0;
            if (maximo != elementoQ) {
                int resto = maximo - elementoQ;
                 agregar = replicate(c, resto);
                 nombre2 = nombre2 + agregar;
            }
            System.out.println("Nombre = " + nombre2 + ", Tamaño:" + nombre2.length()) ;
        }
        //
    }

    public static String replicate(char c, int n) {
        String cadena = "";
        StringBuilder strnbl = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            strnbl.append(String.valueOf(c));
            cadena = String.valueOf(strnbl);
        }
        return cadena;
    }

}





