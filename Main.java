package CarFun;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Main extends JFrame {

  JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btnClose;
  JLabel hintLabel,imageLabel;
  JPanel panel;
  JTextField countDownTextField;

  public Main(){   

      hintLabel=new JLabel("Choose any number and try to guess the model of the car");
      hintLabel.setBounds(120,40,500,40);

      imageLabel=new JLabel();           
     imageLabel.setBounds(260,150,400,500);         

      panel=new JPanel();
      panel.setBackground(Color.CYAN);    
      panel.setBounds(230,150,270,200);  
      
      countDownTextField=new JTextField(25);
      countDownTextField.setBounds(300,100,120,40);
      countDownTextField.setEditable(false);
      countDownTextField.setBackground(Color.red);
      countDownTextField.setForeground(Color.white);
      countDownTextField.setText("Time left:");
      countDownTextField.setHorizontalAlignment(SwingConstants.CENTER);//centering the text in the count down textfield
      countDownTextField.setFont(new Font("Consolas",Font.BOLD,16));  
      countDownTextField.setCaretPosition(5);   //moves the caret to the middle of the blank space in the textfield
      countDownTextField.setCaretColor(Color.red);//makes the caret in the count down text field invisible
      countDownTextField.setVisible(false);


      btn1=new JButton("1");
      btn2=new JButton("2");
      btn3=new JButton("3");
      btn4=new JButton("4");
      btn5=new JButton("5");
      btn6=new JButton("6");
      btn7=new JButton("7");
      btn8=new JButton("8");     

      btnClose=new JButton("Close");// terminates the program
      btnClose.setBounds(300,550,100,30);     


    setTitle("Can you name these car logos?");
    setSize(700,700);
    setLocationRelativeTo(null);   
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);
    setVisible(true);

    add(hintLabel);
    add(imageLabel);
    add(countDownTextField);

    add(btnClose);

    panel.add(btn1); panel.add(btn2); panel.add(btn3); panel.add(btn4); 
    panel.add(btn5); panel.add(btn6); panel.add(btn7); panel.add(btn8);
  

    add(panel);

    btn1.addActionListener(e->{
      timerFunction();
      carModel("bmw");

    });

    btn2.addActionListener(e->{
      timerFunction();
      carModel("audi");
    });


    btn3.addActionListener(e->{
      carModel("mazda");
      timerFunction();
    });

     btn4.addActionListener(e->{
      carModel("mercedes");
      timerFunction();
    });

     btn5.addActionListener(e->{
      carModel("mitsubishi");
      timerFunction();
    });

     btn6.addActionListener(e->{
      carModel("rolls_royce");
      timerFunction();
    });

     btn7.addActionListener(e->{
       carModel("subaru");
      timerFunction();
    });

     btn8.addActionListener(e->{
       carModel("toyota");
      timerFunction();
    });

    btnClose.addActionListener(e->{
      System.exit(0);

    });
  }

    public void timerFunction(){

      countDownTextField.setVisible(true);

    // Create a timer to countdown from 5 seconds
    Timer timer=new Timer(710,new ActionListener() {
      int count=5;

      public void actionPerformed(ActionEvent e){
        countDownTextField.setText(Integer.toString(count));
        if(count==0){
          ((Timer) e.getSource()).stop();
          //displays the name of the logo after the countdown

        }

        count--;
      }

    });
    timer.start();

  }

  public String carModel(String car){
    

    if(car=="bmw"){
      ImageIcon bmw =new ImageIcon("logos/bmw.jpg");     

        // Create a new thread to display the image
        Thread imageDisplayThread = new Thread(new Runnable() {
        @Override
        public void run() {
            // Display the image
            imageLabel.setIcon(bmw); //loads BMW logo
            btn1.setEnabled(false);//the btn is disabled 
            
            revalidate();
            repaint();

            try {
                // Sleep for 5 seconds
                Thread.sleep(5000);  
                  countDownTextField.setText("BMW");               
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }                       
        }
    });
    imageDisplayThread.start();  
    
  }

  else if(car=="audi"){
       ImageIcon audi =new ImageIcon("logos/audi.jpg");     

           // Create a new thread to display the image
           Thread imageDisplayThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Display the image
                imageLabel.setIcon(audi); //loads Audi logo
                btn2.setEnabled(false);//the btn is disabled 
                
                revalidate();
                repaint();

                try {
                    // Sleep for 5 seconds
                    Thread.sleep(5000);
                      countDownTextField.setText("Audi");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }                            
            }
        });
        imageDisplayThread.start();

  }

  else if(car=="mazda"){
    ImageIcon mazda =new ImageIcon("logos/mazda.jpg");     

           // Create a new thread to display the image
           Thread imageDisplayThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Display the image
                imageLabel.setIcon(mazda); //loads mazda logo
                btn3.setEnabled(false);//the btn is disabled 
                
                revalidate();
                repaint();

                try {
                    // Sleep for 5 seconds
                    Thread.sleep(5000);
                      countDownTextField.setText("Mazda");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                           
            }
        });
        imageDisplayThread.start();     

  }

  else if(car=="mercedes"){
    ImageIcon mercedes =new ImageIcon("logos/mercedes.jpg");     

           // Create a new thread to display the image
           Thread imageDisplayThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Display the image
                imageLabel.setIcon(mercedes ); //loads mercedes logo
                btn4.setEnabled(false);//the btn is disabled 
                
                revalidate();
                repaint();

                try {
                    // Sleep for 5 seconds
                    Thread.sleep(5000);
                      countDownTextField.setText("Mercedes");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }                        
            }
        });
        imageDisplayThread.start();
       

  }

  else if(car=="mitsubishi"){
     ImageIcon mitsubishi =new ImageIcon("logos/mitsubishi.jpg");     

           // Create a new thread to display the image
           Thread imageDisplayThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Display the image
                imageLabel.setIcon(mitsubishi); //loads mitsubishi logo
                btn5.setEnabled(false);//the btn is disabled 
                
                revalidate();
                repaint();

                try {
                    // Sleep for 5 seconds
                    Thread.sleep(5000);
                      countDownTextField.setText("Mitsubishi");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }          
            }
        });
        imageDisplayThread.start();

  }

  else if(car=="rolls_royce"){
    ImageIcon rolls_royce =new ImageIcon("logos/rolls_royce.jpg");     

           // Create a new thread to display the image
           Thread imageDisplayThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Display the image
                imageLabel.setIcon(rolls_royce ); //loads rolls_royce logo
                btn6.setEnabled(false);//the btn is disabled 
                
                revalidate();
                repaint();

                try {
                    // Sleep for 7 seconds
                    Thread.sleep(5000);
                      countDownTextField.setText("Rolls Royce");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }                          
            }
        });
        imageDisplayThread.start();
       

  }

  else if(car=="subaru"){
     ImageIcon subaru =new ImageIcon("logos/subaru.jpg");     

           // Create a new thread to display the image
           Thread imageDisplayThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Display the image
                imageLabel.setIcon(subaru); //loads subaru logo
                btn7.setEnabled(false);//the btn is disabled 
                
                revalidate();
                repaint();

                try {
                    // Sleep for 5 seconds
                    Thread.sleep(5000);
                      countDownTextField.setText("Subaru");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }                         
            }
        });
        imageDisplayThread.start();
       

  }

  else if(car=="toyota"){
      ImageIcon toyota =new ImageIcon("logos/toyota.jpg");     

           // Create a new thread to display the image
           Thread imageDisplayThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Display the image
                imageLabel.setIcon(toyota); //loads toyota logo
                btn8.setEnabled(false);//the btn is disabled 
                
                revalidate();
                repaint();

                try {
                    // Sleep for 5 seconds
                    Thread.sleep(5000);
                      countDownTextField.setText("Toyota");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }                         
            }
        });
        imageDisplayThread.start();      

  }


return car;
}

  public static void main(String[] args) {
      System.out.println("this is very shitty code!");
        Main main=new Main(); 
        
      }
    }    
    
    

 
  


 
