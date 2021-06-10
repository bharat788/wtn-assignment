package AbstractClass;

public class ICICBank extends GeneralBank {

	@Override
	public double getSavingInterestRate() {
		return 4.0;
	}

	@Override
	public double getFixedInterestRate() {
		return 8.5;
	}

}