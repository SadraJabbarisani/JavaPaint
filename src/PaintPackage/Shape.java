package PaintPackage;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    public String name;
    public Color borderColor;
    public Color fillColor;
    public boolean isFill;

    public Shape() {      
        borderColor = Color.black;
        fillColor = Color.white;
        isFill = false;
    }

    public Shape(Color borderColor, Color fillColor, boolean isFill) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.isFill = isFill;
    }
    
    
    public abstract void draw(Graphics myGr);
    
    public abstract void move(int xMove, int yMove);
    
    public abstract void scale(int amount);
    
    public abstract void erase();
    
    public abstract boolean hit(Point p);
    
    public static Point scalePoint (Point p, Point c, double k){
        double teta, x, y;
        int OPx, OPy;
        
        y = c.distance(c.getX(),p.getY());
        x = c.distance(p.getX(),c.getY());
        teta = Math.atan(y/x); 
        
        OPx = (int)(c.distance(p) * (1+k) * Math.cos(teta)); //System.out.println(OPx);   //for debug
        OPy = (int)(c.distance(p) * (1+k) * Math.sin(teta)); //System.out.println(OPy);
        
        if (c.getX() > p.getX())
            OPx *= -1;
        
        if (c.getY() > p.getY())
            OPy *= -1;
        
        return new Point(c.getX() + OPx, c.getY() + OPy);
    }

}
