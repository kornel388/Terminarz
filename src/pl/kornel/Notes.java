package pl.kornel;

public class Notes {
	
	private String note;
	private String date;
	
	public void getNotes(){
		System.out.println("______________________________________");
		System.out.println(' ');
		System.out.println("Treœæ notatki: " + note);
		System.out.println("Data dodania: " + date);
		System.out.println(' ');

	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public void setDate(String date){
		this.date = date;
	}
	public String getNote(){
		return note;
	}
	
}
