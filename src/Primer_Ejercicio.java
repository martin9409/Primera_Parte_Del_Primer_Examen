	import java.util.Scanner;
public class Primer_Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mi_scanner=new Scanner(System.in);
		double num1,num2;
		System.out.print("Ingrese el Numero 1");
		num1=mi_scanner.nextDouble();
		System.out.println("ingrese el numero 2");
		num2=mi_scanner.nextDouble();
		System.out.println("Ingrese 1 Para Sumar");
		System.out.println("Ingrese 2 Para Restar");
		System.out.println("Ingrese 3 Para Multiplicar");
		System.out.println("Ingrese 4 Para Dividir");
		double x=mi_scanner.nextDouble();
		if (x==1){
				System.out.println(num1+num2);
			}else if(x==2){
				System.out.println(num1-num2);
			}else if(x==3){
				System.out.println(num1*num2);
			}else if(x==4){
				System.out.println(num1/num2);
			}
	}

}
