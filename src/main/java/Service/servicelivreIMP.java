/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DAO.livreImp;
import Modele.Livre;
import java.util.List;

/**
 *
 * @author hp
 */
public class servicelivreIMP implements serviceLivreInter{
    livreImp DAO=new livreImp();
    @Override
    public List<Livre> getall() {
     return  DAO.getall();
    
    }

    @Override
    public void save(Livre livre) {
     DAO.save(livre);
    }

    @Override
    public void delete(int id) {
     DAO.delete(id);
    }

    @Override
    public void update(Livre livre) {
     DAO.update(livre);
    }

    @Override
    public Livre get(int id) {
     return DAO.get(id);
    }
    
}
