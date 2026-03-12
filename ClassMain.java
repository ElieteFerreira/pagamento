
public class ClassMain {
	
	public class Main {
	    public static void main(String[] args) {
	    
	        Cargo dev = new Cargo("programador", 5000.0);
	   
	        Funcionario func1 = new Funcionario("João Neto", dev);
	        
	        Pagamento pgto = new Pagamento();
	        pgto.gerarHolerite(func1, 10, 12); 
	    }
	}



}
