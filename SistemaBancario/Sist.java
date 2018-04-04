public class Sist {

    
    public static void main(String[] args) {
        Sistema s = new Sistema();
        s.criarContaXPTOBasic(1);
        s.criarContaXPTOPlus(2);
        s.criarContaXPTOExtreme(3);
        for(int i=1;i<=3;i++){
            s.creditar(i,1000);//inclusao pois uma conta qualquer irá realizar a mesma chamada porém execuções diferentes ocorrem
        }
        for(int i=1;i<=3;i++){
            s.debitar(i,10);//ocorre inclusão similar ao o que aconteceu em creditar 
        }
        //todas as igualdades devem ser verdadeiras
        s.consultarSaldo(1);//==990.00
        s.consultarSaldo(2);//==995.00
        s.consultarSaldo(3);//==992.02
	
    }
    
}