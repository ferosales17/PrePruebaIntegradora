package domain;

public class Ejercicio1 {
    public static void main(String[] args) {
        replicate('t',3);
        replicate('A',4);
        replicate('e',10);
        replicate('r',12);
        replicate('2',24);
        replicate('@',25);
        replicate('a',45);
    }

    public static void replicate (char c, int n){
        String cadena = "";
        StringBuilder strnbl = new StringBuilder();
        for(int i=1;i<=n;i++){
            strnbl.append(String.valueOf(c));
            cadena = String.valueOf(strnbl);
        }
        System.out.println("cadena = " + cadena);
    }
}
