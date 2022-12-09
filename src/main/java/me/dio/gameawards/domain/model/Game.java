package me.dio.gameawards.domain.model;

import jakarta.persistence.*;

@Entity(name = "TB_GAMES") //Nome da tabela na persistencia
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // long com "l" maiusculo é o wraper class que aceita o "nulo"
    private String name;
    @Column(length = 500)
    private String description; // Descrição do jogo
    private String cover; //Capa do jogo
    private long votes; // long com "l" minusculo é o primitivo

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public long getVotes() {
        return votes;
    }

    public void setVotes(long votes) {
        this.votes = votes;
    }
}
