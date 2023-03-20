package ma.geo.local.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_STUDENT")
public class StudentEntity {
    @Id
    private long id;
    private String nama;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                '}';
    }
}
