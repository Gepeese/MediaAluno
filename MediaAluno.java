import java.util.Scanner;
public class MediaAluno{
    public static void main(String[] args) {
        Float nota1,nota2,nota3,media;
        String nomeAluno;
        Scanner LerTeclado = new Scanner(System.in);
        System.out.print("Digite o Nome do Aluno: ");
        nomeAluno = LerTeclado.nextLine();
        System.out.print("Digite a nota 1: ");
        nota1 = LerTeclado.nextFloat();
        System.out.print("Digite a nota 2: ");
        nota2 = LerTeclado.nextFloat();
        System.out.print("Digite a nota 3: ");
        nota3 = LerTeclado.nextFloat();
        media = (nota1+nota2+nota3)/3;
        System.out.printf(nomeAluno+" Sua Media Foi: "+" %.2f ", media);
        LerTeclado.close();

    }
}
