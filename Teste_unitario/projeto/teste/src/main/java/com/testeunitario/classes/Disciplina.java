package com.testeunitario.classes;

public class Disciplina {
    private String nome;

    private double creditos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    public Disciplina(String nome, double creditos) {
        this.nome = nome;
        this.creditos = creditos;
    }

    public Disciplina() {
        
    }
}
