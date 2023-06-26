import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		new Main();
	}
	
	private Scanner scanner = new Scanner(System.in);
	
	public Main() {
		while(true) {
			System.out.println("Qual é o valor do produto em dólares?");
			int valor = scanner.nextInt();
			System.out.println("Qual é a quantidade de produtos a serem comprados?");
			int quantidade = scanner.nextInt();
			int valorFinal = valor * 6;
			int valorTotal = valorFinal * quantidade;
			double II = valorFinal * (25.0 / 100.0);
			double ICMS = valorFinal * (23.0 / 100.0);
			double IPI = valorFinal * (30.0 /100.0);
			double valorComImposto = (valorFinal + II + ICMS + IPI);
			System.out.println("Valor de cada produto: R$"+valorFinal+" (dólar a R$6)");
			System.out.println("Valor de cada produto com imposto: R$"+ valorComImposto);
			System.out.println("Valor total: R$"+valorTotal);
			System.out.println("Valor do ICMS: R$"+ ICMS+" (ICMS a 23%)");
			System.out.println("Valor do II: R$"+II+ " (II a 25%)");
			System.out.println("Valor do IPI: R$"+IPI+ " (IPI a 30%)");
			System.out.println("------------------------------------------");
			double valorDoImposto = ((valorTotal * (10.0 / 100.0)) + (valorTotal * (3.0 / 100.0)));
			System.out.println("Valor indicado para venda: "+ (valorComImposto + (valorComImposto * (15.0 / 100.0))));
			System.out.println("Valor de imposto sobre renda bruta: R$"+valorDoImposto+ " (valor do PIS a 3% e CONFIS a 10%)");
			System.out.println("Esses valores consideram todas as taxas no valor mais alto possível.");
		}
	}
}
