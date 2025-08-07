/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.terminho.terminho.model;

/**
 *
 * @author Éric
 */
public class Jogador {
    private String nome;
    private int tentativasTotais;
    private int vitoriasTermo;
    private int vitoriasDueto;
    private int vitoriasQuarteto;
    
    public Jogador(String nome){
        this.nome = nome;
        this.tentativasTotais = 0;
        this.vitoriasTermo = 0;
        this.vitoriasDueto = 0;
        this.vitoriasQuarteto = 0;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void adicionarVitoriaTermo(){
        vitoriasTermo++;
    }

    public int getTentativasTotais() {
        return tentativasTotais;
    }

    public void setTentativasTotais(int tentativasTotais) {
        this.tentativasTotais = tentativasTotais;
    }

    public int getVitoriasTermo() {
        return vitoriasTermo;
    }

    public void setVitoriasTermo(int vitoriasTermo) {
        this.vitoriasTermo = vitoriasTermo;
    }

    public int getVitoriasDueto() {
        return vitoriasDueto;
    }

    public void setVitoriasDueto(int vitoriasDueto) {
        this.vitoriasDueto = vitoriasDueto;
    }

    public int getVitoriasQuarteto() {
        return vitoriasQuarteto;
    }

    public void setVitoriasQuarteto(int vitoriasQuarteto) {
        this.vitoriasQuarteto = vitoriasQuarteto;
    }
    
    

   
    
}
