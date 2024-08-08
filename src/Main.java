import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu email: ");
        String email = sc.nextLine();

        System.out.println("Digite o ano do seu nascimento: ");
        Integer dataNascimento = sc.nextInt();

        System.out.println("Digite sua altura: ");
        Float altura = sc.nextFloat();

        System.out.println("Digite seu sexo: ");
        Character sexo = sc.next().charAt(0);

        System.out.println("Digite o seu peso: ");
        Double peso  = sc.nextDouble();

        System.out.println("Ano Atual: ");
        Integer anoAtual = sc.nextInt();

        String alturaFormato = String.format("%.2f", altura);

        //Ano atual
        Integer idade = anoAtual - dataNascimento;

        Boolean nasceuDepois2000 = dataNascimento > 2000;


        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu email: " +email);
        System.out.println("Seu ano de nascimento: " +dataNascimento);
        System.out.println("Sua altura: " +alturaFormato);
        System.out.println("Seu sexo: " +sexo);
        System.out.println("Você tem: " + idade + " anos");
        System.out.println("Nasceu depois do Ano 2000: " + nasceuDepois2000);
        System.out.println("Seu peso: " +peso+ " Kgs");

    }
}
