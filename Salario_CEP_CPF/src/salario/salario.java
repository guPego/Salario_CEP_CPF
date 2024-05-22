package salario;

import java.util.Scanner;

/**
 *
 * @author Gu
 */
public class salario {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu salario: ");
        double salarioBruto = scanner.nextDouble();
        
        System.out.print("Digite o desconto INSS em porcentagem: ");
        double porcentagemINSS = scanner.nextDouble();
        
        System.out.print("Dependentes: ");
        int dependetes = scanner.nextInt();
        
        System.out.print("Digite o valor de outros descontos: ");
        int outrosDescontos = scanner.nextInt();
        
        double descontoINSS = salarioBruto * porcentagemINSS / 100;
        double salarioLiquido = salarioBruto - descontoINSS - outrosDescontos;
        
        System.out.println("Nome: " + nome);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Desconto INSS: " + porcentagemINSS + "%");
        System.out.println("Dependentes: " + dependetes);
        System.out.println("Outros descontos: " + outrosDescontos);
        System.out.println("Salario liquido: " + salarioLiquido);
        
    }
}
