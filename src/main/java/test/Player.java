package test;

public class Player {
    private String nickname;
    private static int playersCount;

    private int points;

    private int level;
    private int money;
    public Player(String nickname, int points, int level, int money) {
        this.nickname = nickname.toUpperCase();
        this.points = points;
        this.level = level;
        this.money = money;
        playersCount++;
    }

    public static int getPlayersCount() {
        return playersCount;
    }

    public Player (String nickname){
        this(nickname,0,1,100);
    }
    public Player() {
        this("");
    }

    public void printInfo(){
    System.out.println(String.format("Игрок с именем %s(level: %s) имеет %s очков и %s монет",nickname,level,points,money
    ));


}
}
