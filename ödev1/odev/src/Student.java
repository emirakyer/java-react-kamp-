public class Student {
    private static int nextId = 1; // Her öğrenciye otomatik artan benzersiz ID sağlayan statik alan

    private int id;
    private String name;
    private int weight;
    private int height;
    private Double score;

    public Student(String name, int weight, int height, Double score) {
        this.id = nextId++;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

}
