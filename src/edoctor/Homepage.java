/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edoctor;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import static edoctor.MyResources.getResources;
import java.sql.*;
import java.awt.Component;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
/**
 *
 * @author OLUWAGBEMI
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    String nma;
    public Homepage() {
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
//        Dimension scrnSize = Toolkit.getDefaultToolkit().getScreenSize();
//        int x = scrnSize.width;
//        int y = scrnSize.height;
//        super.setBounds(0, 0, x-15, y-45);
        super.setLocationRelativeTo(null);
    }
    
    public void displayPdf()
    {
       Dimension size;
       PageReader pg;
       Homepage.jDesktopPane1.removeAll();
       size = Homepage.jDesktopPane1.getSize();
       pg = new PageReader();
       pg.setBounds(0, 0, size.width, size.height);
       pg.setVisible(true);
       Homepage.jDesktopPane1.add(pg);
    }
    public void displayRegForm()
    {

        Dimension size ;
        RegForm i;
        //String leafNodeStr = HMIS_View.getNodeInfo();
         Homepage.jDesktopPane1.removeAll();
            size = Homepage.jDesktopPane1.getSize();
            i = new RegForm();
            RegForm.jLabel1.setText(getResources().getString("regpatient"));
            RegForm.lb_surname.setText(getResources().getString("sname"));
            RegForm.lb_othernames.setText(getResources().getString("oname"));
            RegForm.lb_gender.setText(getResources().getString("gender"));
            RegForm.lb_dob.setText(getResources().getString("dob"));
            RegForm.lb_marital.setText(getResources().getString("status"));
            RegForm.lb_religion.setText(getResources().getString("religion"));
            RegForm.lb_state.setText(getResources().getString("origin"));
            RegForm.lb_nation.setText(getResources().getString("nation"));
            RegForm.lb_dat.setText(getResources().getString("date"));
            RegForm.lb_email.setText(getResources().getString("email"));
            RegForm.lb_addr1.setText(getResources().getString("addr1"));
            RegForm.lb_addr2.setText(getResources().getString("addr2"));
	    RegForm.lb_phone.setText(getResources().getString("phone"));
            RegForm.lb_occup.setText(getResources().getString("occupation"));
            RegForm.lb_height.setText(getResources().getString("height"));
            RegForm.lb_blood.setText(getResources().getString("blood"));
            RegForm.lb_age.setText(getResources().getString("age"));
            RegForm.lb_medhist.setText(getResources().getString("medhist"));
            RegForm.lb_fileno.setText(getResources().getString("pass"));
            RegForm.lbl_pat.setText(getResources().getString("patid"));
            RegForm.jRadioButton1.setText(getResources().getString("male"));
            RegForm.jRadioButton2.setText(getResources().getString("female"));
            RegForm.btnSubmit.setText(getResources().getString("submit"));
            RegForm.jButton1.setText(getResources().getString("uploadbtn"));
            RegForm.jButton3.setText(getResources().getString("reset"));
            RegForm.jButton5.setText(getResources().getString("cancel"));
            
            i.setBounds(0, 0, size.width, size.height);
            i.setVisible(true);
            Homepage.jDesktopPane1.add(i);

    }
     public void displayRegForm2()
    {

        Dimension size ;
        RegForm2 i;
        //String leafNodeStr = HMIS_View.getNodeInfo();
         Homepage.jDesktopPane1.removeAll();
            size = Homepage.jDesktopPane1.getSize();
              i = new RegForm2();
            RegForm2.jLabel1.setText(getResources().getString("regdoc"));
            RegForm2.lb_surname.setText(getResources().getString("sname"));
            RegForm2.lb_othernames.setText(getResources().getString("oname"));
            RegForm2.lb_gender.setText(getResources().getString("gender"));
            RegForm2.lb_dob.setText(getResources().getString("dob"));
            RegForm2.lb_marital.setText(getResources().getString("status"));
            RegForm2.lb_religion.setText(getResources().getString("religion"));
            RegForm2.lb_state.setText(getResources().getString("origin"));
            RegForm2.lb_nation.setText(getResources().getString("nation"));
            RegForm2.lb_lga.setText(getResources().getString("docid"));
            RegForm2.lb_email.setText(getResources().getString("email"));
            RegForm2.lb_addr1.setText(getResources().getString("addr1"));
            RegForm2.lb_addr2.setText(getResources().getString("addr2"));
	    RegForm2.lb_phone.setText(getResources().getString("phone"));
            RegForm2.lb_age1.setText(getResources().getString("constime"));
            RegForm2.lb_days.setText(getResources().getString("day"));
            RegForm2.lb_blood.setText(getResources().getString("blood"));
            RegForm2.lb_age.setText(getResources().getString("spec"));
            RegForm2.lb_medhist.setText(getResources().getString("fee"));
            RegForm2.lb_fileno.setText(getResources().getString("pass"));
            RegForm2.from.setText(getResources().getString("from"));
            RegForm2.to.setText(getResources().getString("to"));
            RegForm2.jRadioButton1.setText(getResources().getString("male"));
            RegForm2.jRadioButton2.setText(getResources().getString("female"));
            RegForm2.btnSubmit.setText(getResources().getString("submit"));
            RegForm2.jButton1.setText(getResources().getString("uploadbtn"));
            RegForm2.jButton3.setText(getResources().getString("reset"));
            RegForm2.jButton5.setText(getResources().getString("cancel"));
            
            i.setBounds(0, 0, size.width, size.height);
            i.setVisible(true);
            Homepage.jDesktopPane1.add(i);

    }
    
     public void displayPatientView()
    {
        PatViewDocDiag sv = new PatViewDocDiag(this, true);
       
        PatViewDocDiag.jLabel2.setText(getResources().getString("patid"));
        PatViewDocDiag.chk.setText(getResources().getString("chk"));
        //PatViewDocDiag.jLabel3.setText(getResources().getString("patsymp"));
        //GeneralServices.jButton4.setText(getResources().getString("admin"));
        PatViewDocDiag.jLabel4.setText(getResources().getString("date"));
        PatViewDocDiag.jLabel5.setText(getResources().getString("fff"));
        PatViewDocDiag.jButton2.setText(getResources().getString("cancel"));

        sv.setVisible(true);
    }
    public void displayServices()
    {
        GeneralServices sv = new GeneralServices(this, true);
         GeneralServices.jPanel2.setBorder(BorderFactory.createTitledBorder(getResources().getString("all")));
        GeneralServices.jButton1.setText(getResources().getString("viewrecord"));
        sv.setVisible(true);
    }
     public void displayMedicalAdvice()
    {

        Dimension size ;
       /* GetMedicalAdvice ga;
        //String leafNodeStr = HMIS_View.getNodeInfo();
         Homepage.jDesktopPane1.removeAll();
         size = Homepage.jDesktopPane1.getSize();
         ga = new GetMedicalAdvice();
           GetMedicalAdvice.lbl_seek.setText(getResources().getString("seekmed"));
            GetMedicalAdvice.lbl_pat.setText(getResources().getString("patid"));
            GetMedicalAdvice.lbl_symp.setText(getResources().getString("patsymp"));
            GetMedicalAdvice.lbl_pre.setText(getResources().getString("prevmd"));
            GetMedicalAdvice.lbl_dat.setText(getResources().getString("datailm"));
            GetMedicalAdvice.lbl_doc.setText(getResources().getString("docid"));
            GetMedicalAdvice.getMed.setText(getResources().getString("getMed"));
//            GetMedicalAdvice.lbl_docs.setText(getResources().getString("doclist"));
            GetMedicalAdvice.lbl_option.setText(getResources().getString("selection"));

            
            ga.setBounds(0, 0, size.width, size.height);
            ga.setVisible(true);
            Homepage.jDesktopPane1.add(ga);*/

    }
     public void displayDocDiagnose()
     {
        Dimension size ;
      /*  DocDiagnose dc;
        Homepage.jDesktopPane1.removeAll();
        size = Homepage.jDesktopPane1.getSize();  
        dc = new  DocDiagnose();
        DocDiagnose.lbl_pat.setText(getResources().getString("patid"));
        DocDiagnose.dia.setText(getResources().getString("dia"));
        DocDiagnose.lbl_diag.setText(getResources().getString("datediag"));
        DocDiagnose.dochid.setText(getResources().getString("dochid"));
      //  DocDiagnose.patnsym.setText(getResources().getString("patnsym"));
        DocDiagnose.lbl_med.setText(getResources().getString("mediag"));
        DocDiagnose.d.setText(getResources().getString("d"));
        DocDiagnose.cl.setText(getResources().getString("cl"));
        dc.setBounds(0, 0, size.width, size.height);
        dc.setVisible(true);
        Homepage.jDesktopPane1.add(dc);*/
        
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 1150, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SELECT YOUR LANGUAGE");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Yoruba", "Hausa" }));

        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButton1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 230, 190));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setText("GO BACK<<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton2)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 170, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bac.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1480, 920));

        jMenu1.setText("File");

        jMenuItem1.setText("Services");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Patient");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem9.setText("Get  Medical Advice");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem11.setText("View Diagnosis");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem7.setText("Get Appointment");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem13.setText("Log Out");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Doctor");
        jMenu3.setEnabled(false);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Register Patient");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Register Doctor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem15.setText("Diagnose  Patient");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuItem17.setText("View Patient Details");
        jMenu3.add(jMenuItem17);

        jMenuItem18.setText("Log Out");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem18);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Customer Care");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Speak with Agent");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("HELP");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("About");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        displayRegForm();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        displayRegForm2();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        
       displayMedicalAdvice();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this,"M HERE");
       // displayAppointment();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        displayDocDiagnose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        PatViewDocDiag pt = new PatViewDocDiag(this,true);
        pt.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Customer_Cares cr = new Customer_Cares();
        cr.setVisible(true);
        cr.setLocationRelativeTo(this);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        displayPdf();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                Homepage.jMenu1.setText(getResources().getString("filelabel"));
        Homepage.jMenu2.setText(getResources().getString("patm"));
        Homepage.jMenu3.setText(getResources().getString("docman"));
        Homepage.jMenu4.setText(getResources().getString("cust"));
       // Homepage.jMenu6.setText(getResources().getString("pharm"));

        //Homepage.jMenuItem1.setText(getResources().getString("openservice"));
        Homepage.jMenuItem2.setText(getResources().getString("exit"));        
        Homepage.jMenuItem4.setText(getResources().getString("regpatient"));
       
        Homepage.jMenuItem9.setText(getResources().getString("getmdad"));
      //  Homepage.jMenuItem10.setText(getResources().getString("viewprofile"));
        Homepage.jMenuItem11.setText(getResources().getString("daig"));
        Homepage.jMenuItem7.setText(getResources().getString("getapoint"));
        Homepage.jMenuItem13.setText(getResources().getString("logout"));
        Homepage.jMenuItem5.setText(getResources().getString("regdoc"));
