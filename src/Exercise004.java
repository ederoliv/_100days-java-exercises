import java.util.Objects;

/*
4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
    entre eles.
    Ex:
    Digite um valor: 8
    Digite outro valor: 5
    A soma entre 8 e 5 é igual a 13.
 */
public class Exercise004 {

    public static void main(String[] args) {
        int primeiroNumero, segundoNumero, somaDosNumeros;

        System.out.print("Digite um valor: ");
        primeiroNumero = Integer.parseInt(Objects.requireNonNull(EntraDados.entradaDados()));

        System.out.print("Digite mais um valor: ");
        segundoNumero = Integer.parseInt(Objects.requireNonNull(EntraDados.entradaDados()));

        somaDosNumeros = primeiroNumero + segundoNumero;

        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + somaDosNumeros);

    }
}
