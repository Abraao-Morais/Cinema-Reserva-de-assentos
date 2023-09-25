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

    public String reservaAssento(Scanner scanner, Mapa mapa){
        System.out.print("\n\nRESERVA ASSENTO\n"
                         + "Digite a fileira do assento desejado (em caixa alta): ");
        char fileira = scanner.next().charAt(0);

        System.out.print("Digite o numero do assento desejado: ");
        int numeroAssento = Integer.parseInt(scanner.next());

        int reserva = mapa.reservaAssento(fileira, numeroAssento);
        if (reserva == 1){
            return "Assento reservado.";
        } else {
            return (reserva == 0)?"O assento digitado não existe.":"Este assento já está reservado";
        }
    }

    public String cancelaReserva(Scanner scanner, Mapa mapa){
        System.out.print("\n\nCANCELA RESERVA\n"
                         + "Digite a fileira do assento desejado (em caixa alta): ");
        char fileira = scanner.next().charAt(0);

        System.out.print("Digite o numero do assento desejado: ");
        int numeroAssento = Integer.parseInt(scanner.next());

        int reserva = mapa.cancelaReserva(fileira, numeroAssento);
        if (reserva == 1){
            return "Reserva cancelada.";
        } else {
            return (reserva == 0)?"O assento digitado não existe.":"Não existe resva neste assento";
        }
    }
}
