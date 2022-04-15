package corejava_project;
import framework.*;
public  class GSShopFactory extends ShopFactory {
	@Override
	public PrimeAcc getNewPrimeAcc(int accNo,String accNm,float charges,boolean isSalaried) {
	GSPrimeAcc GsPrime=new GSPrimeAcc(accNo,accNm,charges,isSalaried);
	System.out.println(GsPrime.toString());
	return GsPrime;
	}

	public NormalAcc getNewNormalAcc(int accNo,String accNm,float charges,float deliveryCharges) {
		GSNormalAcc GsNormal=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
				System.out.println(GsNormal.toString());
		
		return GsNormal;
	}
	


}
