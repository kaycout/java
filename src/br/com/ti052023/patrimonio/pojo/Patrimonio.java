package br.com.ti052023.patrimonio.pojo;

public class Patrimonio {
	private Integer id;
	private String serie;
	private String nomepatrimonio;
	private String tipo;
	private String descricao;
	private String localizacao;
	private String fabricacao;
	private String dataaquisicao;
	public Patrimonio() {
	}
	public Patrimonio(Integer id, String serie, String nomepatrimonio, String tipo, String descricao,
			String localizacao, String fabricacao, String dataaquisicao) {
		this.id = id;
		this.serie = serie;
		this.nomepatrimonio = nomepatrimonio;
		this.tipo = tipo;
		this.descricao = descricao;
		this.localizacao = localizacao;
		this.fabricacao = fabricacao;
		this.dataaquisicao = dataaquisicao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getNomepatrimonio() {
		return nomepatrimonio;
	}
	public void setNomepatrimonio(String nomepatrimonio) {
		this.nomepatrimonio = nomepatrimonio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(String fabricacao) {
		this.fabricacao = fabricacao;
	}
	public String getDataaquisicao() {
		return dataaquisicao;
	}
	public void setDataaquisicao(String dataaquisicao) {
		this.dataaquisicao = dataaquisicao;
	}
	


}
