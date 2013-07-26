package cn.wangxing;

import com.sun.org.apache.xerces.internal.impl.msg.XMLMessageFormatter_it;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 13-7-25.
 */
public class Game {

    private static int[][] board = new  int[5][5];
    private static int m = board[0][0];
    private int i1 = 0, i2 = 0, i3 = 0,i4 = 0 ,i5 = 0,i6 = 0;


    public void setBoard(){

        Random random = new Random();
        Game game = new Game();
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[i].length ; j++) {
                game.board[i][j] = random.nextInt(6);
                System.out.print(game.board[i][j] + "  ");
            }
            System.out.println();

        }

    }

    public void start(){

        for (int j = 1; j < board[i1].length ; j++) {
            if(board[i1][j] !=board[i1][j-1]){
                break;
            }
            i1 = j-1;
        }
        System.out.println("i1  "+i1);

        for (int j = 0; j <= i1; j++) {
            for (int k = 1; k < board[i1].length; k++) {
                if(board[k][i1] !=board[k-1][i1]){
                    break;
                }
                i2 = j;
                i3 = k;
            }

        }
        System.out.print("i3  " + i3 + "  ");
        System.out.println("i2  "+i2);
        for (int i = 1; i <= i2; i++) {
            for (int j = 1; j < board[i].length ; j++) {
                if(board[i][j] !=board[i][j-1]){
                    break;
                }
                i4 = i;
                i5 = j;
            }
        }
        System.out.print("i4  " + i4 + "   ");
        System.out.println("i5  "+i5);
    }

    public void iuput(){

        boolean b = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("iuput n :");
        int n = scanner.nextInt();
        while(b = false){
            if (n == m){
                n = scanner.nextInt();
            } else {
                b = true;
            }
        }


    }

    public static void main(String[] args) {

        Game game = new Game();
        int[][] board = {{1,1,1,},{1,1,2},{2,2,2}};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();

        }
        game.start();


    }


}

