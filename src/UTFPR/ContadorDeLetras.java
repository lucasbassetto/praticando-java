package UTFPR;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContadorDeLetras {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Digite uma frase:");
            String frase = br.readLine();

            System.out.println("Digite uma letra:");
            String letra = br.readLine();

            letra = letra.toLowerCase();

            int count = 0;
            int posicao = 0;

            for (int i = 0; i < frase.length(); i++) {
                String letraAtual = String.valueOf(frase.charAt(i)).toLowerCase();
                if (letraAtual.equals(letra)) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println("A letra \"" + letra + "\" aparece " + count + " vezes na frase.");
                System.out.println("Ela está na(s) posição(ões):");
                for (int i = 0; i < frase.length(); i++) {
                    if (frase.charAt(i) == letra.charAt(0) || frase.charAt(i) == letra.toUpperCase().charAt(0)) {
                        System.out.println(i + 1);
                    }
                }
            } else {
                System.out.println("A letra '" + letra + "' não existe na frase.");
            }
        }
        catch(IOException e) {
            System.out.println("Erro de entrada");
        }
    }
}
