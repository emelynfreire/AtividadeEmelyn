/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeemelyn;

/**
 *
 * Classe com metodos que possibilitará o usuario do sistema, fazer o login
 * em que poderá ser usuario normal ou administrador
 * 
 * @author Emelyn Freire
 * 
 */
public class Login {
    
    
    public String usuario;

   
    public int tipo;

   
    public String senha;

    /**
     *
     * @return String - retorna o nome do usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @param usuario String - Nome do usuario, responsavel pela identificação
     * de modo que serve como seu endereço
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     *
     * @return Int - tipó do usuario
     */
    public int getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo Int - tipo de usuario que poderá ser adm ou normal
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return String - senha do usuario
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha String - a senha posibilitará o usuario ter acesso ao sistema
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
