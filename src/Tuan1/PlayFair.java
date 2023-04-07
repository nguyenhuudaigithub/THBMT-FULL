package Tuan1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Mingo
 */
public class PlayFair extends javax.swing.JFrame {

    char pf[][]={{'M','O','N','A','R'},
                 {'C','H','Y','B','D'},
                 {'E','F','G','I','K'},
                 {'L','P','Q','S','T'},
                 {'U','V','W','X','Z'}
                
            };

    /**
     * Creates new form PlayFair
     */
    public PlayFair() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnmahoa = new javax.swing.JButton();
        btngiaima = new javax.swing.JButton();
        txtbr = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbm = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("CipherText");

        btnmahoa.setText("Encrypt");
        btnmahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoaActionPerformed(evt);
            }
        });

        btngiaima.setText("Decrypt");
        btngiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngiaimaActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        txtbm.setColumns(20);
        txtbm.setRows(5);
        jScrollPane1.setViewportView(txtbm);

        jLabel4.setText("PLAYFAIR");

        jLabel1.setText("Plaintext");

        jLabel2.setText("Key");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnmahoa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btngiaima))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtbr, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel4)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmahoa)
                    .addComponent(btngiaima))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoaActionPerformed

        String banro=this.txtbr.getText();
        banro=banro.toUpperCase();
        banro=banro.replace('J', 'I');
        String banma=mahoa(banro);
        this.txtbm.setText(banma);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmahoaActionPerformed

    private void btngiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngiaimaActionPerformed
        String banma=this.txtbm.getText();
        String banro=giaima(banma);
        int n=banro.length();
        String br="";
        for(int i=0;i<n-2;i+=2)
        if(banro.charAt(i)==banro.charAt(i+2))
        br+=banro.charAt(i);
        else
        br+=banro.charAt(i)+""+banro.charAt(i+1);
        if(banro.charAt(n-1)=='X')
        br+=banro.charAt(n-2);
        else
        br+=banro.charAt(n-2); br+=banro.charAt(n-1);
        this.txtbm.setText(br);

        // TODO add your handling code here:
    }//GEN-LAST:event_btngiaimaActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(PlayFair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayFair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayFair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayFair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayFair().setVisible(true);
            }
        });
    }
    
    private String giaima(String banma)
    {
        int n=banma.length();
        String banro="";
        char a,b;
        for (int i=0;i<n;i+=2)
        {
            a=banma.charAt(i);
            b=banma.charAt(i+1);
            banro+=thayTheNguoc(a,b);
        }
        return banro;
    }
    String thayTheNguoc(char a,char b)
    {
        String vta=timViTri(a);
        String vtb=timViTri(b);
        char x,y;
        if(vta.charAt(0)==vtb.charAt(0))
        {
            x=pf[vta.charAt(0)-'0'][((vta.charAt(1)-'0')-1+5)%5];
            y=pf[(vtb.charAt(0)-'0')][((vtb.charAt(1)-'0')-1+5)%5];
            return x+""+y;
        }
        if(vta.charAt(1)==vtb.charAt(1))
        {
            x=pf[((vta.charAt(0)-'0')-1+5)%5][(vta.charAt(1)-'0')];
            y=pf[((vtb.charAt(0)-'0')-1+5)%5][(vtb.charAt(1)-'0')];
            return x+""+y;
        }
        x=pf[(vta.charAt(0)-'0')][(vtb.charAt(1)-'0')];
        y=pf[(vtb.charAt(0)-'0')][(vta.charAt(1)-'0')];
        return x+""+y;
        
    }
    private String mahoa(String banro){
        int n=banro.length();
        int i=0;
        String banma="";
        char a,b;
        while(i<n)
        {
            if(i==n-1)
            {
                a=banro.charAt(i);
                b='X';
                i++;
            }else{
                a=banro.charAt(i);
                b=banro.charAt(i+1);
                
                if(a==b)
                {
                    b='X';
                    i++;
                }else
                    i+=2;
            }
            banma+=thayThe(a,b);
            
            }
        return banma;
        }
    String thayThe(char a,char b)
    {
        String vta=timViTri(a);
        String vtb=timViTri(b);
        char x,y;
        if(vta.charAt(0)==vtb.charAt(0))
        {
            x=pf[vta.charAt(0)-'0'][((vta.charAt(1)-'0')+1)%5];
            y=pf[(vtb.charAt(0)-'0')][((vtb.charAt(1)-'0')+1)%5];
            return x+""+y;
        }
        if(vta.charAt(1)==vtb.charAt(1))
        {
            x=pf[((vta.charAt(0)-'0')+1)%5][(vta.charAt(1)-'0')];
            y=pf[((vtb.charAt(0)-'0')+1)%5][(vtb.charAt(1)-'0')];
            return x+""+y;
        }
        x=pf[(vta.charAt(0)-'0')][(vtb.charAt(1)-'0')];
        y=pf[(vtb.charAt(0)-'0')][(vta.charAt(1)-'0')];
        return x+""+y;
    }
    private String timViTri(char a)
    {
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                if(pf[i][j]==a)
                    return i+""+j;
        return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngiaima;
    private javax.swing.JButton btnmahoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea txtbm;
    private javax.swing.JTextField txtbr;
    // End of variables declaration//GEN-END:variables
}