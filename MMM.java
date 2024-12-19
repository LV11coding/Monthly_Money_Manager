import java.util.*;

public class Management {
    public static void main(String[] args) {
        String input = "";
        Scanner k = new Scanner(System.in);
        double prihodiobshto = 0, razhodiobshto = 0;
        double[] prihodi = new double[4];
        double[] razhodi = new double[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter income for week " + (i + 1) + ":");
            prihodi[i] = k.nextDouble();
            prihodiobshto += prihodi[i];
            k.nextLine();
            System.out.println("Enter expenses for week " + (i + 1) + " (enter \"STOP\" to stop writing):");
            while (true) {
                System.out.print("Enter an expense: ");
                input = k.nextLine();
                
                if (input.equals("STOP")) {
                    break;
                }
                
                try {
                    double number = Double.parseDouble(input);
                    razhodi[i] += number;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or \"STOP\" to finish.");
                }
            }
            razhodiobshto += razhodi[i];
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Money left from week " + (i + 1) + " = " + (prihodi[i] - razhodi[i]));
        }
        System.out.println("Total income over the month = " + prihodiobshto);
        System.out.println("Total expenses over the month = " + razhodiobshto);
        System.out.println("Total money left = " + (prihodiobshto - razhodiobshto));
        k.close();
    }
}
//made by lachko
