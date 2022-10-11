package Test;

import enums.Grades;
import enums.Qualifications;
import models.Applicants;
import models.Manager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void hire() {
        Manager manager = new Manager();
        Applicants Victor = new Applicants("Victor", "Jones", 30,
                "victorjonah@gmail.com", Grades.FIRSTCLASS, 4, Qualifications.HND);
        Victor.setGrades(Grades.FIRSTCLASS);
        manager.hire(Victor);
        Grades result = Victor.getGrades();
        Grades compare = Grades.FIRSTCLASS;
        assertEquals(compare, result);
    }

}
