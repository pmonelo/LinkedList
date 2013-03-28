import acm.program.*;
import javax.swing.*;
import acm.gui.*;
import java.awt.event.*;


public class Acm extends Program
{
    public void init()
    {
        JButton pug,shitzu, corgi, bark, sleep, age;
        
        pug= new JButton("Pug");
        shitzu= new JButton("Shitzu");
        corgi= new JButton("Corgi");
        
        JLabel pick = new JLabel("Pick a dog");
        
        JTextField output = new JTextField();
        
        TableLayout t= new TableLayout(4,2);
        
        this.setLayout(t);
        
        this.add(pick);
        this.add(output);
        this.add(corgi);
        this.add(shitzu);
        this.add(pug);
        
        this.addActionListeners();
    }
    }
    
//     public void actionPerformed(ActionEvent event)
//     {
//         String b= event.getActionCommand();
//         
//        if (b.equals("restart"))
//         {
//             System.out.println("Button reset was clicked!");
//             this.e= new EvenOdd();
//             this.start();
//             this.wins.setText("");
//             this.newsettings();
//         }
//         
//         else if (b.equals("p1button1")  && (this.e.gameover() == false))
//     {
//     }
//     }
// 
// }