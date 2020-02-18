public class GameOfLife{
    private int m_x;
    private int m_y;
    private int m_steps;
    private int m_preset;
    private int m_midX;
    private int m_midY;
    private char[][] board;

    GameOfLife(int x, int y, int steps, int preset){
        m_x = x;
        m_y = y;
        m_steps = steps;
        m_preset = preset;
        m_midX = m_x/2;
        m_midY = m_y/2;

        board = new char[m_y][m_x];
    }

    public void start()throws InterruptedException{
        makeBoard();
        for(int i = 1; i<=m_steps;++i){
            showBoard(i);
            updateBoard();

            Thread.sleep(300);
        }
    }

    private void makeBoard(){
        for(int i = 0; i<board.length; ++i){
            for(int j = 0; j<board[i].length; ++j){
                board[i][j] = '.';
            }
            if(m_preset == 0){
                random();
            }
            else if(m_preset == 1){
                boat();
                
            }
            else if(m_preset == 2){
                blinker();
            }
            else if(m_preset == 3){
                spaceship();
            }
            else{
                System.out.println("Podano zly preset");
                return;
            }
        }
    }

    private void boat(){
        board[m_midY-1][m_midX] = 'X';
        board[m_midY+1][m_midX] = 'X';
        board[m_midY][m_midX-1] = 'X';
        board[m_midY][m_midX+1] = 'X';
        board[m_midY-1][m_midX-1] = 'X';
    }
    private void blinker(){
        board[m_midY][m_midX] = 'X';
        board[m_midY-1][m_midX] = 'X';
        board[m_midY+1][m_midX] = 'X';
    }
    private void spaceship(){
        board[m_midY-1][m_midX-1] = 'X';
        board[m_midY-1][m_midX+1] = 'X';
        board[m_midY-1][m_midX] = 'X';
        board[m_midY+1][m_midX] = 'X';
        board[m_midY][m_midX-1] = 'X';
    }

    private void random(){
        for(int i = 0; i< board.length; ++i){
            for(int j =0; j< board[i].length; ++j){
                if(Math.random() > 0.5){
                    board[i][j] = 'X';
                }
                else{
                    board[i][j] = '.';
                }
            }
        }
    }

    private void showBoard(int steps){
        for(int i = 0; i<board.length;++i){
            if(i == board.length/2){
                System.out.print(steps);
            }
            else{
                System.out.print('-');
            }
        }
        System.out.println();
        for(int i = 0; i<board.length; ++i){
            for(int j=0; j<board[i].length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private void updateBoard(){
        int neighbours = 0;
        char tmp[][] = copyOfArray(board);
        for(int i = 0; i<board.length; ++i){
            for(int j =0; j<board[i].length; j++){
                neighbours = countNeighbours(j,i);
                if(neighbours == 3 && board[i][j] == '.'){
                    tmp[i][j] = 'X';
                }
                if(neighbours > 3 && board[i][j]=='X'){
                    tmp[i][j] = '.';
                }
                if(neighbours < 2 && board[i][j]=='X'){
                    tmp[i][j] = '.';
                }
            }
            
        }
        board = copyOfArray(tmp);
    }

    private int countNeighbours(int x, int y){
        int count = 0;
        for(int i = y-1; i<=y+1; ++i){
            for(int j = x-1; j<=x+1; ++j){
                if(i<0 || j<0){
                    continue;
                }
                if(i>=m_y || j>=m_x){
                    continue;
                }
                else if(board[i][j] == 'X'){
                    count++;
                }
            }
        }
        if(board[y][x] == 'X'){
            --count;
        }
        return count;
    }

    private char[][] copyOfArray(char[][] array){
        char[][] cpy = new char[array.length][];
        for(int i = 0; i<array.length; ++i){
            for(int j=0; j<array[i].length ; ++j){
                cpy[i] = array[i].clone();
            }
        }
        return cpy;
    }
}