import java.util.Scanner;
/*
@author Fernando López
@version 06/08/2022
 */


public class Main {
    public static void main(String[] args) {
        int contador=0;
        /*Vehiculo[] transporte;

        transporte =new Vehiculo[5];
*/
        Scanner capta = new Scanner(System.in);

        Taller ejecucion=new Taller();

        Vehiculo transporte=new Vehiculo();

        int i=0;
        for(i=0;i<5;i++){

        System.out.println("Ingresa la marca del carro "+(i+1));
        String marca= capta.nextLine();
        System.out.println("Ingresa la placa del carro "+ (i+1));
        String placa= capta.nextLine();
        System.out.println("Ingresa el problema del carro "+ (i+1));
        String problema= capta.nextLine();
        System.out.println("Ingresa el modelo del carro "+(i+1));
        int modelo= capta.nextInt();
        System.out.println("Ingrese el costo estimado"+(i+1));
        double costo=capta.nextDouble();
        capta.nextLine();
        transporte=new Vehiculo(marca,placa,problema,modelo,costo);

        //para agregar valores a carro
        ejecucion.agregarVehiculo(transporte);
            //System.out.println(transporte);
        }

        ejecucion.mostrar();
        //para eliminar un carro
        System.out.println("Ingresa el numero de los carros que deseas eliminar");
        for (int a=0; a<2; a++) {
            int adeletar = capta.nextInt();
            adeletar = adeletar - 1;
            ejecucion.eliminar(adeletar);
        }
        //para mostrar los datos actualizados

        ejecucion.mostrar(); //@see Funciones taller

        System.out.println(transporte);

    }
}