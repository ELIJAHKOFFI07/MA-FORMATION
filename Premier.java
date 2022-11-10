package mathMenuAppli;
	import javax.swing.JOptionPane;

	public class Premier {
	    public static void main(String[] args) throws Exception {
	        int t[];
	        for (int i = 2; i <= 100; i++) {
	            if (prem(i) == true) {
	                JOptionPane.showMessageDialog(null, i);
	            }
	        }

	    }

	    public static boolean prem(int x) {
	        assert x >= 2;
	        for (int i = 2; i < x; i++) {
	            if (x % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

