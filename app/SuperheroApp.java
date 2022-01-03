package app;


import java.util.Scanner;
import java.util.Set;

public class SuperheroApp {

    /**
     * @author vemaj
     *
     */

    private static Scanner scanner = new Scanner(System.in);

    /**
     * @param args mainklasse
     */
    public static void main(String[] args) {

        while (true) {
            showStandardMenu();
            int choice = readUserInputStandard();
            handle(choice);
            System.out.println("====================");
        }
    }

    /**
     * 
     * @return
     */
    private static int readUserInputStandard() {
        System.out.print("\nPlease choose a number between 1 and 6:\t");
        int choiceInternal = scanner.nextInt();

        return choiceInternal;
    }



    /**
     * 
     * @param choice
     */
    private static void handle(int choice) {
        switch (choice) {
            case 1:
                createSuperhero();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                showRaidMenu();
                break;
            case 6:
                break;
            default: {
                System.out.println("Ungueltige Eingabe. Bitte ueberpruefen Sie Ihre Eingabe");
                showStandardMenu();
            }
                break;

        }
    }

    /**
     * 
     */
    private static void showStandardMenu() {

        String menuItems[] = { "", "(1)\t Create Superhero", "(2)\t Show Selected Superhero",
                "(3)\t List all Superheroes", "(4)\t Delete Superhero", "(5)\t Start Raid",
                "(6)\t Quit" };

        System.out.println("\nSuperheroes vs. IT-Giant 1.0\n");
        for (int i = 1; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }

    }

    private static void showRaidMenu() {

        String menuItems[] = { "", "(1)\t Explore"};

        System.out.println("\n------ Raid Menu ------\n");
        for (int i = 1; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }

    }

    private static void createSuperhero() {
        System.out.println(
                "\nLeider hat die Methode noch keinen Code. Aber Du kannst hoffentlich nachvollziehen wie der Ablauf ist. Hier sollst Du einen neuen Superhero anlegen.\n");
    }

}
