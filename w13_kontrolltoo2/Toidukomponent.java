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
        
        public double arvutaValkudeKogus() {
        return kogusGrammides * toiduaine.valgud /100; 
        }

        public double arvutaSüsivesikuteKogus() {
        return kogusGrammides * toiduaine.susivesikud/ 100;
        }

        public double naitaKogusGrammides() {
        return kogusGrammides;
        }

        }

