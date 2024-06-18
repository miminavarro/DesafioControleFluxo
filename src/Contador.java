import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroParametro = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoParametro = entrada.nextInt();

        try {
            avaliarParametros(primeiroParametro, segundoParametro);

            System.out.println("Contagem: ");

            for (int i = primeiroParametro + 1; i <= segundoParametro; i++) {
                System.out.println("Imprimindo o restante dos números: " + i);
            }
            System.out.println("Contagem com " + (segundoParametro - primeiroParametro) + " ocorrências.");
            
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        entrada.close();
    }

    static void avaliarParametros(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }
    }
}