package pub;

public class Bill {
	public char gender; 
	public int beer; 
	public int barbercue;
	public int softDrink;

	
	public double cover () 
	{
		double feeding = feeding();
		return (feeding > 30) ? 0.0 : 4.00; 
	}
	
	public double feeding () 
	{
		return ((this.beer * 5.0) + (this.barbercue * 7.0) + (this.softDrink * 3.0));
	}
	
	public double ticket ()
	{
		return (this.gender != 'F') ? 10.0 : 8.0;
	}
	
	public double total () 
	{
		double total = feeding() + ticket() + cover();
		return  total;
	}
}
