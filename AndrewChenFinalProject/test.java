import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;



public class test extends Applet implements ActionListener,KeyListener
{
    private int x=200;
    private int y=475;      //PLAYER
    
    private int x4=100;
    private int y4=200;     //NEUTRAL ENTITY
    
    private int xinc=2;
    private int yinc=1;     //MOVEMENT INCREMENTS
   
    
   
    
    private int page=1;       //PAGES(LEVELS)
    
    private int ctr=0;
    private boolean up=false;
    private boolean down=false;
    private boolean left=false;         //MOVEMENT
    private boolean right=false;
    
    
    private Timer timer;
    public void init()
    {
        int x4=200;
        int x4=200;
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
        
    
        if(x4==0 && y4==0){
            page=2;         //NEXT STAGE
            int x4=250;
            int y4=100;
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
        if(x4<40){
            xinc*=-1;
        }
        if(x4>getWidth()-60){
            xinc*=-1;
        }
        if(y4<40){
            yinc*=-1;
        }
         if(y4>getHeight()-60){
            yinc*=-1;
        }
        

      
        
      
       }
    
    public void enemy1(Graphics g,int x4,int y4){
        g.setColor(Color.RED);      //OBJECTIVE
        g.fillRect(x4,y4,20,20);
    } 
    
 
        g.setColor(Color.BLACK);
        
        g.fillRect(x4,y1,20,20);
    }
    
    
}