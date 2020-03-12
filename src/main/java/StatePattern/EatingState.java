package StatePattern;

public class EatingState implements State {

	public void doAction(Philosopher philosopher) {
		System.out.println(philosopher.getName() + " is in eating state");
		philosopher.setState(this);
	}
}