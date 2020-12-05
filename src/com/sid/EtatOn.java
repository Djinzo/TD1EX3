package com.sid;

public class EtatOn extends Etat{


    public EtatOn(Distributeur distributeur){
        super(distributeur);
    }

    @Override
    public void demarrer() {
        System.out.println("Distributeur est deja demarrer");
    }

    @Override
    public void introduirePice(int v) {
        distributeur.setEtat(new EtatDistribution(distributeur));
        distributeur.addToMontant(v);
    }

    @Override
    public void getProduit() {
        System.out.println("Distributeur est On");
    }

    @Override
    public void arreter() {
        distributeur.setEtat(new EtatOff(distributeur));
        System.out.println("Distributeur on Etat Off");
    }
}
