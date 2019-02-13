
package medical.shop.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class billing_home extends javax.swing.JFrame {

    
     public billing_home() {
        initComponents();
        
        table("SELECT id,name,quantity,unit_price,total FROM billing_data ORDER BY id ASC");
        
        /*remove all lists*/
        String[] arr = {""};  
        search_item_lists.setListData(arr);
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
// Function For : displaying DB values to table as per Query
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
        displayTable.setModel(DbUtils.resultSetToTableModel(rs));
        displayTable.setVisible(true);

        /*Code to produce Total Cost*/
        String query2 = "SELECT total FROM billing_data;";
        pst = conn.prepareStatement(query2);
        rs = pst.executeQuery(query2); 
        int sum = 0;
        while(rs.next())  { sum += Integer.parseInt(rs.getString("total")); }    
        total_amount.setText(String.valueOf(sum)+"/-");
        
        
        if(sum == 0) printButton.setVisible(false);
        else  printButton.setVisible(true);
        /*-------------*/
    }
    catch(Exception ex) { 
        this.dispose();
        new billing_home().setVisible(true);
    }
   
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
        jLabel4 = new javax.swing.JLabel();
        side_view_bills_button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        disp_m_name = new javax.swing.JTextField();
        disp_m_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        disp_m_quantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        search_item_lists = new javax.swing.JList();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        disp_c_name = new javax.swing.JTextField();
        disp_c_contact_no = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        disp_c_address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        displayPanel = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        total_amount = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        ClearCartButton = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel4.setBackground(new java.awt.Color(102, 0, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Billing");

        side_view_bills_button.setText("List Purchases");
        side_view_bills_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                side_view_bills_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(side_view_bills_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(side_view_bills_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Billing")));

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Medicine Name  : ");

        jLabel6.setText("Medicine Id :");

        jLabel7.setText("Quanitity");

        AddButton.setBackground(new java.awt.Color(204, 255, 204));
        AddButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddButton.setText("Add >");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(255, 204, 204));
        ClearButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ClearButton.setText("Reset");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(disp_m_quantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(disp_m_id, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disp_m_name, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(disp_m_name, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(disp_m_id, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(disp_m_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        search_item_lists.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        search_item_lists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_item_listsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(search_item_lists);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Custumer Data"));

        jLabel8.setText("Customer Name :  ");

        jLabel11.setText("Customer Contact No:");

        jLabel9.setText("Customer Address");

        resetButton.setBackground(new java.awt.Color(255, 102, 102));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(153, 255, 102));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(disp_c_address, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(disp_c_contact_no)
                            .addComponent(disp_c_name))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disp_c_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(disp_c_contact_no, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(disp_c_address, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        displayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cart\n"));

        displayTable.setModel(new javax.swing.table.DefaultTableModel(
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
        displayTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayTableMouseClicked(evt);
            }
        });
        displayPanel.setViewportView(displayTable);

        jLabel10.setBackground(new java.awt.Color(0, 51, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Total : Rs. ");

        total_amount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        total_amount.setForeground(new java.awt.Color(0, 0, 255));
        total_amount.setText("00.00");

        printButton.setBackground(new java.awt.Color(153, 153, 255));
        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        ClearCartButton.setBackground(new java.awt.Color(255, 102, 102));
        ClearCartButton.setText("Clear Cart");
        ClearCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearCartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClearCartButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(total_amount)
                                        .addComponent(jLabel10))
                                    .addComponent(ClearCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(printButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))))
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

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        disp_c_name.setText(null);
        disp_c_contact_no.setText(null);
        disp_c_address.setText(null);     
    }//GEN-LAST:event_resetButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String e_name = disp_c_name.getText();
        String contact_no = disp_c_contact_no.getText();

        String e_address = disp_c_address.getText();

        if(e_name.equals(null) || contact_no.equals(null) || e_address.equals(null))
        {
            JOptionPane.showMessageDialog(null,"All fields are mandatory");
        }
        else
        {
            String query = "INSERT INTO customers (name,contact_no,address) VALUES ('"+e_name+"','"+contact_no+"','"+e_address+"')";

            Connection con = database();
            Statement db_statement = null;
            try { db_statement = con.createStatement(); } 
            catch (SQLException ex) { JOptionPane.showMessageDialog(null,ex); }
            
            try {
                int val = db_statement.executeUpdate(query);
                if(val == 1) JOptionPane.showMessageDialog(null,"Successfully Registered");
                else JOptionPane.showMessageDialog(null,"Failed To Register :");
            }
            catch (SQLException ex) 
            { 
                 JOptionPane.showMessageDialog(null, "Existing Account");
                 
                 Connection conn = database();
                 PreparedStatement pst = null;
                 ResultSet rs = null;
                 query = "SELECT name,address FROM customers WHERE contact_no = '"+contact_no+"'";
    
                try
                {
                    pst = conn.prepareStatement(query);
                    rs = pst.executeQuery(query); 
                    while(rs.next())  
                        { 
                            disp_c_name.setText(rs.getString("name")); 
                            disp_c_address.setText(rs.getString("address"));
                        }    
                }
                catch(Exception exx) { JOptionPane.showMessageDialog(null,exx); }
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        disp_m_name.setText(null);
        disp_m_id.setText(null);
        disp_m_quantity.setText(null);    
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
      String m_name = disp_m_name.getText();
      String m_id = disp_m_id.getText();
      String m_quantity = disp_m_quantity.getText();    
      String query =null;
      
      if(m_name.equals("") && m_id.equals("") )
      {
        JOptionPane.showMessageDialog(null,"Empty Fields");
      }
      else 
      {
          int id =0;
          if(!m_id.equals(""))
          {
            id =0;
            try{ id = Integer.parseInt(m_id); }
            catch(Exception ex) { JOptionPane.showMessageDialog(null,ex); }
          }
          
          
          if(!m_name.equals("") && !m_id.equals("") ) query = "SELECT * FROM stock WHERE name LIKE '%"+m_name+"%' OR id LIKE "+id;
          if(!m_name.equals("") && m_id.equals("") )  query = "SELECT * FROM stock WHERE name LIKE '%"+m_name+"%'";
          if(m_name.equals("") && !m_id.equals("") )  query = "SELECT * FROM stock WHERE id LIKE "+id;
      
        
      //JOptionPane.showMessageDialog(null,query);
      
    Connection conn = database();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    String list_of_medicines = null;
   
    try
    {
        pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
    }
    catch(Exception ex) { JOptionPane.showMessageDialog(null,"Error On Creating Prepared Statements \n\n"+ex); }      
     
      
    DefaultListModel dlm = new DefaultListModel();     
    int  i =0;
    try { 
            while(rs.next())  
            { 
                list_of_medicines = rs.getString("id")+"-"+rs.getString("name");   
                dlm.addElement(list_of_medicines);
            } 
            
            search_item_lists.setModel(dlm);
          
        } 
    catch (SQLException ex)  { JOptionPane.showMessageDialog(null,"Error \n\n"+ex); }    
     
    
     }/*Else Closed*/   
      
    }//GEN-LAST:event_AddButtonActionPerformed

    
    
    
    
/*----------------------------------------------------------------------------*/    
// Function For : Writing selected items from list_panel to DATABASE
/*----------------------------------------------------------------------------*/    
    private void search_item_listsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_item_listsMouseClicked
     
     int error_flag = 0;
     int  quantity = 0;
     try { quantity = Integer.parseInt(disp_m_quantity.getText()); }
     catch(Exception ex) { error_flag=1; if(!disp_m_quantity.getText().equals("")) JOptionPane.showMessageDialog(null,"Quantity must be numeric"); }

     if(quantity == 0) {error_flag=1; if(disp_m_quantity.getText().equals(""))  JOptionPane.showMessageDialog(null,"Invalid Quantity");}
     
    /*Getting the selected string and splitting to get the id of the medicine*/
     int index = search_item_lists.getSelectedIndex();
     String s = (String) search_item_lists.getSelectedValue();
     String[] pieces = s.split("-");
     int medicine_id = Integer.parseInt(pieces[0]);
     /*------------------------------------------------------------------------*/
     
     //JOptionPane.showMessageDialog(null,quantity+1);
     //JOptionPane.showMessageDialog(null,medicine_id+1);
     
        
    String name = null;
    int price = 0;
    int stock_available = 0;
        
    Connection conn = database();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    try { rs = conn.prepareStatement("Select name,price,stock_available FROM stock WHERE id = "+medicine_id).executeQuery(); }
    catch(Exception ex) { error_flag=1; JOptionPane.showMessageDialog(null,"Error On Creating Prepared Statements \n\n"+ex); }      
     
   try { 
            while(rs.next())  
            { 
               name = rs.getString("name");
               price = Integer.parseInt(rs.getString("price"));
               stock_available = Integer.parseInt(rs.getString("stock_available"));
            } 
        } 
    catch (SQLException ex)  { error_flag=1; JOptionPane.showMessageDialog(null,"Error \n\n"+ex); }    
   
   
   //JOptionPane.showMessageDialog(null,name+"\n\n"+price+"\n\n"+stock_available);
     
    if(quantity > stock_available) { error_flag=1; JOptionPane.showMessageDialog(null,"Insufficent Stock"); }
    
    if(error_flag == 0)
        {
            int total_price = quantity * price;
            String query = "INSERT INTO billing_data (medicine_id,name,quantity,unit_price,total) VALUES ("+medicine_id+",'"+name+"',"+quantity+","+price+","+total_price+")";

            int val = 0;
            Connection con = database();
            Statement db_statement = null;
            try 
                {  
                    db_statement = con.createStatement(); 
                    val = db_statement.executeUpdate(query);
                } 
            catch (SQLException ex) {JOptionPane.showMessageDialog(null,ex); }

            if(val != 1) JOptionPane.showMessageDialog(null,"DB Error");

            table("SELECT id,name,quantity,unit_price,total FROM billing_data ORDER BY id ASC");
        }
     
       
    }//GEN-LAST:event_search_item_listsMouseClicked

    
    
    
/*----------------------------------------------------------------------------*/    
// Function For : providing an option to remove selected item whaich has been saved to DB
/*----------------------------------------------------------------------------*/    
    private void displayTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayTableMouseClicked
       int row = displayTable.getSelectedRow();
        String emp_id = (displayTable.getModel().getValueAt(row,0).toString());
        int id =Integer.parseInt(emp_id);
        //JOptionPane.showMessageDialog(null,id);
        
        int response = JOptionPane.showConfirmDialog(null, "Do you want to remove this Item?");
        
        if(response == 0)
        {
        Connection con = database();
        Statement db_statement=null;
        try { db_statement = con.createStatement(); } 
        catch (SQLException ex) { JOptionPane.showMessageDialog(null,ex); }
        
        try { 
           String query = "DELETE FROM billing_data WHERE id="+id;
           int executeUpdate = db_statement.executeUpdate(query); 
            
           if(executeUpdate != 1) JOptionPane.showMessageDialog(null,"Failed To Execute");
               
            table("SELECT * FROM billing_data ORDER BY id ASC");
            
            } 
        catch (SQLException ex) {JOptionPane.showMessageDialog(null,"Error in Deletion\n\n"+ex); }
            
        }
    }//GEN-LAST:event_displayTableMouseClicked

    
    
    
    
    private void ClearCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearCartButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Do you want to remove this Item?");
        if(response == 0)
        {
        
        Connection con = database();
        Statement db_statement=null;
        try { db_statement = con.createStatement(); } 
        catch (SQLException ex) { JOptionPane.showMessageDialog(null,ex); }
        
        try { 
           String query = "TRUNCATE billing_data";
           int executeUpdate = db_statement.executeUpdate(query); 
           
           if(executeUpdate != 0)
           JOptionPane.showMessageDialog(null,"Failed To Execute Command");
           
           table("SELECT * FROM billing_data ORDER BY id ASC");
            
            } 
        catch (SQLException ex) {JOptionPane.showMessageDialog(null,"Error in Deletion\n\n"+ex); }
            
        }
    }//GEN-LAST:event_ClearCartButtonActionPerformed

    
    
    
    
/*----------------------------------------------------------------------------*/    
// This function makes necessary updation in stock availability and clears "Billing_data" TABLE
/*----------------------------------------------------------------------------*/    
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
    
    Connection conn = database();
    ResultSet rs = null;
    String query = null;
    
    /*-Checking For Customer Data and Managing cust data-*/
    int response =  0;
    String customer_contact_no = disp_c_contact_no.getText();
    if(customer_contact_no.equals(""))
    {
        /*- response : yes:0 , no:1, cancell:2 -*/
        response = JOptionPane.showConfirmDialog(null, "Do you want to continue without customer registration?");
        customer_contact_no = "Not Available";
    }
    else
    {
        try
          {
               int ii=0;
               rs = conn.prepareStatement("SELECT name,address FROM customers WHERE contact_no = '"+customer_contact_no+"'").executeQuery();

               while(rs.next())  
               {
                   ii=1;
                   disp_c_name.setText(rs.getString("name")); 
                   disp_c_address.setText(rs.getString("address"));
                   //JOptionPane.showMessageDialog(null,"cust no exists");
               }    

               if(ii==0)
               {
                query = "INSERT INTO customers (name,contact_no,address) VALUES ('"+disp_c_name.getText()+"','"+customer_contact_no+"','"+disp_c_address.getText()+"')";
                conn.prepareStatement(query).executeUpdate();
                JOptionPane.showMessageDialog(null,"New Customer Added");
               }
          }
          catch(Exception exx) { JOptionPane.showMessageDialog(null,exx); }
    }
    /*----------------------*/         
    
    if(response == 0)
    {      

        /*-Writing purchase data into purchase table : Data from billing data table-*/
        String name = null;
        int price,quantity,total_price,medicine_id,flag = 0;
        int stock_available = 0;
        int val = 0;
        
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        Statement db_statement=null;
        ResultSet rs2 = null;
        
        try { 
                rs = conn.prepareStatement("Select * FROM billing_data").executeQuery();
                while(rs.next())  
                { 
                   name = rs.getString("name");
                   price = Integer.parseInt(rs.getString("unit_price"));
                   quantity = Integer.parseInt(rs.getString("quantity"));
                   total_price = Integer.parseInt(rs.getString("total"));
                   
                   /*-updating stock table-*/
                   medicine_id = Integer.parseInt(rs.getString("medicine_id"));
                   rs2 = conn.prepareStatement("Select stock_available FROM stock WHERE id = "+medicine_id).executeQuery();
                   while(rs2.next()) 
                   { 
                        stock_available =  Integer.parseInt(rs2.getString("stock_available")) - quantity; 
                        query = "UPDATE stock SET stock_available = "+stock_available+" WHERE id = "+medicine_id;
                        try { conn.createStatement().executeUpdate(query);  } 
                        catch (SQLException ex) { JOptionPane.showMessageDialog(null,ex); }
                    }
                   /*----------------------*/
                   
                   String values = "('"+timeStamp+"','"+name+"','"+customer_contact_no+"',"+quantity+","+price+","+total_price+")";
                   query = "INSERT INTO purchases (date,product,customer_contact_no,quantity,unit_price,total_cost) VALUES "+values;
                   val = conn.prepareStatement(query).executeUpdate();
                   
                   if(val != 1) flag+=1;
                } 
            } 
        catch (Exception ex)  { JOptionPane.showMessageDialog(null,"3 Error \n\n"+ex); }    
        /*-------------------------------------------------------------------------------*/


        /*-Clearing data from "bill_data" table-*/
        if(flag != 0) JOptionPane.showMessageDialog(null,"DB Error");
        else 
         {
             try { 
                    try { db_statement = conn.createStatement(); } 
                    catch (SQLException ex) { JOptionPane.showMessageDialog(null,ex); }
                    int executeUpdate = db_statement.executeUpdate("TRUNCATE billing_data"); 

                    if(executeUpdate != 0) JOptionPane.showMessageDialog(null,"Failed To Clear Billing Data Table But Data Successfully Entered into Purchase Table");
                    else 
                        {
                            table("SELECT * FROM billing_data ORDER ");
                            JOptionPane.showMessageDialog(null,"Purchase Complete"); 
                        }
                 } 
             catch (SQLException ex) {JOptionPane.showMessageDialog(null,"2. Error in Deletion\n\n"+ex); }
         }
        /*-------------------------------------*/

    
    }/*if closed for no customer contact no*/
                
   
    }//GEN-LAST:event_printButtonActionPerformed

    
    
    
    
    private void side_view_bills_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_side_view_bills_buttonActionPerformed
      this.dispose();
      new view_bills().setVisible(true);
    }//GEN-LAST:event_side_view_bills_buttonActionPerformed

    
   
    
    
    
    
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
            java.util.logging.Logger.getLogger(billing_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton ClearCartButton;
    private javax.swing.JTextField disp_c_address;
    private javax.swing.JTextField disp_c_contact_no;
    private javax.swing.JTextField disp_c_name;
    private javax.swing.JTextField disp_m_id;
    private javax.swing.JTextField disp_m_name;
    private javax.swing.JTextField disp_m_quantity;
    private javax.swing.JScrollPane displayPanel;
    private javax.swing.JTable displayTable;
    private javax.swing.JButton header_billing_button;
    private javax.swing.JButton header_customer_button;
    private javax.swing.JButton header_employees_button;
    private javax.swing.JButton header_stock_button;
    private javax.swing.JButton header_vendors_button;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JList search_item_lists;
    private javax.swing.JButton side_view_bills_button;
    private javax.swing.JLabel total_amount;
    // End of variables declaration//GEN-END:variables

}
