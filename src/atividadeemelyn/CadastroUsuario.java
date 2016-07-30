/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeemelyn;
/**
 *
 * Classe com metodos que possibilitará o usuário normal fazer o cadastro no sistema
 * 
 * @author Emelyn Freire
 * 
 */

public class CadastroUsuario {

  
    public String nome;
    public int idade;
    private String senha;
    
    /**
     *
     * @return String - retorna o nome do usuário
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome String indicada pelo usuário ao fazer o cadastro
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return Int - retorna a idade do usuário
     */
    public int getIdade() {
        return idade;
    }

    /**
     *
     * @param idade Int que indica a idade informada pelo usuário comum
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *
     * @return String - retorna a senha do usuário
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha String - senha que fará com que o usuário tenha acesso ao sistema
     */
    public void setSenha(String senha) {
        this.senha = senha;
  
    }}
   
