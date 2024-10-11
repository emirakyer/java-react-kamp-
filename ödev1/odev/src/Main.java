
public class Main {

	public static void main(String[] args) {
	Student student1 = new Student("Emir", 80 , 175, 100.0);
	Student student2 = new Student("Eren", 70 , 170, 100.0);
	Student student3 = new Student("Rıza", 100 , 193, 200.0);
	Student student4 = new Student("Nihal", 55 , 153, 150.0);
	Student student5 = new Student("Kail", 559 , 53, 10.0);

	System.out.println(student5.getName());


	StudentManager studentManager = new StudentManager();
	studentManager.showInfoStudent(student1);
	studentManager.showInfoStudentTwoPerson(student1,student2);
	
	Student[] students = {student1, student2, student3,student4};
	studentManager.showInfoStudents(students);
	
	studentManager.averageClassScore(students);

	studentManager.updateStudentInfo(student5,"Kamil",59,180,55.0);
	}
}