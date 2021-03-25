import java.util.Scanner;

interface Message { // interface
    
    public void helloUser(); //interface meetod (Viber)
    public void countWords(); // interface static meetod (Text)
}


class Viber implements Message { // esimene klass Viber

    public void helloUser() { //helloUser meetod
        System.out.println("Viber tervitab Teid!");
    }
}



class Text implements Message { // teine klass Text

  public static void main(String[] args) // static meetod
    {
        Viber myViber = new Viber(); // Viber call
        myViber.helloUser();


        Scanner in = new Scanner(System.in); // Text call
        System.out.print("Sisesta uus sõnum: ");
        String str = in.nextLine();
        System.out.print("Kokku sõnu: " + countWords(str) + " sõna/sõnu");
    }

 public static int countWords(String str) { // static meetod countWords

       int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count; 
    }
 }