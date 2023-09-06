
package calculadora;

public class CalculadoraTesteDiv {
       public static void main(String[] args) {
        CalculadoraDiv calc = new CalculadoraDiv();
        int div = calc.div(20,10);
        System.out.println(div);
        
         //cenário de teste 1: Soma de dois números
         div = calc.div(3,7);
        System.out.println(div);
        
        //cenário de teste 2: Soma de dois números um deles 0 
        //div = calc.div(3,0);
        //System.out.println(div);
        
        //cenário de teste 3: Soma de dois números ambos 0
        /* div = calc.div(0,0);
        System.out.println(div);
        Deu erro por ser divisão por 0*/
        
        //cenário de teste 4: Soma de dois números um deles negativos 
         div = calc.div(6,-7);
        System.out.println(div);
        
        //cenário de teste 5: Soma de dois números negativos
         div = calc.div(-20,-40);
        System.out.println(div);
        
        //cenário de teste 6: Soma de dois números com o menor negativo
         div = calc.div(-4,9);
        System.out.println(div);
        
        //cenário de teste 7: Soma de dois números
         div = calc.div(0,-27);
        System.out.println(div);
     }
}
