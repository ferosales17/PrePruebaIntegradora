package domain;

public class Ejercicio2 {
    public static void main(String[] args) {

        lpad("5",3,'x');
        lpad("12",2,'K');
        lpad("23",10,'1');
        lpad("4",30,'0');
        lpad("f",7,'Z');

    }

    public static void lpad(String s,int n, char c){
        String cadena = "";
        StringBuilder strnbl = new StringBuilder();
        for(int i=1;i<=n;i++){
            strnbl.append(String.valueOf(c));
            cadena = String.valueOf(strnbl) + s;

        }
        System.out.println("cadena = " + cadena);
    }
}
