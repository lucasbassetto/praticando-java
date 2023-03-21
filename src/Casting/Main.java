package Casting;

public class Main {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario();

        //UPCASTING
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcasting
        Gerente gerente_ = (Gerente) new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();
        Faxineiro faxineiro_ = (Faxineiro) new Funcionario();

        vendedor.andar();
        vendedor_.vender();
    }
}