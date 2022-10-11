package models;

import enums.Grades;
import enums.Qualifications;
import interfaces.ApplicantInterface;

public class Applicants extends Person implements ApplicantInterface {

    private Grades grades;
    private int yearsOfExperience;
    private Qualifications qualifications;

    public Applicants() {
    }

    public Applicants(String firstName, String lastName, int age, String email, Grades grades,
                      int yearsOfExperience, Qualifications qualifications) {
        super(firstName, lastName, age, email);
        this.grades = grades;
        this.yearsOfExperience = yearsOfExperience;
        this.qualifications = qualifications;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Qualifications getQualifications() {
        return qualifications;
    }

    public void setQualifications(Qualifications qualifications) {
        this.qualifications = qualifications;
    }

    @Override
    public String apply(Applicants applicants) {
        if (applicants.yearsOfExperience >= 3 && applicants.qualifications.equals(Qualifications.BSC)){
            return "You can apply for this role";
        } else {
            return "Not qualify for this role";
        }
    }
}