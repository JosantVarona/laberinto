package partida;

import java.util.Scanner;

public class Game {
    public static void laberinto(){
        char[][] mazmorra = {
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', 'P', '.', '.', '#', '.', '.', '.', '.', '#'},
                {'#', '#', '#', '.', '#', '.', '#', '#', '.', '#'},
                {'#', '.', '#', '.', '#', '.', '#', '.', '.', '#'},
                {'#', '.', '#', '.', '#', '.', '#', '#', '#', '#'},
                {'#', '.', '.', '.', '.', '.', '.', '.', '.', 'E'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
        };

        int jugadorX = 1;
        int jugadorY = 1;
        boolean salida = true;
        char movimiento= ' ';

        mostrarmazmorra(mazmorra);

        Scanner scanner = new Scanner(System.in);

        while (salida==true&& movimiento !='Z') {
            System.out.print("Introduce un movimiento (W/A/S/D) o Z para salir de la partida");
            movimiento = scanner.next().charAt(0);

            int nuevoX = jugadorX;
            int nuevoY = jugadorY;

            switch (movimiento) {
                case 'W':
                case 'w':
                    nuevoX--;
                    break;
                case 'A':
                case 'a':
                    nuevoY--;
                    break;
                case 'S':
                case 's':
                    nuevoX++;
                    break;
                case 'd':
                case 'D':
                    nuevoY++;
                    break;
                case 'Z':
                case 'z':
                    System.out.println("gracias por jugar a nuestro juego");
                    break;
                default:
                    System.out.println("Movimiento no valido");

            }

            if (nuevoX==5&&nuevoY==9){
                System.out.println("¡Has encontrado la salida!");
                salida=false;
            }
            if (elmovivmientoVale(mazmorra, nuevoX, nuevoY)) {
                mazmorra[jugadorX][jugadorY] = '.';
                jugadorX = nuevoX;
                jugadorY = nuevoY;
                mazmorra[jugadorX][jugadorY] = 'P';

                mostrarmazmorra(mazmorra);


            } else {
                System.out.println("Tes estas chocando");
            }
        }

    }

    public static void mostrarmazmorra(char[][] mazmorra) {
        for (char[] fila : mazmorra) {
            for (char celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean elmovivmientoVale(char[][] mazmorra, int x, int y) {
        return x >= 0 && x < mazmorra.length && y >= 0 && y < mazmorra[0].length && mazmorra[x][y] != '#';
    }

}
