/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4punto3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

/**
 *
 * @author Usuario Normal
 */
public class Menu extends JFrame {
    JPopupMenu pop= new JPopupMenu();
    JMenuItem verde= new JMenuItem("Verde");
    JMenuItem rojo= new JMenuItem("Rojo");
    JMenuItem azul= new JMenuItem("Azúl");
    JPanel a= new JPanel();
    public Menu() {
        verde.addActionListener(new GestionMenu(a));
        rojo.addActionListener(new GestionMenu(a));
        azul.addActionListener(new GestionMenu(a));
        pop.add(verde);
        pop.add(rojo);
        pop.add(azul);
        a.setComponentPopupMenu(pop);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(a);
        this.setSize(300, 300);
        this.setVisible(true);
    }
    private class GestionMenu implements ActionListener{
        JPanel panel= new JPanel();
        public GestionMenu(JPanel b){
            this.panel=b;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==verde){
                panel.setBackground(Color.green);
            }
            if(e.getSource()==rojo){
                panel.setBackground(Color.red);
            }
            if(e.getSource()==azul){
                panel.setBackground(Color.blue);
            }
        }
}
}
