package main.factorymethod;

public abstract class Conexao {
    protected String query;
    public abstract void conectar();
    public abstract void desconectar();
    public abstract String getData(String query);
}
