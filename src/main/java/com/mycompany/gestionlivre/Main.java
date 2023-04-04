/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionlivre;

import helpclass.NewHibernateUtil;
import Modele.Livre;
import Modele.user;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//       
//        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
//        Transaction tx=session.beginTransaction(); 
//        Livre l=new Livre(1,"tggtgtg","hiuhi",3,6);
//        session.save(l);
//        tx.commit();
//        System.out.println("ok");

       
//        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
//        Transaction tx=session.beginTransaction(); 
//        user l=new user("tggtgtg","hiuhi@gmail.com","joidjeoid");
//        session.save(l);
//        tx.commit();
//        System.out.println("ok");

//        Session session=NewHibernateUtil.getSessionFactory().getCurrentSession();
//        Transaction tx=session.beginTransaction(); 
//        user l=new user("tggtgtg","hiuhi@gmail.com","joidjeoid");
//        session.save(l);
//        tx.commit();
//        System.out.println("ok");

Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Criteria cr = session.createCriteria(user.class);
        cr.add(Restrictions.like("nom", "ttrrr"));
        cr.add(Restrictions.like("password","ewww"));
        tx.commit();
          System.out.println("ok");
        
    }
    
}
