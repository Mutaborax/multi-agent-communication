import jade.core.behaviours.Behaviour;

import java.io.IOException;
import java.util.Scanner;

public class MyOneShotBehaviour extends Behaviour {

    private boolean isDone = false;

    @Override
    public void action() {
        System.out.println("Executing Something");

        System.out.println("Agent listening at........");
        try {
            Thread.sleep(1000); // Introducing a small delay for readability
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      
        try {
			if (System.in.available() > 0) {
			    Scanner scanner = new Scanner(System.in);
			    String userInput = scanner.nextLine().trim().toLowerCase();

			    if ("true".equals(userInput)) {
			        System.out.println("Agents behaviour is ending........");
			        isDone = true;
			    } else if ("false".equals(userInput)) {
			        System.out.println("Agents behavior.........");
			    } else {
			        System.out.println("Invalid input. Defaulting to 'false' and behavior will continue.");
			    }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public boolean done() {
        return isDone;
    }
}

