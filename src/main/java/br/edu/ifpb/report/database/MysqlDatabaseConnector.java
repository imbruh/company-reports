package br.edu.ifpb.report.database;

public class MysqlDatabaseConnector extends DatabaseConnector{

	@Override
    public void openConnection() {
        System.out.println("Create mysql connetion");
    }

	@Override
    public void executeQuery(String query) {
        System.out.println("Run SQL query");
    }

}
