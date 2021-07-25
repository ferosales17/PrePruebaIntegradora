package domain;

public class Ejercicio3 {
    public static void main(String[] args) {
        int edades[];
        edades = new int[3];
        edades[0] = 1;
        edades[1] = 23;
        toStringArray(edades);
    }

    public static String[] toStringArray(int arr[]) {
        String arrStrg [] = new String[arr.length];
        String charS;
        for(int i =0; i<arr.length;i++){
            charS = String.valueOf(arr[i]);
            arrStrg[i] = charS;
            System.out.println( i + " = " + arrStrg[i]);
        }
        return arrStrg;
    }



}
