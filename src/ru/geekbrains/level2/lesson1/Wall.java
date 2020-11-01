package Lesson1;

public class Wall extends Barrier {

    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Стена по имени " + super.getName() + " имеет высоту: " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("прыжок выполнен");

            return true;
        } else {
            System.out.println("прыжок не выполнен");

            return false;
        }
    }
}
