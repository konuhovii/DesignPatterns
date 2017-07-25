package proxy.virtual;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        JFrame frame = new JFrame("Yohoho!!!");
        URL initialURL = new URL("http://girlstop-extra.info/cat/posts/241y/8.jpg");
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(800, 600);
        frame.getContentPane().add(imageComponent);
        frame.setVisible(true);
    }
}
