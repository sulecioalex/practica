package proyecto;
import cartas.carta;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class proyecto {

static int x=0;
 static int token=1;
static int  contador =0;
static int opc=0;
static int seleccion;
static int r=0;
static int p=0;
	public static void main(String[] args) {
	carta c1=new carta();
	c1.nombre="Guard";
	c1.numero=1;
	
	carta c2=new carta();
	c2.nombre="Guard";
	c2.numero=1;
	
	carta c3=new carta();
	c3.nombre="Guard";
	c3.numero=1;
	
	carta c4= new carta();
	c4.nombre="Guard";
	c4.numero=1;
	
	carta c5= new carta();
	c5.nombre="Guard";
	c5.numero=1;
	
	carta c6= new carta();
	c6.nombre="Priest";
	c6.numero=2;
	
	
	carta c7= new carta();
	c7.nombre="Priest";
	c7.numero=2;
	
	carta c8= new carta();
	c8.nombre="Baron";
	c8.numero=3;
	
	carta c9= new carta();
	c9.nombre="Baron";
	c9.numero=3;
	
	carta c10= new carta();
	c10.nombre="Handmaid";
	c10.numero=4;
	
	carta c11= new carta();
	c11.nombre="Handmaid";
	c11.numero=4;
	
	carta c12= new carta();
	c12.nombre="Prince";
	c12.numero=5;
	
	carta c13= new carta();
	c13.nombre="Prince";
	c13.numero=5;
	
	carta c14= new carta();
	c14.nombre="king";
	c14.numero=6;
	
	carta c15= new carta();
	c15.nombre="Countess";
	c15.numero=7;
	
	carta c16= new carta();
	c16.nombre="Princess";
	c16.numero=8;
	
	
	System.out.println();
	
	ArrayList<carta> deck=new ArrayList<carta>();
	deck.add(c1);
	deck.add(c2);
	deck.add(c3);
	deck.add(c4);
	deck.add(c5);
	deck.add(c6);
	deck.add(c7);
	deck.add(c8);
	deck.add(c9);
	deck.add(c10);
	deck.add(c11);
	deck.add(c12);
	deck.add(c13);
	deck.add(c14);
	deck.add(c15);
	deck.add(c16);
	System.out.println(deck.get(0).nombre);
	Collections.shuffle(deck);
	System.out.println(deck.get(0).nombre);
	c1= deck.get(0);
	c2= deck.get(1);
	c3= deck.get(2);
	c4= deck.get(3);
	c5= deck.get(4);
	c6= deck.get(5);
	c7= deck.get(6);
	c8= deck.get(7);
	c9= deck.get(8);
	c10= deck.get(9);
	c11= deck.get(10);
	c12= deck.get(11);
	c13= deck.get(12);
	c14= deck.get(13);
	c15= deck.get(14);
	c16= deck.get(15);
	
	System.out.println(c1.nombre);
	
	ArrayList<carta> usuario=new ArrayList<carta>();
	usuario.add(c1);
	usuario.add(c2);
	usuario.add(c3);
	usuario.add(c4);
	usuario.add(c5);
	usuario.add(c6);
	usuario.add(c7);
	usuario.add(c8);
	ArrayList<carta> cpu=new ArrayList<carta>();
	cpu.add(c9);
	cpu.add(c10);
	cpu.add(c11);
	cpu.add(c12);
	cpu.add(c13);
	cpu.add(c14);
	cpu.add(c15);
	cpu.add(c16);
	
	
	
	while (x != 3)
		{
		int d =0;
		int f=0 ;
		int c=0;
		System.out.println("bienvendio a letter love ingrese una opcion");
		System.out.println("1) juego");
		System.out.println("2) opciones");
		System.out.println("3) reglas");
		System.out.println("4) salir");
		Scanner s=new Scanner(System.in);
		opc=s.nextInt();
		switch (opc)	{
		case 1:
			System.out.print(usuario.get(0).nombre + "      ");
			System.out.println(usuario.get(1).nombre);
			System.out.print(cpu.get(0).nombre + "     ");
			System.out.println(cpu.get(1).nombre);
			int comparacion;
			while (contador < token )
			{
				
				for (int z=0; z<8; z++)	{
					r = s.nextInt();
					if (r==1){
						//usar z-d
					System.out.println(usuario.get(z+2-f).nombre);	//mostrar 
					System.out.println(usuario.get(z+1-d).nombre);	//mostrar 
					
						d=0;//d=0;
						f=0;//f=0;
						
						
					}
					
					if (r==2){
						++z;//z++
						d=d+1;
						f=f+2;
						//
						//usar z
						System.out.println(usuario.get(z+1).nombre);//mostrar z+1
						System.out.println(usuario.get(z-1).nombre);//mostrar z-1
						--z;//z--
						//
						
					}
				}
					
			}
			
			
			
			
			
			
			
			
			
			break;
		case 2:
		{
			System.out.println("ingrese a cuantos tokens quiere jugar ");
			System.out.println("1 token precione 1");
			System.out.println("3 token precione 3");
			System.out.println("7 token precione 7");
			token=s.nextInt();
			 if (token == 1){ 
					 token=1;
					 }
			 else if (token == 3){ 
				 token=3;}
			 else if (token == 7){ 
				 token=7;}
		}		 		
			break;
		case 3:
			System.out.println("Tomas el clerigo");
			System.out.println("al descartar al clerigo puedes ver la mano ");
			System.out.println("del otro jugador");
			System.out.println("");
			System.out.println("Guardia");
			System.out.println("nombra una carta y si esa carta la tiene tu ");
			System.out.println("oponente es eliminado de la ronda ");
			System.out.println("");
			System.out.println("Princesa");
			System.out.println("si descartas esta carta eres eliminado de la ronda");
			System.out.println("");
			System.out.println("Condesa");
			System.out.println("Si en algún momento tienes a la Condesa y al Rey o ");
			System.out.println("al Príncipe en tu mano, descarta esta carta");
			System.out.println("");
			System.out.println("Rey");
			System.out.println("Al descartar al rey,  intercambia la carta en tu mano por ");
			System.out.println("la de tu eleccion de la mano del oponente");
			System.out.println("");
			System.out.println("Principe");
			System.out.println("");
			System.out.println("elije un jugador para descartar su mano y riba una nueva carta");
			System.out.println("");
			System.out.println("La doncella");
			System.out.println("te hace inmune a todos los efectos");
			System.out.println("");
			System.out.println("Baron");
			System.out.println("ambos jugadores muestran su mano y la suma mas baja de las cartas ");
			System.out.println("es eliminado de la ronda");
			System.out.println("");
			break;	
		case 4:
		
		x=3;
			break;
		}
		}
	}

}
