import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        int suma = 0;
        String frase="";
        char[]letras;
        System.out.println("BUENOS DÍAS INTRODUZCA UNA FRASE");
        frase=entrada.nextLine();
        System.out.println(frase.length());
        for(int i= 0 ; i<frase.length() ;i++){
            if(frase.charAt(i)=='a'||
            frase.charAt(i)=='e'||
            frase.charAt(i)=='i'||
            frase.charAt(i)=='o'||
            frase.charAt(i)=='u'){
               suma++;
            }
        }
        System.out.println(suma);




    }
}
