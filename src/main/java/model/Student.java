package model;

public class Student {
    private String name;
    private String surname;
    private Byte point;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Byte getPoint() {
        return point;
    }

    public void setPoint(Byte point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + point;
    }
}
