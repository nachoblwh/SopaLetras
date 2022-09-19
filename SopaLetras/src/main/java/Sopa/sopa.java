package Sopa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Coordenada.TableroException;

public class sopa {
	
	List<List<Character>> tablero = new  ArrayList<List<Character>>();
	Scanner sc= new Scanner(System.in);
	public int num=0;
	public void preguntarNumero(){
	
	do {
		num=0;
		try 
		{
			
			System.out.println("Dame un numero para definir el tamaño del array");
				num=sc.nextInt();
				for(int i=0;i<num;i++)
				{
					this.tablero.add(new ArrayList<Character>());
					for(int j=0;j<num;j++)
					{ 
						this.tablero.get(i).add('*');
					}
				}
		}catch(Exception e) {
			System.err.println("El numero es menor que 0 "+e.getMessage());
		}
	}while(num<0);
		
	
	}
	
	public void colocarPalabraHorizontal(String palabra, coordenada Coordenada) throws TableroException
	{
		
		if (palabra==null || palabra.isEmpty())
		{
			throw new TableroException("No existe ninguna palabra");
		}
		if (palabra.length()>this.num) 
		{
			throw new TableroException("El tamaño de la palabra es superior al tamaño de la matrix");
		}
		else if(Coordenada.getFila()>num)
		{
			throw new TableroException("La fila");
		}
		else if(Coordenada.getColumna()>num) 
		{
			throw new TableroException("La columna");
		}
		else if(Coordenada.getSentido()==Sentido.NORMAL) 
		{
			if(this.num-(Coordenada.getColumna()+palabra.length())<0)
			{
				throw new TableroException("El tamaño de la palabra supera el limite establecido ");
			}
			
			this.colocarPalabraHorizontalSentidoNormal(palabra, Coordenada);
		}
	}

	private void colocarPalabraHorizontalSentidoNormal(String palabra, coordenada coordenada) {


		
	}
	
}



