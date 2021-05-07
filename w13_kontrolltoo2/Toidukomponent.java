public class Toidukomponent {

        Toiduaine toiduaine;
        double kogusGrammides;
        
        public Toidukomponent(Toiduaine toiduaine, double kogusGrammides) {
        this.toiduaine = toiduaine;
        this.kogusGrammides = kogusGrammides;
        }
        
        public double arvutaRasvaKogus() {
        return kogusGrammides * toiduaine.rasvad / 100;
        }
        }

