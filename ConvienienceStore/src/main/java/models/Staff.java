package models;

import javax.management.relation.Role;

public class Staff extends Person {
    private String id;
    private String role;
    private String qualification;
    private String yearsOfExperience;

    public Staff() {
    }

    public Staff(String firstName, String lastName, int age, String email, String id, String role, String qualification, String yearsOfExperience) {
        super(firstName, lastName, age, email);
        this.id = id;
        this.role = role;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", role='" + role + '\'' +
                ", qualification='" + qualification + '\'' +
                ", yearsOfExperience='" + yearsOfExperience + '\'' +
                '}';
    }
}