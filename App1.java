import java.util.Scanner;
//Abel Melquisedec Bermudez Diaz del 1M7:)
//NUMERO DE CARNET:2024-1669U
public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);

    }

    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valo [" + i + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }

        //Hay que hacer que mire bonito

    } //"haciendo invertido16"
    public static int[] invertirArray(int[] a) {
        try {
            int longitud = a.length;
            int[] arrayInvertido = new int[longitud];
    
            for (int i = 0; i < longitud; i++) {
                arrayInvertido[i] = a[longitud - 1 - i];
            }
    
            return arrayInvertido;
        } catch (Exception e) {
            System.out.println("Ocurrió:( un error al querer invertir el array: " + e.getMessage());
            return null;
        }
    }
    
     }

    //Aqui va el metodo de inverso
    //los voy a aplazar a todos  //noescape