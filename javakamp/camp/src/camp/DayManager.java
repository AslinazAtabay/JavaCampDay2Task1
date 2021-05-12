package camp;

public class DayManager {
	public void addDay(Day day) {
		System.out.println(day.id + ". günü ekleme kodu çaðýrýldý.");
	}
	
	public void deleteDay(Day day) {
		System.out.println( day.id + ". gün için silme kodu çaðýrýldý.");
	}

	public void editDay(Day day) {
		System.out.println(day.id + ". gün için düzenleme kodu çaðýrýldý.");
	}
}
