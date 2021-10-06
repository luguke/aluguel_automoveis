//Classe com as variáveis e encaplsulamento dos dados dos aluguéis
public class Aluguel {
    private int diariaMoto;
    private int diariaCarroSimples;
    private int diariaCarroLuxo;
    private int diasAluguel;

    public int getDiariaMoto() {
        return diariaMoto;
    }

    public void setDiariaMoto(int diariaMoto) {
        this.diariaMoto = diariaMoto;
    }

    public int getDiariaCarroSimples() {
        return diariaCarroSimples;
    }

    public void setDiariaCarroSimples(int diariaCarroSimples) {
        this.diariaCarroSimples = diariaCarroSimples;
    }

    public int getDiariaCarroLuxo() {
        return diariaCarroLuxo;
    }

    public void setDiariaCarroLuxo(int diariaCarroLuxo) {
        this.diariaCarroLuxo = diariaCarroLuxo;
    }

    public int getDiasAluguel() {
        return diasAluguel;
    }

    public void setDiasAluguel(int diasAluguel) {
        this.diasAluguel = diasAluguel;
    }

}
