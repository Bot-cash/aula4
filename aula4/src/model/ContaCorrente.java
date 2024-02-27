package model;

public class ContaCorrente extends Conta {
private double Valortaxa ;


	ContaCorrente(String email) {
		super(email);
		// TODO Auto-generated constructor stub
	}
 public String Saque (double valorsaque) {
      if (valorsaque + ValorTaxa <= saldo) {
     saldo =- valorsaque;
     return (
    	 "valor Sacado : " + valorsaque
    	 +"\nValor saldo apos o saque:"
    	 + saldo
 );   	 

} else {
		return "saldo insuficiente ";
}
 }
      
        public String Depois (double valorDeposito) {
        	saldo += valorDeposito;
        	return ("Valor Sacado " + valorDeposito
        			+"\nValor Saldo Após o Saque:"
        			+ saldo);
        	
        	
        }
        public double getsaldo() {
        	return saldo;
        	)
        }
    
        			
   
    	 
     
}