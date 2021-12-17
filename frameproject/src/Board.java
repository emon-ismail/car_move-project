import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Board extends JPanel implements ActionListener   {
    Image backgroundImage;
    Car car;
    Timer time;
    Board(){
         ImageIcon imageIcon1 =new ImageIcon("Emon.jpeg");
         backgroundImage=imageIcon1.getImage();
         time=new Timer(5,this);
         time.start();
         setFocusable(true);
         car=new Car();
         addKeyListener(new KeyAdapter() {
             @Override
             public void keyPressed(KeyEvent e) {
                 super.keyPressed(e);
                 if(e.getKeyCode()==37){
                     car.x = car.x-5;

                 }
                 if(e.getKeyCode()==39){
                     car.x=car.x+5;
                 }

             }
         });

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(backgroundImage,0,0,this);
        g.drawImage(car.carImage, car.x,450,this);
    }
    public void actionPerformed(ActionEvent e){
        repaint();
    }

    }

