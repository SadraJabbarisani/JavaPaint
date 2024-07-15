package PaintPackage;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape{
    public static int shapeNumber;
    public Point center;
    public int radius;
    
    public Circle() {
        super();
        name = "Circle_" + shapeNumber;
        shapeNumber++;
        this.center = new Point();
        this.radius = 1;
        
    }

    public Circle(Point center, int radius, Color borderColor, Color fillColor, boolean isFill) {
        super(borderColor,fillColor,isFill);
        name = "Circle_" + shapeNumber;
        shapeNumber++;
        this.center = center;
        this.radius = radius;
        
    }
    
    public void draw(Graphics myGr) {
        myGr.setColor(borderColor);
        myGr.drawOval(center.getX()-radius, center.getY()-radius, 2*radius, 2*radius);
        if(isFill){
            myGr.setColor(fillColor);
            myGr.fillOval(center.getX()-radius, center.getY()-radius, 2*radius, 2*radius);
        }
        System.out.printf("%s draw at %s with radius %d\n", name, center, radius);
    }

    public void move(int xMove, int yMove) {
        center.setX(center.getX() + xMove);
        center.setY(center.getY() + yMove);
        
    }
    
    public void scale(int amount){
            radius += amount;
    }
    
    public void erase(){
        System.out.printf("%s erased\n",name);
    }
    
    public boolean hit(Point p){
        return center.distance(p)<= radius;
    }

    
    
}
