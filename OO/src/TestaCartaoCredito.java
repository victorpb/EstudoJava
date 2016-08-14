
public class TestaCartaoCredito {
	public static void main(String[] args) {
		CreditCard card1 = new CreditCard();
		CreditCard card2 = new CreditCard();
		
		card1.number = 1111111111;
		card1.validateDate = "12/01/2020";
		
		card2.number = 22222222;
		card2.validateDate = "31/12/3000";
		
		System.out.println("Dados do primeiro cartão");
		System.out.println("Número do cartão: " + card1.number);
		System.out.println("Validade do primeiro cartão: " + card1.validateDate);
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Dados do segundo cartão");
		System.out.println("Número do cartão: " + card2.number);
		System.out.println("Validade do primeiro cartão: " + card2.validateDate);
	}
}
