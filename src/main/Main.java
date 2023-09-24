package main;

import java.util.Scanner;

import cinema.Mapa;
import cinema.Opcoes;

public class Main {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        Opcoes menu = new Opcoes();
        Scanner input = new Scanner(System.in);

        String limpaTerminal = "\u001B[H\u001B[2J";
        boolean exit = true;
        do {
            switch (menu.menuPrincipal(input)) {
                case 1: {
                    System.out.println(limpaTerminal + mapa.mostrarMapa());
                    break;
                }
                case 2: {
                    String retornoReserva = (menu.reservaAssento(input, mapa)) ? "Assento reservado."
                            : "nao foi possivel reservar um assento, tente novamente.";
                    System.out.println(limpaTerminal + retornoReserva);
                    break;
                }
                case 3: {
                    String retornoCancelamento = (menu.reservaAssento(input, mapa)) ? "Reserva cancelada."
                            : "nao foi possivel cancelar a reserva, tente novamente.";
                    System.out.println(limpaTerminal + retornoCancelamento);
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
        input.close();
        System.out.println(limpaTerminal + "Código finalizado");
    }
}
