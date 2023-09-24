package cinema;

import java.util.Scanner;

public class Opcoes {

    public Opcoes() {
    }

    public int menuPrincipal(Scanner scanner) {
        System.out.print("\n\nMENU PRINCIPAL\n"
                         + "1) Mapa de assentos;\n"
                         + "2) Reservar assento;\n"
                         + "3) Cancelar reserva;\n"
                         + "4) Ocupados e Livres;\n"
                         + "5) Sair;\n"
                         
                         + "Digite a opcao desejada: ");

        int opcao = scanner.nextInt();
        return opcao;
    }

    public boolean reservaAssento(Scanner scanner, Mapa mapa){
        System.out.print("\n\nRESERVA ASSENTO\n"
                         + "Digite a fileira do assento desejado (em caixa alta): ");
        char fileira = scanner.next().charAt(0);

        System.out.print("Digite o numero do assento desejado: ");
        int numeroAssento = Integer.parseInt(scanner.next());

        if (mapa.reservaAssento(fileira, numeroAssento)){
            return true;
        } else {
            return false;
        }
    }

    public boolean cancelaReserva(Scanner scanner, Mapa mapa){
        System.out.print("\n\nCANCELA RESERVA\n"
                         + "Digite a fileira do assento desejado (em caixa alta): ");
        char fileira = scanner.next().charAt(0);

        System.out.print("Digite o numero do assento desejado: ");
        int numeroAssento = Integer.parseInt(scanner.next());

        if (mapa.cancelaReserva(fileira, numeroAssento)){
            return true;
        } else {
            return false;
        }
    }
}
