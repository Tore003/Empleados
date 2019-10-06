import java.io.*;
public class Empleados {

    public static void main(String[] args) throws IOException
    {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int empleados=0;
        String nombre;
        String apellido;
        int valorhora=0;
        int horas=0;
        int valorhorasextra=0;
        int sueldo=0;
        int horasextraemp=0;
        int horasmin=0;
        
        
        while(empleados<=10){
         empleados=empleados+1;
         
         System.out.println("Ingrese su nombre");
         nombre = bufEntrada.readLine();
         System.out.println("Ingrese su apellido");
         apellido = bufEntrada.readLine();
         System.out.println("Ingrese cant. de horas trabajadas");
         horas = Integer.parseInt(bufEntrada.readLine());
         System.out.println("Ingrese cant. de horas minimas");
         horasmin = Integer.parseInt(bufEntrada.readLine());
        
         System.out.println("Ingrese valor de hora trabajada");
        valorhora = Integer.parseInt(bufEntrada.readLine());
        
        valorhorasextra=(int)(horas*0.5);
        System.out.println("El valor de la hora extra es: " + valorhora);
        horasextraemp= horas-horasmin;
        System.out.println("la cant de horas extras del empleado es: " + horasextraemp);
        sueldo=(horas*horasmin) + (valorhorasextra*horasextraemp);
        System.out.println("El sueldo del empleado es: " + sueldo);
        }   
    }  
}
