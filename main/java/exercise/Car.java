package exercise;

public class Car {
    int noofwheeels;
    int noofdoors;
    int maxspeed;
    String name;
    String modalNO;
    String compunyname;

    public Car(int noofwheeels, int noofdoors, int maxspeed, String name, String modalNO, String compunyName) {
        this.noofwheeels = noofwheeels;
        this.noofdoors = noofdoors;
        this.maxspeed = maxspeed;
        this.compunyname = compunyname;
        this.modalNO = modalNO;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noofwheeels=" + noofwheeels +
                ", noofdoors=" + noofdoors +
                ", maxspeed=" + maxspeed +
                ", name='" + name + '\'' +
                ", modalNO='" + modalNO + '\'' +
                ", compunyname='" + compunyname + '\'' +
                '}';
    }

    public static void main(String[] args) {
    Car swift = new Car(4,4,100,"swift","S2000","maruti");
        System.out.println(swift);
    }
}
