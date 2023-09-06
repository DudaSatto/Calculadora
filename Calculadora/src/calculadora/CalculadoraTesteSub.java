
package calculadora;

public class CalculadoraTesteSub {
     public static void main(String[] args) {
        CalculadoraSub calc = new CalculadoraSub();
        int sub = calc.sub(6,9);
        System.out.println(sub);
        
         //cenário de teste 1: Subtração de dois números
        int soma = calc.sub(3,7);
        System.out.println(soma);
        
        //cenário de teste 2: Subtração de dois números um deles 0 
        soma = calc.sub(3,0);
        System.out.println(soma);
        
        //cenário de teste 3: Subtração de dois números ambos 0
         sub = calc.sub(0,0);
        System.out.println(sub);
        
        //cenário de teste 4: Subtração de dois números um deles negativos 
         sub = calc.sub(6,-7);
        System.out.println(sub);
        
        //cenário de teste 5: Subtração de dois números negativos
         sub = calc.sub(-20,-40);
        System.out.println(sub);
        
        //cenário de teste 6: Subtração de dois números com o menor negativo
         sub = calc.sub(-4,9);
        System.out.println(sub);
        
        //cenário de teste 7: Subtração de dois números
         sub = calc.sub(0,-27);
        System.out.println(sub);
     }
}
