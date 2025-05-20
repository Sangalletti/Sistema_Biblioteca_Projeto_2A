
public class Administrador {

    private String id;
    private String nome;
    private String email;
    private String cargo;

    //Contrutor
    public Administrador(String id, String nome, String email, String cargo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    public String getId() { //Getter d ID
        return id;
    }

    public String getNome() { //Getter do Nome
        return nome;
    }

    public String getEmail() { //Getter do Email
        return email;
    }

    public String getCargo() { //Getter do Cargo
        return cargo;
    }

    public void exibir() { //Método para exibir a lista de Administradores
        System.out.println("Administrador: " + nome + " | ID: " + id + " | Email: " + email + " | Cargo: " + cargo);
    }
}
