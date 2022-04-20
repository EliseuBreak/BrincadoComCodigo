
package aula01;

/**
 *
 * @author Eliseu Nsakala
 */
public class Conceitos01 {
    
    public static void main(String[] args) {
        
        int idade = 0; // variavel  primitivo
        Integer idadeObjecto = new Integer(0); //variavel objecto , todos em java começam com Maiuscula
        String nome = "Whitney Houston";
        String nomePai ="John Russel Houston";
        String nomeMae = "Cissy Houston";
        String dataNascimento = "09/09/1963";
        
        System.out.println("Seja Bem Vindo");
        System.out.println("Apresente-se por favor");
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade );
        System.out.println("Filhação\n");
        System.out.println("Pai:" + nomePai);
        System.out.println("Mãe:" + nomeMae);

    }

}
