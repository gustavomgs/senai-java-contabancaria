import java.util.Scanner;

class ContaBancaria {
    
  static double saldo;  
    
    
  public static double depositar(double valor) {
      
      saldo = saldo + valor;
        
    return saldo;
  }

	public static void main(String args[]){  
  
   
    depositar(12.0);
    
    System.out.print(saldo);
    
    System.exit(0);
		
	}

}
