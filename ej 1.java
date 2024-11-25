public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }
}
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan", 30000);
        emp.mostrarInformacion();

        System.out.println();

        Gerente ger = new Gerente("Ana", 50000, "Recursos Humanos");
        ger.mostrarInformacion();
    }
}