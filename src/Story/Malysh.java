package Story;

public class Malysh extends Human implements WaitForSomebody, LookOutOfTheWindow {
    Malysh(String name, int age, double height) {
        super(name, age, height);
        System.out.println("Создан персонаж " + this.getName());
    }

    public String toString() {
        String var10000 = this.getName();
        return "Имя персонажа: " + var10000 + ", Возраст персонажа: " + this.getAge() + ", Рост персонажа: " + this.getHeight();
    }

    public void waitForSb (Human obj){
        System.out.println(this.getName() + " ждет " + obj.getName() + "a");
    }
    public void lookOutTheWindow(Window obj){
        System.out.println(this.getName() + " высунул нос в " + obj.getName());
    }

    @Override
    public void waitForSb() { }

    @Override
    public void lookOutOfTheWindow() { }
}

