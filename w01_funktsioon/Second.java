public class Second {
    public static void main(String[] args) {
        System.out.println(myName());
        System.out.println(add(5, 10));
        System.out.println(fullname("Elena", "Dunajeva"));
        System.out.println(checkEqual(5, 5));
        System.out.println(notEqual(4, 4));

        myMath();
    } 

    public static String myName(){ // see on funktsioon
        return "Elena";
    }

    public static int add(int number1, int number2){
        return number1 + number2;
    }

    public static String fullname(String firstName, String lastName){
        return firstName + " " + lastName + " !";
    }

    public static boolean checkEqual(int number1, int number2){
        return number1 == number2;
    }

    public static boolean notEqual(int number1, int number2){
        return number1 != number2;
    }

    public static void myMath(){
        System.out.println(Math.pow(5, 2));

    } // teeme matemaatilist funktsiooni

    int number = (int) Math.pow(3, 2);{
        System.out.println(number);

        System.out.println(Math.sqrt(9));
    }

    public static void myLogical(){
        System.out.println(5 < 10 && 5 > 4);
    }

    public static void areStringsEqual(){
        String name1 = "Elena";
        String name2 = "Elena";

        System.out.println(name1 == name2);

        String newName1 = new String("Elena"); // uus objekt
        String newName2 = new String("Elena"); // uus objekt

        System.out.println(newName1 == newName2);
        System.out.println(newName1.equals(newName2));
    }
}

// function add(number1, number2)

