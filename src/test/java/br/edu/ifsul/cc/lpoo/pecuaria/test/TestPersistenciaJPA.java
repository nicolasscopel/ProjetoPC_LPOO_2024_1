package br.edu.ifsul.cc.lpoo.pecuaria.test;

import br.edu.ifsul.cc.lpoo.pecuaria.modelo.Raca;
import br.edu.ifsul.cc.lpoo.pecuaria.modelo.dao.PersistenciaJPA;
import org.junit.Test;

/**
 *
 * @author 20222PF.CC0019
 */
public class TestPersistenciaJPA {

    //@Test
    public void testConexaoJPA() {
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        if (jpa.conexaoAberta()) {
            System.out.println("conectou no BD via jpa ...");
            jpa.fecharConexao();
        } else {
            System.out.println("nao conectou no BD ...");

        }
    }

    //criar um novo teste para gerar um registro de Raca.
    //@Test
    public void testInsertRacaJPA() throws Exception {
        PersistenciaJPA jpa = new PersistenciaJPA();

        if (jpa.conexaoAberta()) {

            Raca r = new Raca();
            r.setNome("Teste de Raca");

            jpa.persist(r);
            System.out.println("Raca id : " + r.getId());

            jpa.fecharConexao();
        } else {
            System.out.println("testInsertRacaJPA: Nao concentou no BD");

        }

    }

    //criar um novo teste para alterar um registro de Raca.
    //@Test
    public void testAlterarRacaJPA() throws Exception {
        
        PersistenciaJPA jpa = new PersistenciaJPA();
        
        if(jpa.conexaoAberta()){
            
            Raca r = (Raca) jpa.find(Raca.class, Integer.valueOf(2));
            
            if(r != null){
                
                r.setNome("Teste de alteração de nome NOVAMNETE");
            
                jpa.persist(r); // ALTERA O NOME
                
            System.out.println("Raca de id " + r.getId() + " alterado");
            
            }else{
                System.out.println("Não encontrou registro de id = 2");
               
            }
 
           
        jpa.fecharConexao();  
        }else{
            System.out.println("testAlteraRacaJPA : Não conectou no BD");
        }

    }
    
    //criar um novo teste para remover um registro de Raca.
    //@Test
    public void testRemoverRacaJPA() throws Exception {
        
        PersistenciaJPA jpa = new PersistenciaJPA();
        
        if(jpa.conexaoAberta()){
            
            Raca r = (Raca) jpa.find(Raca.class, Integer.valueOf(2));
            
            if(r != null){
                
                System.out.println("Raca de id " + r.getId() + " removido.");
                jpa.remover(r);
                
            }
            

          jpa.fecharConexao();   
        }else{
            System.out.println("testRemoverRacaJPA : Não conectou no BD");
        }

    }

}


