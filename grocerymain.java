package BuildingBlocks;

public class grocerymain {
	public static void main(String[]args)
	{
		Grocerymart g=new Grocerymart();
		g.setCusname("Mahaprabu");
		g.setCusid(12345);
		g.setCusno(790400000);
		g.setCusbal(700);		
		g.setAddress("Tamilnadu");
		
		g.shop(300);
		g.shop(345);
		
		g.recharge(2000);
		
	}

}
