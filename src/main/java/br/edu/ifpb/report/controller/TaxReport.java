package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends GenerateReport{
		
	@Override
	public DatabaseConnector createConnection() {
		return new MysqlDatabaseConnector();
	}
	
    @Override
    public void executeDatabaseQuery() {
    	System.out.println("Executing MySql Query...");
        String query = "SELECT * FROM taxes";
        connector.executeQuery(query);
    }

    @Override
    public void convertToDocumentFormat() {
    	System.out.println("Converting to PDF");
    }
}
