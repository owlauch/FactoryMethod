package main.factorymethod;
public class MySqlConexaoFactory implements ConexaoFactory{

    @Override
    public Conexao obtercoConexao() {
       return new ConexaoMySql();
    }
    
}
