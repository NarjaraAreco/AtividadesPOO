import java.util.Scanner;

public class PesoIdeal
{
    public static void main (String[]args)
    {
      Scanner leia = new Scanner (System.in);
      
      TestePI p = new TestePI() ; 
      
        System.out.printf ("Informe o seu sexo:");
		p.setSexo (leia.next ());

		System.out.printf ("Informe a sua altura:");
		p.setAltura (leia.nextDouble ());

		System.out.printf ("Informe o seu nome:");
		p.setNome (leia.next ());
		
	  p.setPi(p.calculoPi);
	
      p.tabela();
    }
    
}