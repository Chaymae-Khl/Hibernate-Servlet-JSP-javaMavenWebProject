/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modele.Livre;
import java.util.List;

/**
 *
 * @author hp
 */
public interface  serviceLivreInter {
    List<Livre> getall();
    void save(Livre livre);
    void delete(int id);
    void update(Livre livre);
    Livre get(int id);
}
