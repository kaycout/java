package classes;

public class Fornecedor {
	private String RazaoSocial;
	private String NomeFantasia;
	private String Cnpj;
	
	
	public String cadastro() {
		String msg = "Fornecedor cadastrado";
		return msg;
	}
	
//	public Boolean cadastrou() {
//		Boolean rs = true;
//		return rs;
//  	}
	
	public void setRazaoSocial (String RazaoSocial) {
		this.RazaoSocial = RazaoSocial;
	}
	public void setNomeFantasia (String NomeFantasia) {
		this.NomeFantasia  = NomeFantasia;
	}
	public void setCnpj (String Cnpj) {
		this.Cnpj  = Cnpj;
	}
}

