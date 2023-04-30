/**
 * Classe IniciadoJedi representa as informações de um jedi.
 * @author Alex Bruno Silveira Viana, absv0802@gmail.com&gt;
 * @version 1.0, 2023-04-30;
 */

import java.util.ArrayList;

public class SessaoJedi{
	
	/**Nome de um jedi.
     * Objeto do tipo TreinadorJedi.
     * Uma lista contendo referências à objetos do tipo IniciadoJedi.
     */
    String nome;
    TreinadorJedi treinador;
    ArrayList<IniciadoJedi>iniciados = new ArrayList <IniciadoJedi>();


    /**
     * Construtor da classe.
     * @param nome.
     * @param objeto do tipo TreinadorJedi.
     */
    public SessaoJedi(String nome, TreinadorJedi treinador){
        this.nome = nome;
        this.treinador = treinador;
    }
    
    /*
     * Adiciona um objeto do tipo IniciadoJedi em uma lista.
     * @param Objeto do tipo IniciadoJedi.*/
    public void addIniciado(IniciadoJedi iniciado){
        if(!iniciados.contains(iniciado)){//Verifica se o objeto está na lista, se não estiver ele adiciona o objeto.
            iniciados.add(iniciado);
        }
    }

    /*
     * Busca um objeto do tipo IniciadoJedi, sendo a chave de busca o atributo nome.
     * @param Nome.
     * @return Retorna nulo se o nome não for encontrado.*/
    public IniciadoJedi getIniciado(String nome){
        for(IniciadoJedi iniciado:iniciados){
            if(iniciado.nome.equals(nome)){
                return iniciado;
            }
        }
        return null;
    }
    
    /*
     *Este método calcula a média dos anos de nascimento de um iniciado jedi.
     *@return Retorna a média*/
    public double getMediaAnoNascimento(){
        double m = 0.0, ac = 0.0;

        for(IniciadoJedi iniciado:iniciados){
            ac += iniciado.anoNascimento;
            m++;
        }
        return ac/m;
    }

    
    /**
     * Este método juntará as informações de um treinador jedi e as informações de um jedi, e tendo a possibilidade de adicionar mais objetos do tipo IniciadoJedi.
     * @return Retorna a todas as descrições.
     */
    public String getDescricao(){
        StringBuilder descricao = new StringBuilder();
        descricao.append(String.format("--> SESSÃO %s (Treinador: %s)\n", nome, treinador.getDescricao()));
        int seq=1;
        for(IniciadoJedi iniciado:iniciados){
            descricao.append(String.format("- Iniciado %d: %s\n", seq++, iniciado.getDescricao()));
        }
        return descricao.toString();
    }
}