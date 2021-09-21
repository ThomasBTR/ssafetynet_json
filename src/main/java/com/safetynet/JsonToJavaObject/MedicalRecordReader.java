package com.safetynet.JsonToJavaObject;

import com.google.gson.Gson;
import com.safetynet.jsonobject.MedicalRecords;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MedicalRecordReader {

	private MedicalRecords medicalRecords;
	private String filepath = "C:\\Users\\thoma\\IdeaProjects\\json\\src\\main\\resources\\medical records.json";

	public MedicalRecordReader(MedicalRecords medicalRecords, String filepath) {
		this.medicalRecords = medicalRecords;
		this.filepath = filepath;
	}

	public MedicalRecords getMedicalRecords() {
		Gson gson = new Gson();
		try (Reader reader = new FileReader(filepath)) {
			// Convert JSON File to Java Object
			medicalRecords = gson.fromJson(reader, MedicalRecords.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return medicalRecords;
	}
}
