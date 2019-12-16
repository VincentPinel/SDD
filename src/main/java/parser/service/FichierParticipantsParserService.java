package parser.service;

import groupeur.model.Participant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FichierParticipantsParserService {

	public Set<Participant> donneParticipants() {
<<<<<<< HEAD
<<<<<<< HEAD
		return null;
=======
=======
>>>>>>> 3258f9d770ed86290196b5e3b208a2a508031c6f
		File excelFile = new File(getClass().getClassLoader()
				.getResource("Participants.xlsx").getFile());

		Set<Participant> participants = new HashSet<Participant>();
		try {
			XSSFSheet sheet = getFirstSheetFromExcelFile(excelFile);
			participants = mapRowsToParticipants(sheet);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return participants;
	}

	private XSSFSheet getFirstSheetFromExcelFile(File excelFile)
			throws FileNotFoundException, IOException {
		FileInputStream fis;
		fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		return sheet;
<<<<<<< HEAD
>>>>>>> 2 - Implémentation du parsing du fichier et mappage en Participant
=======
>>>>>>> 3258f9d770ed86290196b5e3b208a2a508031c6f
	}

	private Set<Participant> mapRowsToParticipants(XSSFSheet sheet) {
		return StreamSupport.stream(sheet.spliterator(), false).filter(row -> row.getRowNum() != 0).map(row -> new Participant(row)).collect(Collectors.toSet());
	}
}
