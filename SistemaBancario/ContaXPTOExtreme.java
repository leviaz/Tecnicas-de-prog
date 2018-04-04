public class ContaXPTOExtreme extends Conta {
    public float saldo;
	public int id;
	
	
	public float getSaldo(){
		return this.saldo;
	}
	public void setSaldo(float s){
		this.saldo=s;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int i){
		this.id=i;
	}
	public ContaXPTOExtreme(int i){
		this.setId(i);
		this.setSaldo(0);
		
	}
	public String toString(){
            return ("id da conta:"+this.getId()+"Extreme,"+"saldo:"+this.getSaldo());
	}
	public void consultarSaldo(){
		System.out.println("saldo:"+this.getSaldo());
	}
	public void debitar(float v){
            if(this.getSaldo()>=v && v>0){
		this.setSaldo(this.getSaldo()-(v*0.998f));
            }else{
                System.out.println("Não é possivel sacar esse valor,saldo insuficiente ou valor invalido.");
            }    
	}
	public void creditar(float v){
            if(v>0){
		this.setSaldo(this.getSaldo()+(v*1.002f));
            }else{
                System.out.println("Não é possivel depositar esse valor,valor invalido.");
            }    
	}
}