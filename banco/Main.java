package banco;
public class Main {

	public static void main(String[] args) {
		Cliente usuario = new Cliente();
		usuario.setNome("Usuario");
		
		Conta cc = new ContaCorrente(usuario);
		Conta poupanca = new ContaPoupanca(usuario);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		//teste lombok
		System.out.println("-----------------------------"); 
		System.out.println("Teste Getter Lombok: Nome do Cliente: " + usuario.getNome()); 
	}

}
