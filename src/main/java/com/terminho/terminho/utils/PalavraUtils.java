/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.terminho.terminho.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;

/**
 *
 * @author Éric
 */
public class PalavraUtils {
    
    public static List<String> carregarPalavras(String nomeArquivo){
        List<String> palavras = new ArrayList<>();
        
        try(InputStream input = PalavraUtils.class.getClassLoader().getResourceAsStream(nomeArquivo)){
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            
            String linha;
            while((linha = reader.readLine()) != null){
                palavras.add(linha.trim().toLowerCase());
            }
        }catch(IOException e){
            System.err.println("Erro ao carregar o arquivo de palavras" + e.getMessage());
        }
        return palavras;
    }
    
    private static String palavraAleatoria(List<String> lista){
        Random random = new Random();
        int index = random.nextInt(lista.size());
        return lista.get(index);
    }
    
    public static String retornaPalavra(String nomeArquivo){
        List<String> palavras = carregarPalavras(nomeArquivo);
        return palavraAleatoria(palavras);
        
    }
    
}
