public class Livre{
    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible;
    private double penalite = 0;

    public Livre(String titre, String auteur, String isbn){


    this.titre = titre;
    this.auteur = auteur;
    this.isbn = isbn;
    this.disponible = true //par defaut un livre est disponible
    }

    // Getters
    public String getTitre(){
        return titre;
    }

    public String getAuteur(){
        return auteur;
    }

    public String getIsbn(){
        return isbn;
    }

    public boolean isDisponible(){
        return disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible =disponible;
    }

public void emprunter(){
    if(disponible){
        if(penalite >0){
            System.out.println("Vous avez une pénalité de "+ penalite +"F CFA. Vous ne pouvez pas emprunter ce livre.");
            return;
        }
        disponible = false;
        System.out.println("Le livre'"+titre+"'a été emprunté avec succès.");
    }else{
        System.out.println(x:"Le livre n'est pas disponible pour l'emprunt.");
    }
}

public void appliquerPenaliteRetard(int joursRetard){
    double tauxParJour = 500;//Montant de la penalité par jour
    this.penalite += joursRetard * tauxParJour;
}

    //Annotation
    @Override

    public String tostring(){
        return "Livre{"+
                "titre='" + titre +"', auteur='"+ auteur +"', isbn='" isbn +"'}";
    }
}