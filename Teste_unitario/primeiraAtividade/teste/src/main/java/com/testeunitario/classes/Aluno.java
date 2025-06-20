package com.testeunitario.classes;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    
    private int faltas;

    private ArrayList<Disciplina> listaDisciplina = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public ArrayList<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(ArrayList<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }

    public Aluno(String nome, int faltas, ArrayList<Disciplina> listaDisciplina) {
        this.nome = nome;
        this.faltas = faltas;
        this.listaDisciplina = listaDisciplina;
    }

    public Aluno( ) {
        
    }

    public void adicionarDisciplina(Disciplina novaDisciplina){
        listaDisciplina.add(novaDisciplina);
    }

    public int verificarQuantidadeDisciplinas() {
        return listaDisciplina.size();
    }

    public void adicionarFaltas(int numeroFaltas) {
        faltas += numeroFaltas;
    }

    public int quantidadeFaltas(){
        return getFaltas();
    }

    public double qtdCreditosDisciplinas() {
    double qtdCreditosTotal = 0.0;
    
    for (int i = 0; i < listaDisciplina.size(); i++) {
        qtdCreditosTotal += listaDisciplina.get(i).getCreditos();
    }

    return qtdCreditosTotal;
}
}
