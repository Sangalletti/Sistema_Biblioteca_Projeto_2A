
public class Livro {

    private String isbn;
    private String titulo;
    private String autor;
    private int ano;

    //Construtor
    public Livro(String isbn, String titulo, String autor, int ano) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getIsbn() { //Getter do Isbn
        return isbn;
    }

    public String getTitulo() { //Getter do Titulo
        return titulo;
    }

    public String getAutor() { //Getter do Autor
        return autor;
    }

    public int getAno() { //Getter do Ano
        return ano;
    }

    public void exibir() { //Método exibir para listar dos Títulos
        System.out.println("Titulo: " + titulo + " | Autor: " + autor + " | Ano: " + ano
                + " | ISBN: " + isbn);
    }
}
