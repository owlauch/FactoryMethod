package main.factorymethod;
public class OracleConexaoFactory implements ConexaoFactory{

    @Override
    public Conexao obtercoConexao() {
       return new ConexaoOracle();
    }
    
}
