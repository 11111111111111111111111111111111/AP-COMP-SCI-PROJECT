import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;



public class Game extends Applet implements ActionListener,KeyListener
{
    private int x=1000;
    private int y=475;      //PLAYER
    
    private int x1=721;
    private int y1=300;     //NEUTRAL ENTITY
    
    private int xinc=2;
    private int yinc=1;     //MOVEMENT INCREMENTS
    private int xinc2=2;
    private int yinc2=3;
    private int xinc1=3;
    private int yinc1=2;  
    
    private int x2=341;    
    private int y2=274;
                             //ENEMIES
    private int x3=329;
    private int y3=489;
    
    private int page=0;       //PAGES(LEVELS)
    
    private int ctr=0;
    private boolean up=false;
    private boolean down=false;
    private boolean left=false;         //MOVEMENT
    private boolean right=false;
    
    
    private Timer timer;
    public void init()
    {
        int x1=200;
        int x2=200;
        int xinc=10;
        int yinc=10;
                      
        
        timer=new Timer(10,this);
        timer.start();
        
        page=0;
        
        ctr=0;
        addKeyListener(this);
        requestFocus();
    }
    
    public void actionPerformed(ActionEvent ae){
        repaint();
    }
           
    public void keyPressed(KeyEvent evt){
       int z=evt.getKeyCode();
        switch(z){
            case(KeyEvent.VK_UP):;
            up=true;
            break;
            case(KeyEvent.VK_DOWN):;
            down=true;
            break;                      //CONTROL KEYS
            case(KeyEvent.VK_LEFT):;
            left=true;
            break;
            case(KeyEvent.VK_RIGHT):;
            right=true; 
            break;         
            case(KeyEvent.VK_SPACE):;
            page=1;
            break;
       }
       repaint();
    }
    
    public void keyReleased(KeyEvent evt){
        int w=evt.getKeyCode(); 
        switch(w){
            case(KeyEvent.VK_UP):;
            up=false;
            break;
            case(KeyEvent.VK_DOWN):;
            down=false;                     //CONTROL KEYS
            break;
            case(KeyEvent.VK_LEFT):;
            left=false;
            break;
            case(KeyEvent.VK_RIGHT):;
            right=false;
            break;
        }
        repaint();
    }
    
    public void keyTyped(KeyEvent evt){
    
    }
    
