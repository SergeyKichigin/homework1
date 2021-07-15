package java2.homework1;

public class Human implements Participants {

    private String name;
    private int maxLength;
    private int maxHeight;

    public Human(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(int length) {
        if (maxLength >= length) {
            System.out.printf("Human %s run %d metters\n", this.name, length);
            return true;
        } else {
            System.out.printf("Human %s didn`t run %d metters. Marathon is over!\n", this.name, length);
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (maxHeight >= height) {
            System.out.printf("Human %s jump %d metters\n", this.name, height);
            return true;
        } else {
            System.out.printf("Human %s didn`t jump %d metters. Marathon is over!\n", this.name, height);
            return false;
        }
    }

}
