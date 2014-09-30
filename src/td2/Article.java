/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2;

/**
 *
 * @author Poste8
 */
public class Article {
    private int reference;
    private String designation;
    private double prix;
        public Article(){
            super();
        }
        public Article(int reference){
            this();
            setReference(reference);
        }
        public Article(int reference,String designation){
            this.reference = reference;
            this.designation = designation;
        }
        public Article(int reference,String designation,double prix){
            this.reference = reference;
            this.designation = designation;
            this.prix = prix;
        }
        public int getReference(){
            return this.reference;
        }
        public void setReference(int reference){
            this.reference = reference;
        }
        public String toString(){
            return getReference()+""+getDesignation()+""+getPrix();
        }

        public String getDesignation() {
            return designation;
        }

         public double getPrix() {
            return prix;
        }
}

  
