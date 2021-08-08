package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends GenerateReport{

    @Override
	public DatabaseConnector createConnection() {
		return new PostgreSQLDatabaseConnector();
	}

    @Override
    public void executeDatabaseQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.executeQuery(query);
    }
    
    @Override
    public void convertToDocumentFormat() {
        System.out.println("Converting To XLS...");
    }

}
