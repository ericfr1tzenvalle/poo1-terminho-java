/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.terminho.terminho.controller;

import com.terminho.terminho.model.Jogador;
import com.terminho.terminho.utils.ArquivoUtils;
import com.terminho.terminho.utils.PalavraUtils;
import com.terminho.terminho.view.GameView;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Éric
 */
public class GameController {

    private String arquivoPalavra = "palavras.txt";
    private int tentativas = 5;
    private Scanner sc = new Scanner(System.in);
    private GameView view;

    public GameController() {
        this.view = new GameView();
    }

    public void menu(Jogador jogador) {
        int opcao = -1;
        try {
            while (opcao != 0) {
                view.saudacoes(jogador);
                view.mostrarOpcoes();
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        iniciarTermo(jogador);
                        break;
                    case 2:
                    case 3:
                        System.out.println("> Não implementado.");
                        break;
                    default:
                        System.out.println("> Opção Inválida.");
                        break;

                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada Inválida! Digite um número." + e.getMessage());
        }
    }

    public void iniciarTermo(Jogador jogador) {
        limparTela();
        int tentativas = 5;
        List<String> palavrasUsadas = new ArrayList<>();
        List<String> palavrasExistentes = PalavraUtils.carregarPalavras(arquivoPalavra);
        String palavraSecreta = PalavraUtils.retornaPalavra(arquivoPalavra);
        System.out.println("[] [] [] [] []");
        System.out.print("> ");
        while (tentativas > 0) {
            String palavraChute = sc.nextLine().toLowerCase().trim();
            while (palavraChute.length() > 5) {
                System.out.println("A palavra deve ter 5 letras!");
                System.out.print("> ");
                palavraChute = sc.nextLine().toLowerCase().trim();
            }
            while (!verificaPalavraExiste(palavraChute, palavrasExistentes)) {
                System.out.println("Essa palavra não existe!");
                System.out.print("> ");
                palavraChute = sc.nextLine().toLowerCase().trim();
            }
            palavrasUsadas.add(palavraChute);
            System.out.flush();
            limparTela();
            view.mostrarChutesTermo(palavraSecreta, palavrasUsadas);
            if (palavraChute.equals(palavraSecreta)) {
                System.out.println(">>>> VITÓRIA <<<<");
                jogador.adicionarVitoriaTermo();
                ArquivoUtils.salvarJson("data/Jogador.json", jogador);
                return;
            }
            tentativas--;
            jogador.setTentativasTotais(jogador.getTentativasTotais() + 1);
        }
        System.out.println(">>>> PERDEU <<<<\nA palavra era: " + palavraSecreta);
        ArquivoUtils.salvarJson("data/Jogador.json", jogador);

    }

    public boolean verificaPalavraExiste(String palavraChute, List<String> palavras) {
        for (String palavra : palavras) {
            if (palavra.equals(palavraChute)) {
                return true;
            }
        }
        return false;
    }

    public static void limparTela() {
        try {
            String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {

            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

}
