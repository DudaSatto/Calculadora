
package calculadora;

public class CalculadoraTesteMulti {
   public static void main(String[] args) {
        CalculadoraMulti calc = new CalculadoraMulti();
        // Cenério de teste 1: multiplicação entre dois números 
        int mult = calc.mult(6,9);
        System.out.println(mult);
        
         // Cenério de teste 2: multiplicação entre dois números 
         mult = calc.mult(6,0);
        System.out.println(mult);
        
         // Cenério de teste 3: multiplicação entre dois números 
         mult = calc.mult(0,0);
        System.out.println(mult);
        
         // Cenério de teste 4: multiplicação entre dois números 
         mult = calc.mult(3,-9);
        System.out.println(mult);
        
         // Cenério de teste 5: multiplicação entre dois números 
         mult = calc.mult(-8,-9);
        System.out.println(mult);
       
         // Cenério de teste 6: multiplicação entre dois números 
         mult = calc.mult(-6,5);
        System.out.println(mult);
        
         // Cenério de teste 7: multiplicação entre dois números 
         mult = calc.mult(0,-9);
        System.out.println(mult);
     }
    
}
