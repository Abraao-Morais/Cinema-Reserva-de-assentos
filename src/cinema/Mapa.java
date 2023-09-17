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

    public String mostrarMapa() {
        String mapa = "    1     2     3     4     5     6     7     8     9     10    11    12    13    14\n";
        for (Assento[] fileira : mapaAssentos) {
            mapa += fileira[0].getFileira() + " ";
            for (Assento assento : fileira) {
                mapa += " " + assento.getEstadoAssento() + " ";
            }
            mapa += " " + fileira[0].getFileira() + "\n";
        }
        mapa += "    1     2     3     4     5     6     7     8     9     10    11    12    13    14\n"
                + "\n----------------------------------------------------------------------------------------"
                + "\n                                         TELA"
                + "\n----------------------------------------------------------------------------------------";
        return mapa;
    }

    public void reservarAssento(int numeroAssento) {
    }
}
