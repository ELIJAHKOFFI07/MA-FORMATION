package mathMenuAppli;

import javax.swing.JOptionPane;
 public class palindromique{
   public static void main(String[] args){
      String mot=JOptionPane.showInputDialog("entrez un mot");
      if (palin(mot)==true){
         JOptionPane.showMessageDialog(null, mot+ "est un palindrome") ;}
      else{
          JOptionPane.showMessageDialog(null, mot + "n'est pas un palindrome");}
         
      }
static boolean palin(String mot){
      int y = mot.length();
      int res=0;
      for(int i=0;i<=(int)(y/2);i++){
            res+=1;
         if(mot.charAt(i)!=mot.charAt(y-res)) {
            return false;}}
       return true;}
        
      
      }
	

