/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modele.user;


/**
 *
 * @author hp
 */
public interface loginInter {
     void save(user user);
     user login(String nom, String password);
}
