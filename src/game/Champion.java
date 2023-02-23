package game;

public class Champion
{
	private String name;
	private int life; 
	private int attack;
	private int armor;

	public Champion(String name, int life, int attack, int armor)
	{
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getLife()
	{
		return life;
	}
	
	public int getAttack()
	{
		return attack;
	}
	
	public int getArmor()
	{
		return armor;
	}
	
	public void takeDamage(String nameOtherChampion, int lifeOtherChampion, int attackOtherChampion, int armorOtherChampion) 
	{
		this.life = (attackOtherChampion > this.armor)? this.life  -= attackOtherChampion - this.armor : this.life - 1;
		if(this.life < 0) 
		{
			this.life = 0;
		}
	}
	
	public String status()
	{
		return name
			  + ": "	
			  + life
			  + " de vida ";
	}
}