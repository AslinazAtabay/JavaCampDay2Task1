package camp;

public class DayManager {
	public void addDay(Day day) {
		System.out.println(day.id + ". g�n� ekleme kodu �a��r�ld�.");
	}
	
	public void deleteDay(Day day) {
		System.out.println( day.id + ". g�n i�in silme kodu �a��r�ld�.");
	}

	public void editDay(Day day) {
		System.out.println(day.id + ". g�n i�in d�zenleme kodu �a��r�ld�.");
	}
}
