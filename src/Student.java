public class Student {
    private long controlNumber;
    private String name;
    private String lastName;
    private String career;
    private int semester;

    public Student(long controlNumber, String name, String lastName, String career, int semester) {
        this.controlNumber = controlNumber;
        this.name = name;
        this.lastName = lastName;
        this.career = career;
        this.semester = semester;
    }

    public long getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(long controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(short semester) {
        this.semester = semester;
    }
    public double generalAvg(long controlNumber){

        return 0.0;
    }
    public double semesterAvg(long controlNumber, int semester){

        return 0.0;
    }
    public double subjectAvg(long controlNumber, String subject){

        return 0.0;
    }
    public String toString(){
        System.out.println("Los datos del estudiante: ");
        System.out.println("Nombre: " + this.name);
        System.out.println("Apellidos: " + this.lastName);
        System.out.println("Numero de control: " + this.controlNumber);
        System.out.println("Carrera: " + this.career);
        System.out.println("Semestre: " + this.semester);
        return "";
    }
}