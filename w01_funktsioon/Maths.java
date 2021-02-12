public class Maths { // programm räägib minust, arvutab summat ja prindib konsooli
  public int sum(int a, int b) { //konstruktori meetod, mida tehakse, kui moodustatakse uus objekt
    int k = a + b;
    return k;
  }
  
  public static void main(String [] args) { //main meetod, main meetod näitab, mis tegevused hakkab programm tegema
    System.out.println(hello()); //tervituse väljatrükk
    System.out.println(myAge(20)); //vanuse väljatrükk
    System.out.println(mySex('N')); //soo väljatrükk
    System.out.println(myFavouriteNumber(37, 37)); //true või false väljatrükk
    System.out.println("Nuud natukene arvutamist:"); 
    

    Maths m = new Maths(); // uus objekt
    int result = m.sum(10, 20);
    System.out.println("Summa on " + result);
  

    if (result == 30){ //kontrollib, kas tulemus on võrdne if pakutud summaga
      System.out.println("Just, see on 30!"); 
  } else if (result != 30){ 
      System.out.println("Summa ei ole 30");
  } 
    System.out.println("Minu esimene Java kodutoo!");

  }
  public static String hello(){ //funktsioon, mis näitab tervitust
    return "Tere! Tanu Java funktsioonidele siin saab naha natuke informatsiooni minu kohta:";
}
  public static int myAge(int age){ // funktsioon, mis näitab vanust
    return age;
}
  public static char mySex(char sex){ // funktsioon, mis näitab sugu
    return sex;
}
  public static boolean myFavouriteNumber(int number1, int number2){ // funktsioon näitab, kas kaks mu lemmik arvu on võrdsed või mitte
    return number1 != number2;
}

}
