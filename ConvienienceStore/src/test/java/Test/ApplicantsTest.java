package Test;

import enums.Grades;
import enums.Qualifications;
import models.Applicants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantsTest {
    @Test
    void apply() {
        Applicants Victor = new Applicants("Victor", "Gloria", 24,
                "victorgloria@gmail.com", Grades.SECONDCLASS_LOWER, 4, Qualifications.BSC);
    String actual = Victor.apply(Victor);
    String compare5 = "You can apply for this role";
    assertEquals(compare5, actual);
    }
}