import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaração de variáveis
        var numero1 = 0;
        var numero2 = 0;

        //Entrada de dados
        Scanner obj; //Declaração
        obj = new Scanner(System.in); // Construção
        System.out.println("Entre com um número:");
        numero1 = obj.nextInt();
        System.out.println("Entre com outro número:");
        numero2 = obj.nextInt();

        //Processamento
        int soma = numero1 + numero2;

        //Saída de dados
       System.out.println(soma);

    }
}