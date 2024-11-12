import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ContatoCRUD {

	// Método para salvar um contato comum
    public void salvarContato(Contato contato) {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(contato);
        transaction.commit();
        session.close();
    }
	
 // Método para salvar um contato profissional
	public void salvarContatoProfissional(ContatoProfissional contatoProfissional) {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(contatoProfissional); 
        transaction.commit();
        session.close();
    }

	// Método para buscar um contato pelo ID
    public Contato buscarContato(int id) {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Contato contato = session.get(Contato.class, id);
        session.close();
        return contato;
    }
    
    public ContatoProfissional buscarContatoProfissional(int id) {
        Session session = HibernateConfig.getSessionFactory().openSession();
        ContatoProfissional contato = session.get(ContatoProfissional.class, id);
        session.close();
        return contato;
    }

	// Método para listar todos os contatos # TODO, aprender a fazer query somente da class base, usando a coluna tipo_contato
    public List<Contato> listarContatos() {
        Session session = HibernateConfig.getSessionFactory().openSession();
        List<Contato> contatos = session.createQuery("from Contato", Contato.class).list();
        session.close();
        return contatos;
    }
    
    // Método para listar todos os contatos # TODO, adicionar no diagrama
    public List<ContatoProfissional> listarContatosProfissionais() {
        Session session = HibernateConfig.getSessionFactory().openSession();
        List<ContatoProfissional> contatos = session.createQuery("from ContatoProfissional", ContatoProfissional.class).list();
        session.close();
        return contatos;
    }
    
 // Método para atualizar um contato
    public void atualizarContato(Contato contato) {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(contato);
        transaction.commit();
        session.close();
    }

    public void atualizarContatoProfissional(ContatoProfissional contato) {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(contato);
        transaction.commit();
        session.close();
    }

 // Método para deletar um contato pelo ID
    public void deletarContato(int id) {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Contato contato = session.get(Contato.class, id);
        if (contato != null) {
            session.remove(contato);
            transaction.commit();
        }
        session.close();
    }
}
