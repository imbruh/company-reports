package br.edu.ifpb.report.database;

public class PostgreSQLDatabaseConnector extends DatabaseConnector{

	@Override
    public void openConnection() {
        System.out.println("Create postgres connetion");
    }
	

	@Override
    public void executeQuery(String query) {
        System.out.println("Run SQL query");
    }

}
