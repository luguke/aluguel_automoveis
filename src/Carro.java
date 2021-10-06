//Classe com as variáveis e encaplsulamento dos dados dos carros
public class Carro extends Veiculo {
    private String estepe;
    private String airbag;

    public String getEstepe() {
        return estepe;
    }

    public void setEstepe(String estepe) {
        this.estepe = estepe;
    }

    public String getAirbag() {
        return airbag;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }
}
