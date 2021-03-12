import java.io.BufferedReader; //loeb teksti sümbolid
import java.io.FileReader; //loeb 

public class ALetters {

    //muutujad
    public static int smallLetters = 0; // a tähed
    public static int bigLetters = 0; // A tähed
    public static String textFile;
    public static String[] words = new String[0];
    public int count1 = 1; //leidmiseks kui palju sõnu sisaldavad üks a täht
    public int count2 = 2; //leidmiseks kui palju sõnu sisaldavad kaks a tähti
    public int count3 = 3; //leidmiseks kui palju sõnu sisaldavad kolm a tähti
    public static int oneLetter_a = 0;  // kui palju sõnu sisaldavad üks a täht
    public static int twoLetters_a = 0; // kui palju sõnu sisaldavad kaks a tähti
    public static int threeLetters_a = 0; // kui palju sõnu sisaldavad kolm a tähti
    public static int oneLetter_A = 0;
    public static int twoLetter_A = 0;
    public static int threeLetter_A = 0;
    public static int howManyLetters = 0;
    public static int howManyLettersA= 0; 
    public int allLetters = 0;
    public int allWords = 0;


    // leiame kui palju kokku väikeseid ja suuri a tähti tektsis
    public void count() throws Exception { //throwing an exception is as simple as using the throw statement. You then specify the exception object you wish to throw
        BufferedReader br = new BufferedReader(new FileReader("text.txt")); // bufferreader simplifies reading text from a character input ehk text.txt
        while ((textFile = br.readLine()) != null) { // tektsi loetakse rida realt
            words = textFile.split(" ");
            for (int i = 0; i <= textFile.length() - 1; i++) {
                if (textFile.charAt(i) == 'a') {
                    smallLetters ++; // kui palju a tähti
                } else if (textFile.charAt(i) == 'A') {
                    bigLetters ++; // kui palju A tähti
                }
            
            }
            
        }
        

        br.close();

        System.out.println("Kokku väikeseid a tähti tekstis on " + smallLetters);
        System.out.println("Kokku suuri A tähti tekstis on " + bigLetters);
    }


    // leiame kui palju igas sõnas suuri ja väikeseid a tähti ning kui palju sõnu sisaldavad üht a tähti, kaks a tähti ja kolm a tähti
    public void howMany() throws Exception { //throws Exception tähendab seda et 
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        while ((textFile = br.readLine()) != null) {
            words = textFile.split(" ");
            for (int i = 0; i <= words.length - 1; i++) { 
                for (int j = 0; j <= words[i].length() - 1; j++) {
                    if (words[i].charAt(j) == 'a') {
                        howManyLetters++;
                    }
                }
                if (howManyLetters == count1) {
                    oneLetter_a++;
                } else if (howManyLetters == count2) {
                    twoLetters_a++;
                } else if (howManyLetters == count3) {
                    threeLetters_a++;
                }
                System.out.println("Sõna '" + words[i] + "' sisaldab väikesi/väikest " + howManyLetters + " 'a' tähti"); // prindib välja kui palju väikeseid a tähti sõnas
                
                howManyLetters = 0; // otsime väikeseid a tähti

                for (int j = 0; j <= words[i].length() - 1; j++) {
                    if (words[i].charAt(j) == 'A') {
                        howManyLettersA++;
                    }
                }
                if (howManyLettersA == count1) {
                    oneLetter_A++;
                } else if (howManyLettersA == count2) {
                    twoLetter_A++;
                } else if (howManyLettersA == count3) {
                    threeLetter_A++;
                }
                System.out.println("Sõna '" + words[i] + "' sisaldab suuri/suurt " + howManyLettersA + " 'A' täht"); //prindib välja kui palju suuri A tähti sõnas
                
                howManyLettersA = 0; // otsime suuri A tähti

            }

            System.out.println("Üht a tähti sisaldab " + oneLetter_a + " sõna");
            System.out.println("Kaht a tähti sisaldavad " + twoLetters_a+ " sõna");
            System.out.println("Kolm a tähti sisaldavad " + threeLetters_a + " sõna");

            System.out.println("Üht A tähti sisaldab " + oneLetter_A + " sõna");
            System.out.println("Kaht A tähti sisaldavad " + twoLetter_A+ " sõna");
            System.out.println("Kolm A tähti sisaldavad " + threeLetter_A + " sõna");

        }
        br.close();
    }
        

    public void getAverage()throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        while ((textFile = br.readLine()) != null) {
            words = textFile.split(" ");
            for (int i = 0; i <= words.length - 1; i++) {
                for (int j = 0; j <= words[i].length() - 1; j++) {
                    if (words[i].toLowerCase().charAt(j) == 'a') {
                        howManyLetters++;
                        howManyLettersA++;
                    }
                allLetters++;
                }
                allWords++;
                
            }
            int average = (howManyLetters + howManyLettersA) / allWords;
            System.out.println("Keskmine: " + average);
            System.out.println("Kokku on " + (allLetters) + " tähti tekstis");
            System.out.println("Koku on " + (allWords) + " sõnu.");
            
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {
        ALetters test = new ALetters();
        test.count();
        test.howMany();
        test.getAverage();

    }
}