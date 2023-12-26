package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.task1.Student;
import ucu.edu.ua.task1.User;

public class StudentTest {
    private User student;


    @BeforeEach
    public void init() {
        student = Student.builder()
                    .name("Oles")
                    .age(32)
                    .gender("MALE")
                    .mark(61)
                    .mark(100)
                    .mark(62)
                    .build();
    }

    @Test
    public void testStudent() {
        String expected = "Student(super=User(name=Oles, age=32, weight=0, height=0, gender=MALE), grades=[61, 100, 62])";
        Assertions.assertEquals(expected, student.toString());

    }
}
