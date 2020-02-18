public class lab04{
    public static void main(String args[])throws InterruptedException{
        int size_x = Integer.parseInt(args[0]);
        int size_y = Integer.parseInt(args[1]);
        int steps = Integer.parseInt(args[2]);
        int preset = Integer.parseInt(args[3]);

        GameOfLife game = new GameOfLife(size_x, size_y,steps, preset);

        game.start();
    }
}