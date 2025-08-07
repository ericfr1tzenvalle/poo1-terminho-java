/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.terminho.terminho.utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;

/**
 *
 * @author Éric
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ArquivoUtils {
    
      private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    
    /**
     * Verifica se um arquivo existe no caminho especificado.
     */  
      
    public static boolean verificaArquivoExiste(String caminho){ 
       File file = new File(caminho);
       return file.exists();
        
    }
    
     /**
     * Salva um objeto qualquer como JSON em um arquivo.
     */
    
    public static void salvarJson(String caminho, Object obj){
        try(FileWriter writer = new FileWriter(caminho)){
            gson.toJson(obj,writer);
            
        }catch(IOException e){
            System.err.println("Erro ao salvar JSON: " + e.getMessage());
        }
    }
    
     /**
     * Carrega um objeto de um arquivo JSON.
     */
    
    public static <T> T carregarJson(String caminho, Class<T> tipo){
        try(FileReader reader = new FileReader(caminho)){
            return gson.fromJson(reader,tipo);
        }catch(FileNotFoundException e){
            System.err.println("Arquivo não encontrado: " + caminho);
        }catch(IOException e){
            System.err.println("Erro ao ler JSON: " + e.getMessage());
        }
         return null;
    }
    
    /**
     * Cria uma pasta, caso ela ainda não exista.
     */
    public static void criarPastaSeNaoExistir(String caminhoPasta) {
        File pasta = new File(caminhoPasta);
        if (!pasta.exists()) {
            pasta.mkdirs();
        }
    }
    
    
}
