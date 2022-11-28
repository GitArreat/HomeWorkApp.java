package test;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("карина", 2000, 80,555);
        Player player2 = new Player("OLEG", 500, 60,3423);
        System.out.println("Всего игроков : " + Player.getPlayersCount());
        Player player3 = new Player("alex");
        System.out.println("Всего игроков : " + Player.getPlayersCount());


        player1.printInfo();
        player2.printInfo();
        player3.printInfo();

//        Player[] players = {player1,player2,player3};
//        for (int i = 0; i < players.length; i++) {
//            System.out.println();
//
//        }


    }
}
