import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
*
*
* */
public class Exercise003 {

    public static void main(String[] args) {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Digite seu nome: ");

            String nomeCompleto = input.readLine();

            System.out.print("Digite seu salário: ");

            double salario = Double.parseDouble(input.readLine());

            System.out.println("Nome do funcionário: " + nomeCompleto + "\n" + "Salário: " + salario);


        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
