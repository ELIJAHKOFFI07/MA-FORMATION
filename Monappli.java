package mathMenuAppli;

import javax.swing.JOptionPane;

import Algebrelin.Matrice2;
import Algebrelin.Matrice4;
import Algebrelin.Matrice5;
import Algebrelin.Matrices3;
import Algebrelin.inversematrix;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Monappli extends Application {

private Button Palindrome,PGCD,Factorielle,nbrepremier, ExitButton,PPCM,Discriminant,Det2,Det3,Det4,Det5,ReverseMatrix,MatrixMultiplication;
private Label label;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root=new VBox(20);// il y'aura un espacement de 20 cm entre les composantes
		root.setPadding(new Insets(21));// marge de 21cm sur tous les cotés
		root.setAlignment(Pos.CENTER);
		
		// chargement des images 
		ImageView like=new ImageView(getClass().getResource("like.png").toString());// chargement de l'image like.png
		ImageView dislike=new ImageView(getClass().getResource("dislike.png").toString());
		ImageView FACTO=new ImageView(getClass().getResource("imagefacto.png").toString());
		ImageView dett3=new ImageView(getClass().getResource("determinant3.png").toString());
		 Image img = new Image(getClass().getResource("imageOperateur.png").toString());
	        BackgroundImage bImg = new BackgroundImage(img,
	                                                   BackgroundRepeat.NO_REPEAT,
	                                                   BackgroundRepeat.NO_REPEAT,
	                                                   BackgroundPosition.CENTER,
	                                                   BackgroundSize.DEFAULT);
	        Background bGround = new Background(bImg);
		
		
		label=new Label("Bienvenue  au  menu  Mathematique");
		label.setFont(Font.font("Pacifico"));
		Palindrome=new Button("Test d'un  palindrome");
		Palindrome.setGraphic(like);// j'ajoute l'image like à mon bouton
		Palindrome.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// ce qui se passe lorsqu'on survol ce bouton 
				label.setText("Vous avez choisi "+Palindrome.getText());
				
			}
		});
		
		Palindrome.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// lorsqu'on arrête de survoler 
				label.setText("Bienvenue  au  menu  Mathematique");
				
			}
		});
		Palindrome.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// ce qui se passera lorsqu'on cliquera sur ce boutton
				   String mot=JOptionPane.showInputDialog("entrez un mot");
				      if (palindromique.palin(mot)==true){
				         JOptionPane.showMessageDialog(null, mot+ "est un palindrome") ;}
				      else{
				          JOptionPane.showMessageDialog(null, mot + "n'est pas un palindrome");}
				         
				
				
			}
		});
		
		
		PGCD=new Button("Calculer le PGCD");
		PGCD.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// ce qui se passe lorsqu'on cliquera sur ce boutton
				try {
				 String a = JOptionPane.showInputDialog("entrez un entier");
				   String b = JOptionPane.showInputDialog("entrez un entier");
				    int y = Integer.parseInt(a);
				    int x = Integer.parseInt(b);
				    JOptionPane.showMessageDialog(null,"le pgcd est " + PPCMPGCD.pgcd(x, y));

			}
				catch(Exception illegal) {
					JOptionPane.showMessageDialog(null," Entrer des  entiers  ");
					}
				}
				
			
		});
		PGCD.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// ce qui se passe lorsqu'on survol ce bouton 
				label.setText("Vous avez choisi "+PGCD.getText());
				
			}
		});
		
		PGCD.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// lorsqu'on arrête de survoler 
				label.setText("Bienvenue  au  menu  Mathematique");
				
			}
		});
		PGCD.setGraphic(dislike);// j'ajoute l'image dislike à mon bouton
	
		Factorielle=new Button(" calculer le factoriel d'un entier");
		Factorielle.setGraphic(FACTO);
		Factorielle.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// ce qui se passe lorsqu'on survol ce bouton 
				label.setText("Vous avez choisi "+Factorielle.getText());
				
			}
		});
		
		Factorielle.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// lorsqu'on arrête de survoler 
				label.setText("Bienvenue  au  menu  Mathematique");
				
			}
		});
		Factorielle.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// ce qui se passe lorsqu'on clique sur le bouton factoriel
				try {
			    String a = JOptionPane.showInputDialog("entrez un entier ");
			    int x = Integer.parseInt(a);
			     JOptionPane.showMessageDialog(null, "factoriel" + x + "=" + Facto2.fact(x));
			}
			
			catch( Exception illegalArgument) {
				JOptionPane.showMessageDialog(null," Veuillez entrer des entiers s'il vous plait");}
			}
		});
		
		
		nbrepremier=new Button("tester la primalité d'un entier");
		nbrepremier.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// ce qui se passe lorsqu'on survol ce bouton 
				label.setText("Vous avez choisi "+nbrepremier.getText());
				
			}
		});
		
		nbrepremier.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// lorsqu'on arrête de survoler 
				label.setText("Bienvenue  au  menu  Mathematique");
				
			}
		});
		
		nbrepremier.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// ce qui se passe lorsu'on clique sur le bouton nbrepremier
				try {
				String a = JOptionPane.showInputDialog("entrez un entier ");
			    int x = Integer.parseInt(a);
			    if (Premier.prem(x) == true) {
	                JOptionPane.showMessageDialog(null, a+""+"est premier");
			}
			    else {
			    	  JOptionPane.showMessageDialog(null, a+ "  "+" "+"n' est  pas premier");
			    	}
				}
				catch(Exception illegal) {
					JOptionPane.showMessageDialog(null,"Veuillez entrer absolument un entier svp ");
				}
				
			    }
		});
		PPCM=new Button("calculer le ppcm");
		PPCM.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// ce qui se passe lorsqu'on survol ce bouton 
				label.setText("Vous avez choisi "+PPCM.getText());
				
			}
		});
		
		PPCM.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// lorsqu'on arrête de survoler 
				label.setText("Bienvenue  au  menu  Mathematique");
				
			}
		});
		PPCM.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// fonctionnalités du pouton ppcm
				try {
				  String a = JOptionPane.showInputDialog("entrez un entier");
				   String b = JOptionPane.showInputDialog("entrez un entier");
				    int y = Integer.parseInt(a);
				    int x = Integer.parseInt(b);
				    if ((x != 0) || (y != 0)) {
					      JOptionPane.showMessageDialog(null,"le ppcm est " + (x * y) /PPCMPGCD. pgcd(x, y));
					    } else {
					      JOptionPane.showMessageDialog(null,"le ppcm n'existe pas ");
					    }
				}
				catch(Exception illegal) {
					JOptionPane.showMessageDialog(null,"Veuillez  entrer  des  entiers ");
				}
			}
		});
		
		Discriminant = new Button("Calculer  le  discriminant ");
	Discriminant.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// ce qui se passe lorsqu'on survol ce bouton 
				label.setText("Vous avez choisi "+Discriminant.getText());
				
			}
		});
		
		Discriminant.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// lorsqu'on arrête de survoler 
				label.setText("Bienvenue  au  menu  Mathematique");
				
			}
		});
		Discriminant.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// le role du bouton discriminant 
				SecondDegre.discriminant();
				
			}
		});
		
		
		 Det2=new Button(" calculer le discriminant d'une matrice d'ordre 2");
			Det2.setOnMouseEntered(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// ce qui se passe lorsqu'on survol ce bouton 
					label.setText("Vous avez choisi "+Det2.getText());
					
				}
			});
			
			Det2.setOnMouseExited(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// lorsqu'on arrête de survoler 
					label.setText("Bienvenue  au  menu  Mathematique");
					
				}
			});
		 Det2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// 
				JOptionPane.showMessageDialog(null,"le determinant est "+ Matrice2.determinant());
				
			}
		});
		 Det3=new Button(" calculer le determinant  d'une matrice d'ordre 3");
		 Det3.setGraphic(dett3);
			Det3.setOnMouseEntered(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// ce qui se passe lorsqu'on survol ce bouton 
					label.setText("Vous avez choisi "+Det3.getText());
					
				}
			});
			
			Det3.setOnMouseExited(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// lorsqu'on arrête de survoler 
					label.setText("Bienvenue  au  menu  Mathematique");
					
				}
			});
		 Det3.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// 
					JOptionPane.showMessageDialog(null, "le determinant est "+Matrices3.determinant());
					
				}
			});
		 
		 Det4=new Button(" calculer le determinant t d'une matrice d'ordre 4");
			Det4.setOnMouseEntered(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// ce qui se passe lorsqu'on survol ce bouton 
					label.setText("Vous avez choisi "+Det4.getText());
					
				}
			});
			
			Det4.setOnMouseExited(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// lorsqu'on arrête de survoler 
					label.setText("Bienvenue  au  menu  Mathematique");
					
				}
			});
			
		 Det4.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// 
					JOptionPane.showMessageDialog(null, "le determinant est "+Matrice4.determinant());
					
				}
			});
		 
		 Det5=new Button(" calculer le discriminant d'une matrice d'ordre 5");
			Det5.setOnMouseEntered(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// ce qui se passe lorsqu'on survol ce bouton 
					label.setText("Vous avez choisi "+Det5.getText());
					
				}
			});
			
			Det5.setOnMouseExited(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// lorsqu'on arrête de survoler 
					label.setText("Bienvenue  au  menu  Mathematique");
					
				}
			});
		 Det5.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// 
					JOptionPane.showMessageDialog(null, "le determinant est "+Matrice5.determinant());
					
				}
			});
		 
		 ReverseMatrix=new Button(" calculer l'inverse d'une matrice");
		 ReverseMatrix.setOnMouseEntered(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// ce qui se passe lorsqu'on survol ce bouton 
					label.setText("Vous avez choisi "+ReverseMatrix.getText());
					
				}
			});
			
		 ReverseMatrix.setOnMouseExited(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// lorsqu'on arrête de survoler 
					label.setText("Bienvenue  au  menu  Mathematique");
					
				}
			});
		 ReverseMatrix.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// 
				 String sc = JOptionPane.showInputDialog(null,"Entrer le nombre de lignes ");
		        int row = Integer.valueOf(sc);
		   	 String sc2 = JOptionPane.showInputDialog(null,"Entrer le nombre de lignes ");
		        int col = Integer.valueOf(sc2);

		        if (row != col) {
		        	JOptionPane.showMessageDialog(null,"Impossible d'inverser la matrice car elle n'est pas carée");
		            return;
		        }
		        int A[][] = new int[row][col];
		        JOptionPane.showMessageDialog(null,"Entrer la  Matrice de " + row + " " + "colonnes");
		        for (int i = 0; i < row; i++) {
		            for (int j = 0; j < col; j++) {
		            	 A[i][j] = Integer.parseInt( JOptionPane.showInputDialog(null,"Entrer l' element no. " + i + " " + j + " "));
		               
		            }
		        }

		        int[][] adj = new int[row][col];

		        float[][] inv = new float[row][col];

		        JOptionPane.showMessageDialog(null,"\n la matrice entree est :\n");
		      inversematrix.display(A, row, col);


		        int det = inversematrix.determinant(A, row);
		        JOptionPane.showMessageDialog(null,"le determinant est  :"+ det );

		        JOptionPane.showMessageDialog(null,"la matrice adjointe est  :");
		        inversematrix.adjoint(A, adj, row, col);
		        inversematrix.display(adj, row, col);

		        JOptionPane.showMessageDialog(null,"l''inverse est   :");
		        if (inversematrix.inverse(A, inv, row, col))
		        	inversematrix.display(inv, row, col);
			
			}
		});
		 
		 MatrixMultiplication=new Button(" calculer la multiplication de 2 matrices ");
		 MatrixMultiplication.setOnMouseEntered(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// ce qui se passe lorsqu'on survol ce bouton 
					label.setText("Vous avez choisi "+MatrixMultiplication.getText());
					
				}
			});
			
		 MatrixMultiplication.setOnMouseExited(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// lorsqu'on arrête de survoler 
					MatrixMultiplication.setText("calculer la multiplication de 2 matrices ");
					
				}
			});
		 MatrixMultiplication.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// 
				
				        int m,n,p,q;
				        int first[][]=new int[10][10];
				        int second[][]=new int[10][10];
				        int result[][]=new int[10][10];
				        
				        m=Integer.parseInt(JOptionPane.showInputDialog(null,"Entrer le nombre de lignes de la 1ere matrice  : "));
				        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Entrer le nombre de colonnes  de la 1ere matrice  : "));
				        p=Integer.parseInt(JOptionPane.showInputDialog(null,"Entrer le nombre de lignes de la 2eme matrice  : "));
				        q=Integer.parseInt(JOptionPane.showInputDialog(null,"Entrer le nombre de colonnes  de la 2eme matrice  : "));
				        if (n!=p) {
				        	JOptionPane.showMessageDialog(null, "Multiplication impossible  :");
				        } else {

				       
				        	JOptionPane.showMessageDialog(null,"Entrer la premiere matrice :");
				       
				        for (int i = 0; i < m; i++) {
				            for (int j = 0; j < n; j++) {
				                first[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,null));;
				            }
				        }
				    	JOptionPane.showMessageDialog(null,"Entrer la  seconde matrice :");
				        for (int i = 0; i < m; i++) {
				            for (int j = 0; j < n; j++) {
				                second[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,null));
				            }
				        }
				        int sum=0;
				        for (int i = 0; i < m; i++) {
				            for (int j = 0; j < q; j++) {
				                for (int j2 = 0; j2 < p; j2++) {
				                    sum=sum+(first[i][j2]*second[j2][j]);
				                }
				                result[i][j]=sum;
				                sum=0;
				            }
				        }
				        JOptionPane.showMessageDialog(null,"le resultat est  : ");
				        for (int i = 0; i < m; i++) {
				            for (int j = 0; j < n; j++) {
				            	JOptionPane.showMessageDialog(null,result[i][j]+"\t");
				            }
				         
				        }
				       
				    }
					
				}
			});
		 
		
		 
		 
		 ExitButton=new Button("Quitter l'application ");
			ExitButton.setOnMouseEntered(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// ce qui se passe lorsqu'on survol ce bouton 
					label.setText("	Souhaitez vous quitter l'appli  /n le groupe YCDIT vous remercie");
					
				}
			});
			
			ExitButton.setOnMouseExited(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					// lorsqu'on arrête de survoler 
					label.setText("Bienvenue  au  menu  Mathematique");
					
				}
			});
		
		 ExitButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// ce qui se passe lorsqu'on clique sur le bouton
		int confirm=		JOptionPane.showConfirmDialog(null, "etes vous sûr de vouloir quitter");// sortie de l'application
	
		/*
		 * yes=0,no=1,et cancel=2
		 */
				if (confirm==0) {
					Platform.exit();
				}
			}
		});
		 
		 
		
		root.getChildren().addAll(label,Palindrome,PGCD,Factorielle, nbrepremier,Discriminant,Det2,Det3,Det4,Det5,ExitButton,ReverseMatrix,MatrixMultiplication);
		root.setBackground(bGround);
		Scene scene=new Scene(root,500,700);// les dimensions de la scene
		primaryStage.setScene(scene);
		primaryStage.setTitle("elieAppli");
		primaryStage.show();
		
	}

}
