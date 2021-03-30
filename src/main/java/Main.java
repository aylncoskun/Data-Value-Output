import model.Gender;
import model.Observation;
import server.Server;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Server server = new Server();
        //boolean serverConnection = server.testConnection();
        //System.out.println(serverConnection);
        String patientID = server.createPatient("Doe", "John", Gender.MALE);
        System.out.println(patientID);
        //ArrayList<String> allPatientIDs = server.getPatients();
        //Observation numericalObservation = new Observation("http://sfb125.de/ontology/ihCCApplicationOntology/", "albumin_concentration", 0.4, "g/l");
        //Observation categoricalObservation = new Observation("http://sfb125.de/ontology/ihCCApplicationOntology/", "fatty_liver_severity", "http://sfb125.de/ontology/ihCCApplicationOntology/", "fatty_liver_stage_0");
        //String numericalObservationID = server.createNumericalObservation(numericalObservation, patientID);
        //String categoricalObservationID = server.createCategoricalObservation(categoricalObservation, patientID);
        //ArrayList<Observation> observationsOfPatient = server.getObservationsOfPatient(patientID);
    }
}
