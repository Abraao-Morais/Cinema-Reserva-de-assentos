package main;

import java.util.Scanner;

import cinema.Mapa;
import cinema.Opcoes;

public class Main {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        Opcoes menu = new Opcoes();
        Scanner scanner = new Scanner(System.in);

        String limpaTerminal = "\u001B[H\u001B[2J";
        boolean exit = true;
        do {
            switch (menu.menuPrincipal(scanner)) {
                case 1: {
                    System.out.println(limpaTerminal + mapa.mostrarMapa());
                    break;
                }
                case 2: {
                    System.out.println(limpaTerminal + menu.reservaAssento(scanner, mapa));
                    break;
                }
                case 3: {
                    System.out.println(limpaTerminal + menu.cancelaReserva(scanner, mapa));
                    break;
                }
                case 4: {
                    System.out.println(limpaTerminal + mapa.mostraLivreOcupados());
                    break;
                }
                case 5: {
                    exit = false;
                    break;
                }
                default: {
                    System.out.println(limpaTerminal + "Algo está errado, por favor tente novamente");
                }
            }
        } while (exit);
        scanner.close();
        System.out.println(limpaTerminal + "Código finalizado");
    }
}
