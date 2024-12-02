package objetos;

import classes.Cliente;

public class UsarCliente {

	public static void main(String[] args) {
		// vamos instanciar a classe Cliente gerando o 
		// objeto cli 
		Cliente cli = new Cliente();
		cli.setNome("Rodrigo");
		cli.setEmail("rod387@gmail.com");
		cli.setCpf("123456789");
		cli.setIdade(24);
		System.out.println(cli.cadastrar());
		
	}

}
