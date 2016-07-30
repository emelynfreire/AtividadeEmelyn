/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeemelyn;

/**
 *
 * Classe com metodos que possibilitará o ADMINISTRADOR fazer a manipulação das informações
 * e dados no sistema
 * 
 * @author Emelyn Freire
 * 
 */
public class Adm {

    
    public boolean excluirContaUsuarios;

    
    public boolean verDadosUsuario;

    
    public boolean editarDadosFilmes;

    /**
     *
     * 
     * @return Boolean - se foi exluido a conda do usuario
     */
    public boolean isExcluirContaUsuarios() {
        return excluirContaUsuarios;
    }

    /**
     *
     * @param excluirContaUsuarios boolean que informa se é true ou false para 
     * a exclusão da Conta do usuario
     */
    public void setExcluirContaUsuarios(boolean excluirContaUsuarios) {
        this.excluirContaUsuarios = excluirContaUsuarios;
    }

    /**
     *
     * @return Boolean - retorna se será possivel ver os dados do usuario
     */
    public boolean isVerDadosUsuario() {
        return verDadosUsuario;
    }

    /**
     *
     * @param verDadosUsuario boolean que imforma se será possivel ver os dados do usuario
     */
    public void setVerDadosUsuario(boolean verDadosUsuario) {
        this.verDadosUsuario = verDadosUsuario;
    }

    /**
     *
     * @return Boolean - se será possivel editar os dados do filme
     */
    public boolean isEditarDadosFilmes() {
        return editarDadosFilmes;
    }

    /**
     *
     * @param editarDadosFilmes Boolean - imforma se será possivel editar os dados do filme
     */
    public void setEditarDadosFilmes(boolean editarDadosFilmes) {
        this.editarDadosFilmes = editarDadosFilmes;
    }
    
}
