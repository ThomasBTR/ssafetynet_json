package com.safetynet.JsonToJavaObject;

import com.google.gson.Gson;
import com.safetynet.jsonobject.Firestations;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FirestationsReader {

	private Firestations firestations;
	private String filepath = "C:\\Users\\thoma\\IdeaProjects\\json\\src\\main\\resources\\firestation.json";

	public FirestationsReader(Firestations firestations, String filepath) {
		this.firestations = firestations;
		this.filepath = filepath;
	}

	public Firestations getFirestations() {
		Gson gson = new Gson();
		try (Reader reader = new FileReader(filepath)) {
			// Convert JSON File to Java Object
			firestations = gson.fromJson(reader, Firestations.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return firestations;
	}
}
