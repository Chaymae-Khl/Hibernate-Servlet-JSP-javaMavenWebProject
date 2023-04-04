/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Modele.user;
import helpclass.NewHibernateUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hp
 */
public class loginIMP implements loginInter {

    @Override
    public void save(user user) {
         Transaction transaction = null;
    try {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
    } catch (HibernateException e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
    }

    @Override
    public user login(String nom, String password) {
         Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    Transaction tx = session.beginTransaction();
    Criteria cr = session.createCriteria(user.class);

    cr.add(Restrictions.like("nom", nom));
    cr.add(Restrictions.like("password",password));
    user u = (user) cr.uniqueResult();
    tx.commit(); // commit the transaction
    if (u == null) {
        throw new RuntimeException("Invalid username or password"); // handle the case where the user isn't found
    }
    return u;
}}

    

   
   
    
    


    

