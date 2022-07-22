package INTERFACE.CHALLENGE;

public class mainClass {
    public static void main(String[] args) {
        ISaveable monster = new Monster("TIM",1000,10);
        ISaveable player = new Player("ME",200,25);

        System.out.println(monster.toString());
        System.out.println(player.toString());

        //----
    }
}
