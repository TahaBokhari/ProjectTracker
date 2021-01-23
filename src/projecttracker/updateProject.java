/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttracker;

import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
//import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author tahab
 */

public class updateProject extends javax.swing.JFrame {

    /**
     * Creates new form ProjectForm
     */
    Connection conn=null;
    
    public updateProject() throws SQLException {
        
        initComponents();
       
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        searchGroup.add(projectNumberRadio);
        searchGroup.add(projectDescriptionRadio);
        projNum.disable();
        projDesc.disable();
        
        
        conn=SqLiteConnection.connect();
        
        
        
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void setCompany(String Company) {
        this.Company.setText(Company);
    }

    public void setLocation(String Location) {
        this.Location.setText(Location);
    }

    public void setPrice(String Price) {
        this.Price.setText(Price); 
    }

    public void setProjectNumber(String ProjectNumber) {
        this.ProjectNumber.setText(ProjectNumber); 
    }

    public void setTeam(String Team) {
        this.Team.setText(Team);
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus.setSelectedItem(completionStatus);
    }

    public void setDescription(String description) {
        this.description.setText(description) ;
    }

    public void setEndDate(Date endDate) {
        this.endDate.setDate(endDate);
    }

    public void setGush(String gush) {
        this.gush.setText(gush);
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public void setParcel(String parcel) {
        this.parcel.setText(parcel) ;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus.setSelectedItem(paymentStatus);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.setText(phoneNumber);
    }

    public void setProjDesc(JTextField projDesc) {
        this.projDesc = projDesc;
    }

    public void setProjNum(JTextField projNum) {
        this.projNum = projNum;
    }

    public void setProjectDescriptionRadio(JRadioButton projectDescriptionRadio) {
        this.projectDescriptionRadio = projectDescriptionRadio;
    }

    public void setProjectNumberRadio(JRadioButton projectNumberRadio) {
        this.projectNumberRadio = projectNumberRadio;
    }

    public void setSearchGroup(ButtonGroup searchGroup) {
        this.searchGroup = searchGroup;
    }

    public void setSearchProject(JButton searchProject) {
        this.searchProject = searchProject;
    }

    public void setSection(String section) {
        this.section.setText(section); 
    }

    public void setStartDate(Date startDate) {
        this.startDate.setDate(startDate);
    }

    public void setUpdateProject(JButton updateProject) {
        this.updateProject = updateProject;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        searchGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ProjectNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Team = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Company = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Location = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        startDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        paymentStatus = new javax.swing.JComboBox();
        completionStatus = new javax.swing.JComboBox();
        updateProject = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        gush = new javax.swing.JTextField();
        parcel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        section = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        projectNumberRadio = new javax.swing.JRadioButton();
        projectDescriptionRadio = new javax.swing.JRadioButton();
        projNum = new javax.swing.JTextField();
        projDesc = new javax.swing.JTextField();
        searchProject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Update Project");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 404, 13, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(41, 0, 0));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 658, 0, 41);
        jPanel2.add(jButton3, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Project Number:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 157, -1, 25));

        ProjectNumber.setEditable(false);
        ProjectNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectNumberActionPerformed(evt);
            }
        });
        jPanel3.add(ProjectNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 157, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Project Description: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 195, -1, 25));
        jPanel3.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 195, 450, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Team: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 233, -1, 25));
        jPanel3.add(Team, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 233, 157, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Company: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 271, -1, 25));
        jPanel3.add(Company, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 271, 157, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Location: ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 347, -1, 25));
        jPanel3.add(Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 347, 157, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Start Date:  ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 385, -1, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("End Date:  ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 423, -1, 25));

        startDate.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(startDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 385, 361, -1));

        endDate.setDateFormatString("yyyy-MM-dd");
        endDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                endDateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(endDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 423, 361, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setText("Price:  ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 469, -1, 25));
        jPanel3.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 471, 157, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Payment Status:   ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 626, -1, 25));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Completion Status:   ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 664, -1, 25));

        paymentStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paid", "Not Paid" }));
        paymentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentStatusActionPerformed(evt);
            }
        });
        jPanel3.add(paymentStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 628, 157, -1));

        completionStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "On Work", "On Drow", "Done" }));
        completionStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completionStatusActionPerformed(evt);
            }
        });
        jPanel3.add(completionStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 666, 157, -1));

        updateProject.setBackground(new java.awt.Color(153, 153, 153));
        updateProject.setText("Update Project");
        updateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProjectActionPerformed(evt);
            }
        });
        jPanel3.add(updateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 742, 250, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setText("Gush:  ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 512, -1, 25));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setText("Parcel: ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 550, -1, 25));
        jPanel3.add(gush, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 514, 157, -1));
        jPanel3.add(parcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 157, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Phone Number: ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 309, -1, 25));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel15.setText("Section: ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 588, -1, 25));
        jPanel3.add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 588, 157, -1));
        jPanel3.add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 309, 157, -1));

        projectNumberRadio.setBackground(new java.awt.Color(255, 255, 255));
        projectNumberRadio.setText("Project Number ");
        projectNumberRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectNumberRadioActionPerformed(evt);
            }
        });
        jPanel3.add(projectNumberRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 56, -1, -1));

        projectDescriptionRadio.setBackground(new java.awt.Color(255, 255, 255));
        projectDescriptionRadio.setText("Project Description ");
        projectDescriptionRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectDescriptionRadioActionPerformed(evt);
            }
        });
        jPanel3.add(projectDescriptionRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 56, -1, -1));

        projNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projNumActionPerformed(evt);
            }
        });
        jPanel3.add(projNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 57, 150, -1));
        jPanel3.add(projDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 57, 450, -1));

        searchProject.setText("Search Project");
        searchProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProjectActionPerformed(evt);
            }
        });
        jPanel3.add(searchProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(998, 56, 128, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void ProjectNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjectNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProjectNumberActionPerformed

    private void paymentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentStatusActionPerformed

    private void updateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProjectActionPerformed
        // TODO add your handling code here:
        int projNum=Integer.parseInt(ProjectNumber.getText());
        String projDesc=description.getText();
        String team=Team.getText();
        String comp=Company.getText();
        String ph=phoneNumber.getText();
        String loc=Location.getText();
        String sec=section.getText();
        
        java.util.Date d1 = startDate.getDate();
        java.sql.Timestamp sDate = new java.sql.Timestamp(d1.getTime());
        
        java.util.Date d2 = endDate.getDate();
        java.sql.Timestamp eDate = new java.sql.Timestamp(d2.getTime());
        int amount=Integer.parseInt(Price.getText());
        int Gush=Integer.parseInt(gush.getText());
        int Parcel=Integer.parseInt(parcel.getText());
        
        String payStatus=paymentStatus.getSelectedItem().toString();
        String compStatus=completionStatus.getSelectedItem().toString();
        
       
//        if(eDate.after(sDate))
//        {
            System.out.println(true);
            long diff = eDate.getTime() - sDate.getTime();
            int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
            System.out.println(diffDays);
            
         
        String sql="Update Projects Set projectDescription=?, team=?, company=?, phoneNumber=?, location=?, startDate=?, endDate=?, workingDays=?, price=?, gush=?, parcel=?, section=?, paymentStatus=?, completionStatus=?  Where projectNumber= ? ";
        
        PreparedStatement pstmt=null;
        
        try {

        pstmt = conn.prepareStatement(sql);
        

        //System.out.println(date);
        //pstmt.setInt(1,projNum);
        //pstmt.setTimestamp(1, date);
        pstmt.setString(1,projDesc);
        pstmt.setString(2,team);
        pstmt.setString(3,comp);
        pstmt.setString(4,ph);
        pstmt.setString(5, loc);//setString(5,loc);
        pstmt.setTimestamp(6, sDate);
        pstmt.setTimestamp(7, eDate);//new java.sql.Date(eDate.getTime())
        pstmt.setInt(8,diffDays);//diffDays
        pstmt.setInt(9,amount);
        pstmt.setInt(10,Gush);
        pstmt.setInt(11,Parcel);
        pstmt.setString(12,sec);
        pstmt.setString(13,payStatus);
        pstmt.setString(14,compStatus);
        
        pstmt.setInt(15,projNum);

        pstmt.executeUpdate();
        
        
         
//        String folderName=projNum+" "+projDesc;
//        
//        File theDir = new File("Projects/"+folderName);
//        theDir.mkdir();
        
            
            JOptionPane.showMessageDialog(null," Project Updated Successfully! ");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(updateProject.class.getName()).log(Level.SEVERE, null, ex);
        }
//        } catch (InterruptedException ex) {
//            Logger.getLogger(updateProject.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        finally
        {
            try {
                pstmt.close();
                conn.close();
                
//                TimeUnit.SECONDS.sleep(4);
                
                updateProject obj=new updateProject();
                obj.setVisible(true);
                this.dispose();
//                rs.close();
                
//                ProjectForm obj=new ProjectForm();
//                obj.setVisible(true);
//                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(ProjectForm.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(updateProject.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }

        
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null,"  End Date should be greater than start Date! ");
//        }
        }
    }//GEN-LAST:event_updateProjectActionPerformed

    private void endDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_endDateAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_endDateAncestorAdded

    private void completionStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completionStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_completionStatusActionPerformed

    private void projectNumberRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectNumberRadioActionPerformed
        // TODO add your handling code here:
        projNum.enable();
        projDesc.disable();
    }//GEN-LAST:event_projectNumberRadioActionPerformed

    private void projNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projNumActionPerformed

    private void projectDescriptionRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectDescriptionRadioActionPerformed
        // TODO add your handling code here:
        projDesc.enable();
        projNum.disable();
    }//GEN-LAST:event_projectDescriptionRadioActionPerformed

    private void searchProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProjectActionPerformed
        // TODO add your handling code here:
        Statement stmt=null;
        ResultSet rs=null;
        String sql=null;
        
        if(projectNumberRadio.isSelected()==true && projectDescriptionRadio.isSelected()==false)
        {
            int project=Integer.parseInt(projNum.getText().toString());
            sql="Select projectNumber,projectDescription,team,company,phoneNumber,location,startDate,endDate,workingDays,price,gush,parcel,section,paymentStatus,completionStatus From Projects Where projectNumber= '"+project+"'";
         
            try {
                stmt=conn.createStatement();
                rs=stmt.executeQuery(sql);
                
                
                if(!rs.next())
                {
                  JOptionPane.showMessageDialog(null," No Record Found ");
                  
                  
                }
                else
                {
                  stmt=conn.createStatement();
                  rs=stmt.executeQuery(sql);  
                  
                  ProjectNumber.setText(rs.getString("projectNumber"));
                  description.setText(rs.getString("projectDescription"));
                  Team.setText(rs.getString("team"));
                  Company.setText(rs.getString("company"));
                  phoneNumber.setText(rs.getString("phoneNumber"));
                  Location.setText(rs.getString("location"));
                  startDate.setDate(rs.getDate("startDate"));
                  endDate.setDate(rs.getDate("endDate"));
                  Price.setText(rs.getString("price"));
                  gush.setText(rs.getString("gush"));
                  parcel.setText(rs.getString("parcel"));
                  section.setText(rs.getString("section"));
                  paymentStatus.setSelectedItem(rs.getString("paymentStatus"));
                  completionStatus.setSelectedItem(rs.getString("completionStatus"));
                  
                }
            } catch (SQLException ex) {
                Logger.getLogger(FilterProjects.class.getName()).log(Level.SEVERE, null, ex);
         
        }
            finally
        {
            try {
                stmt.close();
                rs.close();
                
//                ProjectForm obj=new ProjectForm();
//                obj.setVisible(true);
//                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(ProjectForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        else if(projectDescriptionRadio.isSelected()==true && projectNumberRadio.isSelected()==false)
        {
            String desc=projDesc.getText().toString();
            sql="Select projectNumber,projectDescription,team,company,phoneNumber,location,startDate,endDate,workingDays,price,gush,parcel,section,paymentStatus,completionStatus From Projects Where projectDescription= '"+desc+"'";
         
            try {
                stmt=conn.createStatement();
                rs=stmt.executeQuery(sql);
                
                
                if(!rs.next())
                {
                  JOptionPane.showMessageDialog(null," No Record Found ");
                  
                  
                }
                else
                {
                  stmt=conn.createStatement();
                  rs=stmt.executeQuery(sql);  
                  
                  ProjectNumber.setText(rs.getString("projectNumber"));
                  description.setText(rs.getString("projectDescription"));
                  Team.setText(rs.getString("team"));
                  Company.setText(rs.getString("company"));
                  phoneNumber.setText(rs.getString("phoneNumber"));
                  Location.setText(rs.getString("location"));
                  startDate.setDate(rs.getDate("startDate"));
                  endDate.setDate(rs.getDate("endDate"));
                  Price.setText(rs.getString("price"));
                  gush.setText(rs.getString("gush"));
                  parcel.setText(rs.getString("parcel"));
                  section.setText(rs.getString("section"));
                  paymentStatus.setSelectedItem(rs.getString("paymentStatus"));
                  completionStatus.setSelectedItem(rs.getString("completionStatus"));
                  
                }
            } catch (SQLException ex) {
                Logger.getLogger(FilterProjects.class.getName()).log(Level.SEVERE, null, ex);
            
          
            
        }
            finally
        {
            try {
                stmt.close();
                rs.close();
                
//                ProjectForm obj=new ProjectForm();
//                obj.setVisible(true);
//                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(ProjectForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        }
        else if(projectDescriptionRadio.isSelected()==false && projectNumberRadio.isSelected()==false)
        {
          
                JOptionPane.showMessageDialog(null," Please select atleast one option ");
                
//            } catch (SQLException ex) {
//                Logger.getLogger(updateProject.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        
//        stmt.close();
//        rs.close();
    }//GEN-LAST:event_searchProjectActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            menu obj=new menu();
            obj.setVisible(true);
            conn.close();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(updateProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(updateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new updateProject().setVisible(true);
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(updateProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Company;
    private javax.swing.JTextField Location;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField ProjectNumber;
    private javax.swing.JTextField Team;
    private javax.swing.JComboBox completionStatus;
    private javax.swing.JTextField description;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JTextField gush;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField parcel;
    private javax.swing.JComboBox paymentStatus;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField projDesc;
    private javax.swing.JTextField projNum;
    private javax.swing.JRadioButton projectDescriptionRadio;
    private javax.swing.JRadioButton projectNumberRadio;
    private javax.swing.ButtonGroup searchGroup;
    private javax.swing.JButton searchProject;
    private javax.swing.JTextField section;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JButton updateProject;
    // End of variables declaration//GEN-END:variables
}
