public class App {

        public static void main(String[] args) {
        var kartul = new Toidukomponent(new Toiduaine("kartul", 1.69, 0.2, 16.1), 100.0);
        var hapukoor = new Toidukomponent(new Toiduaine("hapukoor", 2.13, 42.0, 2.2), 30.0);
        var vorst = new Toidukomponent(new Toiduaine("vorst", 10.37, 23.02, 8.26), 50.0);
        
        var rasvaKogusVorst = vorst.arvutaRasvaKogus();
        var rasvaKogusHapukoor = hapukoor.arvutaRasvaKogus();
        var rasvaKogusKartul = kartul.arvutaRasvaKogus();


        var valkudeKogus = vorst.arvutaValkudeKogus();
        var valkudeKogus = hapukoor.arvutaValkudeKogus();
        var valkudeKogus = kartul.arvutaValkudeKogus();


        var süsivesikudeKogus = vorst.arvutaSüsivesikudeKogus();
        var süsivesikudeKogus = vorst.arvutaSüsivesikudeKogus();
        var süsivesikudeKogus = vorst.arvutaSüsivesikudeKogus();
        
        
