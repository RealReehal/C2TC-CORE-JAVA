package corejava_project;
import framework.*;
public  class GSShopFactory extends ShopFactory {
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean isPrime) {
	GSPrimeAcc GsPrime=new GSPrimeAcc(accNo,accNm,charges,isPrime);
	System.out.println(GsPrime.toString());
	return GsPrime;
	}

	public NormalAcc getNewNormalAccount(int accNo,String accNm,float charges,float deliveryCharges) {
		GSNormalAcc GsNormal=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
				System.out.println(GsNormal.toString());
		
		return GsNormal;
	}

	public NormalAcc getNewNormalAccount(int accNo,String accNm,float charges,boolean isPrime) {
return null;

}
}
