package controler;
import model.player;
import Vista.IU;
import partida.Game;
public class MainController {
    public static void Control(){
        String nombre = IU.nombrejugador("Introduce el nombre del aventurero");
        player j1 = new player(nombre);
        Game.laberinto();
        System.out.println(j1);
    }

}
