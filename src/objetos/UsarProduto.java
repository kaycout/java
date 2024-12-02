package objetos;

import classes.Fornecedor;
import classes.Produto;

public class UsarProduto {

	public static void main(String[] args) {
		Fornecedor dell = new Fornecedor();
		dell.setRazaoSocial("Dell computer");
		dell.setNomeFantasia("Dell");
		dell.setCnpj("123485960");
		System.out.println(dell.cadastro());
		
		Produto mouse = new Produto();
		mouse.setNome("Mouse sem fio");
		mouse.setDescricao("Mouse sem fio recarregável");
		mouse.setPreco(54.20);
		mouse.setFornecedor(dell);
		System.out.println(mouse.cadastrar());
		System.out.println("O preço do produto é "+mouse.getPreco());

		
//	System.out joga a informação na tela.	
	}

}
