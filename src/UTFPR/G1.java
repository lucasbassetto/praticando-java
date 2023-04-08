package UTFPR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G1 {
    public static void main(String[] args) {

        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);

        double a = 0;
        double b = 0;
        double resultado = 0;
        int opcao = 0;

        try {
            System.out.print("Entre com o primeiro número: ");
            a = Double.parseDouble(cd.readLine());
            System.out.print("Entre com o segundo número: ");
            b = Double.parseDouble(cd.readLine());
            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Somar (a + b)");
            System.out.println("2 - Multiplicar (a * b)");
            System.out.println("3 - Subtrair (a - b)");
            System.out.println("4 - Dividir (a / b)");
            System.out.println("Escolha uma opção: ");
            opcao = Integer.parseInt(cd.readLine());
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }

        switch (opcao) {
            case 1:
                resultado = a + b;
                System.out.println("A soma de a + b é: " + resultado);
                break;
            case 2:
                resultado = a * b;
                System.out.println("A multiplicação de a * b é: " + resultado);
                break;
            case 3:
                resultado = a - b;
                System.out.println("A subtração de a - b é: " + resultado);
                break;
            case 4:
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("A divisão de a / b é: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

    }

}
