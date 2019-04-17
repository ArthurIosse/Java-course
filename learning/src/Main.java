import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.swing.*;
import java.awt.*;
import java.util.stream.*;


public class Main {

    public static void main(String[] args) {

//        JFrame window = new JFrame("window");
//        window.setPreferredSize(new Dimension(640,480));
//        window.setMaximumSize(new Dimension(640,480));
//        window.setMinimumSize(new Dimension(640,480));
//        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        window.setVisible(true);
//        window.setResizable(false);

        Tool hammer = new Hammer("Smasher",1.2,"Wooden");

        hammer.makeWork();


    }

}
