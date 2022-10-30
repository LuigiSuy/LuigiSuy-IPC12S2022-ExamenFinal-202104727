
package examenfinallab_ipc1_202104727;

import java.util.Scanner;

public class ExamenFinalLab_IPC1_202104727 {

    public static void main(String[] args) {
        
        while (true) {
            int op = 0;
            System.out.println("\n************MENU************");
            System.out.println("* 1. Problema 1              *");
            System.out.println("* 2. Problema 2              *");
            System.out.println("* 3. Problema 3              *");
            System.out.println("* 4. Salir                   *");
            System.out.println("************MENU************");
            System.out.print("Ingrese un numero: \n");
            //El Scanner se encarga de recibir un dato desde el teclado del usuario y lo asigna a una variable
            Scanner scan2 = new Scanner(System.in);
            op = scan2.nextInt();

            switch (op) {
                case 1 -> Problema1();
                case 2 -> Problema2();
                case 3 -> Problema3();
                case 4 -> {
                    System.out.println("Muchas gracias por usar el programa. FIN");
                    System.exit(0);
                }
                default -> System.out.println("Esta opcion no existe, Por favor ingrese un valor valido.");
            }
        }        
    }
    
    //*******************PROBLEMA 1*******************
    public static void Problema1(){
        System.out.println("*********Problema 1*********");
        System.out.println("Ingrese el primer numero: ");
        Scanner n1 = new Scanner(System.in);
        int numero1 = n1.nextInt();
        System.out.print("Ingrese el segundo numero: \n");
        Scanner n2 = new Scanner(System.in);
        int numero2 = n2.nextInt();
        
        if (numero1 > numero2) {
            System.out.println("el numero mayor entre los valores ingresadoes es: " + numero1);
        }else{
            System.out.println("el numero mayor entre los valores ingresadoes es: " + numero2);
        }
        Scanner wait = new Scanner(System.in);
        String waiting = wait.nextLine();
    }
    
    //*******************PROBLEMA 2*******************
    public static void Problema2(){
        System.out.println("*********Problema 2*********");
        System.out.println("Ingrese el primer numero para su piramide: ");
        int cont = 0;
        boolean flag = true;
        while (flag) {  
            Scanner n = new Scanner(System.in);
            int numero = n.nextInt();
            if (numero%2==0) {
                System.out.println("el numero tiene que ser un numero impar, por favor ingrese nuevamente un valor valido.");
            }else{
                System.out.println("//numero ingresado: " + numero);
                for (int i = 1; i <= numero; i++) {
                    if (i%2!=0) {
                        cont++;
                    }
                }
                String[][] matriz = new String[cont][numero];
                
                int mitad = matriz[0].length/2;
                
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        if (i+j>=mitad && j-i<=mitad) {
                            matriz[i][j] = "*";
                        }else{
                            matriz[i][j] = " ";
                        }
                        System.out.print(matriz[i][j]);
                    }
                    System.out.println("");
                }
                break;
            }
        }
        Scanner wait = new Scanner(System.in);
        String waiting = wait.nextLine();
    }
    
    //*******************PROBLEMA 3*******************
    public static void Problema3(){
        System.out.println("bueno aux intente este pero pues ya no hay tiempo <3");
        System.out.println("peeeeeeeero tkm sos tremendo enseñando <3 gracias!!!");
    }
}
