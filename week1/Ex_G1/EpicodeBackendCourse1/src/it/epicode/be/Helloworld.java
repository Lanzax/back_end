package it.epicode.be;
import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		int x =3;
		int y=5;
		String myArr[]= new String [5];
		myArr[0]="zero";
		myArr[1]="primo";
		myArr[2]="due";
		myArr[3]="tre";
		myArr[4]="quattro";
		String newStringa="cinque";
		String newArr[]= new String[myArr.length +1];
		for(int i=0; i< newArr.length; i++) {
			if(i<3) {
				newArr[i]=myArr[i];
			}else if(i==3) {
				newArr[i]=newStringa;
			}else if (i> 3) {
				newArr[i]=myArr[i-1];
			}
		}
		for(int i=0; i< newArr.length; i++) {
			System.out.println("element"+ i + ":"+ newArr[i]);
		}
	    
	   while (true) {Scanner numeroUno  = new Scanner(System.in); 
	    System.out.println("scrivi un numero ti dirò se pari o dispari");
	    int leggoUno = numeroUno.nextInt(); 
	    
	    if(pari(leggoUno)==0) {
	     System.out.println("è pari ");
	    }else if(pari(leggoUno)==1) {System.out.println("dispari");}} 
	    
	    
		}
public static int somma(int x, int y) {
	return x+y;
}public static int moltiplica(int x, int y) {
	return x*y;
}
public static String sommaString(String x, String y) {
	return x+y;
}

public static int pari(int x) {
	
	if(x%2==0) {
		return 0;
	}else return 1;
	

}
}



