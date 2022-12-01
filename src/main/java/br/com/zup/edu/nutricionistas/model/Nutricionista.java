package br.com.zup.edu.nutricionistas.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Nutricionista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String crn;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Column(nullable = false)
    private String email;

    public Nutricionista(String crn, String nome, String cpf, LocalDate dataNascimento, String email) {
        this.crn = crn;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    @Deprecated
    public Nutricionista() {
    }

    public Long getId() {
        return id;
    }
}
