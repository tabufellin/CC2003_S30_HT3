import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>Main</h1>
 * This is the main class to run the postfix calculator; it displays
 * the result of calculations present in a txt file called "datos.txt".
 * <p>
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-02-19
 **/
public class Main {
    public static void main (String[] args) throws Exception {


        // Initializes the calculator and imports text
        GuatemalanCalculator myCalculator = GuatemalanCalculator.singleCalculator;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el tipo de stack que desea utilizar:");
        System.out.println("'Arraylist' para ArrayList");
        System.out.println("'Vector' para Vector");
        System.out.println("'List' para Lista simplemente enlazada");
        System.out.println("'Listdouble' para Lista doblemente enlazada");
        System.out.println("'Circular' para lista circular");

        String userInput = input.nextLine();
        myCalculator.StackType(userInput);

        ArrayList<String> textoEnListas = new ArrayList<String>();
        textoEnListas = myCalculator.importText();

        for (int i = 0; i < textoEnListas.size(); i++) {

            String aAnalizar = textoEnListas.get(i);    // Gets the required line
            int x = 1;

            // Validates and performs the operation
            if(myCalculator.validateText(aAnalizar)) {
                x = myCalculator.calculate(aAnalizar);  // Line to analyze
                System.out.println("El resultado de la linea " + (i + 1) + " es: " + x);

            } else {
                System.out.println("Se ha encontrado un error alrededor de la linea " + (i + 1) +":");
                System.out.println("Se encontro " + "'"+ aAnalizar + "'");
                System.out.println("Recuerde solamente incluir caracteres soportados y eliminar cualquier espacio" +
                        " adicional. Los espacios para escribir en multiples lineas deben ser sencillos");
                break;  // If there's an error, the program is stopped.
            }
        }
    }
}
