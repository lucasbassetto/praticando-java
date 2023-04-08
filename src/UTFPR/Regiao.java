package UTFPR;

public class Regiao {

    private int codReg;
    private String cidade;
    private String uf;

    public Regiao() {

    }

    public Regiao(int codReg, String cidade, String uf) {
        this.codReg = codReg;
        this.cidade = cidade;
        this.uf = uf;
    }

    public int getCodReg() {
        return codReg;
    }

    public void setCodReg(int codReg) {
        this.codReg = codReg;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }


}
