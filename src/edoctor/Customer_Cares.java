/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edoctor;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

/**
 *
 * @author Mabside94
 */
public class Customer_Cares extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Cares
     */
   private Toolkit toolkit = Toolkit.getDefaultToolkit();
   Image Ic;
    public Customer_Cares() {
         this.setUndecorated(true);
         setLocationRelativeTo(null);
        initComponents();loadSounds();
       addMouseMotionListener(new MouseMotionAdapter()
       {
            @Override
            public void mouseDragged(MouseEvent e)
            {
               setLocation(e.getXOnScreen(),e.getYOnScreen());
            }
       });
    }
//        private void loadImages()
//    {
//       try
//       {
//        File f=new File("");
//        String path=f.getAbsolutePath()+"\\src\\images\\";
//        ImageIcon left = new ImageIcon(path+"left_soft.jpg");
//        ImageIcon right = new ImageIcon(path+"right_soft.jpg");
//        ImageIcon send = new ImageIcon(path+"call.jpg");
//        ImageIcon end = new ImageIcon(path+"cut.jpg");
//        ImageIcon upp = new ImageIcon(path+"upp.jpg");
//        ImageIcon leftt = new ImageIcon(path+"leftt.jpg");
//        ImageIcon centerr =new ImageIcon(path+"centerr.jpg");
//        ImageIcon rightt = new ImageIcon(path+"rightt.jpg");
//        ImageIcon downn = new ImageIcon(path+"downn.jpg");
//        upb.setIcon(upp);downb.setIcon(downn);centerb.setIcon(centerr);
//        leftb.setIcon(leftt);rightb.setIcon(rightt);lsk.setIcon(left);
//        rsk.setIcon(right);call.setIcon(send);cut.setIcon(end);
//       }catch(Exception e){}
//    }
    Clip[] mysounds = new Clip[12];;
    AudioInputStream[] audioIn = new AudioInputStream[12];
    
    private void loadSounds()
    {
        try
        {
           //open an audio input stream
           URL url = this.getClass().getClassLoader().getResource("intro.au");
           audioIn[0] = AudioSystem.getAudioInputStream(url);
           mysounds[0] = AudioSystem.getClip();
           mysounds[0].open(audioIn[0]);
           url = this.getClass().getClassLoader().getResource("segment.au");
           audioIn[1] = AudioSystem.getAudioInputStream(url);
           mysounds[1] = AudioSystem.getClip();
           mysounds[1].open(audioIn[1]);
           url = this.getClass().getClassLoader().getResource("cholera.au");
           audioIn[2] = AudioSystem.getAudioInputStream(url);
           mysounds[2] = AudioSystem.getClip();
           mysounds[2].open(audioIn[2]);
           url = this.getClass().getClassLoader().getResource("peptic.au");
           audioIn[3] = AudioSystem.getAudioInputStream(url);
           mysounds[3] = AudioSystem.getClip();
           mysounds[3].open(audioIn[3]);
           url = this.getClass().getClassLoader().getResource("diabet.au");
           audioIn[4] = AudioSystem.getAudioInputStream(url);
           mysounds[4] = AudioSystem.getClip();
           mysounds[4].open(audioIn[4]);
           url = this.getClass().getClassLoader().getResource("213-2.au");
           audioIn[5] = AudioSystem.getAudioInputStream(url);
           mysounds[5] = AudioSystem.getClip();
           mysounds[5].open(audioIn[5]);
           url = this.getClass().getClassLoader().getResource("213-2-1.au");
           audioIn[6] = AudioSystem.getAudioInputStream(url);
           mysounds[6] = AudioSystem.getClip();
           mysounds[6].open(audioIn[6]);
           url = this.getClass().getClassLoader().getResource("213-2-2.au");
           audioIn[7] = AudioSystem.getAudioInputStream(url);
           mysounds[7] = AudioSystem.getClip();
           mysounds[7].open(audioIn[7]);
           url = this.getClass().getClassLoader().getResource("213-2-3.au");
           audioIn[8] = AudioSystem.getAudioInputStream(url);
           mysounds[8] = AudioSystem.getClip();
           mysounds[8].open(audioIn[8]);
           url = this.getClass().getClassLoader().getResource("213-3.au");
           audioIn[9] = AudioSystem.getAudioInputStream(url);
           mysounds[9] = AudioSystem.getClip();
           mysounds[9].open(audioIn[9]);
           url = this.getClass().getClassLoader().getResource("213-3-1.au");
           audioIn[10] = AudioSystem.getAudioInputStream(url);
           mysounds[10] = AudioSystem.getClip();
           mysounds[10].open(audioIn[10]);
           url = this.getClass().getClassLoader().getResource("213-3-2.au");
           audioIn[11] = AudioSystem.getAudioInputStream(url);
           mysounds[11] = AudioSystem.getClip();
           mysounds[11].open(audioIn[11]);
           url = this.getClass().getClassLoader().getResource("213-3-3.au");
           audioIn[12] = AudioSystem.getAudioInputStream(url);
           mysounds[12] = AudioSystem.getClip();
           mysounds[12].open(audioIn[12]);
           url = this.getClass().getClassLoader().getResource("un.au");
           audioIn[13] = AudioSystem.getAudioInputStream(url);
           mysounds[13] = AudioSystem.getClip();
           mysounds[13].open(audioIn[13]);
        }catch(Exception e){}
    }
    private Clip currentSound;int playDelay = 3000;
  private void playSound(int index)
  {
      try
      {
        if(currentSound!=null)//stop any current previously loaded sound being played!
        {
              currentSound.stop();
        }
         try
         {
               //mysounds[index].open(audioIn[index]);
               currentSound = mysounds[index];//now store the current sound being played
               if(currentSound!=null)
               {
                try
                {
                  if(!connected)
                  {
                    a.setText("Connected To 213 Service Center ..." + "\n");
                    Thread tt = new Thread();
                    tt.sleep(playDelay);connected = true;
                  }
                  mysounds[index].start();playDelay = 0;
                }catch(Exception e){}
            }
          }catch(Exception e){}
      }catch(Exception e){}
  }
  private String dial1="0",dial2="0",dial3="0";
  private void processSound(String diaNumber,String level, String option)
  {// 213, 1-4,{1(1-3),2(1-3),3(1-3),4(go back to 213)}
      //File f=new File("");
      //String path=f.getAbsolutePath()+"\\src\\";
      try
      {
          stopSound();stopSound1();
         if(diaNumber.equals("213") && level.equals("0"))//General Introduction
         {//213-0-0-0 = processSound(213,0,0,0);
           if(option.equals("0"))
           {             
           try
           {
             /* try
              {
                 if(mysounds[0].isActive())
                 {
                  currentSound.stop();mysounds[0].stop();
                 }
              }catch(Exception e){}
             //mysounds[0].open(audioIn[0]);
             if(mysounds[0]!=null)
             {
                mysounds[0].start();
             }*/
              playSound(0);//"intro.au"
            }catch(Exception e){}
            
          }
         }
         else if(diaNumber.equals("213") && level.equals("1"))//General Introduction
         {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
            if( option.equals("0"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                try
                {
                  /*  try
                    {
                       stopSound();
                       //javax.swing.JOptionPane.showMessageDialog(rootPane, "after");
                    }catch(Exception e){}
                    //mysounds[1].open(audioIn[1]);
                    if(mysounds[1]!=null)
                    {
                      mysounds[1].start();
                    }*/
                   playSound(1);//"213-1.au"
                }catch(Exception e){}                
            }
            else if(option.equals("1"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                try
                {
                  playSound(2);//"213-1-1.au"
                }catch(Exception e){}                
            }
            else if(option.equals("2"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                playSound(3);//"213-1-2.au"
            }
            else if(option.equals("3"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                playSound(4);//"213-1-3.au"
            }
            else if(option.equals("4"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers

            }
            else if(option.equals("5"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers

            }
            else
            {
                playSound(13);//"un.au"
            }
         }
         else if(diaNumber.equals("213") && level.equals("2"))//General Introduction
         {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
            if( option.equals("0"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                playSound(5);//"213-2.au"
            }
            else if(option.equals("1"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                playSound(6);//"213-2.au"
            }
            else if(option.equals("2"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                playSound(7);//"213-2-2.au"
            }
            else if(option.equals("3"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                playSound(8);//"213-2-3.au"
            }
            else if(option.equals("4"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers

            }
            else if(option.equals("5"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers

            }
            else
            {
                playSound(13);//"un.au"
            }
         }
         else if(diaNumber.equals("213") && level.equals("3"))//General Introduction
         {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
            if( option.equals("0"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                playSound(9);//"213-3.au"
            }
            else if(option.equals("1"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                playSound(10);//"213-3-2.au"
            }
            else if(option.equals("2"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                playSound(11);//"213-3-3.au"
            }
            else if(option.equals("3"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
                playSound(12);//"213-3-3.au"
            }
            else if(option.equals("4"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers

            }
            else if(option.equals("5"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers

            }
            else
            {
                playSound(13);//"un.au"
            }
         }
         else if(diaNumber.equals("213") && level.equals("4"))//General Introduction
         {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers
            if(option.equals("4"))//General Introduction
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers

            }
            else if(option.equals("5"))//repeat go back sound
            {//play hostel listing and go back at 4, repeat at 5 and invalid other numbers

            }
            else
            {
                playSound(13);//"un.au"
            }
         }

      }catch(Exception e){}
  }
  private void stopSound()
  {
      try
      {
           if(mysounds[0].isActive())
           {
              currentSound.stop();mysounds[0].stop();
           }
           else if(mysounds[1].isActive())
           {
               currentSound.stop();mysounds[1].stop();
           }
           else if(mysounds[2].isActive())
           {
               currentSound.stop();mysounds[2].stop();
           }
           else if(mysounds[3].isActive())
           {
               currentSound.stop();mysounds[3].stop();
           }
           else if(mysounds[4].isActive())
           {
               currentSound.stop();mysounds[4].stop();
           }
           else if(mysounds[5].isActive())
           {
               currentSound.stop();mysounds[5].stop();
           }
           else if(mysounds[6].isActive())
           {
               currentSound.stop();mysounds[6].stop();
           }
           else if(mysounds[7].isActive())
           {
               currentSound.stop();mysounds[7].stop();
           }
           else if(mysounds[8].isActive())
           {
               currentSound.stop();mysounds[8].stop();
           }
           else if(mysounds[9].isActive())
           {
               currentSound.stop();mysounds[9].stop();
           }
           else if(mysounds[10].isActive())
           {
               currentSound.stop();mysounds[10].stop();
           }
           else if(mysounds[11].isActive())
           {
               currentSound.stop();mysounds[11].stop();
           }
           else if(mysounds[12].isActive())
           {
               currentSound.stop();mysounds[12].stop();
           }
           else if(mysounds[13].isActive())
           {
               currentSound.stop();mysounds[13].stop();
           }

           if(mysounds[0]!=null)
           {
              currentSound.stop();mysounds[0].stop();
           }
           else if(mysounds[1]!=null)
           {
               currentSound.stop();mysounds[1].stop();
           }
           else if(mysounds[2]!=null)
           {
               currentSound.stop();mysounds[2].stop();
           }
           else if(mysounds[3]!=null)
           {
               currentSound.stop();mysounds[3].stop();
           }
           else if(mysounds[4]!=null)
           {
               currentSound.stop();mysounds[4].stop();
           }
           else if(mysounds[5]!=null)
           {
               currentSound.stop();mysounds[5].stop();
           }
           else if(mysounds[6]!=null)
           {
               currentSound.stop();mysounds[6].stop();
           }
           else if(mysounds[7]!=null)
           {
               currentSound.stop();mysounds[7].stop();
           }
           else if(mysounds[8]!=null)
           {
               currentSound.stop();mysounds[8].stop();
           }
           else if(mysounds[9]!=null)
           {
               currentSound.stop();mysounds[9].stop();
           }
           else if(mysounds[10]!=null)
           {
               currentSound.stop();mysounds[10].stop();
           }
           else if(mysounds[11]!=null)
           {
               currentSound.stop();mysounds[11].stop();
           }
           else if(mysounds[12]!=null)
           {
               currentSound.stop();mysounds[12].stop();
           }
           else if(mysounds[13]!=null)
           {
               currentSound.stop();mysounds[13].stop();
           }
         //javax.swing.JOptionPane.showMessageDialog(rootPane, "after");
     }catch(Exception e){}
  }
  private void stopSound1()
  {
      try
      {
          if(mysounds[0]!=null)
           {
              currentSound.setFramePosition(0);
               mysounds[0].setFramePosition(0);
              currentSound.stop();mysounds[0].stop();
           }
           else if(mysounds[1]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[1].setFramePosition(0);
               currentSound.stop();mysounds[1].stop();
           }
           else if(mysounds[2]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[2].setFramePosition(0);
               currentSound.stop();mysounds[2].stop();
           }
           else if(mysounds[3]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[3].setFramePosition(0);
               currentSound.stop();mysounds[3].stop();
           }
           else if(mysounds[4]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[4].setFramePosition(0);
               currentSound.stop();mysounds[4].stop();
           }
           else if(mysounds[5]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[5].setFramePosition(0);
               currentSound.stop();mysounds[5].stop();
           }
           else if(mysounds[6]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[6].setFramePosition(0);
               currentSound.stop();mysounds[6].stop();
           }
           else if(mysounds[7]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[7].setFramePosition(0);
               currentSound.stop();mysounds[7].stop();
           }
           else if(mysounds[8]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[8].setFramePosition(0);
               currentSound.stop();mysounds[8].stop();
           }
           else if(mysounds[9]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[9].setFramePosition(0);
               currentSound.stop();mysounds[9].stop();
           }
           else if(mysounds[10]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[10].setFramePosition(0);
               currentSound.stop();mysounds[10].stop();
           }
           else if(mysounds[11]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[11].setFramePosition(0);
               currentSound.stop();mysounds[11].stop();
           }
           else if(mysounds[12]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[12].setFramePosition(0);
               currentSound.stop();mysounds[12].stop();
           }
           else if(mysounds[13]!=null)
           {
               currentSound.setFramePosition(0);
               mysounds[13].setFramePosition(0);
               currentSound.stop();mysounds[13].stop();
           }

           if(mysounds[0].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[0].setFramePosition(0);
              currentSound.stop();mysounds[0].stop();
           }
           else if(mysounds[1].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[1].setFramePosition(0);
               currentSound.stop();mysounds[1].stop();
           }
           else if(mysounds[2].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[2].setFramePosition(0);
               currentSound.stop();mysounds[2].stop();
           }
           else if(mysounds[3].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[3].setFramePosition(0);
               currentSound.stop();mysounds[3].stop();
           }
           else if(mysounds[4].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[4].setFramePosition(0);
               currentSound.stop();mysounds[4].stop();
           }
           else if(mysounds[5].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[5].setFramePosition(0);
               currentSound.stop();mysounds[5].stop();
           }
           else if(mysounds[6].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[6].setFramePosition(0);
               currentSound.stop();mysounds[6].stop();
           }
           else if(mysounds[7].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[7].setFramePosition(0);
               currentSound.stop();mysounds[7].stop();
           }
           else if(mysounds[8].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[8].setFramePosition(0);
               currentSound.stop();mysounds[8].stop();
           }
           else if(mysounds[9].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[9].setFramePosition(0);
               currentSound.stop();mysounds[9].stop();
           }
           else if(mysounds[10].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[10].setFramePosition(0);
               currentSound.stop();mysounds[10].stop();
           }
           else if(mysounds[11].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[11].setFramePosition(0);
               currentSound.stop();mysounds[11].stop();
           }
           else if(mysounds[12].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[12].setFramePosition(0);
               currentSound.stop();mysounds[12].stop();
           }
           else if(mysounds[13].isActive())
           {
               currentSound.setFramePosition(0);
               mysounds[13].setFramePosition(0);
               currentSound.stop();mysounds[13].stop();
           }
           
         //javax.swing.JOptionPane.showMessageDialog(rootPane, "after");
     }catch(Exception e){}
  }
  boolean connected = false;
  String lastOption="0", toLevel="1";
 private void enterNumber(String number)
 {
  if((Integer.parseInt(number) > 5) || (Integer.parseInt(number)>5))
  {
              a.setText(" Wrong Number!!\n Please Dial 213 again ...");
  }
  else
  {
     if(a.getText().endsWith("..."))
     {
      a.setText("");
     }
     String text = a.getText();
      if( !text.endsWith("d")  && !text.endsWith("t")
            && !text.endsWith("e") && !text.endsWith("y") && !text.endsWith("p"))
      {
	   a.setText( text + number);
      }
      else
      {
             a.setText(number);
      }
      //process the dialing order
      if(connected==true)//if 213 is dialled
      {
         if(dial2.equals("0"))
         {
             dial2=number;
             lastOption=number;toLevel="1";
         }
         else
         {
             dial3=number;
             lastOption=number;toLevel="2";
         }
         if(number.equals("4"))//number 4 to go back to previous menu and reset last & current value to 0
         {            
             dial3="0";dial2="0";lastOption="0";toLevel="2";
         }
         else if(number.equals("5"))//number 5 repeat the current option and reset current value to 0
         {
            if(Integer.parseInt(dial2)>0)
            {
             dial3="0";
             lastOption="0";toLevel="2";
            }
            else 
            {
             dial2="0";dial3="0";
             lastOption="0";toLevel="2";
            }
         }
      }
      if(connected==true)
      {
         //javax.swing.JOptionPane.showMessageDialog(rootPane,dial1+" - "+dial2+" - "+dial3);
         if(dial2.equals("5"))
         {
             dial2="0";
             lastOption="0";toLevel="1";
         }
         if(dial3.equals("5"))
         {
             dial3="0";lastOption="0";toLevel="2";
         }
         processSound(dial1,dial2,dial3);
      }
    }
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        a = new javax.swing.JTextArea();
        cut = new javax.swing.JButton();
        rsk = new javax.swing.JButton();
        downb = new javax.swing.JButton();
        upb = new javax.swing.JButton();
        call = new javax.swing.JButton();
        lsk = new javax.swing.JButton();
        rightb = new javax.swing.JButton();
        leftb = new javax.swing.JButton();
        centerb = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        a.setBackground(new java.awt.Color(255, 255, 204));
        a.setColumns(20);
        a.setEditable(false);
        a.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        a.setForeground(new java.awt.Color(0, 102, 0));
        a.setRows(5);
        jScrollPane1.setViewportView(a);

        jScrollPane1.setBounds(0, 0, 320, 210);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cut.jpg"))); // NOI18N
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        cut.setBounds(230, 260, 90, 40);
        jLayeredPane1.add(cut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        rsk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right_soft.jpg"))); // NOI18N
        rsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rskActionPerformed(evt);
            }
        });
        rsk.setBounds(230, 210, 90, 50);
        jLayeredPane1.add(rsk, javax.swing.JLayeredPane.DEFAULT_LAYER);

        downb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/downn.jpg"))); // NOI18N
        downb.setBounds(90, 270, 140, 30);
        jLayeredPane1.add(downb, javax.swing.JLayeredPane.DEFAULT_LAYER);

        upb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upp.jpg"))); // NOI18N
        upb.setBounds(90, 210, 140, 30);
        jLayeredPane1.add(upb, javax.swing.JLayeredPane.DEFAULT_LAYER);

        call.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/call.jpg"))); // NOI18N
        call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callActionPerformed(evt);
            }
        });
        call.setBounds(0, 260, 90, 40);
        jLayeredPane1.add(call, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lsk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left_soft.jpg"))); // NOI18N
        lsk.setBounds(0, 210, 90, 50);
        jLayeredPane1.add(lsk, javax.swing.JLayeredPane.DEFAULT_LAYER);

        rightb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rightt.jpg"))); // NOI18N
        rightb.setBounds(190, 240, 40, 30);
        jLayeredPane1.add(rightb, javax.swing.JLayeredPane.DEFAULT_LAYER);

        leftb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leftt.jpg"))); // NOI18N
        leftb.setBounds(90, 240, 40, 30);
        jLayeredPane1.add(leftb, javax.swing.JLayeredPane.DEFAULT_LAYER);

        centerb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/centerr.jpg"))); // NOI18N
        centerb.setBounds(130, 240, 60, 30);
        jLayeredPane1.add(centerb, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        b1.setBounds(0, 300, 110, 30);
        jLayeredPane1.add(b1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b2.setText("2 abc");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        b2.setBounds(110, 300, 100, 30);
        jLayeredPane1.add(b2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b3.setText("3 def");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        b3.setBounds(210, 300, 110, 30);
        jLayeredPane1.add(b3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b5.setText("5 jkl");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        b5.setBounds(110, 330, 100, 30);
        jLayeredPane1.add(b5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b4.setText("4 ghi");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        b4.setBounds(0, 330, 110, 30);
        jLayeredPane1.add(b4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b6.setText("6 mno");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        b6.setBounds(210, 330, 110, 30);
        jLayeredPane1.add(b6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b7.setText("7 pqrs");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        b7.setBounds(0, 360, 110, 30);
        jLayeredPane1.add(b7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b10.setText("*");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        b10.setBounds(0, 390, 110, 30);
        jLayeredPane1.add(b10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b8.setText("8 tuv");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        b8.setBounds(110, 360, 100, 30);
        jLayeredPane1.add(b8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        b0.setBounds(110, 390, 100, 30);
        jLayeredPane1.add(b0, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b9.setText("9 wxyz");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        b9.setBounds(210, 360, 110, 30);
        jLayeredPane1.add(b9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        b11.setText("#");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        b11.setBounds(210, 390, 110, 30);
        jLayeredPane1.add(b11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(51, 153, 0));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        // TODO add your handling code here:
        stopSound();
        connected = false;
        dial1 = "0";
        dial2 = "0";
        dial3 = "0";
        a.setText("Calling To 213 Service Center\n Terminated ...");
    }//GEN-LAST:event_cutActionPerformed

    private void rskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rskActionPerformed
        // TODO add your handling code here:
        String text = a.getText();
        int n = text.length();
        //  String str = "" + n;
        try {
            if (n != 0) {
                if (text.endsWith("1") || text.endsWith("2") || text.endsWith("3")
                        || text.endsWith("4") || text.endsWith("5") || text.endsWith("6")
                        || text.endsWith("7") || text.endsWith("8") || text.endsWith("9")
                        || text.endsWith("0") || text.endsWith("*") || text.endsWith("#")) {
                    a.setText(text.substring(0, n - 1));
                } else {
                    a.setText("");
                }

            }
        } catch (Exception e) {
            a.setText(text);
        }
    }//GEN-LAST:event_rskActionPerformed

    private void callActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callActionPerformed
        // TODO add your handling code here:
        String text = a.getText();
        if (!text.endsWith("...")) {
            if (text.length() != 0 && !text.endsWith("d") && !text.endsWith("t")
                    && !text.endsWith("e") && !text.endsWith("y") && !text.endsWith("p")
                    && !text.endsWith("1")) {
                if (text.equals("213")) {
                    a.setText("Calling...." + "\n" + text);
                    processSound(text, "0", "0");
                    dial1 = text;
                } else {
                    toolkit.beep();
                    a.setText(" Wrong Number!!\n Please Dial 213 again ...");
                }
            }
        } else {
            a.setText(" Wrong Number!!\n Please Dial 213 again ...");
        }
    }//GEN-LAST:event_callActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        enterNumber("1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        enterNumber("2");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        enterNumber("3");
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        enterNumber("5");
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        enterNumber("4");
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        enterNumber("6");
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        enterNumber("7");
    }//GEN-LAST:event_b7ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
        if (connected) {
            a.append("*");
            if (toLevel.equals("1")) {
                dial2 = lastOption;
            } else if (toLevel.equals("2")) {
                dial3 = lastOption;
            }
            //javax.swing.JOptionPane.showMessageDialog(rootPane,dial1+" - "+dial2+" - "+dial3);
            processSound(dial1, dial2, dial3);
        }
    }//GEN-LAST:event_b10ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        enterNumber("8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        // TODO add your handling code here:
        enterNumber("0");
    }//GEN-LAST:event_b0ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed

        enterNumber("9");// TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        // TODO add your handling code here:
        if (connected) {
            a.append("#");
        }
    }//GEN-LAST:event_b11ActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        // TODO add your handling code here:
       super.dispose();
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(this, "A VRS-VOICE RESPONSE SYSTEM  \n"
                + "IS A SOFTWARE TARGECTED TO GUILD A NEW VISITOR \n"
                + "COMING IN, INTO AN UNKNOWN CITY TO GET VARIOUS  \n"
                + "ADDRESS OR LOCATION OF PLACE WHERE THEY CAN RESIDE \n"
                + "LOGDE,RELAX,OR CATCH FUN. \n"
                + "A USER OF THIS SOFTWARE MUST DIAL 213 AND LISTEN TO THE VOICE \n"
                + "PROMPTS FROM THE COMPUTER");
    }//GEN-LAST:event_jMenu2MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_Cares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Cares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Cares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Cares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Customer_Cares().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton call;
    private javax.swing.JButton centerb;
    private javax.swing.JButton cut;
    private javax.swing.JButton downb;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leftb;
    private javax.swing.JButton lsk;
    private javax.swing.JButton rightb;
    private javax.swing.JButton rsk;
    private javax.swing.JButton upb;
    // End of variables declaration//GEN-END:variables
}
