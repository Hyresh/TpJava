package local.entities;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "STUDENT")
public class StudentEntity {
    //@Id
    //@Column(name = "id_student")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private long id;
    @EmbeddedId
    private StudentId studentId;

    @Column(name = "name_student")
    private String name;
    @Embedded
    /*@AttributeOverrides({
            @AttributeOverride(name="street",column = @Column(name = "Student_Street")),
            @AttributeOverride(name = "city",column = @Column(name = "Student_City")),
            @AttributeOverride(name = "zipCode",column = @Column(name = "Student_ZipCode"))
    })*/
    private Adress adress;
    //public long getId() {
    //    return id;
    //}

    //public void setId(long id) {
    //    this.id = id;
    //}
    @ManyToMany(cascade = {CascadeType.MERGE,
            CascadeType.PERSIST,
    },fetch = FetchType.EAGER
    )
    @JoinTable(name = "tab_list_course")
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public StudentId getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentId studentId) {
        this.studentId = studentId;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                ", courses=" + courses +
                '}';
    }
}
