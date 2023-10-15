import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-
 * vindas para ela:
 * Ex:
 * Qual é o seu nome? João da Silva
 * Olá João da Silva, é um prazer te conhecer!
 */
public class Exercise002 {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nome;

        try {
            System.out.print("Qual é o seu nome? ");
            nome = input.readLine();
            System.out.println("Olá " + nome + ", é um prazer te conhecer!");

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
