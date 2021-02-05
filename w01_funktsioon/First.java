public class First {
    public static void main(String[] args){
        System.out.println(args.length);
        int[] numberArray = new int[5];
        int numberArray2[] = new int[5];

        String[] stringArray = new String[5];
        String[] greetingsArray = new String[]{"Hello", "world"};

        String name = "Raimo";
        int year = 2021;

        //need on primitiivtüübid
        int myInt = Integer.MAX_VALUE;
        long myLong = Long.MAX_VALUE;
        byte bait = Byte.MAX_VALUE; // -128 to 127 (selles vahemikus) näiteks MIN.VALUE
        short myShort = Short.MAX_VALUE;
        double doubleNumber = 3.4;
        float floatNumber = 3.4f; // panna f lõppu
        boolean flag = true; //false
        char character = 'F';

        // for tsükkel
        for(int i = 0; i < greetingArray.length; i++){ // for (int i = 0; 9 < args-length; i++){
            System.out.println(greetingsArray[i]); //args
        } 

        // foreach tsükkel
        for (String text : greetingsArray){ //args
            System.out.println(text);
        }
        
        //while tsükkel
        int length = greetingsArray.length; //args.length
        while (length > 0){
            length--;
            System.out.println("Inside while");
        }

        if (year == 2021){
            System.out.println(year + " is equal to 2021");
        } else if (year > 2021){
            System.out.println(year + " is larger than 2021");
        } else {
            System.out.println(year + " is not equal to 2021");
        }

        System.out.println("Hello world");
        System.out.println("Test one");
        System.out.println("Test two");

        String hello = "Hello world!";
    }
}
// klassi nimi peab algama suure tähega nagu First ja olla ingliskeelne sõna

//javac First.java
//java First
//java First 1 2 3 4 5 6