/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote1;
import java.util.Random;

/**
 *
 * @author Isao Felipe Morigaki
 */
public class Main {
    private void lutar(Heroi heroi,Monstro monstro){
        int opcao = 0;
        while (opcao != 1 || opcao != 2){
            opcao = InOut.leInt("Local:floresta\n"
                                        + monstro.nome + " lvl" + monstro.level
                                        + " HP: " + monstro.HP
                );
            switch (opcao){
                case 1:
                    while (heroi.HP > 0 && monstro.HP > 0){
                        InOut.leInt("Local:floresta\n"
                                        + monstro.nome + " lvl" + monstro.level
                                        + " HP: " + monstro.HP
                                        + "O que deseja fazer:\n"
                                        + "1: Atacar\n"
                                        + "2: Abrir bolsa\n"
                                        + "3: Desistir\n"
                        );
                    }
                    break;
                case 2:
                    System.exit(0);
                    break;

            }
        }
    }
    
    private Monstro criarMonstro(int level){
        Monstro monstro = null;
        if (level < 3){
            monstro = new Orc();
            monstro.nome="Orc";
        }
        else{
            monstro = new Troll();
            monstro.nome="Troll";
        }
        monstro.HP = 80+(level-1)*10;
        monstro.dano = 20 + (level-1)*5;
        monstro.armadura = 10 + (level-1)*5;
        
        return monstro;
    }
    
    public static void main(String[] args) {
        InOut.MsgDeInformacao("POO'S WAR", "blsblslbslblslsbl. Historia bla");
        String classePersonagem;
        boolean sucesso = false;
        Heroi heroi = null;
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
        
        //heroi.setNome(InOut.leString("Escolha o seu nome:"));
        //InOut.MsgDeInformacao("POO'S WAR", "Nível:" + heroi.getLevel());
        
        
        
        
    }
}
