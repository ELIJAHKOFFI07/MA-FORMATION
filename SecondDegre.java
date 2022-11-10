package mathMenuAppli;

import javax.swing.JOptionPane;

public class SecondDegre {
	protected static  void discriminant() {
		String a1=JOptionPane.showInputDialog(null," Entrer le 1er coefficient "); 
		String b1=JOptionPane.showInputDialog(null," Entrer le 2eme coefficient ");
		String c1=JOptionPane.showInputDialog(null," Entrer le 3eme coefficient ");
		try {
		double a=Double.valueOf(a1);
		double b=Double.valueOf(b1);
		double c=Double.valueOf(c1);
		if(a>0) {
			double	d= (b*b)-4*a*c ; 
			if (d>0) {
		        
		            double X1=-b-(Math.sqrt(d))/(2*a);
		         double    X2=(-b+ Math.sqrt(d))/(2*a);
		            JOptionPane.showMessageDialog(null,"Les solutions sont: "+X1+" et "+X2+"\n Merci d'avoir choisi l'assistance mathématiques");
			}
			else if (d==0) {
				 double x1=b/(2*a);
				 JOptionPane.showMessageDialog(null," LA Solution unique: "+x1+"\n Merci d'avoir choisi l'assistance mathématiques");
				}
			else {
				double x1=-b/(2*a);
			             double X2=(-Math.sqrt(-d))/(2*a);
			           double  x3=(Math.sqrt(-d))/(2*a);
			  		 JOptionPane.showMessageDialog (null,"Les solutions complexes  sont: "+x1+X2+"i et "+x1+"+"+x3+"i \n Merci d'avoir choisi l'assistance mathématiques") ;
			}
			
			}
			else {
				JOptionPane.showMessageDialog(null, " le premier coefficient doit être non nul ");
			}
		
		}
		catch(Exception illegall) {
			JOptionPane.showMessageDialog(null, " Entrer des nombres ");
		}
		
		
		
	}
	

}
