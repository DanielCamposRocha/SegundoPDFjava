import java.util.Scanner;

public class Menu {
    public static void menuInicial() {
        Scanner sc=new Scanner(System.in);
        int c;
        do{
            System.out.println("pulse 0 para salir");
            System.out.println("pulse 1 método generaLetras");
            System.out.println("pulse 2 método pasar a segundos");
            System.out.println("pulse 3 método dar cambio");
            System.out.println("pulse 4 método numero Armstrong");
            System.out.println("pulse 5 método luckyNumber");
            System.out.println("pulse 6 método decimalToRomano");

            c=sc.nextInt();
            switch (c) {
                case 1 -> Letras.generaLetras();
                case 2 -> Segundos.pasaSegundos();
                case 3 -> Cambio.darCambio();
                case 4 -> Armstrong.numArmstrong();
                case 5 -> Lucky.luckyNumber();
                case 6 -> Decimal.decimalToRomano();

            }
        }while (c!=0);
        System.out.println("El programa se ha cerrado correctamente");
    }

}
