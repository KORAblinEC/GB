package Lesson1;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Беговая дорожка по имени " + super.getName() + " имеет длину: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("бег пройден");

            return true;
        } else {
            System.out.println("бег не пройден");

            return false;
        }
    }
}
