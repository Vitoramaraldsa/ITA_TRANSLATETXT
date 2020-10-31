package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author amaral
 */
public class Leitura {
   
    
    public String palavras(String palavra) throws FileNotFoundException, IOException{
      
       InputStream arquivo = getClass().getResourceAsStream("/entrada.txt"); // a barra no início indica a raíz a partir do classpath
       BufferedReader leitor = new BufferedReader(new InputStreamReader(arquivo));
        
        
       String aux = "";
       String linhas = "";
        
       while(aux != null){
       
       aux = leitor.readLine();
       
       if(aux != null){
       linhas = linhas + aux.toLowerCase() + " " ;
         }
       }
       
       
        String vetorTrad[] = linhas.split(",");
      
        for (int i = 0; i < vetorTrad.length; i++) {
            if(i % 2 == 0){
                if(palavra.toLowerCase().equals(vetorTrad[i])){
                    palavra = vetorTrad[i + 1].trim();
                    break;
                }
            
            }else{
                if(palavra.toLowerCase().equals(vetorTrad[i])){
                    palavra = vetorTrad[i - 1].trim();
                    break;
                  }
              }
          }
         
        
        arquivo.close();
        return palavra;

  
    
    
    }

      
    
    
      
}