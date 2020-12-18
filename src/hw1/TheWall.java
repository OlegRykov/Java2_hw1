package hw1;

public class TheWall implements Obstaclesable {
    private double theWallHeight;

    public TheWall(double theWallHeight) {
        this.theWallHeight = theWallHeight;
    }

    @Override
    public void obstacleCourse(Participantable p) {
        p.jump(theWallHeight);
    }
}
