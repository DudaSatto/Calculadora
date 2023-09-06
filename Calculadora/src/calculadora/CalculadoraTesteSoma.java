
package calculadora;

public class CalculadoraTesteSoma {
     public static void main(String[] args) {
        CalculadoraSoma calc = new CalculadoraSoma();
        //cenário de teste 1: Soma de dois números
        int soma = calc.somar(3,7);
        System.out.println(soma);
        
        //cenário de teste 2: Soma de dois números um deles 0 
        soma = calc.somar(3,0);
        System.out.println(soma);
        
        //cenário de teste 3: Soma de dois números ambos 0
         soma = calc.somar(0,0);
        System.out.println(soma);
        
        //cenário de teste 4: Soma de dois números um deles negativos 
         soma = calc.somar(6,-7);
        System.out.println(soma);
        
        //cenário de teste 5: Soma de dois números negativos
         soma = calc.somar(-20,-40);
        System.out.println(soma);
        
        //cenário de teste 6: Soma de dois números com o menor negativo
         soma = calc.somar(-4,9);
        System.out.println(soma);
        
        //cenário de teste 7: Soma de dois números
         soma = calc.somar(0,-27);
        System.out.println(soma);
     }
}
