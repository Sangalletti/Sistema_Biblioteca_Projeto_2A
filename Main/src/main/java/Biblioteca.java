
import java.util.ArrayList;

public class Biblioteca {

    //Declarando listas
    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    ArrayList<Administrador> administradores = new ArrayList<Administrador>();

    //Método para Buscar Livros por Isbn e Cadastrar
    public void cadastrarLivro(Livro novoLivro) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(novoLivro.getIsbn())) {
                System.out.println("Erro: ISBN ja cadastrado.");
                return;
            }
        }
        livros.add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    //Método para Buscar Usuarios por ID e Cadastrar
    public void cadastrarUsuario(Usuario novoUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(novoUsuario.getId())) {
                System.out.println("Erro: ID ja cadastrado.");
                return;
            }
        }
        usuarios.add(novoUsuario);
        System.out.println("Usuario cadastrado com sucesso!");
    }

    //Método para Buscar Administrador por ID e Cadastrar
    public void cadastrarAdministrador(Administrador novoAdministrador) {
        for (Administrador administrador : administradores) {
            if (administrador.getId().equals(novoAdministrador.getId())) {
                System.out.println("Erro: ID ja cadastrado.");
                return;
            }
        }
        administradores.add(novoAdministrador);
        System.out.println("Administrador cadastrado com sucesso!");
    }

    //Método para listar a lista de Livros
    public void listarLivros() {
        for (Livro livro : livros) {
            livro.exibir();
        }
    }

    //Método para listar Usuarios
    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            usuario.exibir();
        }
    }

    //Método para listar Administradores
    public void listarAdministradores() {
        for (Administrador administrador : administradores) {
            administrador.exibir();
        }
    }

}
