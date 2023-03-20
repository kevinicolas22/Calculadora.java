import java.util.Scanner;

class Calc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String simbol = scanner.nextLine(); 
            
        if (simbol.equals ("+")){
        float numero1 = scanner.nextFloat();
        float numero2 = scanner.nextFloat();
        System.out.print("RESULTADO: " + (numero1 + numero2));
        }
        
        else if(simbol.equals ("-")){
        float numero1 = scanner.nextFloat();
        float numero2 = scanner.nextFloat();
        System.out.print("RESULTADO: " + (numero1 - numero2));
        }
        
        else if(simbol.equals ("*")){
        float numero1 = scanner.nextFloat();
        float numero2 = scanner.nextFloat();
        System.out.print("RESULTADO: " + (numero1 * numero2));
        }
        
        else if(simbol.equals ("/")){
        float numero1 = scanner.nextFloat();
        float numero2 = scanner.nextFloat();
        if (numero2 == 0){
        System.out.print("ERRO");   
        }
        else{
        System.out.print("RESULTADO: " + (numero1 / numero2));
        }
        }
        else{
        System.out.print("ENTRADA INVALIDA");   
       }          
    }
}