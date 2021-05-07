public class Toiduaine {

    String nimetus;
    double valgud;
    double rasvad; 
    double susivesikud; 

    public Toiduaine(String toiduNimetus, double toiduValgud, double toiduRasvad, double toiduSusivesikud){

        this.nimetus = toiduNimetus; 
        this.valgud = toiduValgud; 
        this.rasvad = toiduRasvad; 
        this.susivesikud = toiduSusivesikud;

        double protsentKokku = valgud + rasvad + susivesikud;

        if(protsentKokku >= 100){
            System.out.println("Protsent kokku ei saa ületada 100");
        }
    }

 
