package Vista;
import java.util.Scanner;
public class IU {
    public static String nombrejugador(String msg){
        Scanner teclado = new Scanner(System.in);
        String nombre="";
        boolean valido=false;

        System.out.print(msg+": ");
        nombre=teclado.nextLine();

        do {
            if (nombre.trim().length() > 0){
                valido=true;
            }else {
                System.out.println("el nombre introducido es invalido, introducelo de nuevo");
                nombre=teclado.nextLine();
            }
        }while (valido!= true);

        return nombre;
    }
}
