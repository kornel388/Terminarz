package pl.kornel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat  formatdate = new SimpleDateFormat("yyyy.MM.dd '/' hh:mm:ss");
		Scanner sc = new Scanner(System.in);
		String data = formatdate.format(date);
		String note = sc.nextLine();
		
		Notes note1 = new Notes(note, data);
		note1.getNote();
	}

} 