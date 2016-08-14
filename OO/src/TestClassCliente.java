
public class TestClassCliente {
	public static void main(String[] args){
		Client client1 = new Client();
		Client client2 = new Client();
		
		client1.name = "Victor";
		client1.code = 001;
		
		
		client2.name = "Jhon";
		client2.code = 002;
		
		System.out.println("Dados Cliente 1");		
		System.out.println("Name: " + client1.name);
		System.out.println("Code: " + client1.code);
		
		
		System.out.println("-----------------------------------	");
		
		System.out.println("Dados Cliente 2");		
		System.out.println("Name: " + client2.name);
		System.out.println("Code: " + client2.code);
	}
}
