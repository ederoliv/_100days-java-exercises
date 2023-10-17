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

    private static String nome;
    public static void main(String[] args) {



        try {
            System.out.print("Qual é o seu nome? ");
            nome = EntraDados.entradaDados();
            System.out.println("Olá " + nome + ", é um prazer te conhecer!");

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
