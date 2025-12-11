package egzaminWlasny0712;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class konsola0712 {

	public static void main(String[] args) {
		System.out.println("Podaj swoje imie");
		Scanner scannerImie=new Scanner(System.in);
		String imie = scannerImie.nextLine();
		System.out.println("Podaj swoje nazwisko");
		Scanner scannerNazwisko=new Scanner(System.in);
		String nazwisko = scannerNazwisko.nextLine();
		
		System.out.println("imie i naziwkso: "+imie+" "+nazwisko);
		
		System.out.println("Podaj ile haslo ma miec znakow");
		Scanner scannerIloscZnakowWHasle=new Scanner(System.in);
		int iloscZnakowWHasle = scannerIloscZnakowWHasle.nextInt();
		
		List<String>listaMalychLiter = new ArrayList();
		listaMalychLiter.addAll(Arrays.asList("a","b","c","d","e","f","g","h","i","j",
                "k","l","m","n","o","p","q","r","s","t",
                "u","v","w","x","y","z"));
		
		
		List<String>listaDuzychLiter = new ArrayList();
		listaDuzychLiter.addAll(Arrays.asList(
			    "A","B","C","D","E","F","G","H","I","J",
			    "K","L","M","N","O","P","Q","R","S","T",
			    "U","V","W","X","Y","Z"
			));
		

		
		List<String>listaZnakow = new ArrayList();
		listaZnakow.addAll(Arrays.asList(
			    "!", "@", "#", "$", "%"
			));
		
		List<Integer>listaIntow = new ArrayList();
		listaIntow.addAll(Arrays.asList(
			   0,1,2,3,4,5,6,7,8,9
			));


//login jedno z imienia i nazwisko male wszystko
		char login = imie.charAt(0);
	//	String password = 
//testowe wywolanie
generowaniaHasla(iloscZnakowWHasle, listaMalychLiter, listaDuzychLiter, listaZnakow, listaIntow);
	}
	//TO-DO dokoncz generowanie hasla
	public static void generowaniaHasla(int iloscZnakowWHasle, List<String>listaMalychLiter,List<String>listaDuzychLiter,List<String>listaZnakow,List<Integer>listaIntow ) {
		int i = 0;
		while(i<iloscZnakowWHasle) {
			Collections.shuffle(listaMalychLiter);
			System.out.println(listaMalychLiter.get(0));
			i++;
			Collections.shuffle(listaDuzychLiter);
			System.out.println(listaDuzychLiter.get(0));
			i++;
			Collections.shuffle(listaZnakow);
			System.out.println(listaZnakow.get(0));
			i++;
			
		
         }
			
			
		}
	}


