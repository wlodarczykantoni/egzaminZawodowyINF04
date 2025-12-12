package egzaminWlasny0712;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
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
		
		List<String>listaIntow = new ArrayList();
		listaIntow.addAll(Arrays.asList(
			   "0","1","2","3","4","5","6","7","8","9"
			));


//login jedno z imienia i nazwisko cale, ale male wszystko
	String login = imie.toLowerCase().charAt(0)+nazwisko.toLowerCase();
	System.out.println("Tutaj jest twój login: "+login);
	System.out.println("Tutaj jest wygenerowane dla ciebie hasło: ");
generowaniaHasla(iloscZnakowWHasle, listaMalychLiter, listaDuzychLiter, listaZnakow, listaIntow);
	}
	
	public static void generowaniaHasla(int iloscZnakowWHasle, List<String>listaMalychLiter,List<String>listaDuzychLiter,List<String>listaZnakow,List<String>listaIntow ) {
		int i = 0;
		Random random = new Random();
		List<String>password = new ArrayList();
														
		while(i<iloscZnakowWHasle) {
			int resultRandom = random.nextInt(4);
			if(resultRandom == 0) {
				int b=0;
			    Collections.shuffle(listaMalychLiter);
			//    System.out.println(listaMalychLiter.get(0));
			    password.add(listaMalychLiter.get(0));
			    i++;
			} else if(resultRandom == 1) {
				int b=0;
			    Collections.shuffle(listaDuzychLiter);
			//    System.out.println(listaDuzychLiter.get(0));
			    password.add(listaDuzychLiter.get(0));

			    i++;
			    b++;
			}

			else if(resultRandom == 2) {
			    Collections.shuffle(listaZnakow);
			//    System.out.println(listaZnakow.get(0));
			    password.add(listaZnakow.get(0));
			    i++;
			    
			} else if(resultRandom == 3) {
			    Collections.shuffle(listaIntow);
			//    System.out.println(listaIntow.get(0));
			    password.add(listaIntow.get(0));
			    i++;
			}
			
         }
		System.out.print("Hasło to: ");
		for(int x = 0;x<password.size();x++) {
			System.out.print(password.get(x));
			}
			
			
		}
	}


