package cinema;

public class Assento{
    private char fileira;
    private int numeroAssento;
    private EstadoAssento estadoAssento = EstadoAssento.FREE;

    public Assento(char fileira, int numeroAssento) {
        this.fileira = fileira;
        this.numeroAssento = numeroAssento;
    }

    public char getFileira() {
        return fileira;
    }
    public void setFileira(char fileira) {
        this.fileira = fileira;
    }
    public int getNumeroAssento() {
        return numeroAssento;
    }
    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }
    public EstadoAssento getEstadoAssento() {
        return estadoAssento;
    }
    public void setEstado(EstadoAssento estadoAssento) {
        this.estadoAssento = estadoAssento;
    }
}