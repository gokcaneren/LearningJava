
public abstract class SuperHero {

	public abstract void superPower();
	
	
	// final can't be override
	public final void gameOver() {
		System.out.println("Game Over!");
	}
}
