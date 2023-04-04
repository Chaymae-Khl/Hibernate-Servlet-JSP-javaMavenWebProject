/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Modele.user;

/**
 *
 * @author hp
 */
public interface serviceUserInter {
    void save(user user);
    user login(String nom, String password);

}
