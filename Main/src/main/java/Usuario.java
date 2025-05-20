
public class Usuario {

    private String id;
    private String nome;
    private String email;

    //Contrutor
    public Usuario(String id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getId() { //Getter do ID
        return id;
    }

    public String getNome() { //Getter do Nome
        return nome;
    }

    public String getEmail() { //Getter do Email
        return email;
    }

    public void exibir() { //Método para exibir a lista dos Usuário
        System.out.println("Usuario: " + nome + " | ID: " + id + " | Email: " + email);
    }
}
