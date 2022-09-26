import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a year: ");
        int year = scan.nextInt();

            scan.close();

        String result = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? year + " it's a leap year.": 
        year + " it's not a leap year."; // esse método consiste no uso do operador ternário
        
        System.out.println(result);

    /* para um ano ser bissexto ele precisa ser múltiplo de 400 ou múltiplo e 4 mas não múltiplo de 100.
            tendo em vista isso, usamos % (resto) para saber se é múltiplo, exemplo: 400 é múltiplo de 400, 
            o resto (%) da divisão 400 / 400 é = 0, mesma coisa para 800 (múltiplo de 400) 800 % 400 = 0

        também pode ser resolvido da seguinte maneira:
            if (resposta == true) 
                System.out.println(ano +"é um ano bissexto");
        
            if (resposta == false) 
                System.out.println(ano + "não é um ano bissexto"); */
            
    }
}
