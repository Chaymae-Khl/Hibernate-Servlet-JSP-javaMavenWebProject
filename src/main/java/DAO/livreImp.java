/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modele.Livre;
import helpclass.NewHibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hp
 */
public class livreImp implements livreDaoInter {

    @Override
    public List<Livre> getall() {
  Session session = NewHibernateUtil.getSessionFactory().openSession();
    List<Livre> list = null;
    try {
        list = session.createQuery("from Livre").list();
    } catch (HibernateException e) {
        e.printStackTrace();
    } finally {
        session.close();
    }
    return list;
    
    }
 
    @Override
    public void save(Livre livre) {
     Transaction transaction = null;
    try {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(livre);
        transaction.commit();
    } catch (HibernateException e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
    }

    @Override
    public void delete(int id) {
    Transaction transaction = null;
    try {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Livre livre = (Livre) session.get(Livre.class, id);
        if (livre != null) {
            session.delete(livre);
            transaction.commit();
        }
    } catch (HibernateException e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }

    }

    @Override
    public void update(Livre livre) {
      Session session = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx = null;
    try {
        tx = session.beginTransaction();
        session.update(livre);
        tx.commit();
    } catch (HibernateException e) {
        if (tx != null) {
            tx.rollback();
        }
        e.printStackTrace();
    } finally {
        session.close();
    }
    }

    @Override
    public Livre get(int id) {
    Session session = NewHibernateUtil.getSessionFactory().openSession();
    Livre livre = null;
    try {
        livre = (Livre) session.get(Livre.class, id);
    } catch (HibernateException e) {
        e.printStackTrace();
    } finally {
        session.close();
    }
    return livre;
    
}}
