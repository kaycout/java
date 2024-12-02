package classes;

public class Produto {
	private String nome;
	private String descricao;
	private Double preco;
	private Fornecedor fornecedor;
	
	public String cadastrar() {
		String msg = "Produto "+nome+" cadastrado";
		return msg; 		
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
	public void setPreco (Double preco) {
		this.preco = preco;
	}
	public void setFornecedor (Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getNome() {
		return this.nome;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public Double getPreco() {
		return this.preco;
	}
	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}
}
