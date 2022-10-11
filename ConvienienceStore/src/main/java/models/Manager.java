package models;
import enums.Grades;
import interfaces.ManagerInterface;

public class Manager extends Staff implements ManagerInterface {

    public Manager() {
    }

    public Manager(String firstName, String lastName, int age, String email, String id, String role,
                   String qualification, String yearsOfExperience) {
        super(firstName, lastName, age, email, id, role, qualification, yearsOfExperience);
    }

    @Override
    public String hire(Applicants applicants) {
        if(applicants.getGrades()==(Grades.FIRSTCLASS)
        || applicants.getYearsOfExperience()== 5){
            return  "You're hired";
        }
        else{
            return  "Application unsuccessful!";
        }
    }




}