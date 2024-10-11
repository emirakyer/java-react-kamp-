package levelup.app;

import levelup.model.IPerson;
import levelup.model.Student;
import levelup.model.ScholarshipStudent;
import levelup.model.Person;
import levelup.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        // IPerson türünde nesneler oluşturuyoruz
        IPerson student1 = new Student("Kail", 80, 175, 100.0);
        IPerson student2 = new ScholarshipStudent("Emir", 80, 185, 500.0, 200.0);
        IPerson person1 = new Person("Berfin", 50, 190);

        // StudentController nesnesi oluşturuyoruz
        StudentController studentController = new StudentController();

        // IPerson tipindeki nesneleri işlemek için aynı metodu kullanabiliyoruz
        studentController.showPersonInfo(student1); // Student bilgisi göster
        studentController.showPersonInfo(student2); // ScholarshipStudent bilgisi göster
        studentController.showPersonInfo(person1);  // Person bilgisi göster

        // Ad güncellemesi yapıyoruz (polymorphism sayesinde herhangi bir IPerson nesnesinde çalışır)
        studentController.updateStudentName(student1, "Kamil");
        studentController.updateStudentName(person1, "Beril");

        // ScholarshipStudent nesnesi için burs güncellemesi
        if (student2 instanceof ScholarshipStudent) {
            studentController.updateScholarshipAmountInfo((ScholarshipStudent) student2, 300.0);
        }

        // Güncellenen bilgileri tekrar göster
        studentController.showPersonInfo(student1); // Güncellenen isim göster
        studentController.showPersonInfo(student2); // Burs güncellenmiş hali göster
        studentController.showPersonInfo(person1);  // Güncellenen isim göster
    }
}
