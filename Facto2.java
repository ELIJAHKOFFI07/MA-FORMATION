package mathMenuAppli;

import javax.swing.JOptionPane;
public class Facto2 {
  public static void main(String[] args) {
    String a = JOptionPane.showInputDialog("entrez un entier ");
   int x = Integer.parseInt(a);
    JOptionPane.showMessageDialog(null, "factoriel" + x + "=" + fact(x));
  }

   public static int fact(int x) {
    if (x == 0) {
      return 1;
    }

    else {
      return x * fact(x - 1);
    }
  }
}


