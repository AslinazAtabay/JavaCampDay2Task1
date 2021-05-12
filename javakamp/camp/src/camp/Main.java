package camp;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demiro�");
		
		
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�");
		
		
		Course course3 = new Course(3,"Programlamaya Giri� i�in Temel Kurs","Engin Demiro�");
		
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println(course.id);
			System.out.println(course.name);
			System.out.println(course.instructor);
			System.out.println(" ");
			
		}
		
		
		Day day1 = new Day(1,"Day 1 Info","https://youtu.be/HB0T0hAMk0k","Java dilinde kullan�lan di�er veri tiplerini ara�t�r�n�z.","Birinci g�n kamp program�m�z� nas�l buldunuz?");
		
			
		Day day2 = new Day(2,"Day 3 Info","https://youtu.be/zwPQsIpTrH8","�zellik nesnesi olarak tan�mlad���m�z� d���nd���n�z iki �rnek veriniz.","�kinci g�n kamp program�m�z� nas�l buldunuz?");
		
		
		Day day3 = new Day(3,"Day 3 Info","https://youtu.be/v0nc0yesGfk","A�a��daki oynatma listesini 27-39 aral���nda izleyiniz.(27-39 Dahil)","���nc� g�n kamp program�m�z� nas�l buldunuz?");
		
		Day[] days = {day1,day2,day3};
		
		for (Day day : days) {
			System.out.println(day.id);
			System.out.println(day.timetable);
			System.out.println(day.lectureLink);
			System.out.println(day.homework);
			System.out.println(day.rating);
			System.out.println(" ");
		
		
	}
		
	DayManager dayManager = new DayManager();
	dayManager.addDay(day1);
	dayManager.deleteDay(day1);
	dayManager.editDay(day1);
	
		
	}
}

