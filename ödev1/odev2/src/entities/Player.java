package entities;

public class Player {
    private String firstName;
    private String lastName;
    private String nationalId;
    private int birthYear;

    public Player(String firstName, String lastName, String nationalId, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.birthYear = birthYear;
    }

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getNationalId() { return nationalId; }
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
}
