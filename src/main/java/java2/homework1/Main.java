package java2.homework1;

public class Main {
    public static void main(String[] args) {
        Participants[] participants = {
                new Cat("Tishka", 350, 10),
                new Cat("Matroskin", 500, 8),
                new Robot("T-800", 10000, 50),
                new Robot("T-1000", 50000, 75),
                new Human("Ivan", 1700, 3),
                new Human("Misha", 2000, 2)
        };

        Оbstacles[] obs = {
                new Track(300),
                new Wall(3),
                new Track(5000),
                new Wall(5),
                new Track(4000),
                new Wall( 70)
        };

        for (Participants p : participants) {
            for (Оbstacles t : obs) {
                if (!t.obstacles(p)) break;
            }
        }



    }
}