    public void paint(Graphics g)
    {
      if(page==0){
        int w=getWidth();
        int h=getHeight();
          
        g.setColor(Color.GREEN);
        g.fillRect(0,0,w,h);
        g.setColor(ColorLibChen.LEAFGREENac()); //title screen
        g.fillRect(40,40,w-80,h-80);
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman" ,Font.PLAIN,50));
        g.drawString("<TITLE>",w/2-100,h/2);
        g.drawString("Press SPACE to start",w/2-100,h/2+60);
      }
      
        
        
        if(page==1){
        int w=getWidth();
        int h=getHeight();
        
      
        
        g.setColor(Color.GREEN);
        g.fillRect(0,0,w,h);
        g.setColor(ColorLibChen.LEAFGREENac()); //background
        g.fillRect(40,40,w-80,h-80);
        g.setColor(Color.RED);                  //background props
        g.drawString("PLAY IN THIS SCREEN SIZE",20,20);
        
        g.setColor(Color.BLUE); //player
        g.fillRect(x,y,20,20);
        
        //LEVEL 1
        if(x==x1+20 && y1==y || x1==x+20 && y1==y || y==y1+20 && x1==x || y1==y+20 && x1==x){
            x1=0;
            y1=0;               //ENEMY MOVEMENT
            enemy1(g,x1,y1);
        }
        else if(x==x1+20 && y1==y+1 || x1==x+20 && y1==y+1 || y==y1+20 && x1==x+1 || y1==y+20 && x1==x+1){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
        else if(x==x1+20 && y1==y+2 || x1==x+20 && y1==y+2 || y==y1+20 && x1==x+2 || y1==y+20 && x1==x+2){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+3 || x1==x+20 && y1==y+3 || y==y1+20 && x1==x+3 || y1==y+20 && x1==x+3){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+4 || x1==x+20 && y1==y+4 || y==y1+20 && x1==x+4 || y1==y+20 && x1==x+4){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+5 || x1==x+20 && y1==y+5 || y==y1+20 && x1==x+5 || y1==y+20 && x1==x+5){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+6 || x1==x+20 && y1==y+6 || y==y1+20 && x1==x+6 || y1==y+20 && x1==x+6){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+7 || x1==x+20 && y1==y+7 || y==y1+20 && x1==x+7 || y1==y+20 && x1==x+7){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+8 || x1==x+20 && y1==y+8 || y==y1+20 && x1==x+8 || y1==y+20 && x1==x+8){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+9 || x1==x+20 && y1==y+9 || y==y1+20 && x1==x+9 || y1==y+20 && x1==x+9){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+10 || x1==x+20 && y1==y+10 || y==y1+20 && x1==x+10 || y1==y+20 && x1==x+10){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+11 || x1==x+20 && y1==y+11 || y==y1+20 && x1==x+11 || y1==y+20 && x1==x+11){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+12 || x1==x+20 && y1==y+12 || y==y1+20 && x1==x+12 || y1==y+20 && x1==x+12){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+13 || x1==x+20 && y1==y+13 || y==y1+20 && x1==x+13 || y1==y+20 && x1==x+13){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+14 || x1==x+20 && y1==y+14 || y==y1+20 && x1==x+14 || y1==y+20 && x1==x+14){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+15 || x1==x+20 && y1==y+15 || y==y1+20 && x1==x+15 || y1==y+20 && x1==x+15){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+16 || x1==x+20 && y1==y+16 || y==y1+20 && x1==x+16 || y1==y+20 && x1==x+16){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+17 || x1==x+20 && y1==y+17 || y==y1+20 && x1==x+17 || y1==y+20 && x1==x+17){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+18 || x1==x+20 && y1==y+18 || y==y1+20 && x1==x+18 || y1==y+20 && x1==x+18){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+19 || x1==x+20 && y1==y+19 || y==y1+20 && x1==x+19 || y1==y+20 && x1==x+19){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y+20 || x1==x+20 && y1==y+20 || y==y1+20 && x1==x+20 || y1==y+20 && x1==x+20){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y-1 || x1==x+20 && y1==y-1 || y==y1+20 && x1==x-1 || y1==y+20 && x1==x-1){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y-2 || x1==x+20 && y1==y-2 || y==y1+20 && x1==x-2 || y1==y+20 && x1==x-2){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y-3 || x1==x+20 && y1==y-3 || y==y1+20 && x1==x-3 || y1==y+20 && x1==x-3){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y-4 || x1==x+20 && y1==y-4 || y==y1+20 && x1==x-4 || y1==y+20 && x1==x-4){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y-5 || x1==x+20 && y1==y-5 || y==y1+20 && x1==x-5 || y1==y+20 && x1==x-5){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y-6 || x1==x+20 && y1==y-6 || y==y1+20 && x1==x-6 || y1==y+20 && x1==x-6){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y-7 || x1==x+20 && y1==y-7 || y==y1+20 && x1==x-7 || y1==y+20 && x1==x-7){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y-8 || x1==x+20 && y1==y-8 || y==y1+20 && x1==x-8 || y1==y+20 && x1==x-8){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y-9 || x1==x-20 && y1==y-9 || y==y1+20 && x1==x-9 || y1==y+20 && x1==x-9){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
         else if(x==x1+20 && y1==y-10 || x1==x+20 && y1==y-10 || y==y1+20 && x1==x-10 || y1==y+20 && x1==x-10){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
        else if(x==x1+20 && y1==y-11 || x1==x+20 && y1==y-11 || y==y1+20 && x1==x-11 || y1==y+20 && x1==x-11){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
        else if(x==x1+20 && y1==y-12 || x1==x+20 && y1==y-12 || y==y1+20 && x1==x-12 || y1==y+20 && x1==x-12){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
        else if(x==x1+20 && y1==y-13 || x1==x+20 && y1==y-13 || y==y1+20 && x1==x-13 || y1==y+20 && x1==x-13){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }else if(x==x1+20 && y1==y-14 || x1==x+20 && y1==y-14 || y==y1+20 && x1==x-14 || y1==y+20 && x1==x-14){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
        else if(x==x1+20 && y1==y-15 || x1==x+20 && y1==y-15 || y==y1+20 && x1==x-15 || y1==y+20 && x1==x-15){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }else if(x==x1+20 && y1==y-16 || x1==x+20 && y1==y-16 || y==y1+20 && x1==x-16 || y1==y+20 && x1==x-16){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
        else if(x==x1+20 && y1==y-17 || x1==x+20 && y1==y-17 || y==y1+20 && x1==x-17 || y1==y+20 && x1==x-17){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
          else if(x==x1+20 && y1==y-18 || x1==x+20 && y1==y-18 || y==y1+20 && x1==x-18 || y1==y+20 && x1==x-18){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
          else if(x==x1+20 && y1==y-19 || x1==x+20 && y1==y-19 || y==y1+20 && x1==x-19 || y1==y+20 && x1==x-19){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
          else if(x==x1+20 && y1==y-20 || x1==x+20 && y1==y-20 || y==y1+20 && x1==x-20 || y1==y+20 && x1==x-20){
            x1=0;
            y1=0;
            enemy1(g,x1,y1);
        }
        else{
            enemy1(g,x1,y1);
            x1+=xinc;        //enemy movement
            y1+=yinc;
        }
        
        g.setColor(Color.BLACK);
        g.fillRect(x2,y2,20,20);
        
        
          if(x==x2+20 && y2==y || x2==x+20 && y2==y || y==y2+20 && x2==x || y2==y+20 && x2==x){
            x2=0;
            y2=0;               //ENEMY MOVEMENT
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y+1 || x2==x+20 && y2==y+1 || y==y2+20 && x2==x+1 || y2==y+20 && x2==x+1){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y+2 || x2==x+20 && y2==y+2 || y==y2+20 && x2==x+2 || y2==y+20 && x2==x+2){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+3 || x2==x+20 && y2==y+3 || y==y2+20 && x2==x+3 || y2==y+20 && x2==x+3){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+4 || x2==x+20 && y2==y+4 || y==y2+20 && x2==x+4 || y2==y+20 && x2==x+4){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+5 || x2==x+20 && y2==y+5 || y==y2+20 && x2==x+5 || y2==y+20 && x2==x+5){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+6 || x2==x+20 && y2==y+6 || y==y2+20 && x2==x+6 || y2==y+20 && x2==x+6){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+7 || x2==x+20 && y2==y+7 || y==y2+20 && x2==x+7 || y2==y+20 && x2==x+7){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+8 || x2==x+20 && y2==y+8 || y==y2+20 && x2==x+8 || y2==y+20 && x2==x+8){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+9 || x2==x+20 && y2==y+9 || y==y2+20 && x2==x+9 || y2==y+20 && x2==x+9){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+10 || x2==x+20 && y2==y+10 || y==y2+20 && x2==x+10 || y2==y+20 && x2==x+10){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+11 || x2==x+20 && y2==y+11 || y==y2+20 && x2==x+11 || y2==y+20 && x2==x+11){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+12 || x2==x+20 && y2==y+12 || y==y2+20 && x2==x+12 || y2==y+20 && x2==x+12){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+13 || x2==x+20 && y2==y+13 || y==y2+20 && x2==x+13 || y2==y+20 && x2==x+13){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+14 || x2==x+20 && y2==y+14 || y==y2+20 && x2==x+14 || y2==y+20 && x2==x+14){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+15 || x2==x+20 && y2==y+15 || y==y2+20 && x2==x+15 || y2==y+20 && x2==x+15){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+16 || x2==x+20 && y2==y+16 || y==y2+20 && x2==x+16 || y2==y+20 && x2==x+16){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+17 || x2==x+20 && y2==y+17 || y==y2+20 && x2==x+17 || y2==y+20 && x2==x+17){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+18 || x2==x+20 && y2==y+18 || y==y2+20 && x2==x+18 || y2==y+20 && x2==x+18){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+19 || x2==x+20 && y2==y+19 || y==y2+20 && x2==x+19 || y2==y+20 && x2==x+19){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+20 || x2==x+20 && y2==y+20 || y==y2+20 && x2==x+20 || y2==y+20 && x2==x+20){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-1 || x2==x+20 && y2==y-1 || y==y2+20 && x2==x-1 || y2==y+20 && x2==x-1){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-2 || x2==x+20 && y2==y-2 || y==y2+20 && x2==x-2 || y2==y+20 && x2==x-2){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-3 || x2==x+20 && y2==y-3 || y==y2+20 && x2==x-3 || y2==y+20 && x2==x-3){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-4 || x2==x+20 && y2==y-4 || y==y2+20 && x2==x-4 || y2==y+20 && x2==x-4){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-5 || x2==x+20 && y2==y-5 || y==y2+20 && x2==x-5 || y2==y+20 && x2==x-5){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-6 || x2==x+20 && y2==y-6 || y==y2+20 && x2==x-6 || y2==y+20 && x2==x-6){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-7 || x2==x+20 && y2==y-7 || y==y2+20 && x2==x-7 || y2==y+20 && x2==x-7){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-8 || x2==x+20 && y2==y-8 || y==y2+20 && x2==x-8 || y2==y+20 && x2==x-8){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-9 || x2==x-20 && y2==y-9 || y==y2+20 && x2==x-9 || y2==y+20 && x2==x-9){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-10 || x2==x+20 && y2==y-10 || y==y2+20 && x2==x-10 || y2==y+20 && x2==x-10){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y-11 || x2==x+20 && y2==y-11 || y==y2+20 && x2==x-11 || y2==y+20 && x2==x-11){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y-12 || x2==x+20 && y2==y-12 || y==y2+20 && x2==x-12 || y2==y+20 && x2==x-12){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y-13 || x2==x+20 && y2==y-13 || y==y2+20 && x2==x-13 || y2==y+20 && x2==x-13){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }else if(x==x2+20 && y2==y-14 || x2==x+20 && y2==y-14 || y==y2+20 && x2==x-14 || y2==y+20 && x2==x-14){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y-15 || x2==x+20 && y2==y-15 || y==y2+20 && x2==x-15 || y2==y+20 && x2==x-15){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }else if(x==x2+20 && y2==y-16 || x2==x+20 && y2==y-16 || y==y2+20 && x2==x-16 || y2==y+20 && x2==x-16){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y-17 || x2==x+20 && y2==y-17 || y==y2+20 && x2==x-17 || y2==y+20 && x2==x-17){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
          else if(x==x2+20 && y2==y-18 || x2==x+20 && y2==y-18 || y==y2+20 && x2==x-18 || y2==y+20 && x2==x-18){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
          else if(x==x2+20 && y2==y-19 || x2==x+20 && y2==y-19 || y==y2+20 && x2==x-19 || y2==y+20 && x2==x-19){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
          else if(x==x2+20 && y2==y-20 || x2==x+20 && y2==y-20 || y==y2+20 && x2==x-20 || y2==y+20 && x2==x-20){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else{
            enemy2(g,x2,y2);
            x2+=xinc1;        //enemy movement
            y2+=yinc1;
        }
        if(x1==0 && y1==0){
            page=2;         //NEXT STAGE
            int x1=250;
            int y1=100;
        }
        if(x2==0 && y2==0){
            page=3;         //GAME OVER
        }
        
             
        // player movements
        if(up){
            y-=3;
        }
        if(down){
            y+=3;
        }
        if(left){
            x-=3;
        }
        if(right){
            x+=3;
        }
        
        //player movement restrictions
        if(x<40){
            x=41;
        }
        if(x>getWidth()-60){
            x=getWidth()-61;
        }
        if(y<40){
            y=41;
        }
         if(y>getHeight()-60){
            y=getHeight()-61;
        }
        
        //enemy movement restrictions
        if(x1<40){
            xinc*=-1;
        }
        if(x1>getWidth()-60){
            xinc*=-1;
        }
        if(y1<40){
            yinc*=-1;
        }
         if(y1>getHeight()-60){
            yinc*=-1;
        }
        
        if(x2<40){
            xinc1*=-1;
        }
        if(x2>getWidth()-60){
            xinc1*=-1;
        }
        if(y2<40){
            yinc1*=-1;
        }
         if(y2>getHeight()-60){
            yinc1*=-1;
        }
           
      }
      
      
      //GAME OVER SCREEN
      if(page==3){
        int w=getWidth();
        int h=getHeight();
          
        g.setColor(Color.GREEN);
        g.fillRect(0,0,w,h);
        g.setColor(ColorLibChen.LEAFGREENac()); //GAME OVER SCREEN
        g.fillRect(40,40,w-120,h-80);
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman" ,Font.PLAIN,50));
        g.drawString("GAME OVER",w/2,h/2);
        x2=(int)(Math.random()*1000+40);
        y2=(int)(Math.random()*600+40);
        }
      
        
      //LEVEL 2
      if(page==2){
       
        int w=getWidth();
        int h=getHeight();          
        g.setColor(Color.GREEN);
        g.fillRect(0,0,w,h);
        g.setColor(ColorLibChen.LEAFGREENac()); //STAGE 2
        g.fillRect(40,40,w-80,h-80);
        
        
         g.setColor(Color.RED);                  
         g.drawString("PLAY IN THIS SCREEN SIZE",20,20);
        
        
        g.setColor(Color.BLUE); //PLAYER
        g.fillRect(x,y,20,20);
        
        int x4=200;
        int y4=400;
        
        int xinc=10;
        int yinc=10;
        
        x1++;
        y1++;
        
            if(x==x4+20 && y4==y || x4==x+20 && y4==y || y==y4+20 && x4==x || y4==y+20 && x4==x){
            x4=0;
            y4=0;               //ENEMY MOVEMENT
            enemy1(g,x4,y4);
        }
        else if(x==x4+20 && y4==y+1 || x4==x+20 && y4==y+1 || y==y4+20 && x4==x+1 || y4==y+20 && x4==x+1){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
        else if(x==x4+20 && y4==y+2 || x4==x+20 && y4==y+2 || y==y4+20 && x4==x+2 || y4==y+20 && x4==x+2){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+3 || x4==x+20 && y4==y+3 || y==y4+20 && x4==x+3 || y4==y+20 && x4==x+3){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+4 || x4==x+20 && y4==y+4 || y==y4+20 && x4==x+4 || y4==y+20 && x4==x+4){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+5 || x4==x+20 && y4==y+5 || y==y4+20 && x4==x+5 || y4==y+20 && x4==x+5){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+6 || x4==x+20 && y4==y+6 || y==y4+20 && x4==x+6 || y4==y+20 && x4==x+6){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+7 || x4==x+20 && y4==y+7 || y==y4+20 && x4==x+7 || y4==y+20 && x4==x+7){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+8 || x4==x+20 && y4==y+8 || y==y4+20 && x4==x+8 || y4==y+20 && x4==x+8){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+9 || x4==x+20 && y4==y+9 || y==y4+20 && x4==x+9 || y4==y+20 && x4==x+9){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+10 || x4==x+20 && y4==y+10 || y==y4+20 && x4==x+10 || y4==y+20 && x4==x+10){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+11 || x4==x+20 && y4==y+11 || y==y4+20 && x4==x+11 || y4==y+20 && x4==x+11){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+12 || x4==x+20 && y4==y+12 || y==y4+20 && x4==x+12 || y4==y+20 && x4==x+12){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+13 || x4==x+20 && y4==y+13 || y==y4+20 && x4==x+13 || y4==y+20 && x4==x+13){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+14 || x4==x+20 && y4==y+14 || y==y4+20 && x4==x+14 || y4==y+20 && x4==x+14){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+15 || x4==x+20 && y4==y+15 || y==y4+20 && x4==x+15 || y4==y+20 && x4==x+15){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+16 || x4==x+20 && y4==y+16 || y==y4+20 && x4==x+16 || y4==y+20 && x4==x+16){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+17 || x4==x+20 && y4==y+17 || y==y4+20 && x4==x+17 || y4==y+20 && x4==x+17){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+18 || x4==x+20 && y4==y+18 || y==y4+20 && x4==x+18 || y4==y+20 && x4==x+18){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+19 || x4==x+20 && y4==y+19 || y==y4+20 && x4==x+19 || y4==y+20 && x4==x+19){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y+20 || x4==x+20 && y4==y+20 || y==y4+20 && x4==x+20 || y4==y+20 && x4==x+20){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y-1 || x4==x+20 && y4==y-1 || y==y4+20 && x4==x-1 || y4==y+20 && x4==x-1){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y-2 || x4==x+20 && y4==y-2 || y==y4+20 && x4==x-2 || y4==y+20 && x4==x-2){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y-3 || x4==x+20 && y4==y-3 || y==y4+20 && x4==x-3 || y4==y+20 && x4==x-3){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y-4 || x4==x+20 && y4==y-4 || y==y4+20 && x4==x-4 || y4==y+20 && x4==x-4){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y-5 || x4==x+20 && y4==y-5 || y==y4+20 && x4==x-5 || y4==y+20 && x4==x-5){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y-6 || x4==x+20 && y4==y-6 || y==y4+20 && x4==x-6 || y4==y+20 && x4==x-6){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y-7 || x4==x+20 && y4==y-7 || y==y4+20 && x4==x-7 || y4==y+20 && x4==x-7){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y-8 || x4==x+20 && y4==y-8 || y==y4+20 && x4==x-8 || y4==y+20 && x4==x-8){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y-9 || x4==x-20 && y4==y-9 || y==y4+20 && x4==x-9 || y4==y+20 && x4==x-9){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
         else if(x==x4+20 && y4==y-10 || x4==x+20 && y4==y-10 || y==y4+20 && x4==x-10 || y4==y+20 && x4==x-10){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
        else if(x==x4+20 && y4==y-11 || x4==x+20 && y4==y-11 || y==y4+20 && x4==x-11 || y4==y+20 && x4==x-11){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
        else if(x==x4+20 && y4==y-12 || x4==x+20 && y4==y-12 || y==y4+20 && x4==x-12 || y4==y+20 && x4==x-12){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
        else if(x==x4+20 && y4==y-13 || x4==x+20 && y4==y-13 || y==y4+20 && x4==x-13 || y4==y+20 && x4==x-13){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }else if(x==x4+20 && y4==y-14 || x4==x+20 && y4==y-14 || y==y4+20 && x4==x-14 || y4==y+20 && x4==x-14){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
        else if(x==x4+20 && y4==y-15 || x4==x+20 && y4==y-15 || y==y4+20 && x4==x-15 || y4==y+20 && x4==x-15){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }else if(x==x4+20 && y4==y-16 || x4==x+20 && y4==y-16 || y==y4+20 && x4==x-16 || y4==y+20 && x4==x-16){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
        else if(x==x4+20 && y4==y-17 || x4==x+20 && y4==y-17 || y==y4+20 && x4==x-17 || y4==y+20 && x4==x-17){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
          else if(x==x4+20 && y4==y-18 || x4==x+20 && y4==y-18 || y==y4+20 && x4==x-18 || y4==y+20 && x4==x-18){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
          else if(x==x4+20 && y4==y-19 || x4==x+20 && y4==y-19 || y==y4+20 && x4==x-19 || y4==y+20 && x4==x-19){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
          else if(x==x4+20 && y4==y-20 || x4==x+20 && y4==y-20 || y==y4+20 && x4==x-20 || y4==y+20 && x4==x-20){
            x4=0;
            y4=0;
            enemy1(g,x4,y4);
        }
        else{
            enemy1(g,x4,y4);
            x4+=xinc;        //enemy movement
            y4+=yinc;
        }
        
        g.setColor(Color.BLACK);
        g.fillRect(x2,y2,20,20);
        
        
        if(x==x2+20 && y2==y || x2==x+20 && y2==y || y==y2+20 && x2==x || y2==y+20 && x2==x){
            x2=0;
            y2=0;               //ENEMY MOVEMENT
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y+1 || x2==x+20 && y2==y+1 || y==y2+20 && x2==x+1 || y2==y+20 && x2==x+1){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y+2 || x2==x+20 && y2==y+2 || y==y2+20 && x2==x+2 || y2==y+20 && x2==x+2){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+3 || x2==x+20 && y2==y+3 || y==y2+20 && x2==x+3 || y2==y+20 && x2==x+3){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+4 || x2==x+20 && y2==y+4 || y==y2+20 && x2==x+4 || y2==y+20 && x2==x+4){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+5 || x2==x+20 && y2==y+5 || y==y2+20 && x2==x+5 || y2==y+20 && x2==x+5){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+6 || x2==x+20 && y2==y+6 || y==y2+20 && x2==x+6 || y2==y+20 && x2==x+6){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+7 || x2==x+20 && y2==y+7 || y==y2+20 && x2==x+7 || y2==y+20 && x2==x+7){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+8 || x2==x+20 && y2==y+8 || y==y2+20 && x2==x+8 || y2==y+20 && x2==x+8){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+9 || x2==x+20 && y2==y+9 || y==y2+20 && x2==x+9 || y2==y+20 && x2==x+9){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+10 || x2==x+20 && y2==y+10 || y==y2+20 && x2==x+10 || y2==y+20 && x2==x+10){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+11 || x2==x+20 && y2==y+11 || y==y2+20 && x2==x+11 || y2==y+20 && x2==x+11){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+12 || x2==x+20 && y2==y+12 || y==y2+20 && x2==x+12 || y2==y+20 && x2==x+12){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+13 || x2==x+20 && y2==y+13 || y==y2+20 && x2==x+13 || y2==y+20 && x2==x+13){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+14 || x2==x+20 && y2==y+14 || y==y2+20 && x2==x+14 || y2==y+20 && x2==x+14){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+15 || x2==x+20 && y2==y+15 || y==y2+20 && x2==x+15 || y2==y+20 && x2==x+15){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+16 || x2==x+20 && y2==y+16 || y==y2+20 && x2==x+16 || y2==y+20 && x2==x+16){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+17 || x2==x+20 && y2==y+17 || y==y2+20 && x2==x+17 || y2==y+20 && x2==x+17){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+18 || x2==x+20 && y2==y+18 || y==y2+20 && x2==x+18 || y2==y+20 && x2==x+18){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+19 || x2==x+20 && y2==y+19 || y==y2+20 && x2==x+19 || y2==y+20 && x2==x+19){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y+20 || x2==x+20 && y2==y+20 || y==y2+20 && x2==x+20 || y2==y+20 && x2==x+20){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-1 || x2==x+20 && y2==y-1 || y==y2+20 && x2==x-1 || y2==y+20 && x2==x-1){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-2 || x2==x+20 && y2==y-2 || y==y2+20 && x2==x-2 || y2==y+20 && x2==x-2){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-3 || x2==x+20 && y2==y-3 || y==y2+20 && x2==x-3 || y2==y+20 && x2==x-3){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-4 || x2==x+20 && y2==y-4 || y==y2+20 && x2==x-4 || y2==y+20 && x2==x-4){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-5 || x2==x+20 && y2==y-5 || y==y2+20 && x2==x-5 || y2==y+20 && x2==x-5){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-6 || x2==x+20 && y2==y-6 || y==y2+20 && x2==x-6 || y2==y+20 && x2==x-6){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-7 || x2==x+20 && y2==y-7 || y==y2+20 && x2==x-7 || y2==y+20 && x2==x-7){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-8 || x2==x+20 && y2==y-8 || y==y2+20 && x2==x-8 || y2==y+20 && x2==x-8){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-9 || x2==x-20 && y2==y-9 || y==y2+20 && x2==x-9 || y2==y+20 && x2==x-9){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
         else if(x==x2+20 && y2==y-10 || x2==x+20 && y2==y-10 || y==y2+20 && x2==x-10 || y2==y+20 && x2==x-10){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y-11 || x2==x+20 && y2==y-11 || y==y2+20 && x2==x-11 || y2==y+20 && x2==x-11){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y-12 || x2==x+20 && y2==y-12 || y==y2+20 && x2==x-12 || y2==y+20 && x2==x-12){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y-13 || x2==x+20 && y2==y-13 || y==y2+20 && x2==x-13 || y2==y+20 && x2==x-13){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }else if(x==x2+20 && y2==y-14 || x2==x+20 && y2==y-14 || y==y2+20 && x2==x-14 || y2==y+20 && x2==x-14){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y-15 || x2==x+20 && y2==y-15 || y==y2+20 && x2==x-15 || y2==y+20 && x2==x-15){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }else if(x==x2+20 && y2==y-16 || x2==x+20 && y2==y-16 || y==y2+20 && x2==x-16 || y2==y+20 && x2==x-16){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else if(x==x2+20 && y2==y-17 || x2==x+20 && y2==y-17 || y==y2+20 && x2==x-17 || y2==y+20 && x2==x-17){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
          else if(x==x2+20 && y2==y-18 || x2==x+20 && y2==y-18 || y==y2+20 && x2==x-18 || y2==y+20 && x2==x-18){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
          else if(x==x2+20 && y2==y-19 || x2==x+20 && y2==y-19 || y==y2+20 && x2==x-19 || y2==y+20 && x2==x-19){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
          else if(x==x2+20 && y2==y-20 || x2==x+20 && y2==y-20 || y==y2+20 && x2==x-20 || y2==y+20 && x2==x-20){
            x2=0;
            y2=0;
            enemy2(g,x2,y2);
        }
        else{
            enemy2(g,x2,y2);
            x2+=xinc1;        //enemy movement
            y2+=yinc1;
        }
        
        
        
        g.setColor(Color.BLACK);
        g.fillRect(x3,y3,20,20);
        
        
         if(x==x3+20 && y3==y || x3==x+20 && y3==y || y==y3+20 && x3==x || y3==y+20 && x3==x){
            x3=0;
            y3=0;               //ENEMY MOVEMENT
            enemy3(g,x3,y3);
        }
        else if(x==x3+20 && y3==y+1 || x3==x+20 && y3==y+1 || y==y3+20 && x3==x+1 || y3==y+20 && x3==x+1){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
        else if(x==x3+20 && y3==y+2 || x3==x+20 && y3==y+2 || y==y3+20 && x3==x+2 || y3==y+20 && x3==x+2){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+3 || x3==x+20 && y3==y+3 || y==y3+20 && x3==x+3 || y3==y+20 && x3==x+3){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+4 || x3==x+20 && y3==y+4 || y==y3+20 && x3==x+4 || y3==y+20 && x3==x+4){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+5 || x3==x+20 && y3==y+5 || y==y3+20 && x3==x+5 || y3==y+20 && x3==x+5){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+6 || x3==x+20 && y3==y+6 || y==y3+20 && x3==x+6 || y3==y+20 && x3==x+6){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+7 || x3==x+20 && y3==y+7 || y==y3+20 && x3==x+7 || y3==y+20 && x3==x+7){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+8 || x3==x+20 && y3==y+8 || y==y3+20 && x3==x+8 || y3==y+20 && x3==x+8){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+9 || x3==x+20 && y3==y+9 || y==y3+20 && x3==x+9 || y3==y+20 && x3==x+9){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+10 || x3==x+20 && y3==y+10 || y==y3+20 && x3==x+10 || y3==y+20 && x3==x+10){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+11 || x3==x+20 && y3==y+11 || y==y3+20 && x3==x+11 || y3==y+20 && x3==x+11){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+12 || x3==x+20 && y3==y+12 || y==y3+20 && x3==x+12 || y3==y+20 && x3==x+12){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+13 || x3==x+20 && y3==y+13 || y==y3+20 && x3==x+13 || y3==y+20 && x3==x+13){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+14 || x3==x+20 && y3==y+14 || y==y3+20 && x3==x+14 || y3==y+20 && x3==x+14){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+15 || x3==x+20 && y3==y+15 || y==y3+20 && x3==x+15 || y3==y+20 && x3==x+15){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+16 || x3==x+20 && y3==y+16 || y==y3+20 && x3==x+16 || y3==y+20 && x3==x+16){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+17 || x3==x+20 && y3==y+17 || y==y3+20 && x3==x+17 || y3==y+20 && x3==x+17){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+18 || x3==x+20 && y3==y+18 || y==y3+20 && x3==x+18 || y3==y+20 && x3==x+18){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+19 || x3==x+20 && y3==y+19 || y==y3+20 && x3==x+19 || y3==y+20 && x3==x+19){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y+20 || x3==x+20 && y3==y+20 || y==y3+20 && x3==x+20 || y3==y+20 && x3==x+20){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y-1 || x3==x+20 && y3==y-1 || y==y3+20 && x3==x-1 || y3==y+20 && x3==x-1){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y-2 || x3==x+20 && y3==y-2 || y==y3+20 && x3==x-2 || y3==y+20 && x3==x-2){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y-3 || x3==x+20 && y3==y-3 || y==y3+20 && x3==x-3 || y3==y+20 && x3==x-3){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y-4 || x3==x+20 && y3==y-4 || y==y3+20 && x3==x-4 || y3==y+20 && x3==x-4){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y-5 || x3==x+20 && y3==y-5 || y==y3+20 && x3==x-5 || y3==y+20 && x3==x-5){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y-6 || x3==x+20 && y3==y-6 || y==y3+20 && x3==x-6 || y3==y+20 && x3==x-6){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y-7 || x3==x+20 && y3==y-7 || y==y3+20 && x3==x-7 || y3==y+20 && x3==x-7){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y-8 || x3==x+20 && y3==y-8 || y==y3+20 && x3==x-8 || y3==y+20 && x3==x-8){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y-9 || x3==x-20 && y3==y-9 || y==y3+20 && x3==x-9 || y3==y+20 && x3==x-9){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
         else if(x==x3+20 && y3==y-10 || x3==x+20 && y3==y-10 || y==y3+20 && x3==x-10 || y3==y+20 && x3==x-10){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
        else if(x==x3+20 && y3==y-11 || x3==x+20 && y3==y-11 || y==y3+20 && x3==x-11 || y3==y+20 && x3==x-11){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
        else if(x==x3+20 && y3==y-12 || x3==x+20 && y3==y-12 || y==y3+20 && x3==x-12 || y3==y+20 && x3==x-12){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
        else if(x==x3+20 && y3==y-13 || x3==x+20 && y3==y-13 || y==y3+20 && x3==x-13 || y3==y+20 && x3==x-13){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }else if(x==x3+20 && y3==y-14 || x3==x+20 && y3==y-14 || y==y3+20 && x3==x-14 || y3==y+20 && x3==x-14){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
        else if(x==x3+20 && y3==y-15 || x3==x+20 && y3==y-15 || y==y3+20 && x3==x-15 || y3==y+20 && x3==x-15){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }else if(x==x3+20 && y3==y-16 || x3==x+20 && y3==y-16 || y==y3+20 && x3==x-16 || y3==y+20 && x3==x-16){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
        else if(x==x3+20 && y3==y-17 || x3==x+20 && y3==y-17 || y==y3+20 && x3==x-17 || y3==y+20 && x3==x-17){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
          else if(x==x3+20 && y3==y-18 || x3==x+20 && y3==y-18 || y==y3+20 && x3==x-18 || y3==y+20 && x3==x-18){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
          else if(x==x3+20 && y3==y-19 || x3==x+20 && y3==y-19 || y==y3+20 && x3==x-19 || y3==y+20 && x3==x-19){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
          else if(x==x3+20 && y3==y-20 || x3==x+20 && y3==y-20 || y==y3+20 && x3==x-20 || y3==y+20 && x3==x-20){
            x3=0;
            y3=0;
            enemy3(g,x3,y3);
        }
        else{
            enemy3(g,x3,y3);
            x3+=xinc2;        //enemy movement
            y3+=yinc2;
        }
        
        
        
        
        if(x4==0 && y4==0){
            page=4;      //NEXT STAGE
        }
        if(x2==0 && y2==0){
            page=3;     //GAME OVER
        }
        if(x3==0 && y3==0){
            page=3;     //GAME OVER
        }
        
        if(up){
            y-=3;
        }
        if(down){
            y+=3;
        }
        if(left){
            x-=3;
        }
        if(right){
            x+=3;
        }
        
        //player movement restrictions
        if(x<40){
            x=41;
        }
        if(x>getWidth()-60){
            x=getWidth()-61;
        }
        if(y<40){
            y=41;
        }
         if(y>getHeight()-60){
            y=getHeight()-61;
        }
        
        //enemy movement restrictions
        if(x1<40){
            xinc*=-1;
        }
        if(x1>getWidth()-60){
            xinc*=-1;
        }
        if(y1<40){
            yinc*=-1;
        }
         if(y1>getHeight()-60){
            yinc*=-1;
        }
        
        if(x2<40){
            xinc1*=-1;
        }
        if(x2>getWidth()-60){
            xinc1*=-1;
        }
        if(y2<40){
            yinc1*=-1;
        }
         if(y2>getHeight()-60){
            yinc1*=-1;
        }
        
        
        if(x3<40){
            xinc2*=-1;
        }
        if(x3>getWidth()-60){
            xinc2*=-1;
        }
        if(y3<40){
            yinc2*=-1;
        }
         if(y3>getHeight()-60){
            yinc2*=-1;
        }
       }
       }
    
    public void enemy1(Graphics g,int x1,int y1){
        g.setColor(Color.RED);      //OBJECTIVE
        g.fillRect(x1,y1,20,20);
    } 
    
    public void enemy2(Graphics g,int x1,int y1){
        g.setColor(Color.BLACK);
        
        g.fillRect(x1,y1,20,20);
    }
    
    public void enemy3(Graphics g,int x1,int y1){
        g.setColor(Color.BLACK);
        g.fillRect(x3,y3,20,20);
    }
}