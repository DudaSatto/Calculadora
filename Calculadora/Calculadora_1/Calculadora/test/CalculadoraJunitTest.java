


import calculadoratest.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class CalculadoraJunitTest {
  
    
    
    @SuppressWarnings("deprecation")
    @Test
    public  class SomarDoisNumerosPositivos{
        public static void main (String[] args){
            Calculadora calc = new Calculadora(); 
             int soma - calc.somar(3, 7);
              assertEquals(12,soma);
        }
      
      
    
    
    }
      @SuppressWarnings("deprecation")
    @Test
    public void CalculadoraSoma(){
      Calculadora calc = new Calculadora();
      int soma - calc.somar(3, 7);
       assertEquals(12,soma);
    
    
    }
    
    public CalculadoraJunitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
       
    }
    
    @AfterEach
    public void tearDown() {
    }

   
}
