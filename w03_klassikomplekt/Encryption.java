public class Encryption {

    public static void main(String[] args) {

        String text = "Kuidas sul laheb?"; //peame teisendama stringi tähemassiiviks

        char[] chars = text.toCharArray(); // Java string toCharArray () teisendab selle stringi tähemassiks. 
        //See tagastab äsja loodud tähemassiivi, selle pikkus on selle stringiga sarnane ja sisu initsialiseeritakse selle stringi märkidega.

        for(char c : chars) { // iga c chars sees
            c += 1; //tähemuutuja + integer
            System.out.print(c); // print, mitte println et oleks paremini tulemust näha
        }

        System.out.println(text);
    }
    
}

//võetud internetist https://www.youtube.com/watch?v=8wlE6DgOWBs&t=301s Alex Lee
