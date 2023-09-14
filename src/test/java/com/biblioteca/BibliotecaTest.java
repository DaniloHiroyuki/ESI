package com.biblioteca;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void testAdicionarLivro() {
        Autor autor = new Autor("Primeiro", "Autor");
        Editora editora = new Editora("Editora 1");
        Livro livro = new Livro(autor, editora, "ISBN1", "Livro 1", 200);
        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 19.99);
        biblioteca.AdicionarEstoque(livroEstoque);
        assertTrue(biblioteca.getEstoque().contains(livroEstoque));
    }

    @Test
    public void testRemoverLivro() {
        Autor autor = new Autor("Segundo", "Autor");
        Editora editora = new Editora("Editora 2");
        Livro livro = new Livro(autor, editora, "ISBN2", "Livro 2", 250);
        LivroEstoque livroEstoque = new LivroEstoque(livro, 5, 14.99);
        biblioteca.AdicionarEstoque(livroEstoque);
        biblioteca.RemoverEstoque(livroEstoque);
        assertFalse(biblioteca.getEstoque().contains(livroEstoque));
    }

    @Test
    public void testAdicionarAutor() {
        Autor autor = new Autor("Terceiro", "Autor");
        biblioteca.AdicionarAutor(autor);
        assertTrue(biblioteca.getAutores().contains(autor));
    }

    @Test
    public void testRemoverAutor() {
        Autor autor = new Autor("Quarto", "Autor");
        biblioteca.AdicionarAutor(autor);
        biblioteca.RemoverAutor(autor);
        assertFalse(biblioteca.getAutores().contains(autor));
    }

    @Test
    public void testAdicionarEditora() {
        Editora editora = new Editora("Editora 3");
        biblioteca.AdicionarEditora(editora);
        assertTrue(biblioteca.getEditoras().contains(editora));
    }

    @Test
    public void testRemoverEditora() {
        Editora editora = new Editora("Editora 4");
        biblioteca.AdicionarEditora(editora);
        biblioteca.RemoverEditora(editora);
        assertFalse(biblioteca.getEditoras().contains(editora));
    }
}
