/*
1. Crie uma variável que armazena o valor de uma laranja;
2. Crie uma variável que informa o valor de uma uva;
3. Some o valor da laranja com a uva;
*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Escreva seu código aqui ⬇️

        System.out.println("Insira dois valores");
        double laranjaPreco = sc.nextDouble();
        double uvaPreco = sc.nextDouble();
        double valorSoma = laranjaPreco + uvaPreco;
        System.out.println("O valor da soma é " + valorSoma);

        // Recebam duas idades, faça a soma delas e imprima no terminal
        
        System.out.println("Insira duas idades");
        int idade1 = sc.nextInt();
        int idade2 = sc.nextInt();
        int somaIdades = idade1 + idade2;
        System.out.println("A soma das idades é " + somaIdades);
    }
}
