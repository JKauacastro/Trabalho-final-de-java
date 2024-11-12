import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContatoCRUD contatoCrud = new ContatoCRUD();
        
        while (true) {
            System.out.println("\nGERENCIADOR PESSOAL DE CONTATOS\n");
            System.out.println("1:Cadastrar contato");
            System.out.println("2:Cadastrar contato profissional");
            System.out.println("3:Listar contatos");
            System.out.println("4:Buscar contato por id");
            System.out.println("5:Atualizar contato");
            System.out.println("6:Deletar contato");
            System.out.println("7:Sair do sistema");
            System.out.print("-> Escolha uma opção: ");
            
            Scanner scanner = new Scanner(System.in);

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Cadastrar um contato comum
                	Contato contato = Utils.capturarcontato();
                    contatoCrud.salvarContato(contato);
                    System.out.println("Contato cadastrado!\n");
                    break;
                    
                case 2:
                	// Cadastrar um contato profissional
                    ContatoProfissional contatoProfissional = Utils.capturarContatoProfissional();
                    contatoCrud.salvarContatoProfissional(contatoProfissional);
                    System.out.println("Contato profissional cadastrado!\n");
                    break;

                case 3:
                	// Listar todos os contatos
                	Utils.listcontato(contatoCrud);
                    break;
                
                case 4:
                    // Buscar contato pelo ID
                	Utils.buscarContato(contatoCrud);
                    break;

                case 5:
                    // Atualizar um contato específico
                	 Utils.atualizarContato(contatoCrud);
                    break;

                case 6:
                    // Deletar um contato pelo ID
                	Utils.deletarId(contatoCrud);
                    break;

                case 7:
                	// Para sair do sistema
                    System.out.println("Saindo do sistema..Obrigado!");
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
