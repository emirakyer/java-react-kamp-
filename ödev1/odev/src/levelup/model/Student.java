package levelup.model;

public class Student extends Person {
    private static int nextId = 1; // Her öğrenciye otomatik artan benzersiz ID sağlayan statik alan
    private int id;
    private Double score;

    public Student(String name, int weight, int height, Double score) {
        super(name, weight, height);
        this.id = nextId++;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
    
    @Override
    public void showPersonInfo() {
        super.showPersonInfo(); // Super class'tan gelen methodu çağırıyoruz
        System.out.println("ID: " + id + ", Score: " + score);
    }

}
