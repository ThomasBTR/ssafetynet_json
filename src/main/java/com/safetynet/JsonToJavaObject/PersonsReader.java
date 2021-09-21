package com.safetynet.JsonToJavaObject;

import com.google.gson.Gson;
import com.safetynet.jsonobject.Persons;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PersonsReader {

	private Persons persons;
	private final String filepath = "C:/Users/thoma/IdeaProjects/json/src/main/resources/persons.json";

	public Persons getPersons() {
		Gson gson = new Gson();

		try(Reader reader = new FileReader(filepath)) {
			persons = gson.fromJson(reader, Persons.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return persons;
	}

}
