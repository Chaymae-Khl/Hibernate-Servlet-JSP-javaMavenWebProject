/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import javax.persistence.*;

/**
 *
 * @author hp
 */
@Entity
public class Livre {
    @Id
    @GeneratedValue
    @Column(unique=true)
    int num_livre;
    String titre;
    String auteur;
    int n_page;
    float prix;

    public Livre(int num_livre, String titre, String auteur, int n_page, float prix) {
        this.num_livre = num_livre;
        this.titre = titre;
        this.auteur = auteur;
        this.n_page = n_page;
        this.prix = prix;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public Livre(int num_livre, String titre, int n_page, float prix) {
        this.num_livre = num_livre;
        this.titre = titre;
        this.n_page = n_page;
        this.prix = prix;
    }

    public Livre() {
    }

    public Livre(String titre, String auteur, int n_page, float prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.n_page = n_page;
        this.prix = prix;
    }

    public Livre(String titre, int n_page, float prix) {
        this.titre = titre;
        this.n_page = n_page;
        this.prix = prix;
    }

    public int getNum_livre() {
        return num_livre;
    }

    public String getTitre() {
        return titre;
    }

    public int getN_page() {
        return n_page;
    }

    public float getPrix() {
        return prix;
    }

    public void setNum_livre(int num_livre) {
        this.num_livre = num_livre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setN_page(int n_page) {
        this.n_page = n_page;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Livre{" + "num_livre=" + num_livre + ", titre=" + titre + ", auteur=" + auteur + ", n_page=" + n_page + ", prix=" + prix + '}';
    }

    
    
}
