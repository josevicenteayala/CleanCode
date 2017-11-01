package com.intergrupo.cleancode.meaningfulnames;

import java.util.ArrayList;
import java.util.List;

public class MeaningFulNames {
	
	
	
	private static final String FILE_NAME_SEPARATOR = "-";
	private static final String ANALYSIS_PHASE = "8";
	private static final int START_PROCESS = 6;
	private static final int DOCUMENTATION_PROCESS = 5;
	private static final int FEASIBILITY_PROCESS = 4;
	private static final int ANALYSIS_PROCESS = 3;
	private static final int RECEPTION_PROCESS = 2;
	public static final int INIT_PROCESS = 1;
	
	/**
	 * List of processes about science projects
	 */
	private int[] processList = new int[] {INIT_PROCESS,RECEPTION_PROCESS,ANALYSIS_PROCESS,FEASIBILITY_PROCESS,DOCUMENTATION_PROCESS,START_PROCESS};

	/**
	 * the method let get the information about analysis phase <br>
	 * the 8 value means the analisys phase in the actual process <br>
	 * the '-' means the valid character to separate the file name of the documents in this phase 
	 * @return list with information about analysis phase: <8>
	 */
	public List<String> getAnalysisProcessInformation(){
		List<String> listWithAnalysisProcessInformation = new ArrayList<>();
		for(int indexInArray: processList) {
			if(processList[indexInArray] == ANALYSIS_PROCESS) {
				listWithAnalysisProcessInformation.add(ANALYSIS_PHASE);
				listWithAnalysisProcessInformation.add(FILE_NAME_SEPARATOR);
			}
		}
		return listWithAnalysisProcessInformation;
	}
	
	/**
	 * the method let get the information about analysis phase <br>
	 * the 8 value means the analisys phase in the actual process <br>
	 * the '-' means the valid character to separate the file name of the documents in this phase 
	 * @return list with information about analysis phase: <8>
	 * @param int:numberOfProcessToGet is the number of the process to find
	 */
	public List<String> getProcessInformation(int numberOfProcessToGet){
		List<String> listWithAnalysisProcessInformation = new ArrayList<>();
		for(int indexInArray: processList) {
			if(processList[indexInArray] == numberOfProcessToGet) {
				listWithAnalysisProcessInformation.add(ANALYSIS_PHASE);
				listWithAnalysisProcessInformation.add(FILE_NAME_SEPARATOR);
			}
		}
		return listWithAnalysisProcessInformation;
	}	
	
}
