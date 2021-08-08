package br.edu.ifpb.report.controller;


public interface ReportInterface {
	
	public void createDatabaseConnection();
	public void executeDatabaseQuery();
	public void convertToDocumentFormat();
}
