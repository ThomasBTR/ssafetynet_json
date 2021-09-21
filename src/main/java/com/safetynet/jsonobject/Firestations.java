package com.safetynet.jsonobject;

import com.safetynet.models.FirestationJson;

import java.util.Arrays;

public class Firestations {

	private FirestationJson[] firestations;

	public Firestations() {
	}

	public FirestationJson[] getFirestations() {
		return firestations;
	}

	public void setFirestations(FirestationJson[] firestations) {
		this.firestations = firestations;
	}

	@Override
	public String toString() {
		return "Firestations{" +
				"firestations=" + Arrays.toString(firestations) +
				'}';
	}
}
