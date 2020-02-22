import java.util.Scanner;

public class Server {
    private CoffeeMachine machine;
    private Scanner scanner;


    Server(){
        machine = new CoffeeMachine();
        scanner = new Scanner(System.in);
    }

    public void start(){
        System.out.println("You can pick one of these available coffees: ");
        System.out.println("Latte, Americano, Cappuccino, Espresso, Flat White");
        String chosenCoffee = scanner.next();
        int[] chosenCoffeeIngredients = order(chosenCoffee.toUpperCase());
        System.out.println("Making coffee ....");
        System.out.println("Here is your " + chosenCoffee);
        System.out.println("It has " +
                chosenCoffeeIngredients[0] + "% milk, " +
                chosenCoffeeIngredients[1] + "% espresso, " +
                chosenCoffeeIngredients[2] + "% water and " +
                chosenCoffeeIngredients[3] + "% milk foam");
        System.out.println("Have a nice day! ");
    }

    private int[] order(String Coffee){
        switch (Coffee){
            case "LATTE":
                return machine.getLATTE();
            case "AMERICANO":
                return machine.getAMERICANO();
            case "ESPRESSO":
                return machine.getESPRESSO();
            case "CAPPUCCINO":
                return machine.getCAPPUCCINO();
            case "FLAT WHITE":
                return machine.getFLAT_WHITE();
                /*case "No Name":
                machine.setNO_NAME_COFFEE();
                machine.getNO_NAME_COFFEE();
                break;*/
            default: return machine.getNO_NAME_COFFEE();
        }
    }
}
