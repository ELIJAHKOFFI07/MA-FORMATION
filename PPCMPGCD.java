package mathMenuAppli;
	import javax.swing.JOptionPane;

	 public class PPCMPGCD {
	  public static void main(String[] args) {
	   String a = JOptionPane.showInputDialog("entrez un entier");
	   String b = JOptionPane.showInputDialog("entrez un entier");
	    int y = Integer.parseInt(a);
	    int x = Integer.parseInt(b);
	    JOptionPane.showMessageDialog(null,"le pgcd est " + pgcd(x, y));
	    if ((x != 0) || (y != 0)) {
	      JOptionPane.showMessageDialog(null,"le ppcm est " + (x * y) / pgcd(x, y));
	    } else {
	      JOptionPane.showMessageDialog(null,"le ppcm n'existe pas ");
	    }
	  }

	  static int pgcd(int a, int b) {
	    if (a == 0) {
	      return b;
	    }
	    if (b == 0) {
	      return a;
	    }

	    else if (a >= b) {
	      return pgcd(b, a % b);
	    } else {
	      return pgcd(a, b % a);
	    }
	  }
	}



