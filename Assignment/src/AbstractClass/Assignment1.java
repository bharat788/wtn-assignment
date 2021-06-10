package AbstractClass;

public class Assignment1 {
	public static void main(String[] args) {
		ICICBank iciciBank = new ICICBank();
		KotMBank kotMBank = new KotMBank();

		System.out.println(iciciBank.getSavingInterestRate());
		System.out.println(iciciBank.getFixedInterestRate());
		System.out.println(kotMBank.getSavingInterestRate());
		System.out.println(kotMBank.getFixedInterestRate());
		
		GeneralBank gb1 = new ICICBank();
		GeneralBank gb2 = new KotMBank();
		
		System.out.println(gb1.getSavingInterestRate());
		System.out.println(gb1.getFixedInterestRate());
		System.out.println(gb2.getSavingInterestRate());
		System.out.println(gb2.getFixedInterestRate());
	}
}
