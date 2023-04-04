/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.loginIMP;
import Modele.user;

/**
 *
 * @author hp
 */
public class serviceUserIMP implements  serviceUserInter {
   loginIMP DAO=new loginIMP();
    @Override
    public void save(user user) {
       DAO.save(user);
    }

    @Override
    public user login(String nom, String password) {
    return DAO.login(nom,password);
   
    }
    
}
