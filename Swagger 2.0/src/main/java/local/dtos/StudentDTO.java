package local.dtos;

import local.entities.Adress;

import java.util.List;

public class StudentDTO {
    private StudentIdDTO studentId;
    private String name;

    private List<CourseDTO> courses;
    private AdressDTO adress;

    public StudentIdDTO getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentIdDTO studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<CourseDTO> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDTO> courses) {
        this.courses = courses;
    }

    public AdressDTO getAdress() {
        return adress;
    }

    public void setAdress(AdressDTO adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                ", adress=" + adress +
                '}';
    }
}
