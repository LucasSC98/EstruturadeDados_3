import java.util.Scanner;

public class ConsultaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println("Digite o valor que quer procurar: ");
        int valorProcurado = sc.nextInt();
        int indexposicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorProcurado) {
                indexposicao  = i;
                break;
            }
        }

        if (indexposicao  != -1) {
            System.out.println("Valor foi encontrado na posição: " + indexposicao);
        } else {
            System.out.println("Valor não foi encontrado");
        }
    }
}