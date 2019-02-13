
package medical.shop.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class customers_home extends javax.swing.JFrame {

    int global_id = 0;
    String global_contact_no = null;
    
    public customers_home() {
        initComponents();
        
        hide_function(0);
        
        String query = "SELECT * FROM customers ORDER BY id ASC";
        table(query);
    }

    
     
/*----------------------------------------------------------------------------*/    
// Function For : Establishing Connection with DATABASE
// Example      : Satatement st = database(); 
// Usage        : Returns connection statement 
// Last Update  : 01 Nov 2014.   
/*----------------------------------------------------------------------------*/    
    private Connection database() {
        Connection con = null;
        String db_url = "jdbc:mysql://localhost:3306/medicalshopms";
        String db_driver = "com.mysql.jdbc.Driver";
        String db_username = "root";
        String db_password = "";
        
        try {
            Class.forName(db_driver);
            con = DriverManager.getConnection(db_url,db_username,db_password);
            } 
        catch (SQLException | ClassNotFoundException ex) { JOptionPane.showMessageDialog(null,ex); }
        return con;
    }

   
/*----------------------------------------------------------------------------*/    
// Function For : displaying DB values to table as per Query [FOR TOP TABLE]
// Example      : table("SELECT * FROM tbl_name"); 
// Last Update  : 03 Nov 2014.   
/*----------------------------------------------------------------------------*/    
private void table(String query){
    Connection conn = database();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    try
    {
        pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
        customersDisplayTable.setModel(DbUtils.resultSetToTableModel(rs));
        customersDisplayTable.setVisible(true);
    }
    catch(Exception ex)
    { JOptionPane.showMessageDialog(null,ex); }
}    
   
    
   
/*----------------------------------------------------------------------------*/    
// Function For : displaying DB values to table as per Query [FOR BOTTOM TABLE]
// Example      : table("SELECT * FROM tbl_name"); 
// Last Update  : 03 Nov 2014.   
/*----------------------------------------------------------------------------*/    
private void table_recepts(String query){
    Connection conn = database();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    try
    {
        pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
        receptsDisplayTable.setModel(DbUtils.resultSetToTableModel(rs));
        receptsDisplayTable.setVisible(true);
    }
    catch(Exception ex)
    { JOptionPane.showMessageDialog(null,ex); }
}    
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        header_billing_button = new javax.swing.JButton();
        header_customer_button = new javax.swing.JButton();
        header_vendors_button = new javax.swing.JButton();
        header_stock_button = new javax.swing.JButton();
        header_employees_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        customer_search_field = new javax.swing.JTextField();
        customer_search_button = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        receptSearch = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersDisplayTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        receiptsDataTable = new javax.swing.JScrollPane();
        receptsDisplayTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        disp_c_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        disp_c_contact_no = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        disp_c_address = new javax.swing.JTextArea();
        updateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Medical Shop Management System");

        header_billing_button.setText("Billing");
        header_billing_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                header_billing_buttonActionPerformed(evt);
            }
        });

        header_customer_button.setText("Customers");
        header_customer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                header_customer_buttonActionPerformed(evt);
            }
        });

        header_vendors_button.setText("Vendors");
        header_vendors_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                header_vendors_buttonActionPerformed(evt);
            }
        });

        header_stock_button.setText("Stock");
        header_stock_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                header_stock_buttonActionPerformed(evt);
            }
        });

        header_employees_button.setText("Employees");
        header_employees_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                header_employees_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(header_billing_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header_customer_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header_vendors_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header_stock_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header_employees_button)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header_employees_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header_stock_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header_vendors_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header_customer_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header_billing_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Medical Shop Management System");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("All Rights Reserved");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jButton5.setBackground(new java.awt.Color(255, 153, 204));
        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Enter Customer Name / Mobile : ");

        customer_search_button.setBackground(new java.awt.Color(204, 255, 153));
        customer_search_button.setText("Search");
        customer_search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customer_search_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customer_search_field, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customer_search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customer_search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setText("Enter a date to find receipts");

        receptSearch.setText("Search");
        receptSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(receptSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receptSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Customers");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Customers"));

        customersDisplayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customersDisplayTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersDisplayTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customersDisplayTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Receipts"));

        receptsDisplayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        receptsDisplayTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptsDisplayTableMouseClicked(evt);
            }
        });
        receiptsDataTable.setViewportView(receptsDisplayTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receiptsDataTable)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receiptsDataTable, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Customer Details");

        jLabel6.setText("Customer Name : ");

        jLabel7.setText("Contact Number : ");

        jLabel8.setText("Address : ");

        disp_c_address.setColumns(20);
        disp_c_address.setRows(5);
        jScrollPane2.setViewportView(disp_c_address);

        updateButton.setBackground(new java.awt.Color(102, 255, 102));
        updateButton.setText("Update ");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(255, 51, 102));
        DeleteButton.setText("Delete Customer");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(disp_c_contact_no)
                    .addComponent(disp_c_name, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disp_c_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disp_c_contact_no, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void header_billing_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_header_billing_buttonActionPerformed
        this.dispose();
        new billing_home().setVisible(true);
    }//GEN-LAST:event_header_billing_buttonActionPerformed

    private void header_customer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_header_customer_buttonActionPerformed
        this.dispose();
        new customers_home().setVisible(true);
    }//GEN-LAST:event_header_customer_buttonActionPerformed

    private void header_vendors_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_header_vendors_buttonActionPerformed
        this.dispose();
        new vendors_home().setVisible(true);
    }//GEN-LAST:event_header_vendors_buttonActionPerformed

    private void header_stock_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_header_stock_buttonActionPerformed
        this.dispose();
        new stock_home().setVisible(true);
    }//GEN-LAST:event_header_stock_buttonActionPerformed

    private void header_employees_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_header_employees_buttonActionPerformed
        this.dispose();
        new employees_home().setVisible(true);
    }//GEN-LAST:event_header_employees_buttonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        new home().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void customersDisplayTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersDisplayTableMouseClicked
        //String c_id = null;
        String c_name = null;
        String c_contact_no = null;
        String c_address    = null;
        
        int row = customersDisplayTable.getSelectedRow();
        String emp_id = (customersDisplayTable.getModel().getValueAt(row,0).toString());
        int id =Integer.parseInt(emp_id);
        global_id = id;
        //JOptionPane.showMessageDialog(null,id);
        
        
        String query = "SELECT * FROM customers WHERE id="+id;
        Connection con = database();
        Statement db_statement=null;
        try { db_statement = con.createStatement(); } 
        catch (SQLException ex) { JOptionPane.showMessageDialog(null,ex); }
        
        try { 
            ResultSet rs = db_statement.executeQuery(query); 
            while(rs.next()) 
                {
                     c_name = rs.getString("name");
                     c_contact_no = rs.getString("contact_no");
                     c_address    = rs.getString("address");
                     
                }
            
            //JOptionPane.showMessageDialog(null,e_id+"\n\n"+e_name+"\n\n"+e_dob+"\n\n"+e_doj+"\n\n"+e_contact_no+"\n\n"+e_address+"\n\n"+last_update);
            
            disp_c_name.setText(c_name);
            disp_c_address.setText(c_address);
            disp_c_contact_no.setText(c_contact_no);
        }
        catch(Exception ex){ JOptionPane.showMessageDialog(null,ex); }
        
        global_contact_no = c_contact_no;
        /*Fetch recept datas*/
        table_recepts("SELECT id,date,product,quantity,unit_price,total_cost FROM purchases WHERE customer_contact_no='"+c_contact_no+"'");
        /*------------------*/
        
         hide_function(1);
    }//GEN-LAST:event_customersDisplayTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       
          String name = disp_c_name.getText();
          String address = disp_c_address.getText();
          String contact_no = disp_c_contact_no.getText();
          
        int i = 0;
        String update_value = "";
        
        if(!name.equals(""))        {  if(i>0) update_value += ", ";   update_value += "name = '"+name+"'";             i++; }
        if(!address.equals(""))     {  if(i>0) update_value += ", ";   update_value += "address = '"+address+"'";       i++; }
        if(!contact_no.equals(""))  {  if(i>0) update_value += ", ";   update_value += "contact_no = '"+contact_no+"'"; i++; }
        
        
        String query = "UPDATE customers SET "+update_value+" WHERE id = '"+global_id+"'";
        
        //JOptionPane.showMessageDialog(null,query);
        
        Connection con = database();
        Statement db_statement = null;
        try {  db_statement = con.createStatement(); } 
        catch (SQLException ex) {JOptionPane.showMessageDialog(null,ex); }
        
        try { 
                int flag = db_statement.executeUpdate(query); 
                int flag_2 = 0;
                 
                if(!contact_no.equals(""))
                {
                    flag_2 = db_statement.executeUpdate("UPDATE purchases SET customer_contact_no = '"+contact_no+"' WHERE customer_contact_no = '"+global_contact_no+"'");
                }
             
                
                if((flag != 1) || (flag_2 != 1)) 
                {
                    JOptionPane.showMessageDialog(null,"Successfully Updated");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Error in Updation..");
                }
            } 
        catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Error in Updation"); }
       
        
        table("SELECT * FROM customers ORDER BY id ASC");
        table_recepts("SELECT id,date,product,quantity,unit_price,total_cost FROM purchases WHERE customer_contact_no = '"+contact_no+"'ORDER BY id ASC");
    }//GEN-LAST:event_updateButtonActionPerformed

    
    
    
    
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure?");
        
        if(response == 0)
        {
        Connection con = database();
        Statement db_statement=null;
        try { db_statement = con.createStatement(); } 
        catch (SQLException ex) { JOptionPane.showMessageDialog(null,ex); }
        
        
        try { 
           int executeUpdate = db_statement.executeUpdate("DELETE FROM customers WHERE id="+global_id); 
           int executeUpdate2 = db_statement.executeUpdate("UPDATE purchases SET customer_contact_no = 'Not Available' WHERE customer_contact_no='"+global_contact_no+"'"); 
           
           JOptionPane.showMessageDialog(null,"Successfully Removed");
           
           disp_c_name.setText(null);
           disp_c_address.setText(null);
           disp_c_contact_no.setText(null);
       
           table("SELECT * FROM customers ORDER BY id ASC");
           table_recepts("SELECT id,date,product,quantity,unit_price,total_cost FROM purchases WHERE customer_contact_no = '"+global_contact_no+"'ORDER BY id ASC");
            
            } 
        catch (SQLException ex) {JOptionPane.showMessageDialog(null,"Error in Deletion\n\n"+ex); }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    
    
    
    private void customer_search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_search_buttonActionPerformed
        
        String value = customer_search_field.getText();
        if(value.equals("")) table("SELECT * FROM customers ORDER BY id ASC");
        else
        {
        String query = "SELECT * FROM customers WHERE (name LIKE \'%"+value+"%\') OR(address LIKE \'%"+value+"%\') OR (contact_no LIKE \'%"+value+"%\') ORDER BY id ASC";
        table(query);
        }
    }//GEN-LAST:event_customer_search_buttonActionPerformed

    private void receptSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptSearchActionPerformed
        String dob = null;
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");

        try{  dob = formatter.format(dateField.getDate()); }
        catch(Exception ex) { dob = ""; }

        if(dob.equals("")) 
        {
            table_recepts("SELECT id,date,product,quantity,unit_price,total_cost FROM purchases WHERE customer_contact_no ='"+global_contact_no+"' ORDER BY id ASC");
        }
        else
        {
        table_recepts("SELECT id,date,product,quantity,unit_price,total_cost FROM purchases WHERE (date = '"+dob+"') AND (customer_contact_no ='"+global_contact_no+"') ORDER BY id ASC");
        }
    }//GEN-LAST:event_receptSearchActionPerformed

    
    
    
    private void receptsDisplayTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptsDisplayTableMouseClicked
        int row = receptsDisplayTable.getSelectedRow();
        String emp_id = (receptsDisplayTable.getModel().getValueAt(row,0).toString());
        int id =Integer.parseInt(emp_id);
        
        
        this.dispose();
       new customer_product_return(id).setVisible(true);
        
    }//GEN-LAST:event_receptsDisplayTableMouseClicked

    public void hide_function(int param){
        if(param == 0) 
        {
            receptsDisplayTable.setVisible(false);
            disp_c_name.setEnabled(false);
            disp_c_address.setEnabled(false);
            disp_c_contact_no.setEnabled(false);
            updateButton.setEnabled(false);
            DeleteButton.setEnabled(false);
            receptSearch.setEnabled(false);
            dateField.setEnabled(false);
        }
        else
        {
            receptsDisplayTable.setVisible(true);
            disp_c_name.setEnabled(true);
            disp_c_address.setEnabled(true);
            disp_c_contact_no.setEnabled(true);
            updateButton.setEnabled(true);
            DeleteButton.setEnabled(true);
            receptSearch.setEnabled(true);
            dateField.setEnabled(true);
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(customers_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customers_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customers_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customers_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customers_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton customer_search_button;
    private javax.swing.JTextField customer_search_field;
    private javax.swing.JTable customersDisplayTable;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JTextArea disp_c_address;
    private javax.swing.JTextField disp_c_contact_no;
    private javax.swing.JTextField disp_c_name;
    private javax.swing.JButton header_billing_button;
    private javax.swing.JButton header_customer_button;
    private javax.swing.JButton header_employees_button;
    private javax.swing.JButton header_stock_button;
    private javax.swing.JButton header_vendors_button;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane receiptsDataTable;
    private javax.swing.JButton receptSearch;
    private javax.swing.JTable receptsDisplayTable;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

}
