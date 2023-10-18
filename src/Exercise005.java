import java.util.Objects;
/*
    5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
*/
public class Exercise005 {
    public static void main(String[] args) {

        double primeiraNota, segundaNota, media;

        System.out.println("Primeira nota: ");
        primeiraNota = Double.parseDouble(Objects.requireNonNull(EntraDados.entradaDados()));

        System.out.println("Segunda nota: ");
        segundaNota = Double.parseDouble(Objects.requireNonNull(EntraDados.entradaDados()));

        media = (primeiraNota + segundaNota) / 2;

        System.out.println("Media: " + media);

    }
}
