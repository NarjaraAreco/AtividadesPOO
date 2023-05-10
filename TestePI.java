public class TestePI 
{
  private String nome;
  private String sexo;  
  private double altura;
  private double pi;
   
Peso (String nome, String sexo, double altura, double pi) 
  {
    this.nome = nome;
    this.sexo = sexo;
    this.altura = altura;
    this.pi = pi;
  } 

//get   
    public String getNome () 
  {
    return this.nome;
  }
  
 public String getSexo () 
  {
    return this.sexo;
  }
  
 public double getAltura () 
  {
    return this.altura;
  }
  
 public double getPi () 
  {
    return this.pi;
  }
  
 //set 
  public void setNome (String nome) 
  {
    this.nome = nome;
  } 
 public void setSexo (String sexo) 
  {
    this.sexo = sexo;
  } 
 
public void setAltura (double altura) 
  {
    this.altura = altura;
  } 
 public void setPi (double pi) 
  {
    this.pi = pi;
  } 
 
//metodo Calc
  double calculoPI () 
  {
    if (this.sexo.equals (" Masculino "))
      {
	this.pi = ((72.7 * this.altura) - 58);
	return this.pi;
      }
    else
      {
	this.pi = ((62.1 * this.altura) - 44.7);
	return this.pi;
      }
  }
 void tabela () 
    {
  System.out.println ("\n\tPeso Ideal %.1f\n", this.pi) ;
    } 
}