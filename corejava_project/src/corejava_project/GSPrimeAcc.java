package corejava_project;

import framework.*;

public class GSPrimeAcc extends PrimeAcc {
	private static final float charges=0;
	public float getCharges()
	{	return charges;
		
	}
	public GSPrimeAcc(int accNO, String accNm, float charges, boolean isPrime)  {
		super(accNO, accNm, charges, isPrime);
		
	}
	@Override
	public void bookProduct(float f) {
		super.bookProduct(f);
	}
	{
		
	}
	@Override
	public String toString() {
		return super.toString();
	}

	}


