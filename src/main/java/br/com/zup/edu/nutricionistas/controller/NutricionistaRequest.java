package br.com.zup.edu.nutricionistas.controller;

import br.com.zup.edu.nutricionistas.model.Nutricionista;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.time.LocalDate;

public class NutricionistaRequest {
    @NotBlank
    private String nome;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String crn;

    @NotBlank
    @CPF
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Past
    private LocalDate dataNascimento;

    public NutricionistaRequest(String nome, String email, String crn, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.crn = crn;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Deprecated
    public NutricionistaRequest() {
    }

    public Nutricionista toNutricionista() {
        return new Nutricionista(crn, nome, cpf, dataNascimento, email);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCrn() {
        return crn;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
