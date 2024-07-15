package PaintPackage;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape{
    public static int shapeNumber;
    public Point p1, p2;
    public int distance;
    

    public Square() {
        super();
        name = "Square_" + shapeNumber;
        shapeNumber++;
        p1 = new Point();
        p2 = new Point();
        distance = (int)p1.distance(p2);
    }

    public Square(Point p1, Point p2, Color borderColor,Color fillColor, boolean isFill) {
        super(borderColor,fillColor,isFill);
        name = "Square_" + shapeNumber;
        shapeNumber++;
        this.p1 = p1;
        this.p2 = p2;
        distance = (int)p1.distance(p2);
    }
    
    public void draw(Graphics myGr) {
        myGr.setColor(borderColor);
        myGr.drawRect(p1.getX()-distance - 1, p1.getY()-distance - 1, 2*distance + 1, 2*distance + 1);
        if(isFill){
            myGr.setColor(fillColor);
            myGr.fillRect(p1.getX()-distance, p1.getY()-distance, 2*distance, 2*distance);           
        }
        System.out.printf("%s draw at %s -> %s\n", name, p1, p2);
    }

    public void move(int xMove, int yMove) {
        p1.setX(p1.getX() + xMove);
        p1.setY(p1.getY() + yMove);
        p2.setX(p2.getX() + xMove);
        p2.setY(p2.getY() + yMove);

    }
    
    public void scale (int amount){
//        p1.setX(p1.getX()-(amount/2));
//        p1.setY(p1.getY()-(amount/2));
//        p2.setX(p2.getX()+(amount/2));
//        p2.setY(p2.getY()+(amount/2));
//        distance = (int)p1.distance(p2);
        distance += amount;
    }
    
    
    public void erase(){
        System.out.printf("%s erased\n",name);
    }
    
    public boolean hit(Point p){
        return p.getX() >= p1.getX()-distance && p.getX() <= p1.getX()+distance 
                && p.getY() >= p1.getY()-distance && p.getY() <= p1.getY()+distance;
    }

}
