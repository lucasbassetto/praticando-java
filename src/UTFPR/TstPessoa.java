package UTFPR;

public class TstPessoa {

    public static void main(String[] args) {

       Pessoa p1 = new Pessoa(00, "Lucas", new Endereco("amazonas", 22, new Regiao(44, "São paulo", "SP")));

       System.out.println(p1);

//
//        Pessoa p1  = new Pessoa();
//
//        p1.setNome("Lucas");
//        p1.setCpf(10012);
//        p1.getEndereco().setNum(22);
//        p1.getEndereco().setRua("amazonas");
//
//        System.out.println(p1.getEndereco().getNum());
    }
}
