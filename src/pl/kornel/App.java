package pl.kornel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
	static Note nt = new Note();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
 	 	menu();
	}
	
	public static void dodajNotatke(){
		System.out.println("Podaja treœæ notatki: ");
		Notes notes = new Notes();
		Date date = new Date();
		SimpleDateFormat  formatdate = new SimpleDateFormat("yyyy.MM.dd '/' hh:mm:ss");
		
		String data = formatdate.format(date);
		String note = sc.nextLine();
 	 	do 
 	 	{
 		 	notes.setNote(note);
 	 	 	notes.setDate(data);
 
 	 	}
 	 	while(notes.getNote() == null);
 	 	nt.addNote(notes);
 	 	System.out.println("Notatka dodana pomyœlnie");
 	 	menu();
	}
	public static void menu() {
		String menu;
		
		System.out.println("###############################################");
		System.out.println("###                                         ###");
		System.out.println("###                                         ###");
		System.out.println("###  1.Dodaj notatke   2.Wyœwietl notatnki  ###");
		System.out.println("###                                         ###");
		System.out.println("###                                         ###");
		System.out.println("###############################################");
		
		menu = sc.nextLine();
		if(menu.equals("1")){
			dodajNotatke();
		}else if(menu.equals("2")){
			nt.showNotes();
		}else {
			menu();
		}
	}

} 