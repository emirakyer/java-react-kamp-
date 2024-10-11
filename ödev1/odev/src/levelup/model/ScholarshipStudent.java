package levelup.model;

public class ScholarshipStudent extends Student{
    private double scholarshipAmount;

    public ScholarshipStudent(String name, int weight, int height, Double score, double scholarshipAmount){
        super(name, weight, height, score);
        this.scholarshipAmount= scholarshipAmount;
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

    public void setScholarshipAmount(double scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
    }

    @Override
    public void showPersonInfo() {
        super.showPersonInfo(); // Student sınıfındaki metodu kullanıyoruz
        System.out.println("Scholarship Amount: " + scholarshipAmount);
    }

    
}
