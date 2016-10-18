package pl.kornel;

public class Notes {
	
	private String note;
	private String date;
	
	public Notes(String note,String date) {
		this.note = note;
		this.date = date;
	}
	
	public void getNote(){
		
		System.out.println("Treœæ notatki: " + note);
		System.out.println("Data dodania: " + date);
	}
}
