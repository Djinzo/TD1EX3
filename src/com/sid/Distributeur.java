package com.sid;

public class Distributeur {
    private Etat etat;
    private int montant;

    public Distributeur(){
        etat=new EtatOff(this);
        montant=0;
    }

    public void demarrer() {
        etat.demarrer();
    }


    public void introduirePice(int v) {
        etat.introduirePice(v);
    }


    public void getProduit() {
        etat.getProduit();
    }


    public void arreter() {
        etat.arreter();
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
    public void addToMontant(int v){
        this.montant+=v;
    }
    public int getMontant(){
        return this.montant;
    }
}
