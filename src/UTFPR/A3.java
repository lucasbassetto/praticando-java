package UTFPR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A3 {

    public static void main(String[] args) {

        System.out.print("Entre com os dados: ");
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        try {
            s = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }
        System.out.println("Meu nome é: " +s);
    }
}
