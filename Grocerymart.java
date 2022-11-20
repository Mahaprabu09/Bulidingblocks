package BuildingBlocks;

public class Grocerymart {
	private String cusName;
	private int cusId;
	private int cusNo;
	private int cusBal;
	private String address;
	
	public String getCusname()
	{
		return cusName;
	}
	public void setCusname(String name)
	{
		this.cusName=name;
	}
	public int getCusId()
	{
		return cusId;
	}
	public void setCusid(int id)
	{
		this.cusId=id;
	}
	public int getCusno()
	{
		return cusNo;
	}
	public void setCusno(int no)
	{
		this.cusNo=no;
	}
	public int getCusbal()
	{
		return this.cusBal;
	}
	
	public void setCusbal(int bal)
	{
		this.cusBal=bal;
	}
	public String getCusaddress()
	{
		return this.address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	
	public void shop(double accountbal)
	{
		
		if(cusBal>=accountbal)
		{
		double remain=cusBal-accountbal;
		System.out.println("Thanks for shopping, your available balance:"+remain);
		}else
		{
			System.out.println("Sorry Insufficient fund please again later");
		}
		System.out.println();
	}
	
	public void recharge(int rechargemoney)
	{
		int addmoney=rechargemoney+cusBal;
		System.out.println("Thanks for recharging money to your account your available balance is:"+addmoney);
	}
}
