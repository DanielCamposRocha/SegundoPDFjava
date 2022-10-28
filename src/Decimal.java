import java.util.Scanner;

public class Decimal {

    public static void decimalToRomano() {
        Scanner sc=new Scanner(System.in);
        int num;
        String intermedio= "";
        do{
            System.out.println("Recuerde el numero a introducir debe ser menor a 4000 y con el formato xxxx");
             System.out.println("Introduzca un número entero");
            intermedio=sc.nextLine();
            num=Integer.parseInt(intermedio);
        }while(num>=4000 | !(num>0));
        int largo=intermedio.length();
        String romano="",romanod="",romanoc="",romanom="";
        int unidades=Integer.parseInt(intermedio.substring(3,largo));
        int decenas =Integer.parseInt(intermedio.substring(2,3));
        int centenas=Integer.parseInt(intermedio.substring(1,2));
        int millares=Integer.parseInt(intermedio.substring(0,1));
    System.out.println(millares+" "+centenas+" "+decenas+" "+unidades);


                switch (millares){
                    case 0:
                        romanom="";
                        break;
                    case 1:
                        romanom="M";
                        break;
                    case 2:
                        romanom="MM";
                        break;
                    case 3:
                        romanom="MMM";
                        break;
                    default:
                        romanom="El numero debe ser menor de 4000";
                        break;
                }


                switch (centenas){
                    case 0:
                        romanoc="";
                        break;
                    case 1:
                        romanoc="C";
                        break;
                    case 2:
                        romanoc= "CC";
                        break;
                    case 3:
                        romanoc= "CCD";
                        break;
                    case 4:
                        romanoc="CD";
                        break;
                    case 5:
                        romanoc="D";
                        break;
                    case 6:
                        romanoc= "DC";
                        break;
                    case 7:
                        romanoc="DCC";
                        break;
                    case 8:
                        romanoc="CCM";
                        break;
                    case 9:
                        romanoc="CM";
                        break;
                }


                switch (decenas){
                    case 0:
                        romanod="";
                        break;
                    case 1:
                        romanod="X";
                        break;
                    case 2:
                        romanod="XX";
                        break;
                    case 3:
                        romanod="XXL";
                        break;
                    case 4:
                        romanod="XL";
                        break;
                    case 5:
                        romanod="L";
                        break;
                    case 6:
                        romanod="LX";
                        break;
                    case 7:
                        romanod="LXX";
                        break;
                    case 8:
                        romanod="XXC";
                        break;
                     case 9:
                        romanod="XC";
                        break;
                  }


                switch (unidades) {
                    case 0:
                        romano="";
                        break;
                    case 1:
                        romano = "I";
                        break;
                    case 2:
                        romano = "II";
                        break;
                    case 3:
                        romano = "III";
                        break;
                    case 4:
                        romano = "IV";
                        break;
                    case 5:
                        romano = "V";
                        break;
                    case 6:
                        romano = "VI";
                        break;
                    case 7:
                        romano = "VII";
                        break;
                    case 8:
                        romano = "IIX";
                        break;
                    case 9:
                        romano = "IX";
                        break;

                }

    System.out.println(intermedio+" en numeros romanos es: "+romanom+romanoc+romanod+romano);
    }
}
