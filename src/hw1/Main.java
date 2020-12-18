package hw1;

public class Main {
    public static void main(String[] args) {
        Participantable[] participant = {
                new Human("Oleg", 80, 3.5),
                new Cat("Garfield", 100, 5),
                new Robot("Terminator", 65, 3)
        };

        Obstaclesable[] obstacles = {
                new TheWall(2.5),
                new TheWall(3),
                new Treadmill(70),
                new TheWall(3.5),
                new Treadmill(90),
                new TheWall(4)
        };

        for (int i = 0; i < obstacles.length; i++) {
            for (int j = 0; j < participant.length; j++) {
                obstacles[i].obstacleCourse(participant[j]);
            }
        }
    }
}
