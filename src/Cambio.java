public class Cambio {
    /*dar cambio con el numero minimo de billetes*/
    public static void darCambio() {
        double dinero=Utilidades.introducirNumero(2.1);
        int doscientos,cien,cincuenta,veinte,diez,cinco;
        doscientos=(int)(dinero/200);
        cien=(int)(dinero % 200)/100;
        cincuenta=(int)(dinero % 100)/50;
        veinte=(int)(dinero % 50)/20;
        diez=(int)(dinero-((doscientos*200)+(cien*100)+(cincuenta*50)+(veinte*20)))/10;
        cinco=(int)(dinero % 10)/5;
        int total=(doscientos*200)+(cien*100)+(cincuenta*50)+(veinte*20)+(10*diez)+(cinco*5);
        System.out.println("La cantidad es: "+dinero);
        if(doscientos>0) System.out.println(doscientos+" billetes de 200, ");
        if(cien>0) System.out.println(cien+" billetes de 100, ");
        if(cincuenta>0) System.out.println(cincuenta+" billetes de 50, ");
        if(veinte>0) System.out.println(veinte+" billetes de 20, ");
        if(diez>0) System.out.println(diez+" billetes de 10 y ");
        if(cinco>0) System.out.println(cinco+" billetes de 5 ");
        System.out.println("son: "+total);
        System.out.println(" Faltan: "+(dinero-total)+" euros");
                        /*este ejercicio se hace con arrays math.floor para asegurar el redondeo hacia abajo*/
    }
}
