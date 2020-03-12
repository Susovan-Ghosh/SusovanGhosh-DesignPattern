package StatePattern;

public class ThinkingState implements State {

	public void doAction(Philosopher philosopher) {
		System.out.println(philosopher.getName() + " is in thinking state");
		philosopher.setState(this);
	}
}