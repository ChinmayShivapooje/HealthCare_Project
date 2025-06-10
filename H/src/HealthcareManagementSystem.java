
import javax.sound.midi.Soundbank;
import java.util.*;

// Define a Patient class
class Patient {
    private String patientId;
    private String name;
    private int age;
    private String gender;

    // Using toString
    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    // Constructor
    public Patient(String patientId, String name, int age, String gender) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    // Getter methods
    public String getPatientId() {

        return patientId;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public String getGender() {

        return gender;
    }


}

// Define an Appointment class
class Appointment {
    private String appointmentId;
    private Patient patient;
    private Date appointmentDate;

    //Using toString
    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId='" + appointmentId + '\'' +
                ", patient=" + patient +
                ", appointmentDate=" + appointmentDate +
                '}';
    }

    // Constructor
    public Appointment(String appointmentId, Patient patient, Date appointmentDate) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
    }

    // Getter methods
    public String getAppointmentId() {

        return appointmentId;
    }

    public Patient getPatient() {

        return patient;
    }

    public Date getAppointmentDate() {

        return appointmentDate;
    }
}

// Define a MedicalRecord class
class MedicalRecord {
    private int recordId;
    private Patient patient;
    private String diagnosis;
    private String prescription;

    //Using toString
    @Override
    public String toString() {
        return "MedicalRecord{" +
                "recordId=" + recordId +
                ", patient=" + patient +
                ", diagnosis='" + diagnosis + '\'' +
                ", prescription='" + prescription + '\'' +
                '}';
    }

    // Constructor
    public MedicalRecord(int recordId, Patient patient, String diagnosis, String prescription) {
        this.recordId = recordId;
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
    }

    // Getter methods
    public int getRecordId() {

        return recordId;
    }

    public Patient getPatient() {

        return patient;
    }

    public String getDiagnosis() {

        return diagnosis;
    }

    public String getPrescription() {

        return prescription;
    }
}

// Define a Clinic class
class Clinic {
    private List<Patient> patients;
    private List<Appointment> appointments;
    private List<MedicalRecord> medicalRecords;


    // Constructor
    public Clinic() {
        this.patients = new ArrayList<>();
        this.appointments = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();

    }


    // Methods to add entities
    public void addPatient(Patient patient) {

        patients.add(patient);
    }

    public void scheduleAppointment(Appointment appointment) {

        appointments.add(appointment);
    }

    public void createMedicalRecord(MedicalRecord medicalRecord) {

        medicalRecords.add(medicalRecord);
    }


    // Other methods for querying and managing data can be added here
}

public class HealthcareManagementSystem {


