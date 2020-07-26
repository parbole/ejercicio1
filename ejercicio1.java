import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) {
        double numero1, numero2, resultado;
        
        System.out.print("Bienvenido" + "\n" + "Digite el primer numero: ");
        Scanner teclado = new Scanner(System.in);
        numero1 = teclado.nextInt();
        
        System.out.print("Ahora, digite el segundo numero: ");
        numero2 = teclado.nextInt();
        
        resultado = numero1 + numero2;
        System.out.print("Se muestra el resultado de la operacion realizada: " + numero1 + " + " + numero2 + " = " + resultado + "\n");
        
        resultado = numero2 - numero1;
        System.out.print("Se muestra el resultado de la operacion realizada: " + numero2 + " - " + numero1 + " = " + resultado + "\n");
        
        resultado = numero1 * numero2;
        System.out.print("Se muestra el resultado de la operacion realizada: " + numero1 + " x " + numero2 + " = " + resultado + "\n");
        
        resultado = numero1 / numero2;
        System.out.print("Se muestra el resultado de la operacion realizada: " + numero1 + " / " + numero2 + " = " + resultado + "\n");
        
        resultado = numero1 % numero2;
        System.out.print("Se muestra el resultado de la operacion realizada: " + numero1 + " % " + numero2 + " = " + resultado + "\n");
        
        resultado = Math.log(numero1);
        System.out.print("Se muestra el resultado de la operacion realizada log(" + numero1 + "): " + resultado + "\n");
        
        resultado = Math.pow(numero1, numero2);
        System.out.print("Se muestra el resultado de la operacion realizada: " + numero1 + " ^ " + numero2 + " = " + resultado + "\n");
        
        
        
    }
}

