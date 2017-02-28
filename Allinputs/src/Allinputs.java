
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Elmira
 */
public class Allinputs extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public Allinputs() {
        initComponents();
        groupButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        btn3 = new javax.swing.JRadioButton();
        CBCat = new javax.swing.JCheckBox();
        CBDog = new javax.swing.JCheckBox();
        CBOther = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        dlContinents = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        T1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        jLabel3.setText("Pets");

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        btn1.setSelected(true);
        btn1.setText("Below 18");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("18-35");

        btn3.setText("36 and up");

        CBCat.setText("Cat");

        CBDog.setText("Dog");

        CBOther.setText("Other");

        jLabel4.setText("Continent of Residence");

        dlContinents.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asia", "Africa", "Australia", "America", "Europe" }));
        dlContinents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlContinentsActionPerformed(evt);
            }
        });

        jLabel5.setText("Prefered Temp C");

        jSlider1.setBackground(new java.awt.Color(255, 204, 0));
        jSlider1.setMajorTickSpacing(5);
        jSlider1.setMaximum(35);
        jSlider1.setMinimum(15);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(25);
        jSlider1.setValueIsAdjusting(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jButton1.setText("Register Me");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(CBCat)
                                .addGap(30, 30, 30)
                                .addComponent(CBDog)
                                .addGap(70, 70, 70)
                                .addComponent(CBOther))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dlContinents, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CBCat)
                    .addComponent(CBDog)
                    .addComponent(CBOther))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dlContinents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dlContinentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlContinentsActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_dlContinentsActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_tfNameActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = tfName.getText();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "you forgot to enter your name",
                    "name missing",
                    JOptionPane.WARNING_MESSAGE);

            return;

        }
        //enum new lesson 
        AgeRange age;
        if (btn1.isSelected()) {

            age = AgeRange.below18;

        } else if (btn2.isSelected()) {

            age = AgeRange.From18to35;
        } else if (btn3.isSelected()) {
            age = AgeRange.From36upWard;

        } else {

            JOptionPane.showMessageDialog(this,
                    "Unknown radiobox Selection",
                    "Internal error",
                    JOptionPane.WARNING_MESSAGE);

            return;
        }
        ArrayList<String> pets = new ArrayList<>();

        if (CBCat.isSelected()) {
            pets.add("Cat");

        }
        if (CBDog.isSelected()) {
            pets.add("Dog");

        }
        if (CBOther.isSelected()) {
            pets.add("Other");

        }

        String petList = "";
        for (String p : pets) {
            if (petList.equals(" ")) {
                 petList = p;
            }else {
               petList += "" + p;
            
            }
        }

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("./output1.txt", true));// true is for appending the lines
            pw.println(tfName.getText() + ";" + age + ";"+petList+";" + dlContinents.getSelectedItem() + ";" + jSlider1.getValue());
            pw.close();
            //
            // System.out.println("Person added.");
        } catch (IOException ioe) {
            // ioe.printStackTrace();
            System.out.println("Error writing to file.");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:

        int x = jSlider1.getValue();
        T1.setText(String.valueOf(x));

    }//GEN-LAST:event_jSlider1StateChanged

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed
    private void groupButton() {
        ButtonGroup bg1 = new ButtonGroup();

        bg1.add(btn1);
        bg1.add(btn2);
        bg1.add(btn3);

    }

  /*  String getAge() {
        if (btn1.isSelected()) {
            return "Below 18";

        } else if (btn2.isSelected()) {
            return "18 - 35";

        } else {
            return "36 and up";
        }

    }*

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Allinputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Allinputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Allinputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Allinputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Allinputs().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBCat;
    private javax.swing.JCheckBox CBDog;
    private javax.swing.JCheckBox CBOther;
    private javax.swing.JTextField T1;
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JRadioButton btn3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> dlContinents;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
