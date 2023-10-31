import view.Car;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        Car car = new Car();
        jFrame.add(car);
        jFrame.setSize(900, 800);
        jFrame.setVisible(true);
    }
}
