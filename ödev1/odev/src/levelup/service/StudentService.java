package levelup.service;

import levelup.model.IPerson;
import levelup.model.ScholarshipStudent;

public class StudentService {

    public void updateName(IPerson person, String newName) {
        person.setName(newName);
        System.out.println("Updated Name: " + person.getName());
    }

    public void updateWeight(IPerson person, int newWeight) {
        person.setWeight(newWeight);
        System.out.println("Updated Weight: " + person.getWeight());
    }

    public void updateHeight(IPerson person, int newHeight) {
        person.setHeight(newHeight);
        System.out.println("Updated Height: " + person.getHeight());
    }

    public void updateScore(IPerson person, double newScore) {
        if (person instanceof ScholarshipStudent) {
            ScholarshipStudent student = (ScholarshipStudent) person;
            student.setScore(newScore);
            System.out.println("Updated Score: " + student.getScore());
        }
    }

    // Metodun adı ve parametre türü düzenlendi
    public void showInfoPerson(IPerson person) {
        person.showPersonInfo();
    }

    public void updateScholarshipAmount(ScholarshipStudent student, double newScholarshipAmount) {
        student.setScholarshipAmount(newScholarshipAmount);
        System.out.println("New Scholarship Amount: " + student.getScholarshipAmount());
    }

    public void showInfoStudents(IPerson[] persons) {
        for (IPerson person : persons) {
            person.showPersonInfo();
        }
    }

    public void averageClassScore(IPerson[] persons) {
        double totalScore = 0;
        int count = 0;

        for (IPerson person : persons) {
            if (person instanceof ScholarshipStudent) {
                ScholarshipStudent student = (ScholarshipStudent) person;
                totalScore += student.getScore();
                count++;
            }
        }

        double averageScore = (count > 0) ? totalScore / count : 0;
        System.out.println("Average Score: " + averageScore);
    }
}
