package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;

public abstract class GenerateReport implements ReportInterface{
	
	DatabaseConnector connector = createConnection();

	public void generate() {
        createDatabaseConnection();
        executeDatabaseQuery();
        convertToDocumentFormat(); 
    }
	
	public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.openConnection();
    }

    public void executeDatabaseQuery() {
        System.out.println("Executing database Query...");
        String query = "SELECT * FROM table";
        connector.executeQuery(query);
    }

    public void convertToDocumentFormat() {
        System.out.println("Converting to...");
    }

    public abstract DatabaseConnector createConnection();
}
