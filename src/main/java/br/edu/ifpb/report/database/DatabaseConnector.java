package br.edu.ifpb.report.database;

public abstract class DatabaseConnector {

	public void openConnection() {
	    System.out.println("Create database connetion");
	 }

    public void executeQuery(String query) {
        System.out.println("Run database query");
    }
}
