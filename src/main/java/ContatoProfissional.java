import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ContatoProfissional")
public class ContatoProfissional extends Contato {
    private String cnpj;
    
    public ContatoProfissional(String nome, String telefone, String sexo, String cpf, String email, String endereco, String cnpj) {
        super(nome, telefone, sexo, cpf, email, endereco);
        this.cnpj = cnpj;
    }

    
    public ContatoProfissional() {
    	super();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
