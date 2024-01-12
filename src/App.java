import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String entrada = br.readLine();
            String[] arr = entrada.split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);

            int soma = 0;
            int contagem = 0;
            for (int k = x;; k++) {

                if (k % 2 != 0) {
                    soma = soma + k;
                    contagem++;
                }
                if (contagem == y) {
                    break;
                }
            }

            System.out.println(soma);
        }

    }
}
