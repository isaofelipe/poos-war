/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote1;


/**
 *
 * @author Isao Felipe Morigaki
 */
public class Main {
    public static void main(String[] args) {
        InOut.MsgDeInformacao("POO'S WAR", "blsblslbslblslsbl. Historia bla");
        String classePersonagem;
        boolean sucesso = false;
        Personagem heroi = null;
        while(!sucesso){
            classePersonagem = InOut.leString("Escolha a sua classe: 'Mago' ou 'Guerreiro'");
            if (classePersonagem.equals("Mago") || classePersonagem.equals("mago") ||
                    classePersonagem.equals("Guerreiro") || classePersonagem.equals("guerreiro")){
                heroi = new Mago();
                sucesso = true;
            }
            else if (classePersonagem.equals("Guerreiro") || classePersonagem.equals("guerreiro")){
                heroi = new Guerreiro();
                sucesso = true;
            }
            else{
                InOut.MsgDeErro("Erro", "Digite 'Mago' ou 'Guerreiro'");
            }
        }
        
        heroi.setNome(InOut.leString("Escolha o seu nome:"));
        InOut.MsgDeInformacao("POO'S WAR", "Nível:" + heroi.getLevel());
        
    }
}
