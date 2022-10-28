import java.util.Scanner;

public class Lucky {

    public static void luckyNumber() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca la fecha de nacimiento en el siguiente formato xx-xx-xxxx");
        String fecha= sc.nextLine();
        String dia = fecha.substring(0,2);
        String mes = fecha.substring(3,5);
        String ano = fecha.substring(6,fecha.length());
        int diai=Integer.parseInt(dia);
        int mesi=Integer.parseInt(mes);
        int anoi=Integer.parseInt(ano);
        int intermedio=diai+mesi+anoi;
        String intermedio2=Integer.toString(intermedio);
        int largo=intermedio2.length();
        int fin=0;
        for (int i=1;i<largo+1;i++){
            int s=intermedio % 10;
            fin=fin+s;
        }
        if (fin>=10){
            int s=fin % 10;
            int a=fin/10;
            System.out.println("El numero de la suerte es:"+(s+a));
        }else{System.out.println("El numero de la suerte es: "+fin);}
    }
}
