public class App {

        public static void main(String[] args) {
        var kartul = new Toidukomponent(new Toiduaine("kartul", 1.69, 0.2, 16.1), 100.0);
        var hapukoor = new Toidukomponent(new Toiduaine("hapukoor", 2.13, 42.0, 2.2), 30.0);
        var vorst = new Toidukomponent(new Toiduaine("vorst", 10.37, 23.02, 8.26), 50.0);
        
        var rasvaKogusVorst = vorst.arvutaRasvaKogus();
        var rasvaKogusHapukoor = hapukoor.arvutaRasvaKogus();
        var rasvaKogusKartul = kartul.arvutaRasvaKogus();


        var valkudeKogusVorst = vorst.arvutaValkudeKogus();
        var valkudeKogusHapukoor = hapukoor.arvutaValkudeKogus();
        var valkudeKogusKartul = kartul.arvutaValkudeKogus();


        var süsivesikuteKogusVorst = vorst.arvutaSüsivesikudeKogus();
        var süsivesikuteKogusHapukoor = vorst.arvutaSüsivesikudeKogus();
        var süsivesikuteKogusKartul = vorst.arvutaSüsivesikudeKogus();
                
        System.out.println("vorstis on " + rasvaKogusVorst + "g rasva"); //leiame rasva
        System.out.println("hapukooris on " + rasvaKogusHapukoor + "g rasva");
        System.out.println("kartulis on " + rasvaKogusKartul + "g rasva");


        System.out.println("vorstis on " + valkudeKogusVorst + "g valke"); //leiame valgud
        System.out.println("hapukooris on " + valkudeKogusHapukoor + "g valke");
        System.out.println("kartulis on " + valkudeKogusKartul + "g valke");


        System.out.println("vorstis on " + süsivesikuteKogusVorst + "g süsivesikuid"); //leiame süsivesikud
        System.out.println("hapukooris on " + süsivesikuteKogusHapukoor + "g süsivesikuid");
        System.out.println("kartulis on " + süsivesikuteKogusKartul + "g süsivesikuid");
        }
        }
        
