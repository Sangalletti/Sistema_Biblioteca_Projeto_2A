
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao = -1;

        //Menu
        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Cadastrar Usuario");
            System.out.println("3 - Cadastrar Administrador");
            System.out.println("5 - Listar Livros");
            System.out.println("6 - Listar Usuarios");
            System.out.println("7 - Listar Administradores");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            //Casos
            switch (opcao) {
                case 1:
                    System.out.print("ISBN: ");
                    String isbn = teclado.nextLine();
                    System.out.print("Titulo: ");
                    String titulo = teclado.nextLine();
                    System.out.print("Autor: ");
                    String autor = teclado.nextLine();
                    System.out.print("Ano: ");
                    int ano = teclado.nextInt();
                    teclado.nextLine();

                    Livro livro = new Livro(isbn, titulo, autor, ano);
                    biblioteca.cadastrarLivro(livro);
                    break;

                case 2:
                    System.out.print("ID: ");
                    String id = teclado.nextLine();
                    System.out.print("Nome: ");
                    String nome = teclado.nextLine();
                    System.out.print("Email: ");
                    String email = teclado.nextLine();

                    Usuario usuario = new Usuario(id, nome, email);
                    biblioteca.cadastrarUsuario(usuario);
                    break;

                case 3:
                    System.out.print("ID: ");
                    String idAdmin = teclado.nextLine();
                    System.out.print("Nome: ");
                    String nomeAdmin = teclado.nextLine();
                    System.out.print("Email: ");
                    String emailAdmin = teclado.nextLine();
                    System.out.print("Cargo: ");
                    String cargoAdmin = teclado.nextLine();

                    Administrador administrador = new Administrador(idAdmin, nomeAdmin, emailAdmin, cargoAdmin);
                    biblioteca.cadastrarAdministrador(administrador);
                    break;

                case 5:
                    biblioteca.listarLivros();
                    break;

                case 6:
                    biblioteca.listarUsuarios();
                    break;

                case 7:
                    biblioteca.listarAdministradores();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }

        }

        //Fecha o Scanner
        teclado.close();
    }
}
