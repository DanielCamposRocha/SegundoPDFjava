public class Letras {

    /*genera una letra aleatoria e indica si es vocal*/
    public static void generaLetras() {
        int aleatorio=(int)(Math.random()*25);

        int i = 65 + aleatorio;
        char i1=(char)i;

        if(i1==1 || i1==5 || i1==9 || i1==15 || i1==21) {
            System.out.println(i1+" es una vocal");
        }else {
            System.out.println(i1+" es una consonante");
        }

    }
}
