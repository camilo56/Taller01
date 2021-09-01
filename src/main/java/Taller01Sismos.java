import java.util.Random;
import java.util.Scanner;

public class Taller01Sismos {
    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma() {
        while (true) {
            mostarMenu();
            var option = leerOpcion();
            switch (option) {
                case "a":
                    double[] sismos1 = llenarArreglo();
                    double[] arr=sismos1;
                    continue;



                case "b":

                    buscarMayorSismo(arr);



                    System.out.println("Error!");

                    break;
                case "c":


                    System.out.println("Error!");

                    break;
                case "d":


                    System.out.println("Error!");

                    break;
                case "s":
                    return;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
            }
        }


    }

    public static String leerOpcion() {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese opcion:");
        return scanner.nextLine();
    } // captura opcion de programa ingresada por el usuario

    public static void mostarMenu() {
        System.out.println("**********************************************************");
        System.out.println("*                      MENÚ                              *");
        System.out.println("*   [a] Ingresar datos                                   *");
        System.out.println("*   [b] Mostrar sismo de mayor magnitud                  *");
        System.out.println("*   [c] Contar sismos mayores o iguales a 5.0            *");
        System.out.println("*   [d] Enviar SMS por cada sismo mayor o igual a 7.0    *");
        System.out.println("*                     Salir (S/N)                        *");
        System.out.println("**********************************************************");
    }

    public static int leerNumero() {
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese numero:");
        return scanner.nextInt();
    } //permite capturar el número ingresado por usuario


    public static double[] llenarArreglo() {
        double[] A = new double[70];
        for (int arr = 0; arr < 70; arr++) {
            A[arr] = Math.random() * 9.9;



        }
        return A;


    } // simular el ingreso de datos con valores aleatorios entre 0.0 y 9.9 y retorna el arreglo.

    public static void imprimirNumDecimal(double numero) {
        System.out.println("El numero es: " + numero);

    }


    public static double buscarMayorSismo( double[] sismos ){

        double mayor=0;
        for(int i=0;i<sismos.length;i++){
           if (sismos[i]>mayor){
               mayor=sismos[i];

           }
        }
        return mayor;



    }
    public static double[] crearArreglo() {       //metodo 1
        Random rnum = new Random();

        double[] arr = new double[70];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnum.nextDouble();

        }
        return arr;
    }
    public static void imprimirNumDecimal(int numero) {
        System.out.println("El numero en decimal es: " + numero);
    } // imprime un mensaje como String, en el cual se muestra el número en su representación decimalk



    //public static contarSismos( double [ ] sismos ...) // retornar un valor que indica cuantos sismos se han producido con una magnitud mayor o igual a 5.0

    //public static enviarSMS( double [ ] sismos ...) // simular un mensaje SMS por pantalla, retornando una String por cada sismo de magnitud mayor o igual a 7.0, con el mensaje: "Alerta!!! se debe evacuar zona costera!"

    //public static String salir (  ) // permite decidir si el usuario desea salir o no del programa.


}








































