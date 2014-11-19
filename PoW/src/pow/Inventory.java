package pow;

public class Inventory {
	//inventory instantiation
	public int[] inventory = new int[4];
	//adds item if event
	public Inventory(int a1, int a2, int a3, int a4, int a5)
	{
		inventory[0] = a1;
		inventory[1] = a2;
		inventory[2] = a3;
		inventory[3] = a4;
		inventory[4] = a5;
	}
	public void addItem(int item)
	{
		for(int x = 0; x < 4; x++)
		{
			if(inventory[x] == 0)
				inventory[x] = item;
		}
	}
//poopy
}
