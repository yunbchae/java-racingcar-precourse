package domain;

public class RaceReport {

    CarName carName;
    Position position;

    public RaceReport(Car car) {
        this.carName = car.getName();
        this.position = car.getPosition();
    }

    public String render() {
        String name = this.carName.getName();
        int position = this.position.getPosition();
        StringBuilder sb = new StringBuilder(name + " : ");
        for (int i=0; i<position; ++i) {
            sb.append("-");
        }
        return sb.toString();
    }
}