    public static void main(String[] args) {


        // Creating a sample clinic
        Clinic clinic = new Clinic();


        // Creating sample patients
        Patient patient1 = new Patient("P001", "Banish", 25, "Male");
        Patient patient2 = new Patient("P002", "Hemanth", 30, "Male");

        // Adding patients to the clinic
        clinic.addPatient(patient1);
        clinic.addPatient(patient2);


        // Scheduling appointments
        Appointment appointment1 = new Appointment("A001", patient1, new Date());
        Appointment appointment2 = new Appointment("A002", patient2, new Date());

        // Creating medical records
        MedicalRecord record1 = new MedicalRecord(1001, patient1, "Fever", "Paracetamol");
        MedicalRecord record2 = new MedicalRecord(1002, patient2, "Cold", "Rest and fluids");

        // Adding appointments and medical records to the clinic
        clinic.scheduleAppointment(appointment1);
        clinic.scheduleAppointment(appointment2);
        clinic.createMedicalRecord(record1);
        clinic.createMedicalRecord(record2);

        //MAP Concept is used for patient's details
        Map<String,Patient> m=new HashMap<>();
        m.put("P001",patient1);
        m.put("P002",patient2);

        //Map used for to check appointments
        Map<Appointment,String> ma=new HashMap<>();
        ma.put(appointment1,"A001");
        ma.put(appointment2,"A002");

        //Map used for to see Medical Record
        Map<Integer,MedicalRecord> mm=new TreeMap<>();
        mm.put(1001,record1);
        mm.put(1002,record2);


        System.out.println("\uD83C\uDF3C\uD83C\uDF3C \uD835\uDCB2ℯ\uD835\uDCC1\uD835\uDCB8ℴ\uD835\uDCC2ℯ \uD835\uDCC9ℴ \uD835\uDCA9\uD835\uDCBE\uD835\uDCC9\uD835\uDCC9ℯ ℋℯ\uD835\uDCB6\uD835\uDCC1\uD835\uDCC9\uD835\uDCBD\uD835\uDCB8\uD835\uDCB6\uD835\uDCC7ℯ \uD83C\uDF3C\uD83C\uDF3C");

        System.out.println("\uD835\uDC0F\uD835\uDC25\uD835\uDC1E\uD835\uDC1A\uD835\uDC2C\uD835\uDC1E \uD835\uDC2C\uD835\uDC1E\uD835\uDC25\uD835\uDC1E\uD835\uDC1C\uD835\uDC2D \uD835\uDC32\uD835\uDC28\uD835\uDC2E\uD835\uDC2B \uD835\uDC2B\uD835\uDC1E\uD835\uDC2A\uD835\uDC2E\uD835\uDC22\uD835\uDC2B\uD835\uDC1E\uD835\uDC26\uD835\uDC1E\uD835\uDC27\uD835\uDC2D ");
        System.out.println("1.Create new patient profile");
        System.out.println("2.Take appointment");
        System.out.println("3.Create new patient's medical record");
        System.out.println("4.To see all patient's details");
        System.out.println("5.to see all appointments");
        System.out.println("6.To see a perticular patient's details");
        System.out.println("7.To see an appointment");
        System.out.println("8.To see a Medical Record");

        Scanner n = new Scanner(System.in);
        int i1 = n.nextInt();
        Patient patient3 = null;
        if (i1 == 1) {
            System.out.println("Please enter the Patient's name:");
            Scanner name = new Scanner(System.in);
            String n1 = name.next();

            System.out.println("Please enter the Patient's ID:");
            Scanner I = new Scanner(System.in);
            String ID = I.next();

            System.out.println("Please enter the Patient's Age:");
            Scanner A = new Scanner(System.in);
            int a = A.nextInt();

            System.out.println("Please enter the Patient's Gender:");
            Scanner G = new Scanner(System.in);
            String g = G.next();

            patient3 = new Patient(ID, n1, a, g);
            clinic.addPatient(patient3);
            m.put("P003",patient3);
            System.out.println("New profile Successfully added");
            System.out.println("your new added profile is");
            System.out.println("Name:" + n1 + " ;PatientID:" + ID + " ;Age:" + a + " ;Gender:" + g + " ;patientReff:1003");
            System.out.println("\uD835\uDC13\uD835\uDC21\uD835\uDC1A\uD835\uDC27\uD835\uDC24 \uD835\uDC32\uD835\uDC28\uD835\uDC2E!");
        } else if (i1 == 2) {
            System.out.println("Please enter the appointment ID:");
            Scanner ai = new Scanner(System.in);
            String AID = ai.next();


            System.out.println("Please enter the Date of Appointment:");
            Scanner d = new Scanner(System.in);
            String D = d.next();

            System.out.println("Please enter the Patient's name:");
            Scanner name = new Scanner(System.in);
            String n1 = name.next();

            System.out.println("Please enter the Patient's ID:");
            Scanner I = new Scanner(System.in);
            String ID = I.next();

            System.out.println("Please enter the Patient's Age:");
            Scanner A = new Scanner(System.in);
            int a = A.nextInt();

            System.out.println("Please enter the Patient's Gender:");
            Scanner G = new Scanner(System.in);
            String g = G.next();


            Appointment appointment3 = new Appointment(AID, new Patient(ID, n1, a, g), new Date(D));
            clinic.scheduleAppointment(appointment3);

            System.out.println("Appointment is successful on:" + D);
            System.out.println("\uD835\uDC13\uD835\uDC21\uD835\uDC1A\uD835\uDC27\uD835\uDC24 \uD835\uDC32\uD835\uDC28\uD835\uDC2E!");
        }
        else if (i1 == 3)
        {
            System.out.println("Please enter the RecordID:");
            Scanner rid = new Scanner(System.in);
            int RID = rid.nextInt();

            System.out.println("Please enter the Patient's disease:");
            Scanner dis = new Scanner(System.in);
            String DIS = dis.next();

            System.out.println("Please enter the prescription:");
            Scanner p = new Scanner(System.in);
            String P = p.next();

            System.out.println("Please enter the Patient's name:");
            Scanner name = new Scanner(System.in);
            String n1 = name.next();

            System.out.println("Please enter the Patient's ID:");
            Scanner I = new Scanner(System.in);
            String ID = I.next();

            System.out.println("Please enter the Patient's Age:");
            Scanner A = new Scanner(System.in);
            int a = A.nextInt();

            System.out.println("Please enter the Patient's Gender:");
            Scanner G = new Scanner(System.in);
            String g = G.next();


            MedicalRecord record3 = new MedicalRecord(RID, new Patient(ID, n1, a, g), DIS, P);
            clinic.createMedicalRecord(record3);

            System.out.println("Medical record is successfully created");
            System.out.println("\uD835\uDC13\uD835\uDC21\uD835\uDC1A\uD835\uDC27\uD835\uDC24 \uD835\uDC32\uD835\uDC28\uD835\uDC2E!");
        }
        else if (i1 == 4)
        {
            System.out.println(patient1.toString());
            System.out.println(patient2.toString());
        }
        else if(i1==5)
        {
            System.out.println(appointment1.toString());
            System.out.println(appointment2.toString());
        }
        else if (i1==6)
        {
            System.out.println("Please enter the Patient ID:");
            Scanner pid=new Scanner(System.in);
            String PID= pid.next();
            for (Map.Entry<String,Patient> m2:m.entrySet())
            {
                if(m2.getKey().equals(PID))
                {
                    System.out.println(m2.getValue());
                }
            }
            System.out.println("\uD835\uDC13\uD835\uDC21\uD835\uDC1A\uD835\uDC27\uD835\uDC24 \uD835\uDC32\uD835\uDC28\uD835\uDC2E!");

        }

        else if(i1==7)
        {
            System.out.println("Please enter the Appointment ID");
            Scanner aid=new Scanner(System.in);
            String AID= aid.next();
            for(Map.Entry<Appointment,String> m3:ma.entrySet())
            {
                if (m3.getValue().equals(AID))
                {
                    System.out.println(m3.getKey());
                }
            }
            System.out.println("\uD835\uDC13\uD835\uDC21\uD835\uDC1A\uD835\uDC27\uD835\uDC24 \uD835\uDC32\uD835\uDC28\uD835\uDC2E!");
        }
        else if (i1==8)
        {
            System.out.println("Please enter the medical record ID:");
            Scanner rid=new Scanner(System.in);
            Integer MID= rid.nextInt();
            for(Map.Entry<Integer,MedicalRecord> r:mm.entrySet()) {
                if(r.getKey().equals(MID))
                {
                    System.out.println(r.getValue());
                }
                System.out.println("\uD835\uDC13\uD835\uDC21\uD835\uDC1A\uD835\uDC27\uD835\uDC24 \uD835\uDC32\uD835\uDC28\uD835\uDC2E!");;
            }

        }

    }

}





// The clinic object now contains patient data, appointments, and medical records





