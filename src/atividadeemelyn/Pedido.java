/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeemelyn;

/**
 *
 * Classe com metodos que possibilitará o usuario fazer mudanças em seu pacote 
 * de pedidos 
 * 
 * @author Emelyn Freire
 * 
 */
public class Pedido {
    
    
    public boolean Cancelar;

    
    public boolean Excluir;

  
    public boolean editar;

    /**
     *
     * @return Boolean - retorna o cancelamento do pedido
     */
    public boolean isCancelar() {
        return Cancelar;
    }

    /**
     *
     * @param Cancelar Boolean - Se será possivel o cliente cancelar seu pedido
     */
    public void setCancelar(boolean Cancelar) {
        this.Cancelar = Cancelar;
    }

    /**
     *
     * @return Boolean - Excluir algum dado
     */
    public boolean isExcluir() {
        return Excluir;
    }

    /**
     *
     * @param Excluir Boolean - possibilita que o usuario poderá excluir algum 
     * dado do pacote antes de concluir seu pedido
     */
    public void setExcluir(boolean Excluir) {
        this.Excluir = Excluir;
    }

    /**
     *
     * @return Booleam - Editar dados do pedido
     */
    public boolean isEditar() {
        return editar;
    }

    /**
     *
     * @param editar Boolean - possibilitará que o usuário edite alguns dados
     * antes de finalizar seu pedido
     */
    public void setEditar(boolean editar) {
        this.editar = editar;
    }
    
}
