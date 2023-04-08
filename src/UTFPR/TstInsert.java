package UTFPR;

import java.util.Locale;
import java.util.Scanner;

public class TstInsert {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        System.out.println("Digite seus dados: ");
//        System.out.print("CPF: ");
//        int cpf = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Nome: ");
//        String nome = sc.nextLine();
//        System.out.println();
//        System.out.println("Digite seu endereço: ");
//        System.out.print("Rua: ");
//        String rua = sc.nextLine();
//        System.out.print("Numero: ");
//        int num = sc.nextInt();
//        System.out.print("Codigo: ");
//        int codReg = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Cidade: ");
//        String cidade = sc.nextLine();
//        System.out.print("Uf: ");
//        String uf = sc.next();
//
//        Pessoa p1 = new Pessoa(cpf, nome, new Endereco(rua, num, new Regiao(codReg, cidade, uf)));
//
//        System.out.println(p1);

        Pessoa p1 = new Pessoa();
        Leitura l = new Leitura();

        p1.setCpf(Integer.parseInt(l.entDados("CPF: ")));
        p1.setNome(l.entDados("NOME: "));
        p1.getEndereco().setRua("Americanas");
        p1.getEndereco().setRua(l.entDados("Digite a rua: "));
        p1.getEndereco().setNum(Integer.parseInt(l.entDados("N°: ")));
        p1.getEndereco().getRegiao().setCidade(l.entDados("CIDADE: "));
        p1.getEndereco().getRegiao().setUf(l.entDados("UF: "));
        p1.getEndereco().getRegiao().setCodReg(Integer.parseInt(l.entDados("CODIGO: ")));

        System.out.println(p1);


    }
}
