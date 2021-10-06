//Classe com as variáveis e encaplsulamento dos dados das motos
public class Moto extends Veiculo {
    private String capacete;
    private String partida;
    private String cilindrada;

    public String getCapacete() {
        return capacete;
    }

    public void setCapacete(String capacete) {
        this.capacete = capacete;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
}
