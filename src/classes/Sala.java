package classes;

public class Sala {
	private String identificacao;
	private String descricao;
	
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String cadastrar() {
		String msg = "A sala "+identificacao+" foi cadastrada";
		return msg;
				
	}
	
}
