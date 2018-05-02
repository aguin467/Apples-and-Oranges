
import javax.swing.JOptionPane;

class merchant {

    public static void main(String arg[]) {
        int appleInHand, appleReq, orangeInHand, orangeReq;
        JOptionPane jp = new JOptionPane();

        // Variables Input
        appleInHand = Integer.parseInt(jp.showInputDialog(null, "How many apples on hand ?", "Apple in hand", JOptionPane.QUESTION_MESSAGE)); 
        appleReq = Integer.parseInt(jp.showInputDialog(null, "How many apples should be in stock ?", "Apple in stock", JOptionPane.QUESTION_MESSAGE)); 
        orangeInHand = Integer.parseInt(jp.showInputDialog(null, "How many oranges on hand ?", "Orange in hand", JOptionPane.QUESTION_MESSAGE));  
        orangeReq = Integer.parseInt(jp.showInputDialog(null, "How many oranges should be in stock ?", "Orange in stock", JOptionPane.QUESTION_MESSAGE)); 
        
        // Formula for number of apples
        if (appleInHand < appleReq) {
            int balapple = appleReq - appleInHand;
            jp.showMessageDialog(null, "Number of Apples to be ordered :" + balapple, "Order", JOptionPane.PLAIN_MESSAGE);
        } else {
            jp.showMessageDialog(null, "Sufficient Number of Apples in stock :", "Order", JOptionPane.PLAIN_MESSAGE);
        }

        // Formula for number of oranges 
        if (orangeInHand < orangeReq) {
            int balorange = orangeReq - orangeInHand;
            jp.showMessageDialog(null, "Number of Orangees to be ordered :" + balorange, "Order", JOptionPane.PLAIN_MESSAGE);
        } else {
            jp.showMessageDialog(null, "Sufficient Number of Oranges in stock :", "Order", JOptionPane.PLAIN_MESSAGE);
        }

    }
}
