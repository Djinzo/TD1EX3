package com.sid;

public class EtatDistribution extends Etat{


    public EtatDistribution(Distributeur distributeur){
        super(distributeur);
    }

    @Override
    public void demarrer() {
        System.out.println("Distributeur en Etat Distribution");
    }

    @Override
    public void introduirePice(int v) {
        distributeur.addToMontant(v);
    }

    @Override
    public void getProduit() {
        if(distributeur.getMontant()>6){
            System.out.println("le montant est "+distributeur.getMontant());
            distributeur.setEtat(new EtatOn(distributeur));
        }

    }

    @Override
    public void arreter() {
        distributeur.setEtat(new EtatOff(distributeur));
        System.out.println("le distributeur est en etat Off\n le montatn :"+distributeur.getMontant());
    }
}
