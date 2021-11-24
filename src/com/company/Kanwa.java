package com.company;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class Kanwa extends JPanel implements MouseInputListener{
    public Kanwa(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
            }
        });
    }
    private int a,b;
    ArrayList points = new ArrayList();

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        a = e.getX();
        b = e.getY();
        points.add(new Point(a,b));
        repaint();

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gra = (Graphics2D) g;
        gra.setColor(Color.BLACK);
        rysujKwa(gra);
    }
    private void rysujKwa(Graphics2D gra){
        int x,y;
        //for (Point p : points){
           // x = (int) p.getX();
           // y = (int) p.getY();
            //gra
        }
    }
}
