package domaine;

public class Felin extends Animal {
	private int bebe;

	public int getBebe() {
		return bebe;
	}

	public void setBebe(int bebe) {
		this.bebe = bebe;
	}

	@Override
	public void crie() {
		System.out.println();
	}

}
