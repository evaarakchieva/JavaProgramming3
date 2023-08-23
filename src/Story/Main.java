package Story;

public class Main {
    public static void main(String[] args) {
        Malysh baby = new Malysh("Малыш",7,140.0D);
        Carlson carl = new Carlson("Карлсон", 36, 100.0D);
        Window window1 = new Window ("окошко", "пластмасса");
        Box box = new Box("ящик", "дерево");
        baby.waitForSb(carl);
        baby.lookOutTheWindow(window1);
        carl.appear();
        carl.spin();
        carl.open(box);
        carl.examine(box);
        carl.close(box);
    }
}