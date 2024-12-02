package classes;

public class Cliente {
// Atributos(caracteristicas) da classe cliente
// os atributos são do cliente e, portanto, são privados
	private String Nome;
	private String Email;
    private String Cpf;
    private Integer Idade;
    
    // Métodos de acesso aos atributos da classe Cliente.
    // Com eles vamos enviar dados e podemos resgatar dos dados.
    
    public void setNome(String nome) {
    	this.Nome = nome;
    }
    
    public void setEmail(String email) {
    	this.Email = email;
    }
    
    public void setCpf(String cpf) {
    	this.Cpf = cpf;
    }
    
    public void setIdade(Integer idade) {
    	this.Idade = idade;
    }
    	
    public String cadastrar() {
    	String msg = "O cliente "+Nome+" foi cadastrado";
    	return msg;
    }
}
