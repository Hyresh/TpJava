package org.example.dtos;

public class StudentDto {
    private Long id;
    private String Name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
