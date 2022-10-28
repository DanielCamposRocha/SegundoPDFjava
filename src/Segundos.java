public class Segundos {
    public static void pasaSegundos() {
        int seg=Utilidades.introducirNumero(1);
        int horas= (int)seg/3600;
        int minutos= (int)(seg % 3600)/60;
        int segundos=(seg % 60);
        System.out.println(seg+" segundos, son: "+horas+" horas,"+minutos+" minutos,"+segundos+" segundos");
    }
}
