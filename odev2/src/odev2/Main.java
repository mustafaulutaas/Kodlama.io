package odev2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(52, "Java", "Engin Demiroğ");
		Course course2 = new Course(60, "C#", "Engin Demiroğ");
		Course course3 = new Course(70, "Java", "Engin Demiroğ");
		Course course4 = new Course(10, "C#", "Engin Demiroğ");
		
		Course[] courses = {course1,course2,course3,course4};
		
		for (Course course : courses) {
			
			System.out.println(course.name + " : %"+course.complate + " : " + course.instructor);
			
		}
		
		Student student1 = new Student("Mustafa","abc@outlook.com","abcd1234");
		Student student2 = new Student("Vahit","abcd@outlook.com","abcd11234");
		Student student3 = new Student("Zeynel","sjkadjka@outlook.com","abcd12234");
		
		
		
		RegisterManager registerManager	= new RegisterManager();
		registerManager.loginIn(student1);
		registerManager.loginIn(student2);
		registerManager.loginIn(student3);
	}

}
