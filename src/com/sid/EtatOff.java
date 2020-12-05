package com.sid;

public class EtatOff extends Etat {

    public EtatOff(Distributeur distributeur){
        super(distributeur);
    }

    @Override
    public void demarrer() {
        distributeur.setEtat(new EtatOn(distributeur));
        System.out.println("Distributeur et demarrer......");
    }

    @Override
    public void introduirePice(int v) {
        System.out.println("Distributeur en Etat Off...");
    }

    @Override
    public void getProduit() {
        System.out.println("Distributeur en Etat Off...");
    }

    @Override
    public void arreter() {
        System.out.println("Distributeur en Etat Off...");
    }
}
