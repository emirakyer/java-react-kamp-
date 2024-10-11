package levelup.model;

public class Person implements IPerson {
    private String name;
    private int weight;
    private int height;

    public Person(String name, int weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
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

    @Override
    public void showPersonInfo() {
        System.out.println("Name: " + name + ", Weight: " + weight + ", Height: " + height);
    }
}
