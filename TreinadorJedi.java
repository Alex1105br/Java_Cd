/**
 * Classe IniciadoJedi representa as informações de um jedi.
 * @author Alex Bruno Silveira Viana, absv0802@gmail.com&gt;
 * @version 1.0, 2023-04-30;
 */

public class TreinadorJedi {
	/*
	 *Titulação de um treinador jedi. 
	 *Nome de um treinador jedi.
	*/
    String titulacao;
    String nome;
    
    
    /*
     *Construtor da classe. 
    */
    public TreinadorJedi(){
        this.titulacao = titulacao;
        this.nome = nome;
    }
    
    /*
     *Construtor da classe.
     *@param titulação de um treinador jedi.
     *@param Nome de um treinador jedi.
    */
    
    
    public TreinadorJedi(String titulacao, String nome){
        this.titulacao = titulacao;
        this.nome = nome;
    }
    
    
    /**
     * Este método juntará todas as informações de um treinador jedi.
     * @return a descrição completa de um treinador jedi.
     */
    public String getDescricao(){
        String r = String.format("%s %s", titulacao, nome); 
        return r;
    }
}