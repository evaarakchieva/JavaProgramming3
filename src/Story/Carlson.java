package Story;

import java.util.Random;

public class Carlson extends Human implements Spin, Examine, Appear,Close,Open {
    Carlson(String name, int age, double height) {
        super(name, age, height);
        System.out.println("Создан персонаж " + this.getName());
    }

    public String toString() {
        String var10000 = this.getName();
        return "Имя персонажа: " + var10000 + ", Возраст персонажа: " + this.getAge() + ", Рост персонажа: " + this.getHeight();
    }
    public void appear(){
        System.out.println(this.getName() + " появился");
    }

    public void spin(){
        Carlson.TalkingCondition talk = Carlson.TalkingCondition.TALKING;
        Random random = new Random();
        int i = random.nextInt(2);
        switch(i) {
            case 0:
                talk = Carlson.TalkingCondition.TALKING;
                break;
            case 1:
                talk = Carlson.TalkingCondition.NOT_TALKING;
                break;
        }
        if(talk.action.equals("разговаривая")){    System.out.println(this.getName() + " кружит по комнате"+ ", " + talk.action);}
    }

    public void examine(Item obj){
        Carlson.MentalState feelings = Carlson.MentalState.INTERESTED;
        Random random = new Random();
        int i = random.nextInt(2);
        switch(i) {
            case 0:
                feelings = Carlson.MentalState.INTERESTED;
                break;
            case 1:
                feelings = Carlson.MentalState.CURIOUS;
                break;
        }
        System.out.println(this.getName() + " рассматривает " + obj.getName() + " " + feelings.label);
    }
    public void open(Item obj){
        System.out.println(this.getName() + " открывает " + obj.getName() );
    }
    public void close(Item obj){
        System.out.println(this.getName() + " закрывает " + obj.getName() );
    }

    @Override
    public void examine() {

    }

    @Override
    public void close() {

    }

    @Override
    public void open() {

    }

    public enum MentalState {
        INTERESTED("с интересом"),
        CURIOUS("с любопытством");
        private final String label;

        MentalState (String label) {
            this.label = label;
        }
    }
    public enum TalkingCondition {
        TALKING("разговаривая"),
        NOT_TALKING("не разговаривая");
        private final String action;
        TalkingCondition(String action){
            this.action = action;
        }
    }
}
