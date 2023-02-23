package program;

import java.util.Locale;
import java.util.Scanner;
import game.Champion;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] nameChampion = new String[2];
		int[] lifeChampion    = new int[2]; 
		int[] attackChampion  = new int[2];
		int[] armorChampion   = new int[2];
		
		Champion championOne, championTwo;
		
		System.out.println("Digite os dados do primeiro campeão: ");
		
		int number = 2;
		for(int count = 0; count < number; count++)
		{
			System.out.print("Name:  ");
			nameChampion[count] = sc.nextLine();
			
			System.out.print("Life:  ");
			lifeChampion[count] = sc.nextInt(); 
			
			System.out.print("Attack:  ");
			attackChampion[count] = sc.nextInt();
			
			System.out.print("Armor:  ");
			armorChampion[count] = sc.nextInt();
			sc.nextLine();
		}
		
		championOne = new Champion(nameChampion[0], lifeChampion[0], attackChampion[0], armorChampion[0]);
		championTwo = new Champion(nameChampion[1], lifeChampion[1], attackChampion[1], armorChampion[1]);
		
		System.out.print("Quantos turnos você deseja executar ? ");
		int numbersTurns = sc.nextInt();
		
		for(int count = 0; count < numbersTurns; count++)
		{
			System.out.println("Resultado do Turno:  " + (count + 1));			
			championOne.takeDamage(championTwo.getName(), championTwo.getLife(), championTwo.getAttack(), championTwo.getArmor());
			championTwo.takeDamage(championOne.getName(), championOne.getLife(), championOne.getAttack(), championOne.getArmor());
			
			System.out.println(championOne.status());
			System.out.println(championTwo.status());
			
			if(championOne.getLife() == 0 || championTwo.getLife() == 0 )
			{
				numbersTurns = 0;
			}							
		}
		
		System.out.println("FIM DO COMBATE");
		sc.close();
	}
}