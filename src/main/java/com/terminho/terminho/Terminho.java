/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.terminho.terminho;

import com.terminho.terminho.controller.GameController;
import com.terminho.terminho.model.Jogador;
import com.terminho.terminho.utils.ArquivoUtils;
import java.util.Scanner;

/**
 *
 * @author Éric
 */
public class Terminho {

    public static void main(String[] args) {
        GameController gc = new GameController();
        Scanner sc = new Scanner(System.in);
        String pasta = "data";
        String caminho = pasta + "/jogador.json";
        ArquivoUtils.criarPastaSeNaoExistir(pasta);
        
        if(ArquivoUtils.verificaArquivoExiste(caminho)){
            Jogador jogador = ArquivoUtils.carregarJson(caminho, Jogador.class);
            gc.menu(jogador);
        }else{
            System.out.println("Qual seu nome: ");
            String nome = sc.nextLine();
            Jogador jogador = new Jogador(nome);
            ArquivoUtils.salvarJson(caminho, jogador);
            gc.menu(jogador);
            
        }
    }
}
