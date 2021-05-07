public class Toiduaine {
    String nimetus;
    double valgud;
    double rasvad;
    double susivesikud;
    
    public Toiduaine(String nimetus, double valgud, double rasvad, double susivesikud) {
    if (valgud + rasvad + susivesikud > 100.0) {
    throw new IllegalArgumentException("Toiduaine koostisainete protsent kokku ületab 100%");
    }
    
    this.nimetus = nimetus;
    this.valgud = valgud;
    this.rasvad = rasvad;
    this.susivesikud = susivesikud;
    }
    }


 
