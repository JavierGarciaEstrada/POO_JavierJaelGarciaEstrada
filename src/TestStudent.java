public class TestStudent {
    public static void main(String[] args) {
        System.out.println("Probando clase Student");

        Student alumno123 = new Student();

        alumno123.setName("Javier");
        alumno123.setCareer("Informatica");
        alumno123.setControlNumber(22670030);
        alumno123.setLastName("Garcia");
        alumno123.setSemester(Short.parseShort("2"));

        System.out.println("Alumno Numero de Control= " + alumno123.getControlNumber());
        System.out.println("Alumno Nombre = " + alumno123.getName());
        System.out.println("Alumno Apellidos = " + alumno123.getLastName());
        System.out.println("Alumno semestre = " + alumno123.getSemester());
        System.out.println("Alumno carrera = " + alumno123.getCareer());

    }
}