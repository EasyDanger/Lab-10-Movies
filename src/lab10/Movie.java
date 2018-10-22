package lab10;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	
	private String title;
	private List<String> category = new ArrayList<>();
	
	public Movie(String title) {
		this.title = title;
	}	
	
	public Movie(String title, String category) {
		this.title = title;
		this.category.add(category);
	}

	public String getTitle() {
		return title;
	}

	public void setCat(String category) {
		this.category.add(category);
		
	}
	public String toFullString() {
		String fullCat = "";
		fullCat = category.get(0);
		for (int i= 1 ;  i < category.size(); i++) {
			fullCat += " and " + category.get(i);
		}
		return title + " is the name of this movie and it's a(n) " + fullCat + " movie.";
	}
	
	public boolean isCat(String test) {
		boolean isCat = false;
		for (int i = 0; (isCat == false) && (i < category.size()); i++) {
			if (test.equalsIgnoreCase(category.get(i))) {
				isCat = true;
			}
		}			
		return isCat;
	}
	public String searchCat(String potCat) {
		for (int i = 0; i < category.size(); i++) {
			if (potCat.equalsIgnoreCase(category.get(i))) {
				return title;
			}
			
		}
	return "";	
	}
	@Override
	public String toString() {
		return title;
	}
}
