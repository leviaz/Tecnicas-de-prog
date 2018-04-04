public class ContaXPTOBasic extends Conta {
    
	
	public float saldo;
	public int id;
	
	
	public float getSaldo(){
		return this.saldo;
	}
	public void setSaldo(float v){
		this.saldo=v;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int i){
		this.id=i;
	}
	public ContaXPTOBasic(int i){
		this.setId(i);
		this.setSaldo(0);
		
	}
	public String toString(){
            return ("id da conta:"+this.getId()+"Extreme,"+"saldo:"+this.getSaldo());
	}
	
	public void consultarSaldo(){
		System.out.println("saldo:"+this.getSaldo());
	}
	public void creditar(float v){
		this.setSaldo(this.getSaldo()+v);
	}
	public void debitar(float v){
		this.setSaldo(this.getSaldo()-v);
	}

}