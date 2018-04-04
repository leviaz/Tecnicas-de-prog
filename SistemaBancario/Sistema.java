public class Sistema {
    public Conta contas[];
	public int indice;
	
	public Sistema(){
		contas = new Conta[4];
		this.setIndice(0);
	}
	public int getIndice(){
		return this.indice;
	}
	public void setIndice(int i){
		this.indice=i;
	}
	public void criarContaXPTOBasic(int i){
            if(this.buscarId(i)){
                Conta c = new ContaXPTOBasic(i);
                this.contas[this.getIndice()]=c;
                this.setIndice(this.getIndice()+1);
            }
	}
	public void criarContaXPTOPlus(int i){
            if(this.buscarId(i)){    
                Conta c = new ContaXPTOPlus(i);
                this.contas[this.getIndice()]=c;
                this.setIndice(this.getIndice()+1);
            }
	}
	public void criarContaXPTOExtreme(int i){
            if(this.buscarId(i)){
            Conta c = new ContaXPTOExtreme(i);
            this.contas[this.getIndice()]=c;
            this.setIndice(this.getIndice()+1);
            }
	}
        public Boolean buscarId(int i){
            for(int j=0;j<=this.getIndice()-1;j++){
              if(this.contas[j].getId()==i){
                  return false;
              }  
            }
            return true;
        }
        
	public Conta buscar(int i){
		Conta c;
		for(int j = 0; j<=this.indice-1;j++){
			
			if(this.contas[j].getId()==i){
				c=this.contas[j];
				return c;
			}
			
		}
		return null;
	}
        //coerçao o metodo creditar do sistema recebe float porem é passado pela main com valor v=1000 int assim a linguagem converte o tipo
	public void creditar(int i,float v){
		Conta c;
		c=this.buscar(i);
		if(c!=null){
			c.creditar(v);//inclusão uma conta de qualquer tipo chama tal metodo e é executado o metodo correspondente
		}else{
			System.out.println("erro");
		}
	}
        //similar ao anterior em creditar ocorre coerção
	public void debitar(int i,float v){
		Conta c=this.buscar(i);
		if(c!=null){
			c.debitar(v);
		}else{
			System.out.println("erro");
		}
		
	}
	
	public void consultarSaldo(int i){
		Conta c=this.buscar(i);
		c.consultarSaldo();
	}
}