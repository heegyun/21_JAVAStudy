package my.day09;

public abstract class PlayerLevel {

    //템플릿 메소드
    public void go(int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }

    abstract  void run();
    abstract  void jump();
    abstract void turn();

    abstract void showLevelMessage();
}
