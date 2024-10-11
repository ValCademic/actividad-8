public class Perro {
    private String nombre, raza, comida;
    private int edad;
    private double gramos;
    //entregar tarea

    public void comer(String a, double b)
    {
        comida=a;
        gramos=b;
    }
    public String ladrar()
    {
        return "guau guau";
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int n)
    {
        edad = n;
    }
    public int getEdad()
    {
        return edad;
    }

    public void setRaza(String n)
    {
        raza = n;
    }

    public String getRaza()
    {
        return raza;
    }
}