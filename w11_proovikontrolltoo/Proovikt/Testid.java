
import org.junit.*;
import jdk.jfr.Timestamp;
import static org.junit.Assert.*;
public class Testid {
    
    
    @Test
    public void nimetus(){
        Jook jook = new Jook("limonaad Limpa", 0.5, 2.2);
        assertEquals("limonaad Limpa", jook.joogiNimetus());
    }

    @Test 
    public void erikaal(){
        Jook jook = new Jook("limonaad Fanta", 0.5, 2.2);
        assertEquals("limonaad Fanta", 0.5, jook.joogiErikaal());
    }

    @Test
    public void mass(){
        Jook jook = new Jook("limonaad Limpa", 0.8, 1.10);
        Joogipudel pudel = new Joogipudel(jook, 0.6, 0, 0.8, 0.1);
        assertEquals(0.725, pudel.joogiMass(), 0.01);
    }
}
