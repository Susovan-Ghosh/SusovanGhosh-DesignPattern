package StatePattern;

public class Test {

	public static void main(String[] args) {

		Philosopher p1 = new Philosopher("Socrates");
		State thinkingState = new ThinkingState();
		thinkingState.doAction(p1);

		Philosopher p2 = new Philosopher("Aristotle");
		State eatingState = new EatingState();
		eatingState.doAction(p2);

		eatingState.doAction(p1);
		thinkingState.doAction(p2);

	}

}