public class Game {
    long score;


    public void play(){
        System.out.println("游戏开始");
        Border border = new Border();
        border.randomPiece2();
        border.randomPiece2();
        border.print();
    }

    public void over(){
        System.out.println("游戏结束");
    }
}
