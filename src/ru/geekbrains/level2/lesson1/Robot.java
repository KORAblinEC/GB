package Lesson1;

public class Robot implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Робот по имнеи " + this.name + " пробегает " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Робот по имнеи " + this.name + " прагыет на " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
