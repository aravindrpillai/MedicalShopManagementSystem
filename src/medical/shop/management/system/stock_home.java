
package medical.shop.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class stock_home extends javax.swing.JFrame {

    int global_medicine_id = 0;
    
    public stock_home() {
        initComponents();
        
        disp_selectedVendor.setEnabled(false);
        
        combobox_for_vendors();
        modifyPanel.setVisible(false);
        
        String query = "SELECT id,name,price,stock_available FROM stock ORDER BY id ASC";
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
        searchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        search_by_vendor = new javax.swing.JComboBox();
        vendor_search_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        modifyPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        disp_s_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        disp_s_cost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        disp_s_stock_available = new javax.swing.JTextField();
        disp_s_min_quantity = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lastUpdate = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        disp_s_vendor_id = new javax.swing.JComboBox();
        disp_selectedVendor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        returnStockButton = new javax.swing.JButton();

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

        header_stock_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
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

        jLabel4.setText("Enter Medicine Name : ");

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SearchButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchField))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Stock");

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setText("List medicines by Vendors :");

        vendor_search_button.setText("Search");
        vendor_search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendor_search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vendor_search_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search_by_vendor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_by_vendor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendor_search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton1.setText("List Return Stocks");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
        jScrollPane1.setViewportView(displayTable);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Medicine Name : ");

        jLabel6.setText("Cost");

        disp_s_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disp_s_costActionPerformed(evt);
            }
        });

        jLabel8.setText("Stock Available");

        updateButton.setBackground(new java.awt.Color(204, 255, 51));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(255, 102, 102));
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Last Updated On : ");

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        disp_s_vendor_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disp_s_vendor_idActionPerformed(evt);
            }
        });

        jLabel13.setText("Selected Vendor : ");

        jLabel14.setText("Select New Vendor If You Want To Alter");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disp_s_vendor_id, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(disp_selectedVendor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(0, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(disp_selectedVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel14)
                .addGap(1, 1, 1)
                .addComponent(disp_s_vendor_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setText("Minimum Stock");

        returnStockButton.setBackground(new java.awt.Color(255, 102, 102));
        returnStockButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        returnStockButton.setText("Return Stock");
        returnStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnStockButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modifyPanelLayout = new javax.swing.GroupLayout(modifyPanel);
        modifyPanel.setLayout(modifyPanelLayout);
        modifyPanelLayout.setHorizontalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addGroup(modifyPanelLayout.createSequentialGroup()
                            .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(disp_s_stock_available, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(disp_s_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(disp_s_min_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(disp_s_name)))
                .addGap(35, 35, 35)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 109, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        modifyPanelLayout.setVerticalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addComponent(returnStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(modifyPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(disp_s_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(disp_s_stock_available, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(disp_s_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(disp_s_min_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(lastUpdate))
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modifyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modifyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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

    private void displayTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayTableMouseClicked
        
        modifyPanel.setVisible(true);
         
        String s_id = null;
        String s_name = null;
        String selected_vendor = null;
        String stock_available = null;
        String min_quantity = null;
        String last_update    = null;
        String unit_price = null;
        String s_last_update = null;
        
        int row = displayTable.getSelectedRow();
        String emp_id = (displayTable.getModel().getValueAt(row,0).toString());
        int id =Integer.parseInt(emp_id);
        
        int vendor_id = 0;
        
        global_medicine_id = id;
        
        String query = "SELECT * FROM stock WHERE id="+id;
        Connection con = database();
        Statement db_statement=null;
        try { db_statement = con.createStatement(); } 
        catch (SQLException ex) { JOptionPane.showMessageDialog(null,ex); }
        
        try { 
            ResultSet rs = db_statement.executeQuery(query); 
            while(rs.next()) 
                {
                     s_id = rs.getString("id");
                     s_name = rs.getString("name");
                     s_last_update = rs.getString("last_update");
                     unit_price = rs.getString("price");
                     stock_available = rs.getString("stock_available");
                     min_quantity = rs.getString("minimum_quantity");
                     last_update    = rs.getString("last_update");
                     selected_vendor = rs.getString("vendor_name");  
                     vendor_id = Integer.parseInt(rs.getString("vendor_id"));
                }
            
            //JOptionPane.showMessageDialog(null,e_id+"\n\n"+e_name+"\n\n"+e_dob+"\n\n"+e_doj+"\n\n"+e_contact_no+"\n\n"+e_address+"\n\n"+last_update);
            
            disp_s_cost.setText(unit_price);
            disp_s_name.setText(s_name);
            
            disp_s_stock_available.setText(stock_available);
            disp_s_min_quantity.setText(min_quantity);
            lastUpdate.setText(last_update);
            disp_selectedVendor.setText(selected_vendor);
            
        } 
        catch (Exception ex) {JOptionPane.showMessageDialog(null,"Error in Fetching Data\n\n"+ex); } 
        
        modifyPanel.setVisible(true);
        
    }//GEN-LAST:event_displayTableMouseClicked

    
    public void combobox_for_vendors(){
    
        disp_s_vendor_id.addItem("#-Select Vendor");
        
        String content = null;
        Connection con = database();
        Statement db_statement=null;
        try { db_statement = con.createStatement(); } 
        catch (SQLException ex) { JOptionPane.showMessageDialog(null,ex); }
        
        try { 
            ResultSet rs = db_statement.executeQuery("SELECT * FROM vendors ORDER BY name ASC"); 
            while(rs.next()) 
                {
                    content = rs.getString("id")+"-"+rs.getString("name");
                    disp_s_vendor_id.addItem(content);
                    search_by_vendor.addItem(content);
                }
            
        } 
        catch (Exception ex) {JOptionPane.showMessageDialog(null,"Error in Fetching Data TO Produce Combobox\n\n"+ex); } 
   
    }
    
    
    
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
          String name = disp_s_name.getText();
          int stock_available = Integer.parseInt(disp_s_stock_available.getText());
          int min_quantity = Integer.parseInt(disp_s_min_quantity.getText());
          int cost = Integer.parseInt(disp_s_cost.getText());
        
          /*-combobox-*/
          int vendor_id = 0;
          String vendor_name = null;
          String vendor = null;
          
          vendor =disp_s_vendor_id.getSelectedItem().toString();
          String[] split = vendor.split("-");
          if(!split[0].equals("#"))
          {
            vendor_id = Integer.parseInt(split[0]);
            vendor_name = split[1];  
          }
           
          /*---------*/
          
          
          String lastUpdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
          
        int i = 0;
        String update_value = "";
        
        if(!name.equals(""))        {  if(i>0) update_value += ", ";   update_value += "name = '"+name+"'";                     i++; }
        if(cost>=0)                 {  if(i>0) update_value += ", ";   update_value += "price = "+cost;                         i++; }
        if(stock_available>=0)      {  if(i>0) update_value += ", ";   update_value += "stock_available = "+stock_available;    i++; }
        if(min_quantity>=0)         {  if(i>0) update_value += ", ";   update_value += "minimum_quantity = "+min_quantity;      i++; }
        if(!lastUpdate.equals(""))  {  if(i>0) update_value += ", ";   update_value += "last_update = '"+lastUpdate+"'";        i++; }
        if(!split[0].equals("#"))   {  if(i>0) update_value += ", ";   update_value += "vendor_id = "+vendor_id+", vendor_name='"+vendor_name+"'";        i++; }
        
        String query = "UPDATE stock SET "+update_value+" WHERE id = "+global_medicine_id;
        
        //JOptionPane.showMessageDialog(null,query);
        
        Connection con = database();
        Statement db_statement = null;
        try {  db_statement = con.createStatement(); } 
        catch (SQLException ex) {JOptionPane.showMessageDialog(null,ex); }
        
        try { 
                int flag = db_statement.executeUpdate(query); 
                if(flag == 1) 
                {
                     if(!split[0].equals("#"))  disp_selectedVendor.setText(vendor_name);
                    JOptionPane.showMessageDialog(null,"Successfully Updated");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Error in Updation..");
                }
            } 
        catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Error in Updation"); }
       
        
        modifyPanel.setVisible(true);
        query = "SELECT id,name,price,stock_available FROM stock ORDER BY id ASC";
        table(query);
        
    }//GEN-LAST:event_updateButtonActionPerformed

    
    
    
    
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure?");
        
        if(response == 0)
        {
           
        int id = Integer.parseInt(disp_s_cost.getText());
        String query = "DELETE FROM stock WHERE id="+global_medicine_id;
        Connection con = database();
        Statement db_statement=null;
        try { db_statement = con.createStatement(); } 
        catch (SQLException ex) { JOptionPane.showMessageDialog(null,ex); }
        
        
        try { 
           int executeUpdate = db_statement.executeUpdate(query); 
            
           if(executeUpdate != 1)
            JOptionPane.showMessageDialog(null,"Failed To Execute");
           else
               JOptionPane.showMessageDialog(null,"Successfully Removed");
                
        modifyPanel.setVisible(false);
        
        query = "SELECT id,name,price,stock_available FROM stock ORDER BY id ASC";
        table(query);
            
            } 
        catch (SQLException ex) {JOptionPane.showMessageDialog(null,"Error in Deletion\n\n"+ex); }
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    
    
    
    
    
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
         modifyPanel.setVisible(false);
        
        String value = searchField.getText();
        if(value.equals("")) table("SELECT id,name,price,stock_available FROM stock ORDER BY name ASC");
        else
        {
        String query = "SELECT id,name,price,stock_available FROM stock WHERE (name LIKE \'%"+value+"%\') ORDER BY name ASC";
        table(query);
        }        
    }//GEN-LAST:event_SearchButtonActionPerformed

    
    
    
    private void vendor_search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendor_search_buttonActionPerformed
      String selected_vendor = (String) search_by_vendor.getSelectedItem();
      //JOptionPane.showMessageDialog(null,selected_vendor);
      
        String[] split = selected_vendor.split("-");
        int vendor_id = Integer.parseInt(split[0]);
        
        String query = "SELECT id,name,price,stock_available FROM stock WHERE vendor_id = "+vendor_id+" ORDER BY name ASC";
        table(query);
      
    }//GEN-LAST:event_vendor_search_buttonActionPerformed

    private void disp_s_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disp_s_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disp_s_costActionPerformed

    private void disp_s_vendor_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disp_s_vendor_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disp_s_vendor_idActionPerformed

    
    
    
       
/*----------------------------------------------------------------------------*/    
// Function For : loads new page to return stock
// Parameter passed [medicine_id] container_table : STOCK 
/*----------------------------------------------------------------------------*/ 
    private void returnStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnStockButtonActionPerformed
       this.dispose();
       new return_stock(global_medicine_id).setVisible(true);
    }//GEN-LAST:event_returnStockButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
         new return_stocks_list().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(stock_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stock_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stock_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stock_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stock_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField disp_s_cost;
    private javax.swing.JTextField disp_s_min_quantity;
    private javax.swing.JTextField disp_s_name;
    private javax.swing.JTextField disp_s_stock_available;
    private javax.swing.JComboBox disp_s_vendor_id;
    private javax.swing.JTextField disp_selectedVendor;
    private javax.swing.JTable displayTable;
    private javax.swing.JButton header_billing_button;
    private javax.swing.JButton header_customer_button;
    private javax.swing.JButton header_employees_button;
    private javax.swing.JButton header_stock_button;
    private javax.swing.JButton header_vendors_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastUpdate;
    private javax.swing.JPanel modifyPanel;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton returnStockButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox search_by_vendor;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton vendor_search_button;
    // End of variables declaration//GEN-END:variables

}
