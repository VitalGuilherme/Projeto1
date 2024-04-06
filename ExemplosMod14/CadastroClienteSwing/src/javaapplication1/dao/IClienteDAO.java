/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication1.dao;

import javaapplication1.domain.Cliente;
import java.util.Collection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VitalGuilherme
 */
public interface IClienteDAO {
    
    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();

}
