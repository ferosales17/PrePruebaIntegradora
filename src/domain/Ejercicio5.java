package domain;

public class Ejercicio5 {
    public static void main(String[] args) {
        String personas[] = new String[3];
        personas[0] = "Federico";
        personas[1] = "Pedro";
        personas[2] = "Juan";

        maxLength(personas);

    }

    public static void maxLength(String arr[]){
            int max,min;
            for(int i=0;i<arr.length;i++){
                String nombre = arr[i];
                int cont = 0;
                for(int j=i;j < nombre.length(); j++){
                    cont++;
                }

            }

    }
}
