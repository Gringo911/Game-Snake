package game;

/**
 * Created by ВАСЯ on 26.10.2018.
 */
import javax.swing.*;


public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(340,370);
        setResizable(false);
        setLocation(300,200);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {



        MainWindow mw = new MainWindow();
    }
}