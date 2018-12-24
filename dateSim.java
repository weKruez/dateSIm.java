import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.sound.sampled.*;
import javax.sound.midi.*;
import java.io.*;
import java.io.InputStream.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Mixer.Info;
import java.net.URI;
import java.net.URL;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.embed.swing.JFXPanel;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
import javafx.application.Platform;

public class dateSim extends JPanel {




public static double score = 0;

public static double point = 0;


public static void setScore(double score) {
     score += point;
    
    }

public static double getScore() {
       return score;
    }



public static void main(String [] args){
/*
try{
    // cl is the ClassLoader for the current class, ie. CurrentClass.class.getClassLoader()
    URL file = new URL("file:///C:/Users/wchri/Desktop/lovesong.wav");
    final Media media = new Media(file.toURI().toString());
    final MediaPlayer mediaPlayer = new MediaPlayer(media);
    mediaPlayer.setAutoPlay(true); 
    mediaPlayer.play();
    mediaPlayer.setVolume(1.0);
}catch(URISyntaxException lk) {lk.printStackTrace();}
 catch(MalformedURLException tu) {tu.printStackTrace();}
*/
JPanel mainPanel = new JPanel(new BorderLayout());
JPanel southBtn = new JPanel(new GridLayout(3, 2, 1, 1)); 
JButton b = new JButton("Say Hello");//1
JButton c = new JButton("Say You Look Good");//1
JButton d = new JButton("Say Sorry I'm Late");//1
JButton eTwo = new JButton("So where are we headed?");//2
JButton f = new JButton("Can we go to your place?");//2
JButton g = new JButton("I don't have any money for our date...");//2
JButton h = new JButton ("How about we go out to eat?");
JButton j = new JButton("I'm really attracted to you.");
JButton k = new JButton("I think there is a stain on my dress...");
JButton l = new JButton("Ok, so... What do you do?");
JButton m = new JButton("Sorry. What do you want to do? I'll do anything for you!");
JButton n = new JButton("I feel so embarrassed. I'm so stupid!");
JButton o = new JButton("So what do you do for fun?");
JButton p = new JButton("Mwah! Wow! I think I'm in love!");
JButton q = new JButton("Thanks Christian. Maybe you're too strong for me!");
ImageIcon icon = new ImageIcon("C:/Users/wchri/Pictures/10346538_10203007241845278_2763831867139494749_n.jpg");
ImageIcon imageTwo = new ImageIcon("C:/Users/wchri/Documents/chrisferry.jpg");
ImageIcon imageThree = new ImageIcon("C:/Users/wchri/Documents/chrisart.jpg");
ImageIcon imageFour = new ImageIcon("C:/Users/wchri/Documents/chrismoney.jpg");
ImageIcon imageFive = new ImageIcon("C:/Users/wchri/Pictures/14479748_10208037164110191_5578124159670056918_n.jpg");
ImageIcon imageSix = new ImageIcon("C:/Users/wchri/Pictures/11002655_10204249084730574_8038951889823101577_n.jpg");
ImageIcon imageSeven = new ImageIcon("C:/Users/wchri/Pictures/14563546_10208472127143995_3354058797998713586_n.jpg");
ImageIcon imageEight = new ImageIcon("C:/Users/wchri/Pictures/14316969_10207903618051623_3416357738179205441_n.jpg");
ImageIcon imageNine = new ImageIcon("C:/Users/wchri/Downloads/kisskiss.jpg");
ImageIcon imageTen = new ImageIcon("C:/Users/wchri/Pictures/15966321_10208956245006639_7549500132389897378_n.jpg");
ImageIcon imageEleven = new ImageIcon("C:/Users/wchri/Pictures/1455035_10201331116303187_906051226_n.jpg");
ImageIcon imageTwelve = new ImageIcon("C:/Users/wchri/Pictures/315891_2326523285812_954023573_n.jpg");
ImageIcon imageThirteen = new ImageIcon("C:/Users/wchri/Pictures/1011227_10201881007250117_1806360688_n.jpg");
JLabel label = new JLabel(icon);
mainPanel.add(label);
JFrame frame = new JFrame();
frame.add(southBtn, BorderLayout.SOUTH);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(label);
frame.setSize(700,700);
frame.setVisible(true);
southBtn.add((b));
southBtn.add((c));
southBtn.add((d));



            b.addActionListener(new ActionListener() {
            
                @Override
                public void actionPerformed(ActionEvent e) {
            
            southBtn.removeAll();
            southBtn.add(eTwo);
            southBtn.add(f);
            southBtn.add(g);
            southBtn.revalidate();
            southBtn.repaint();    
            String msg = ((JButton)e.getSource()).getActionCommand() ;
            JOptionPane.showMessageDialog(frame, "Hey there! Ready to get started?", "Christian feels good!", JOptionPane.PLAIN_MESSAGE); //display button Action
            setScore(score += 1.0);
            
         }   
});
                

            c.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            southBtn.add(eTwo);
            southBtn.add(f);
            southBtn.add(g);
            southBtn.revalidate();
            southBtn.repaint();
            
             String msg = ((JButton)e.getSource()).getActionCommand() ;
             JOptionPane.showMessageDialog(frame, "Ugh. Thanks! You too! Ready to get started?", "Christian feels slightly embarassed!", JOptionPane.PLAIN_MESSAGE); //display button Action
             setScore(score += .5);
             
                }
        
        });
           d.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {    
            southBtn.removeAll();
            southBtn.add(eTwo);
            southBtn.add(f);
            southBtn.add(g);
            southBtn.revalidate();
            southBtn.repaint();
            
            String msg = ((JButton)e.getSource()).getActionCommand() ;
            JOptionPane.showMessageDialog(frame, "Ugh. Yeah... That's ok I guess! Ready to get started?", "Christian feels slightly ignored!", JOptionPane.PLAIN_MESSAGE); //display button Action
            setScore(score += -1.0);
            
    }
            
            });

            eTwo.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

            southBtn.removeAll();
            label.setIcon(imageTwo);
            southBtn.add(h);
            southBtn.add(j);
            southBtn.add(k);
            southBtn.revalidate();
            southBtn.repaint();  
            String msg = ((JButton)e.getSource()).getActionCommand() ;
            JOptionPane.showMessageDialog(frame, "Let's take the ferry to NYC!", "Christian feels good!", JOptionPane.PLAIN_MESSAGE); //display button Action
            setScore(score += 1.0);
            

            }
            });

            f.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageThree);
            southBtn.add(h);
            southBtn.add(j);
            southBtn.add(k);
            southBtn.revalidate();
            southBtn.repaint();    
            String msg = ((JButton)e.getSource()).getActionCommand() ;
            JOptionPane.showMessageDialog(frame, "Don't you think it's a bit soon for that?", "Christian is embarrassed...", JOptionPane.PLAIN_MESSAGE); //display button Action
            setScore(score += .5);
                
              }
            
            });

            g.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageFour);
            southBtn.add(h);
            southBtn.add(j);
            southBtn.add(k);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();
            JOptionPane.showMessageDialog(frame, "I got money!", "Christian is ballin'", JOptionPane.PLAIN_MESSAGE); //display button Action
            setScore(score += -.5);
            
        }
            });

             h.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageFive);
            southBtn.add(l);
            southBtn.add(m);
            southBtn.add(n);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();
            JOptionPane.showMessageDialog(frame, "I'm not that hungry! Let's talk!", "Christian feels good!", JOptionPane.PLAIN_MESSAGE); //display buttun action
            setScore(score += 1.0);
         
        }
    });

             j.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageSix);
            southBtn.add(l);
            southBtn.add(m);
            southBtn.add(n);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();
            JOptionPane.showMessageDialog(frame, "Well, let's not get ahead of ourselves. But you're nice too! <3", "Christian is amused.", JOptionPane.PLAIN_MESSAGE); //action button command
            setScore(score += .5);
    
    }
});

            k.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageSeven);
            southBtn.add(l);
            southBtn.add(m);
            southBtn.add(n);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();    
            JOptionPane.showMessageDialog(frame, "Well. You should've come prepared. I'll use this app to get it out for you.", "Christian is annoyed.", JOptionPane.PLAIN_MESSAGE);      
            setScore(score += -1.0);

}
});

             l.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageEight);
            southBtn.add(o);
            southBtn.add(p);
            southBtn.add(q);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();
            JOptionPane.showMessageDialog(frame, "I write software! I love computers!", "Christian feels good!", JOptionPane.PLAIN_MESSAGE); //display buttun action
            setScore(score += 1.0);
          
        }
    });

             m.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageNine);
            southBtn.add(o);
            southBtn.add(p);
            southBtn.add(q);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();
            JOptionPane.showMessageDialog(frame, "How about a smooch for daddy! <3 <3 <3", "Christian feels sexy! <3 <3 <3.", JOptionPane.PLAIN_MESSAGE); //action button command
            setScore(score += 2);

    }
});

            n.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageTen);
            southBtn.add(o);
            southBtn.add(p);
            southBtn.add(q);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();    
            JOptionPane.showMessageDialog(frame, "You shouldn't feel bad about yourself. Have confidence!", "Christian is helping you!.", JOptionPane.PLAIN_MESSAGE);      
            setScore(score += -.5);
           
}
});


            o.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageEleven);
            southBtn.add(l);
            southBtn.add(m);
            southBtn.add(n);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();    
            JOptionPane.showMessageDialog(frame, "I like to take my dog in the woods. Want to come with? We'll wait for you! We're like a family!", "Christian is waiting for you.", JOptionPane.PLAIN_MESSAGE);      
            setScore(score += -1);
           
}
});

            p.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageTwelve);
            southBtn.add(l);
            southBtn.add(m);
            southBtn.add(n);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();    
            JOptionPane.showMessageDialog(frame, "I'll be your king! Muhaha!", "Christian's ego thrives!.", JOptionPane.PLAIN_MESSAGE);      
            setScore(score += 2);
           
}
});


            q.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
            southBtn.removeAll();
            label.setIcon(imageThirteen);
            southBtn.add(l);
            southBtn.add(m);
            southBtn.add(n);
            southBtn.revalidate();
            southBtn.repaint();
            String msg = ((JButton)e.getSource()).getActionCommand();    
            JOptionPane.showMessageDialog(frame, "Well I am pretty strong! Maybe you can't handle me!", "Christian is wild!.", JOptionPane.PLAIN_MESSAGE);      
            setScore(score += -1);
           
}
});             

        }



  if(getScore() >= 5) {
            System.out.println("Let's make it official!");
            }else{
            System.out.println("I don't think it's going to work!.");
            }

     }
