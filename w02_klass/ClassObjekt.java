class ClassObjekt
{
  public static void main(String[] args)
  {
    int result;
    
    //Objekt kalkulaator
    Calculator c = new Calculator();
   
    result = c.Add(50,100);
    
    // Objekt PrintSumma
    PrintSum p = new PrintSum();
    
    p.print(result);
  }
}
 
//Klass kalkulaator
class Calculator
{
  public int Add(int num1, int num2)
  {
    System.out.println("Summa:");
    return num1 + num2;
  }
}
 
//Klass PrintSumma
class PrintSum
{
  public void print(int value)
  {
    System.out.println(value);
  }

}
