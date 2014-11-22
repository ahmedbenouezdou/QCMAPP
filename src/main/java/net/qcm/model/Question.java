package net.qcm.model;


import java.util.List;

/**
 * Created by benouezdouahmed on 06/09/2014.
 */
public class Question {

    private int id;
    private String titre;
    private List<Reponse> reponses;
    private Boolean multiple;

    public Question() {
    }

    public Question(int id, String titre, List<Reponse> reponses, Boolean multiple){
        this.id=id;
        this.titre=titre;
        this.reponses=reponses;
        this.multiple = multiple;
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

    public List<Reponse> getReponses() {
        return reponses;
    }

    public void setReponses(List<Reponse> reponses) {
        this.reponses = reponses;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public void setMultiple(Boolean typeReponse) {
        this.multiple = typeReponse;
    }
}
