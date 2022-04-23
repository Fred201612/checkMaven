package tools;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Keyboard {
    public static void main(String[] args) throws AWTException {

        Robot robot = new Robot();

        move_mouse(516,1062);

        for (int i=1; i<10; i++){
            robot.delay(60000);
            move_mouse(i+500,i+500);

            System.out.println(i + " minutes already");
        }

    }

    public static void move_mouse(int x, int y) throws AWTException {
        Robot robot = new Robot();
        Random random = new Random();

        robot.mouseMove(x, y);

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

}
