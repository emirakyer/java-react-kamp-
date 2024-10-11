package levelup.controller;

import levelup.model.IPerson;
import levelup.model.ScholarshipStudent;
import levelup.service.StudentService;

public class StudentController {
    private final StudentService studentService;

    public StudentController() {
        this.studentService = new StudentService();
    }

    public void updateStudentName(IPerson person, String newName) {
        studentService.updateName(person, newName);
    }

    public void updateStudentWeight(IPerson person, int newWeight) {
        studentService.updateWeight(person, newWeight);
    }

    public void updateStudentHeight(IPerson person, int newHeight) {
        studentService.updateHeight(person, newHeight);
    }

    public void updateStudentScore(IPerson person, double newScore) {
        studentService.updateScore(person, newScore);
    }

    public void showPersonInfo(IPerson person) {
        studentService.showInfoPerson(person); // Düzeltilmiş metod adı
    }

    public void showStudentsInfo(IPerson[] persons) {
        studentService.showInfoStudents(persons);
    }

    public void updateScholarshipAmountInfo(ScholarshipStudent student, double newScholarshipAmount) {
        studentService.updateScholarshipAmount(student, newScholarshipAmount);
    }

    public void showAverageScore(IPerson[] persons) {
        studentService.averageClassScore(persons);
    }
}
