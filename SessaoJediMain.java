/**
 * Classe IniciadoJedi representa as informações de um jedi.
 * @author Alex Bruno Silveira Viana, absv0802@gmail.com&gt;
 * @version 1.0, 2023-04-30;
 */


public class SessaoJediMain {
    public static void main(String[] args){
    	
    	/*
    	 *Na função main é onde iremos passar os parâmetros para todos os nossos objetos, e no final mostrar todas as informções.*/
        IniciadoJedi jedi1 = new IniciadoJedi("Ashla", "Togruta", -23);
        IniciadoJedi jedi2 = new IniciadoJedi("Jempa", "Whiphid", -22);
        IniciadoJedi jedi3 = new IniciadoJedi("Liam", "Human", -21);
        TreinadorJedi treinador = new TreinadorJedi("High Jedi General", "Mace Windu");
        SessaoJedi sessao = new SessaoJedi("Invisibilidade", treinador);
        sessao.addIniciado(jedi1);
        sessao.addIniciado(jedi2);
        sessao.addIniciado(jedi3);
        System.out.println(sessao.getDescricao());
    }
}