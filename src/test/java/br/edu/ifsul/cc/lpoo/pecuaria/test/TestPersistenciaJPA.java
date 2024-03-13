package br.edu.ifsul.cc.lpoo.pecuaria.test;

import br.edu.ifsul.cc.lpoo.pecuaria.modelo.Raca;
import br.edu.ifsul.cc.lpoo.pecuaria.modelo.dao.PersistenciaJPA;
import java.util.List;
import net.bytebuddy.matcher.ElementMatchers;
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
            r.setNome("Raca aula dia 13");

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

        if (jpa.conexaoAberta()) {

            Raca r = (Raca) jpa.find(Raca.class, Integer.valueOf(2));

            if (r != null) {

                r.setNome("Teste de alteração de nome NOVAMNETE");

                jpa.persist(r); // ALTERA O NOME

                System.out.println("Raca de id " + r.getId() + " alterado");

            } else {
                System.out.println("Não encontrou registro de id = 2");

            }

            jpa.fecharConexao();
        } else {
            System.out.println("testAlteraRacaJPA : Não conectou no BD");
        }

    }

    //criar um novo teste para remover um registro de Raca.
    //@Test
    public void testRemoverRacaJPA() throws Exception {

        PersistenciaJPA jpa = new PersistenciaJPA();

        if (jpa.conexaoAberta()) {

            Raca r = (Raca) jpa.find(Raca.class, Integer.valueOf(2));

            if (r != null) {

                System.out.println("Raca de id " + r.getId() + " removido.");
                jpa.remover(r);

            }

            jpa.fecharConexao();
        } else {
            System.out.println("testRemoverRacaJPA : Não conectou no BD");
        }

    }

    // Criar um novo teste para 
    // 1 - Litar todas as Racas
    // 2 - Caso exista, imprimir, alterar e remover.
    // 3 - Caso  lista vazia, Criar dois registros. 
    //@Test
    public void testListaRacas() throws Exception {

        PersistenciaJPA jpa = new PersistenciaJPA();

        if (jpa.conexaoAberta()) {

            List<Raca> lista = (List<Raca>) jpa.listRacas();

            if (lista.isEmpty()) {

                Raca r = new Raca();
                r.setNome("Teste de setar 1");

                jpa.persist(r);
                System.out.println("Raca id : " + r.getId() + ", "+ r.getNome() + " adicionada");

                r = new Raca();
                r.setNome("Teste de setar 2");

                jpa.persist(r);
                System.out.println("Raca id : " + r.getId() + ", "+ r.getNome() + " adicionada");

            } else {

                
                System.out.println("Teste de Lista. Tamanho da lista = " + lista.size());
                //IMPRIME A LISTA ALTERA E APAGA
                for (Raca r : lista) {
                    
                    //MOSTRA ANTES ALTERAR
                    System.out.println("Raca incontrada id: " + r.getId() + " - " + r.getNome());
     
                   //SETA NOME ALTERADO
                    r.setNome("Nome da Raca alterado");
                    jpa.persist(r); // ALTERA O NOME
                    
                    System.out.println("Raca alterada: " + r.getNome());
                    
                    //REMOVE RACA
                    jpa.remover(r);
                    System.out.println("Raca removida id: " + r.getId());
                    System.out.println("");
                    
                    
                }
                
          }

            jpa.fecharConexao();
        } else {

            System.out.println("testListaRacasJPA : Não conectou no BD");
        }
    }

}
