package java2.homework1;

public class Wall implements Оbstacles{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean obstacles(Participants participant) {
        if (participant.jump(this.height)) {return true;} else {return false;}
    }
}
