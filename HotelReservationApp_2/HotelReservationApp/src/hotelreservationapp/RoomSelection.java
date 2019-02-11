package hotelreservationapp;

import hotelreservationapp.model.BookingDetails;
import hotelreservationapp.model.Room;
import hotelreservationapp.utils.Constants;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.calendar.CalendarUtils;


public class RoomSelection extends javax.swing.JFrame {

    //For writing to file.
    Boolean saveToFile = false;

    public RoomSelection() {
        initComponents();

        //Crosses out past dates for first picker
        Calendar checkInDate = checkInDatePicker.getMonthView().getCalendar();
        checkInDate.setTime(new Date());
        checkInDatePicker.getMonthView().setLowerBound(checkInDate.getTime());
        CalendarUtils.endOfWeek(checkInDate);
        checkInDate.add(Calendar.WEEK_OF_YEAR, 52);
        checkInDatePicker.getMonthView().setUpperBound(checkInDate.getTime());

        //Crosses out past dates for second datepicker
        Calendar checkOutDate = checkOutDatePicker.getMonthView().getCalendar();
        checkOutDate.setTime(new Date());
        checkOutDatePicker.getMonthView().setLowerBound(checkOutDate.getTime());
        CalendarUtils.endOfWeek(checkOutDate);
        checkOutDate.add(Calendar.WEEK_OF_YEAR, 52);
        checkOutDatePicker.getMonthView().setUpperBound(checkOutDate.getTime());
        proceedButton.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        detailsHeaderLabel = new javax.swing.JLabel();
        checkInDatePicker = new org.jdesktop.swingx.JXDatePicker();
        checkOutLabel = new javax.swing.JLabel();
        checkOutDatePicker = new org.jdesktop.swingx.JXDatePicker();
        roomTypeLabel = new javax.swing.JLabel();
        roomTypeDropdown = new javax.swing.JComboBox<>();
        calcBtn = new javax.swing.JButton();
        lengthLabel = new javax.swing.JLabel();
        dayLength = new javax.swing.JLabel();
        roomRateLabel = new javax.swing.JLabel();
        roomRateLbl = new javax.swing.JLabel();
        stayTotalLabel = new javax.swing.JLabel();
        stayTotalLbl = new javax.swing.JLabel();
        cardFeeLabel = new javax.swing.JLabel();
        cardCharge = new javax.swing.JLabel();
        netTotalLabel = new javax.swing.JLabel();
        overallTotal = new javax.swing.JLabel();
        proceedButton = new javax.swing.JButton();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextBox = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextBox = new javax.swing.JTextField();
        addressLine1Label = new javax.swing.JLabel();
        introductionLabel = new javax.swing.JLabel();
        addressLine1TextBox = new javax.swing.JTextField();
        addressLine2Label = new javax.swing.JLabel();
        addressLine2TextBox = new javax.swing.JTextField();
        postcodeLabel = new javax.swing.JLabel();
        postCodeTextBox = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextBox = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        contactNumTextBox = new javax.swing.JTextField();
        contactNoLabel = new javax.swing.JLabel();
        firstName1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(10, 10, 60, 30);

        detailsHeaderLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 14)); // NOI18N
        detailsHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailsHeaderLabel.setText("Your details:");
        jPanel1.add(detailsHeaderLabel);
        detailsHeaderLabel.setBounds(460, 40, 320, 20);

        checkInDatePicker.setBackground(new java.awt.Color(51, 51, 51));
        checkInDatePicker.setForeground(new java.awt.Color(255, 255, 255));
        checkInDatePicker.setName("checkInDatePicker"); // NOI18N
        jPanel1.add(checkInDatePicker);
        checkInDatePicker.setBounds(100, 80, 189, 30);

        checkOutLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        checkOutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkOutLabel.setText("Stay until:");
        jPanel1.add(checkOutLabel);
        checkOutLabel.setBounds(150, 130, 80, 13);

        checkOutDatePicker.setBackground(new java.awt.Color(51, 51, 51));
        checkOutDatePicker.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(checkOutDatePicker);
        checkOutDatePicker.setBounds(100, 150, 189, 30);

        roomTypeLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        roomTypeLabel.setText("What room type would you like?");
        jPanel1.add(roomTypeLabel);
        roomTypeLabel.setBounds(10, 210, 180, 13);

        roomTypeDropdown.setBackground(new java.awt.Color(51, 51, 51));
        roomTypeDropdown.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        roomTypeDropdown.setForeground(new java.awt.Color(255, 255, 255));
        roomTypeDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SINGLE", "DOUBLE", "TRIPLE", "QUAD", "KING", "PENTHOUSE" }));
        jPanel1.add(roomTypeDropdown);
        roomTypeDropdown.setBounds(200, 200, 189, 30);

        calcBtn.setBackground(new java.awt.Color(102, 102, 102));
        calcBtn.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        calcBtn.setForeground(new java.awt.Color(255, 255, 255));
        calcBtn.setText("Calculate Totals");
        calcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });
        jPanel1.add(calcBtn);
        calcBtn.setBounds(120, 250, 130, 30);

        lengthLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        lengthLabel.setText("Length of your stay (in nights):");
        jPanel1.add(lengthLabel);
        lengthLabel.setBounds(10, 290, 170, 13);

        dayLength.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        jPanel1.add(dayLength);
        dayLength.setBounds(250, 290, 95, 20);

        roomRateLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        roomRateLabel.setText("Nightly Room Rate:");
        jPanel1.add(roomRateLabel);
        roomRateLabel.setBounds(70, 320, 102, 13);

        roomRateLbl.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        jPanel1.add(roomRateLbl);
        roomRateLbl.setBounds(250, 320, 85, 20);

        stayTotalLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        stayTotalLabel.setText("Stay Total:");
        jPanel1.add(stayTotalLabel);
        stayTotalLabel.setBounds(110, 350, 55, 13);

        stayTotalLbl.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        jPanel1.add(stayTotalLbl);
        stayTotalLbl.setBounds(250, 350, 109, 20);

        cardFeeLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        cardFeeLabel.setText("Card Booking Fee:");
        jPanel1.add(cardFeeLabel);
        cardFeeLabel.setBounds(70, 380, 97, 13);

        cardCharge.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        jPanel1.add(cardCharge);
        cardCharge.setBounds(250, 380, 79, 21);

        netTotalLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        netTotalLabel.setText("Total (with VAT):");
        jPanel1.add(netTotalLabel);
        netTotalLabel.setBounds(80, 420, 90, 13);

        overallTotal.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        jPanel1.add(overallTotal);
        overallTotal.setBounds(250, 410, 101, 20);

        proceedButton.setBackground(new java.awt.Color(51, 51, 51));
        proceedButton.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        proceedButton.setForeground(new java.awt.Color(255, 255, 255));
        proceedButton.setText("Proceed with Booking");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });
        jPanel1.add(proceedButton);
        proceedButton.setBounds(560, 380, 149, 30);

        firstNameLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        firstNameLabel.setText("First Name");
        jPanel1.add(firstNameLabel);
        firstNameLabel.setBounds(430, 90, 120, 20);
        jPanel1.add(firstNameTextBox);
        firstNameTextBox.setBounds(580, 80, 170, 30);

        lastNameLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        lastNameLabel.setText("Last Name");
        jPanel1.add(lastNameLabel);
        lastNameLabel.setBounds(430, 130, 100, 13);
        jPanel1.add(lastNameTextBox);
        lastNameTextBox.setBounds(580, 120, 170, 30);

        addressLine1Label.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        addressLine1Label.setText("Address Line 1");
        jPanel1.add(addressLine1Label);
        addressLine1Label.setBounds(430, 170, 120, 13);

        introductionLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 14)); // NOI18N
        introductionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        introductionLabel.setText("When would you like your stay to start?");
        jPanel1.add(introductionLabel);
        introductionLabel.setBounds(40, 50, 320, 20);
        jPanel1.add(addressLine1TextBox);
        addressLine1TextBox.setBounds(580, 160, 170, 30);

        addressLine2Label.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        addressLine2Label.setText("Address Line 2");
        jPanel1.add(addressLine2Label);
        addressLine2Label.setBounds(430, 210, 120, 13);
        jPanel1.add(addressLine2TextBox);
        addressLine2TextBox.setBounds(580, 200, 170, 30);

        postcodeLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        postcodeLabel.setText("Postcode");
        jPanel1.add(postcodeLabel);
        postcodeLabel.setBounds(430, 250, 90, 13);
        jPanel1.add(postCodeTextBox);
        postCodeTextBox.setBounds(580, 240, 170, 30);

        emailLabel.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        emailLabel.setText("Email");
        jPanel1.add(emailLabel);
        emailLabel.setBounds(430, 290, 70, 13);
        jPanel1.add(emailTextBox);
        emailTextBox.setBounds(580, 280, 170, 30);

        jLabel14.setFont(new java.awt.Font("Graphik Semibold", 0, 11)); // NOI18N
        jLabel14.setText("Contact Number");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(430, 330, 130, 13);
        jPanel1.add(contactNumTextBox);
        contactNumTextBox.setBounds(580, 320, 170, 30);

        contactNoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\anya.f.collins\\Documents\\College Level 4\\Programming\\1.jpg")); // NOI18N
        jPanel1.add(contactNoLabel);
        contactNoLabel.setBounds(0, 0, 810, 450);
        jPanel1.add(firstName1);
        firstName1.setBounds(580, 80, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBtnActionPerformed

        //check if form is valid before calculating fields
        if(!isValidForm())
            return;

        BookingDetails bookingDetails = new BookingDetails();
        
        int startDateDay = 0;
        int endDateDay = 0;

        Calendar startDateCal = Calendar.getInstance();
        Calendar checkoutDateCal = Calendar.getInstance();

        double roomRate = 0;
        Date checkInDate = null;
        Date checkOutDate = null;
        try {
            checkInDate = Constants.standardDateFormat.parse(Constants.standardDateFormat.format(checkInDatePicker.getDate()));
            checkOutDate = Constants.standardDateFormat.parse(Constants.standardDateFormat.format(checkOutDatePicker.getDate()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        startDateCal.setTime(checkInDate);
        checkoutDateCal.setTime(checkOutDate);
        
        bookingDetails.setCheckInDate(startDateCal);
        bookingDetails.setCheckOutDate(checkoutDateCal);
        
        long diff = checkOutDate.getTime() - checkInDate.getTime();
        long hours = diff / (60 * 60 * 1000);
        long days = hours / 24;

        bookingDetails.setTotalDays(days);
        
        Room room = new Room(Room.RoomType.valueOf(roomTypeDropdown.getSelectedItem().toString()));
        bookingDetails.setRoomDetails(room);

        //calculate costs
        
        //checking value for weekend special
        startDateDay = bookingDetails.getCheckInDate().get(Calendar.DAY_OF_WEEK);
        endDateDay = bookingDetails.getCheckOutDate().get(Calendar.DAY_OF_WEEK);
      
        Boolean weekendSpecial = ((startDateDay == 6 && endDateDay == 1) && (days == 2) ? true : false);

        Double stayTotal = days *  bookingDetails.getRoomDetails().getRoomRate();
        
        if (weekendSpecial) {
            stayTotal = bookingDetails.getRoomDetails().getWeekendRate();
            //weekend special always three days. calculates individual room rate given weekendRate
            roomRate = stayTotal / Double.parseDouble("3");
            //override prepopulated roomrate in bookingDetails
            bookingDetails.getRoomDetails().setRoomRate(roomRate);
        }
        
        double absoluteTotal = stayTotal + bookingDetails.getRoomDetails().getCardFee();
        final double vatFinal = 0.0025;
        double vat = 0;
        vat = absoluteTotal * vatFinal;
        double totalWithVat = absoluteTotal + vat;
        
        bookingDetails.setStayCost(stayTotal);
        bookingDetails.setVatCost(vat);
        bookingDetails.setTotalCost(totalWithVat);
        
        populateForm(bookingDetails);

        //Set button as clickable once fields are populated
        proceedButton.setEnabled(true);
     
    }//GEN-LAST:event_calcBtnActionPerformed

    private Boolean isValidForm()
    {
        if (checkInDatePicker.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please select a start date.");
            return false;
        }

        if (checkOutDatePicker.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please select a checkout date.");
            return false;
        }

        if (checkOutDatePicker.getDate().before(checkInDatePicker.getDate())) {
            JOptionPane.showMessageDialog(null, "Checkout date cannot be before start date.");
            return false;

        }
        return true;
    } 
    
    private void populateForm(BookingDetails bookingDetails){
        dayLength.setText(String.valueOf(bookingDetails.getTotalDays()));
        roomRateLbl.setText("£" + Constants.moneyFormat.format(bookingDetails.getRoomDetails().getRoomRate()));
        cardCharge.setText("£" + Constants.moneyFormat.format(bookingDetails.getRoomDetails().getCardFee()));
        roomRateLbl.setText("£" + Constants.moneyFormat.format(bookingDetails.getRoomDetails().getRoomRate()));
        stayTotalLbl.setText("£" + Constants.moneyFormat.format(bookingDetails.getStayCost()));
        overallTotal.setText("£" + Constants.moneyFormat.format(bookingDetails.getTotalCost()));
    }
  
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //Close room selection and open login pane
        RoomSelection.this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String filePath = "C://Users//anya.f.collins//Desktop//Receipts//" + timeStamp + ".txt";
        try {
            String fNameStr = firstNameTextBox.getText();
            String lNameStr = lastNameTextBox.getText();
            String addLine1Str = addressLine1TextBox.getText();
            String addLine2Str = addressLine2TextBox.getText();
            String postCodeStr = postCodeTextBox.getText();
            String emailStr = emailTextBox.getText();
            String contactNumStr = contactNumTextBox.getText();

            Writer wr = new FileWriter(filePath, saveToFile);

            wr.write("Name: " + fNameStr + " " + lNameStr);
            wr.write(System.getProperty("line.separator"));
            wr.write("Address: " + addLine1Str + ", " + addLine2Str + ", " + postCodeStr);
            wr.write(System.getProperty("line.separator"));
            wr.write("Email: " + emailStr);
            wr.write(System.getProperty("line.separator"));
            wr.write("Contact Number: " + contactNumStr);
            wr.write(System.getProperty("line.separator"));
            wr.write(System.getProperty("line.separator"));
            wr.write("Booking Details - ");
            wr.write(System.getProperty("line.separator"));
            wr.write("Days Booked: " + dayLength.getText());
            wr.write(System.getProperty("line.separator"));
            wr.write("Room Rate " + roomRateLbl.getText());
            wr.write(System.getProperty("line.separator"));
            wr.write("Stay Total " + stayTotalLbl.getText());
            wr.write(System.getProperty("line.separator"));
            wr.write("Card Charge " + cardCharge.getText());
            wr.write(System.getProperty("line.separator"));
            wr.write("Overall Total (VAT @ 0.25%) " + overallTotal.getText());
            wr.write(System.getProperty("line.separator"));


            PrintWriter print_line = new PrintWriter(wr);
            JOptionPane.showMessageDialog(null, "Your booking has been successful! Please look out for an email regarding payment.");
            print_line.close();

        } catch (IOException ex) {
            Logger.getLogger(RoomSelection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_proceedButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RoomSelection.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomSelection.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomSelection.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomSelection.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLine1Label;
    private javax.swing.JTextField addressLine1TextBox;
    private javax.swing.JLabel addressLine2Label;
    private javax.swing.JTextField addressLine2TextBox;
    private javax.swing.JButton backButton;
    private javax.swing.JButton calcBtn;
    private javax.swing.JLabel cardCharge;
    private javax.swing.JLabel cardFeeLabel;
    private org.jdesktop.swingx.JXDatePicker checkInDatePicker;
    private org.jdesktop.swingx.JXDatePicker checkOutDatePicker;
    private javax.swing.JLabel checkOutLabel;
    private javax.swing.JLabel contactNoLabel;
    private javax.swing.JTextField contactNumTextBox;
    private javax.swing.JLabel dayLength;
    private javax.swing.JLabel detailsHeaderLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextBox;
    private javax.swing.JTextField firstName1;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextBox;
    private javax.swing.JLabel introductionLabel;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextBox;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JLabel netTotalLabel;
    private javax.swing.JLabel overallTotal;
    private javax.swing.JTextField postCodeTextBox;
    private javax.swing.JLabel postcodeLabel;
    private javax.swing.JButton proceedButton;
    private javax.swing.JLabel roomRateLabel;
    private javax.swing.JLabel roomRateLbl;
    private javax.swing.JComboBox<String> roomTypeDropdown;
    private javax.swing.JLabel roomTypeLabel;
    private javax.swing.JLabel stayTotalLabel;
    private javax.swing.JLabel stayTotalLbl;
    // End of variables declaration//GEN-END:variables
}
