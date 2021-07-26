package domain;

public class Ejercicio4 {
    public static void main(String[] args) {
        String personas[] = new String[2];
        personas[0] = "Fede";
        personas[1] = "Rosales";
        toIntArray(personas);
    }

    public static int[]  toIntArray (String arr[]) {
        int arrInt[] = new int[arr.length];
        int a;
        for(int i= 0;i < arr.length;i++){
            a = i;
            arrInt[i] = a;
           System.out.println("Elemento = " + arrInt[i]);
        }
        return arrInt;
    }
}
