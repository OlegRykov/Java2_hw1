package hw1;

public class Cat implements Participantable {
    private String name;
    private int maxDistance;
    private double maxJumpHeight;
    private boolean canDo;

    public Cat(String name, int maxDistance, double maxJumpHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.canDo = true;
    }

    @Override
    public void jump(double theWallHeight) {
        if (canDo == true) {
            System.out.println("Cat " + name + " jump...");
            if (maxJumpHeight >= theWallHeight){
                System.out.println("Cat " + name + " was able to jump over an obstacle.");
            }else {
                System.out.println("Cat " + name + " couldn't jump an obstacle.");
                canDo = false;
            }
        }
    }

    @Override
    public void run(int treadmillLength) {
        if (canDo == true){
            System.out.println("Cat " + name + " run...");
            if (maxDistance >= treadmillLength){
                System.out.println("Cat " + name + " was able to run through an obstacle");
            }else {
                System.out.println("Cat " + name + " couldn't run the obstacle");
                canDo = false;
            }
        }
    }
}
