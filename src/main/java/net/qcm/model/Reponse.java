package net.qcm.model;

/**
 * Created by benouezdouahmed on 06/09/2014.
 */
public class Reponse {

    private int id;
    private String titre;
    private Boolean bonneReponse;

    public Reponse() {
    }

    public Reponse(int id, String titre, Boolean bonneReponse){
        this.id=id;
        this.titre=titre;
        this.bonneReponse=bonneReponse;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Boolean getBonneReponse() {
        return bonneReponse;
    }

    public void setBonneReponse(Boolean bonneReponse) {
        this.bonneReponse = bonneReponse;
    }
}
