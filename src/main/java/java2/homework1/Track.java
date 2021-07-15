package java2.homework1;

public class Track implements Оbstacles {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean obstacles(Participants participant) {
        if (participant.run(this.length)) {return true;} else {return false;}
    }
}


