import jade.core.Agent;

public class TestAgent extends Agent {

	@Override
	protected void setup() {
		super.setup();
			System.out.println("Hello! " + getAID().getName() + " is created");	
			
			addBehaviour(new MyOneShotBehaviour());
	}
}

