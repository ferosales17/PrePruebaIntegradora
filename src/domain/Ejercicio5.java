package domain;

public class Ejercicio5 {
    public static void main(String[] args) {
        String personas[] = new String[4];
        personas[0] = "Federico";
        personas[1] = "Pedro";
        personas[2] = "Juan";
        personas[3] = "Juancastro";

        maxLength(personas);

    }

    public static void maxLength(String arr[]) {
        int max = 0, min = 0, cont = 0;
        for (int i = 0; i < arr.length; i++) {
            String nombre = arr[i];
            for (int j = i; j < nombre.length(); j++) {
                cont++;
            }
            if (cont < min) {
                min = cont;
                cont = 0;
            } else if (cont > max) {
                max = cont;
                cont = 0;
            } else {
                min = cont;
            }
        }
        System.out.println("max = " + max);
    }
}
