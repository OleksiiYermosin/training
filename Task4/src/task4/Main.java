package task4;

/**
 * Class for launching program
 * @author Oleksii Yermosin
 * @version 1.0
 * @see Model
 * @see Controller
 * @see View
 */
public class Main {

    /**
     * Method that launches program
     * @param args - array of args
     */
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.readData();
        controller.outputData();
    }

}
