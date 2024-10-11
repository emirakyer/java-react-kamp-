package levelup.model;

public interface IPerson {
    String getName();
    void setName(String name);

    int getWeight();
    void setWeight(int weight);

    int getHeight();
    void setHeight(int height);

    void showPersonInfo();
}
