package BuildingBlocks;

public class smartphone {
	private String Name;
	private String model;
	private int ram;
	private int price;
	
	
	public void setModel(String model)
	{
		this.model=model;
		if(model=="Nord" || model=="2promax")
		{
			this.model=model;
		}
		else
		{
			System.out.println("Sorry this model is not exist");
		}
	}
	
	public String getModel()
	{
		return this.model;
	}

}
