/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeemelyn;

/**
 *
 * Classe com metodos que possibilitará o ADMINISTRADOR fazer o cadastro no seu proprio sistema
 * 
 * @author Emelyn Freire
 * 
 */
public class CadastroAdm {
        
    
    public String nome;

    public int idade;

   
    public String cpf;

    /**
     *
     * @return String - retorna o nome do adm
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome  String - nome indicado pelo próprio adm
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return Int - Retorna a idade do Adm
     */
    public int getIdade() {
        return idade;
    }

    /**
     *
     * @param idade Int - Idade indicada no cadastro do adm
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *
     * @return String - retorna cpf do adm
     */
    public String getCpf() {
        return cpf;
    }

    /**
     *
     * @param cpf String - o cpf do adm
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    

    }
    

