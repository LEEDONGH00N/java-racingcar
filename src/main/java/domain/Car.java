package domain;

public class Car {
    private String name;

    private String moved;
    public Car(String name) {
        this.name = name;
        this.moved = "-";
    }

    public String getName() {
        return name;
    }

    public String getMoved() {
        return moved;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoved(String moved) {
        this.moved = moved;
    }
}
