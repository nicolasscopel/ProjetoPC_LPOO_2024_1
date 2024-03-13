/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.modelo.dao;

import br.edu.ifsul.cc.lpoo.pecuaria.modelo.Raca;
import java.sql.Connection;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0019
 */
public class PersistenciaJDBC implements InterfacePersistencia {

    private final String DRIVER = "org.postgresql.Driver";
    private final String USER = "postgres";
    private final String SENHA = "postgres";
    public static final String URL = "jdbc:postgresql://localhost:5432/db_pecuaria_2024_1";
    private Connection con = null;
    
    
    public PersistenciaJDBC() {
    }
    
    
    

    @Override
    public Boolean conexaoAberta() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void fecharConexao() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void persist(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void remover(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Collection<Raca> listRacas() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
}
