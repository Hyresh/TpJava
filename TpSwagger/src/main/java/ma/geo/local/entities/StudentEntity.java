package ma.geo.local.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class StudentEntity {
    @Id
    @Column(name = "id_student")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name_student")
    private String name;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama() {
        return name;
    }

    public void setNama(String nama) {
        this.name = nama;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", nama='" + name + '\'' +
                '}';
    }
}
