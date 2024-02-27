package model;

public class ContaPoupança extends Conta {
	private double rendimento;

	ContaPoupança(String email) {
		super(email);
		this.rendimento = rendimento;
	}
	 public String Saque (double valorsaque) {
	      if (valorsaque <= saldo) {
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
	        	saldo += (valorDeposito + (ValorDeposito*rendimento));
	        	return ("Valor Sacado " + valorDeposito
	        			+"\nValor Saldo Após o Saque:"
	        			+ saldo);
	        	
	        	
	        }
	        public double getsaldo() {
	        	return saldo;
	        	)
	        }
	    
	        			
	   
	    	 
	     
	}
	

}
