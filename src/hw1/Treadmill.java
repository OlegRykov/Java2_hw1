package hw1;

public class Treadmill implements Obstaclesable {
    private int treadmillLength;

    public Treadmill(int treadmillLength) {
        this.treadmillLength = treadmillLength;
    }

    @Override
    public void obstacleCourse(Participantable p) {
        p.run(treadmillLength);
    }
}
