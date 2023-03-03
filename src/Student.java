public class Student {
    private long controlNumber;
    private String name;
    private String lastName;
    private String career;
    private int semester;



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
}