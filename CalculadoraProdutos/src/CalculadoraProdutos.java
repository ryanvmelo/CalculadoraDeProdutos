import java.util.Scanner;

public class CalculadoraProdutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//p = produto
		double p1;
		double p2;
		
		//q = quantidade
		double q1;
		double q2;
		
		System.out.println("Valor do produto 1:");
		p1 = sc.nextDouble();
		System.out.println("Quantidade do produto 1:");
		q1 = sc.nextDouble();
		System.out.println("Valor do produto 2:");
		p2 = sc.nextDouble();
		System.out.println("Quantidade do produto 2:");
		q2 = sc.nextDouble();
		
		//v = valor
		double v1 = p1 * q1;
		double v2 = p2 * q2;
		
		double valor_total = v1 + v2;
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor_total);

	}

}
