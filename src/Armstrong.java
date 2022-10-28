public class Armstrong {
    public static void numArmstrong() {
        int num=Utilidades.introducirNumero(1);
        String intermedio= Integer.toString(num);
        int digitos=intermedio.length();
        int inicial=num;
        long suma=0;
        for(int i=1;i<digitos+1;i++){
            long s= (long) Math.pow((num % 10),digitos);
            num=num/10;
            suma=suma+s;
        }
        if(suma==inicial) {
            System.out.println(inicial+" es un numero Armstrong");
        }else{
        System.out.println(inicial+" no es un numero Armstrong");
        }

    }
}
