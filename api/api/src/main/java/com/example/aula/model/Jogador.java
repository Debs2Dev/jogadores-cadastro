package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "A idade é obrigatória.")
    @Email(message = "Deve ser uma idade válida.")
    private String idade;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public Jogador() {
    }

    public Jogador(Long id, String nome, String email, String senha) {
        this.id = id;
        this.idade = idade;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "E-mail é obrigatório.") @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "E-mail é obrigatório.") @Email String email) {
        this.email = email;
    }

    public @NotBlank(message = "Senha é obrigatória.") @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigatória.") @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres.") String senha) {
        this.senha = senha;
    }
}

