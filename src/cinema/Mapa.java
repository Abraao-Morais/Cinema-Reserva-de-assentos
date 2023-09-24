package cinema;

public class Mapa {
    private Assento[][] mapaAssentos = new Assento[12][14];

    public Mapa() {
        for (char f = 65; f <= 76; f++) {
            for (int n = 0; n <= 13; n++) {
                mapaAssentos[f - 65][n] = new Assento(f, n + 1);
            }
        }
    }

    public StringBuilder mostrarMapa() {
        StringBuilder mapa = new StringBuilder(
                "\n\n    1     2     3     4     5     6     7     8     9     10    11    12    13    14\n");
        for (Assento[] fileira : mapaAssentos) {
            mapa.append(fileira[0].getFileira() + " ");
            for (Assento assento : fileira) {
                String cor = (assento.getEstadoAssento() == EstadoAssento.BUSY) ? "\u001B[31m" : "\u001B[32m";
                mapa.append(cor + " " + assento.getEstadoAssento() + " " + "\u001B[0m");
            }
            mapa.append(" " + fileira[0].getFileira() + "\n");
        }
        mapa.append("    1     2     3     4     5     6     7     8     9     10    11    12    13    14\n"
                + "\n----------------------------------------------------------------------------------------"
                + "\n                                         TELA"
                + "\n----------------------------------------------------------------------------------------");
        return mapa;
    }

    public boolean verificaAssento(char fileira, int numeroAssento) {
        if (65 <= fileira && fileira <= 76 && 0 <= (numeroAssento - 1) && (numeroAssento - 1) <= 13) {
            return true;
        } else {
            return false;
        }

    }

    public boolean reservaAssento(char fileira, int numeroAssento) {
        if (verificaAssento(fileira, numeroAssento)) {
            mapaAssentos[fileira - 65][numeroAssento - 1].setEstado(EstadoAssento.BUSY);
            return true;
        } else {
            return false;
        }
    }

    public boolean cancelaReserva(char fileira, int numeroAssento) {
        if (verificaAssento(fileira, numeroAssento)) {
            mapaAssentos[fileira - 65][numeroAssento - 1].setEstado(EstadoAssento.FREE);
            return true;
        } else {
            return false;
        }
    }

    public StringBuilder mostraLivreOcupados() {
        int ocupados = 0;
        int livres = 0;
        for (Assento[] fileira : mapaAssentos) {
            for (Assento assento : fileira) {
                if (assento.getEstadoAssento() == EstadoAssento.BUSY) {
                    ocupados++;
                } else {
                    livres++;
                }
            }
        }
        StringBuilder livresOcupados = new StringBuilder(
                "\nTotal de assentos Livres: " + livres + " --> " + (livres * 100 / 168) + "%"
                        + "\nTotal de assentos Ocupados " + ocupados + " --> " + (ocupados * 100 / 168) + "%\n");
        return livresOcupados;
    }
}
