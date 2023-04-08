package UTFPR;

public class Endereco {

    private String rua;
    private int num;

    private Regiao regiao = new Regiao();

    public Endereco() {

    }

    public Endereco(String rua, int num, Regiao regiao) {
        this.rua = rua;
        this.num = num;
        this.regiao = regiao;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }


}
