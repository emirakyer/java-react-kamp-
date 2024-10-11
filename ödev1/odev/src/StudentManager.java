import java.util.HashSet;
import java.util.Set;


public class StudentManager {
    public void showInfoStudent(Student student){
        System.out.println("Öğrenci no:" + student.getId() + " Öğrenci ismi:"+ student.getName() + " Öğrenci kilo:"+ student.getWeight() + " Öğrenci boy:" + student.getHeight()+ " Öğrenci skor:"+student.getScore());
    }

    public void showInfoStudentTwoPerson(Student student,Student student2){
        System.out.println("Öğrenci no:" + student.getId() + " Öğrenci ismi:"+ student.getName() + " Öğrenci kilo:"+ student.getWeight() + " Öğrenci boy:" + student.getHeight()+ " Öğrenci skor:"+student.getScore());
        System.out.println("Öğrenci no:" + student2.getId() + " Öğrenci ismi:"+ student2.getName() + " Öğrenci kilo:"+ student2.getWeight() + " Öğrenci boy:" + student2.getHeight()+ " Öğrenci skor:"+student2.getScore());
    }
    
    public void showInfoStudents(Student[] students){
        for (Student student: students){
	 	System.out.println("Öğrenci no:" + student.getId() + " Öğrenci ismi:"+ student.getName() + " Öğrenci kilo:"+ student.getWeight() + " Öğrenci boy:" + student.getHeight()+ " Öğrenci skor:"+student.getScore());
	    }    
    }

    public void averageClassScore(Student[] students){
        double totalScore = 0;

        for (Student student: students){
            totalScore += student.getScore();    
        }

        double averageScore = totalScore / students.length;

        System.out.println("Sınıftaki Öğrenci Sayısı: " + students.length);
        System.out.println("Sınıfın Ortalaması: " + averageScore);
    }

    public void updateStudentInfo(Student student, String newName, int newWeight, int newHeight, double newScore) {
        student.setName(newName);
        student.setWeight(newWeight);
        student.setHeight(newHeight);
        student.setScore(newScore);

        System.out.println("Öğrencinin bilgileri güncellendi:");
        System.out.println("Yeni İsim: " + student.getName());
        System.out.println("Yeni Kilo: " + student.getWeight());
        System.out.println("Yeni Boy: " + student.getHeight());
        System.out.println("Yeni Skor: " + student.getScore());
    }

}
