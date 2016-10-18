package pl.kornel;

import java.util.LinkedList;
import java.util.List;

public class Note {

	List<Notes> notes = new LinkedList<Notes>();
	
	public void addNote(Notes note) {
		notes.add(note);
	}
	public void showNotes() {
		
		for(Notes wynik : notes) {
			wynik.getNotes();
		}
	}
}
