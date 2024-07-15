package PaintPackage;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangl extends Shape{
    public static int shapeNumber;
    public Point p1, p2;
    private double teta;
    

    public Rectangl() {
        super();
        name = "Rectangle_" + shapeNumber;
        shapeNumber++;
        p1 = new Point();
        p2 = new Point();
        setPoints();
        
    }

    public Rectangl(Point p1, Point p2, Color borderColor,Color fillColor, boolean isFill) {
        super(borderColor,fillColor,isFill);
        name = "Rectangle_" + shapeNumber;
        shapeNumber++;
        this.p1 = p1;
        this.p2 = p2;
        setPoints();
        
    }
    
    public void draw(Graphics myGr) {
        //setPoints();
        myGr.setColor(borderColor);
        myGr.drawRect(p1.getX()-1, p1.getY()-1, p2.getX() - p1.getX() + 1, p2.getY() - p1.getY() + 1);
        if(isFill){
            myGr.setColor(fillColor);
            myGr.fillRect(p1.getX(), p1.getY(), p2.getX() - p1.getX(), p2.getY() - p1.getY());            
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
        amount *= 100000;
        p2.addX((int)(amount * Math.cos(teta)) / 200000 );
        p2.addY((int)(amount * Math.sin(teta)) / 200000 );  
        p1.addX((int)(amount * Math.cos(teta)) /-200000 ); 
        p1.addY((int)(amount * Math.sin(teta)) /-200000 );
    }
    
    public void erase(){
        System.out.printf("%s erased\n",name);
    }
    
    public boolean hit(Point p){
        return p.getX() >= p1.getX() && p.getX() <= p2.getX() 
                && p.getY() >= p1.getY() && p.getY() <= p2.getY();
    }
    
    private void setPoints(){
        int save;
        if(p1.getX()> p2.getX()){
            save = p1.getX();
            p1.setX(p2.getX());
            p2.setX(save);
        }
        
        if(p1.getY()> p2.getY()){
            save = p1.getY();
            p1.setY(p2.getY());
            p2.setY(save);
        }
        
        double y = p2.getY() - p1.getY();
        double x = p2.getX() - p1.getX();
        
        teta = Math.atan(y / x);
        //System.out.println("teta: " + teta);     //for debug
    }

}
