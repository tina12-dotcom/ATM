import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class atm1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("ATM Machine");

        JLabel label = new JLabel("Welcome to the ATM Machine. Please Select the following: ");
        label.setBounds(70, 30, 400, 50);


        JButton deposit = new JButton("Deposit");
        deposit.setBounds(50, 100, 150, 40);

        JButton withdraw = new JButton("Withdraw");
        withdraw.setBounds(50, 150, 150, 40);

        JButton statement = new JButton("Bank Statement");
        statement.setBounds(220, 150, 150, 40);

        JButton transfer = new JButton("Transfer");
        transfer.setBounds(220, 100, 150, 40);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(120, 250, 150, 40);

        f.add(label);
        f.add(deposit);
        f.add(withdraw);
        f.add(statement);
        f.add(transfer);
        f.add(cancel);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}