//        Homepage.jMenuItem14.setText(getResources().getString("viewprofile"));
        Homepage.jMenuItem15.setText(getResources().getString("diagpat"));
       // Homepage.jMenuItem16.setText(getResources().getString("viewapoint"));
        Homepage.jMenuItem17.setText(getResources().getString("viewpatdet"));
        Homepage.jMenuItem18.setText(getResources().getString("logout"));
        Homepage.jMenuItem6.setText(getResources().getString("spikwitagent"));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
	Component component = evt.getComponent();
	if((key == KeyEvent.VK_ENTER) && (component ==jButton1))
        {
                 
        
        Homepage.jMenu1.setText(getResources().getString("filelabel"));
        Homepage.jMenu2.setText(getResources().getString("patm"));
        Homepage.jMenu3.setText(getResources().getString("docman"));
        Homepage.jMenu4.setText(getResources().getString("cust"));
       // Homepage.jMenu6.setText(getResources().getString("pharm"));

       // Homepage.jMenuItem1.setText(getResources().getString("openservice"));
        Homepage.jMenuItem2.setText(getResources().getString("exit"));        
        Homepage.jMenuItem4.setText(getResources().getString("regpatient"));
       
        Homepage.jMenuItem9.setText(getResources().getString("getmdad"));
        //Homepage.jMenuItem10.setText(getResources().getString("viewprofile"));
        Homepage.jMenuItem11.setText(getResources().getString("daig"));
        Homepage.jMenuItem7.setText(getResources().getString("getapoint"));
        Homepage.jMenuItem13.setText(getResources().getString("logout"));
        Homepage.jMenuItem5.setText(getResources().getString("regdoc"));
        //Homepage.jMenuItem14.setText(getResources().getString("viewprofile"));
        Homepage.jMenuItem15.setText(getResources().getString("diagpat"));
       // Homepage.jMenuItem16.setText(getResources().getString("viewapoint"));
        Homepage.jMenuItem17.setText(getResources().getString("viewpatdet"));
        Homepage.jMenuItem18.setText(getResources().getString("logout"));
        Homepage.jMenuItem6.setText(getResources().getString("spikwitagent"));
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       // setVisible(false);
       displayServices();

        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Starter().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JComboBox jComboBox1;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    public static javax.swing.JMenu jMenu3;
    public static javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JMenuItem jMenuItem11;
    public static javax.swing.JMenuItem jMenuItem13;
    public static javax.swing.JMenuItem jMenuItem15;
    public static javax.swing.JMenuItem jMenuItem17;
    public static javax.swing.JMenuItem jMenuItem18;
    public static javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JMenuItem jMenuItem5;
    public static javax.swing.JMenuItem jMenuItem6;
    public static javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    public static javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
