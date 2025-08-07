/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.terminho.terminho.view;

import com.terminho.terminho.model.Jogador;
import com.terminho.terminho.utils.ConsoleCores;
import java.util.List;

/**
 *
 * @author Luísa
 */
public class GameView {
    
    public void mostrarOpcoes(){
        System.out.println("===================================");
        System.out.println("[1] Termo\n[2] Dueto\n[3] Quarteto");
        System.out.print("> ");
    }
    
    public void saudacoes(Jogador jogador){
        System.out.println(">> Seja bem vindo ao [T E R M I N H O] : " + jogador.getNome());
        System.out.println(">> Vitorias termo: " + jogador.getVitoriasTermo());
    }

    public void mostrarChutesTermo(String palavraSecreta, List<String> palavrasChutadas) {
        for(String chute: palavrasChutadas){
            for(int i = 0; i < chute.length(); i++){
                char letraChute = chute.charAt(i);
                char letraSecreta = palavraSecreta.charAt(i);
                
                if(letraChute == letraSecreta){
                    System.out.print(" "+ConsoleCores.VERDE + "[" + letraChute + "]" + ConsoleCores.RESET + " ");
                }else if(palavraSecreta.indexOf(letraChute) != -1){
                    System.out.print(" "+ConsoleCores.AMARELO + "["+letraChute+"]" + ConsoleCores.RESET + " ");
                }else{
                    System.out.print(" ["+letraChute+"] ");
                }
                
            }
            System.out.println();
            
        }
        System.out.println("> ");
        
    }
    
}
