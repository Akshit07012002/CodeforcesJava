package cp;
import java.util.*;
import java.io.*;

class MainClass
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException
	{
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.age = 20;
		p1.name = "Akshit";
		
		p2.age = 19;
		p2.name = "Sajjan";
		
		System.out.println(p1.age + " : " + p1.name);
		System.out.println(p2.age + " : " + p2.name);
		
		p1.walk(); p2.walk(); 
		p1.eat(); p2.eat();
		
		System.out.println("--------------------------------------");
		
		int ppl = 0;
		
		Person p[];
		
		System.out.print("Enter the number of people : ");
		ppl = Integer.parseInt(in.readLine());
		
		p = new Person[ppl];
			

		for(int i=0; i<ppl; i++)
		{
			p[i] = new Person();		
			System.out.print("Enter name : ");
			p[i].name = in.readLine();
			System.out.print("Enter age : ");
			p[i].age = Integer.parseInt(in.readLine());
			System.out.println("....................................");
			
		}
		
		for(int i=0; i<ppl; i++)
		{
			if(i==ppl-1)
			{
				p[i].walk();
				System.out.print(" while ");
				p[0].eat();
			}
			
			else
			{
				p[i].walk();
				System.out.print(" while ");
				p[i+1].eat();
				System.out.println("....................................");
				
			}
			
		}
		
	}
}

class Person
{
	String name;
	int age;
	
	void walk()
	{
		System.out.println("\n" + name + " is walking.");
	}
	
	void eat()
	{
		System.out.println("\n" + name + " is eating.");
	}
	
}