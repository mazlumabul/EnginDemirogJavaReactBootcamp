
public class Main {
	public static void main(String[] args) {

		Course javaReactBootcamp = new Course(1, "Java React ", "21/04/2021");
		Course charpAnuglarBootcamp = new Course(2, "Charp Angular ", "09/01/2021");
		Course temelKurs = new Course(3, "Programlamaya Giri� i�in Temel Kurs", "01/01/2021");

		Course[] courses = { javaReactBootcamp, charpAnuglarBootcamp, temelKurs };

		System.out.println("-Bootcampler-");
		for (Course course : courses) {
			
			System.out.println("Bootcamp Ad� : " + course.name + ", Ba�lang�� Tarihi : " + course.date);
		}

		Instructor javaReactInstructor = new Instructor(1, "Engin", "DEM�RO�", "engindemirog@gmail.com");
		Instructor charpAngularInstructor = new Instructor(2, "Mazlum", "ABUL", "mazlumabul10@gmail.com");
		Instructor temelKursInstructor = new Instructor(3, "Ali", "OSMAN", "aliosman@gmail.com");

		Instructor[] instructors = { javaReactInstructor, charpAngularInstructor, temelKursInstructor };

		System.out.println("-E�itmen Bilgileri-");
		for (Instructor instructor : instructors) {
			
			System.out.println("Ad Soyad : "+instructor.firstName +" "+ instructor.lastName + ", Mail : "+ instructor.email );
		} 
		
		
		System.out.println("Kay�t Oldu�unuz Kurslar");
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(temelKurs);
		courseManager.addToCourse(javaReactBootcamp);
		 
		System.out.println("-E�itmenlerimiz-");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.showInstructor(javaReactInstructor);
		instructorManager.showInstructor(charpAngularInstructor);
		instructorManager.showInstructor(temelKursInstructor);
		
		
	}
} 
