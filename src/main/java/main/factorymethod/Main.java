package main.factorymethod;

public class Main {

    /**
     * exemplo de como seria uma implementação de factory methodo o metodo
     * getdata poderia pegar o metodo conectar efetuar a requisição e depois
     * desconectar foi colocado de maneira externa para exemplificar o modelo.
     * @param args
     */
    public static void main(String[] args) {
        MySqlConexaoFactory mysql = new MySqlConexaoFactory();
        Conexao dbMYSQL = mysql.obtercoConexao();
        dbMYSQL.conectar();
        System.out.println(dbMYSQL.getData("uma String qualquer"));
        dbMYSQL.desconectar();
        System.out.println("____________________________________");
        OracleConexaoFactory orocle = new OracleConexaoFactory();
        Conexao dbOrocle = orocle.obtercoConexao();
        dbOrocle.conectar();
        System.out.println(dbOrocle.getData("uma String qualquer"));
        dbOrocle.desconectar();

    }

}
