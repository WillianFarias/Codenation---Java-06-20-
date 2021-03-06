package br.com.codenation.livro.model;

import br.com.codenation.avaliacao.model.Avaliacao;
import br.com.codenation.categoria.model.Categoria;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    @NotBlank(message = "O Título não pode ser vazio")
    private String titulo;

    @Min(0)
    @Max(10)
    @PositiveOrZero
    private Long quantidadeEstoque;

    @OneToMany

    private List<Avaliacao> avaliacoes;

    @ManyToMany
    @JoinTable(name = "LIVRO_CATEGORIA",
            joinColumns = @JoinColumn(name = "idLivro"),
            inverseJoinColumns = @JoinColumn(name = "idCategoria"))
    private List<Categoria> categorias;


    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }


    public Long getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Long quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Integer getMediaAvaliacoes() {
        return this.avaliacoes.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Avaliacao::getNota))).get().getNota();
    }


}
