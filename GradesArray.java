import java.util.Scanner;

public class GradesArray {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double grades[] = new double[10]; // Aqui o array foi inicializado com 10 itens na lista dentro da variável notas

        for (int i = 0; i < 10; i++) {
            System.out.println("\nInput the student grade: ");
            grades[i] = scan.nextDouble();

            // O loop for rodará enquanto q < 0 e cada repetição do loop será adicionado q++ e o input no notas[q]
            // Exemplo: q=0 -> notas[0] = next input (float), q=1 -> notas[1] = next input, q=2 -> notas[2] = next input
                // assim sucessivamente até completar a lista do array (nesse caso 10)
        }

        double totalGrades = 0;
        
        for (int i = 0; i < grades.length; i++) {
            totalGrades = totalGrades + grades[i];

            // Nesse loop acontecerá a mesma coisa que no loop anterior mas em um caso diferente, notas.length = quantidade de notas no array (nesse caso 10)
            // Então enquanto i < 0 será adicionado i++ e o i corresponderá ao mesmo valor na lista de notas, por exemplo, i = 7 -> notas[7] = 7ª nota no input
            // Na prática: i=0 -> notas[0] + totalNotas (totalNotas = 0 + a primeira nota no input), i=1 -> notas[1] + totalNotas (terá o valor 0+notas[1]), i=2 -> notas[2] + totalNotas
                // Assim sucessivamente até i=notas.lenght (nesse caso 10)
        }

        double averageGrades = totalGrades / grades.length;
        System.out.println("\nThe average student grade is " + averageGrades + "\n");

        scan.close();
        
    }
}
