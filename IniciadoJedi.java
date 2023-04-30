
/**
 * Classe IniciadoJedi representa as informações de um jedi.
 * @author Alex Bruno Silveira Viana, absv0802@gmail.com&gt;
 * @version 1.0, 2023-04-29;
 */
public class IniciadoJedi{

	
	
    /**Nome de um jedi.
     * Espécie de um jedi.
     * Ano de nascimento de um jedi.
     */
    String nome;
    String especie;
    int anoNascimento;

    /**
     *Construtor da classe
    */
    public IniciadoJedi(){
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }
    
    /**
     * Construtor da classe.
     * @param nome de um jedi.
     * @param especie de um jedi.
     * @param ano de nascimento de um jedi.
     */
    public IniciadoJedi(String nome, String especie, int anoNascimento){
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }

    /**
     * Este método juntará todas as informações de um jedi.
     * @return a descrição completa de um jedi.
     */
    public String getDescricao(){
        String nascimento = getAnoNascimento();
        String r = String.format("%s (especie=%s, nascimento=%s)", nome, especie, nascimento);
        return r;
    }
    /**
     *@return o ano de nascimento de um jedi.
     */
    public String getAnoNascimento(){
        String r = " ";
        if(anoNascimento>=0){
            r = String.format("%d DBY", anoNascimento);
            return r;
        }
        if(anoNascimento<0){
            int n = anoNascimento * -1;
            //anoNascimento = anoNascimento * -1;
            r = String.format("%d ABY", n);
            return r;
        }
        return r;
    }


}