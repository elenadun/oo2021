import java.util.*; 
  
public class ToDos3 { 
    public static void main(String[] args) 
    { 
  
        // HasMap koostamine 
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
        // key ja value map jaoks
        hash_map.put(12, "kaia poes"); 
        hash_map.put(15, "pesta aknad"); 
        hash_map.put(2, "teha ara kodutoo"); 
        hash_map.put(3, "lugeda raamat"); 
        hash_map.put(30, "pesta porandad"); 
        hash_map.put(28, "vaadata uut sarja");
  
         
        System.out.println("ToDo tegevused: " + hash_map); 
    } 
} 