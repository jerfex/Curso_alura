/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metaprime.com.loja.teste;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import metaprime.com.lojas.Produto;

/**
 *
 * @author metaprime
 */
public class CadastroDeProduto {
    
    public static void main(String[] args) {
        Produto celularProduto = new Produto();
        celularProduto.setNome("Xiaomi Redmi");
        celularProduto.setDescricao("Muito popular no Brasil");
        celularProduto.setPreco(BigDecimal.valueOf(800));
        
        EntityManagerFactory factory  = Persistence.createEntityManagerFactory("ProdPU");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(celularProduto);
        em.getTransaction().commit();
        em.close();
        
        
    }
    
}
