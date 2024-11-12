import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
	
//entidade que representa a tabela CONTATO do banco de dados 
	
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  // Define inheritance strategy (SINGLE_TABLE is most common)
@DiscriminatorColumn(name = "tipo_contato")  // Define the discriminator column name in the table
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;
	private String telefone;
	private String sexo;
	private String cpf;
	private String email;
	private String endereco;
	
	public Contato() {}
	
	public Contato(String nome, String telefone, String sexo, String cpf, String email, String endereco) {
		this.nome = nome;
	    	this.telefone = telefone;
	    	this.sexo = sexo;
	    	this.cpf = cpf;
	    	this.email = email;
	    	this.endereco = endereco;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}