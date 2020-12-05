package com.sid;

public abstract class Etat {
    protected Distributeur distributeur;

    public Etat(Distributeur d){
        distributeur=d;
    }

    public abstract void demarrer();
    public abstract void introduirePice(int v);
    public abstract void getProduit();
    public abstract void arreter();
}
