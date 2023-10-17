import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntraDados {
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static String entradaDados(){

        try{

             return input.readLine();

        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

}
