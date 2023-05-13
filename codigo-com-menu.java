import java.util.Scanner;

class ContaBancaria {
    
  static double saldo;  
  
  public static boolean validarSangria(double valor){    
    
    if(valor > saldo){
      return false;
    }
    
    return true;
  }
  
  public static void somaSaldo(double valor){
    saldo = saldo + valor;
  }
    
  public static void depositar() {
    
      Scanner teclado = new Scanner(System.in);   
      
      double valor;
      
      System.out.print("Qual o valor que você deseja depositar?\n\n");
      
      valor = teclado.nextDouble();
      
      somaSaldo(valor);  

      menu();      
      
  }
  
  public static double sacar(double valor) {
      
      if(validarSangria(valor) == false){
        System.out.print("Saldo insuficiente\n\n");
        menu();
      }
      
      saldo = saldo + valor;
        
    return saldo;
  } 
  
  public static double exibirSaldo() {
      
    System.out.print(saldo);
        
    return saldo;
  }
  
  public static void menu() {
    Scanner teclado = new Scanner(System.in);   

    int opcao;
    
    System.out.print("Menu do meu sistema\n\n");
    System.out.print("------------------------\n\n");
    System.out.print("Por favor selecione uma opcao:\n");
    System.out.print("------------------------\n\n");
    System.out.print("[1] - Depositar\n");
    System.out.print("[2] - Sacar\n");
    System.out.print("[3] - Exibir saldo\n");
    System.out.print("[4] - Sair do sistema\n");
    
    opcao = teclado.nextInt();       
    
    switch (opcao) {
      case 1:
      depositar();
      break;

      case 2:
      sacar(10.0);
      menu();
      break;

      case 3:
      exibirSaldo();
      menu();
      break;

      case 4:
      System.exit(0);
      break;

    default:
      System.out.printf("Insira uma opção válida");
      main(null);
    }
    
  }
  

	public static void main(String args[]){  

    saldo = 0;

    menu();    
       
    System.exit(0);
		
	}

}
