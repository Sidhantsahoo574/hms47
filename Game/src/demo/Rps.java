package demo;

import java.util.*;
//welcome
public class Rps {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			
		String[] rps= {"r","p","s"};
		String u,c;
		while(true)
		{
			System.out.println("Enter your move (r,p,s) ");
			u=sc.next();
			c=rps[new Random().nextInt(rps.length)];
			if(u.equals("r")||u.equals("s")||u.equals("p"))
				break;
			System.out.println("Invalid move");
		}
		System.out.println("computer move="+c);
			if(u.equals(c))
				System.out.println("draw");
			else if(u.equals("r"))
			{
				if(c.equals("s"))
					System.out.println("You win");
				else if(c.equals("p"))
					System.out.println("You lose");
			}
			else if(u.equals("s"))
			{
				if(c.equals("p"))
					System.out.println("You win");
				else if(c.equals("r"))
					System.out.println("You lose");
			}
			else if(u.equals("p"))
			{
				if(c.equals("r"))
					System.out.println("You win");
				else if(c.equals("s"))
					System.out.println("You lose");
			}
		
		}
	}

}
