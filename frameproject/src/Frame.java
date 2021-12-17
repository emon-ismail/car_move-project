import javax.swing.JFrame;

public class Frame {
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.add(new Board());
        frame.setVisible(true);
    }
}
