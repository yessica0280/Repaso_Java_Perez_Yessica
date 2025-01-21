/*Escribe un programa que solicite la edad de una persona e indique si es un:
 Niño (0-12 años)
 Adolescente (13-17 años)
 Adulto (18-59 años)
 Adulto mayor (60+ años)*/

public static void main(String[]args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Por favor ingresa tu edad: ");
    int edad = Scanner.nextint();
    if (edad >= 0 && edad <= 12){
        System.out.print("Eres un niño.");
    }else if (edad >= 13 && edad <= 17){
        System.out.print("Eres un adolescente.");
    }else if(edad >= 18 && edad <= 59){
        System.out.print("Eres un adulto.");
    }else if(edad >= 60){
        System.out.print("Eres un adulto mayor.");
    }
}

/*Implementa una calculadora que reciba dos números y una operación (+, -. *, /) e imprima el
 resultado.*/

public static void main(String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Por favor ingresa el primer número: ");
    double num1 = Scanner.nextDouble();
    System.out.print("Por favor ingresa el segundo número: ");
    double num2 = Scanner.nextDouble();
    System.out.print("Por favor ingresa la operación (+, -, *, /): ");
    char operación = Scanner.next().charAt(0);
    double resultado;

    switch (operacion){
        case '+':
        resultado = num1 + num2;
        System.out.print("resultado: " + resultado);
        break;

        case '-':
        resultado = num1 - num2;
        System.out.print("resultado: " + resultado);
        break;

        case '*':
        resultado = num1 * num2;
        System.out.print("resultado: " + resultado);
        break;

        case '/':
        resultado = num1 / num2;
        System.out.print("resultado: " + resultado);
        break;
    }
}

/* Crea un programa que reciba una calificación (0-100) y determine:
 A si la nota está entre 90-100.
 B si la nota está entre 80-89.
 C si la nota está entre 70-79.
 D si la nota está entre 60-69.
 F si la nota está por debajo de 60. */

public static void maian(String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Ingresa por favor tu calificación (0 - 100): ");
    int calificacion = Scanner.nextint();
    if (calificacion < 0 || calificacion > 100){
        System.out.println("la calificacion debe de estar entre 0 y 100");
    } else {
        if (calificacion >= 90 && calificacion <= 100){
            System.out.println("calificacion: A");
        } else if (calificacion >= 80 && calificacion <= 89){
            System.out.println("calificacion: B");
        } else if (calificacion >= 70 && calificacion <= 79){
            System.out.println("calificacion: C");
        } else if (calificacion >= 60 && calificacion <= 69){
            System.out.println("calificacion: D");
        } else {
            System.out.println("calificacion: F");
        }
    }
}

/* Escribe un programa que solicite las longitudes de los tres lados de un triángulo e indique si el 
triángulo es:
 Equilátero (todos los lados iguales)
 Isósceles (dos lados iguales)
 Escaleno (todos los lados diferentes) */

public static void min(String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Ingresa por favor la longitud del primer lado: ");
    double lado1 = Scanner.nextDouble();
    System.out.print("Ingresa por favor la longitud del segundo lado: ");
    double lado2 = Scanner.nextDouble();
    System.out.print("Ingresa por favor la longitud del tercer lado: ");
    double lado3 = Scanner.nextDouble();
    if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0){
        System.out.println("Los lados deben ser iguales que cero ");
    } else {
        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("El triangulo es Equilátero (todos los lados son iguales) ");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("El triangulo es Isoceles (dos lados iguales) ");
        } else {
            System.out.println("El triangulo es Escaleno (todos los lados diferentes) ");
        }
    }
}

/* Escribe un programa que reciba el precio de un producto y el tipo de cliente (A, B o C). Aplica un 
descuento según el tipo:
 A: 30%
 B: 20%
 C: 10% Muestra el precio final después del descuento. */

public static void main(String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Ingresa por favor el precio del producto: ");
    double precio = Scanner.nextDouble();
    System.out.print("Ingresa por favor el tipo de cliente (A, B o C): ");
    char tipocliente = Scanner.next().charAt(0);
    double descuento = 0;
    switch (tipocliente){
        case 'A': 
        descuento = 0.30;
        break;

        case 'B':
        descuento = 0.20;
        break;

        case 'C':
        descuento = 0.10;
        break;
    }
    double preciofinal = precio - (precio * descuento);
    System.out.println("El precio final con el descuento es de: " + preciofinal);
}

/* Crea un programa que calcule la tarifa de un estacionamiento basado en el número de horas:
 1 hora o menos: $5
 2-3 horas: $10
 4 o más horas: $15 */

 public static void main(String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Ingresa por favor las horas del estacionamiento: ");
    int horas = Scanner.nextint();
    int tarifa = 0;
    if (horas <= 1){
        tarifa = 5;
    } else if (horas >= 2 && horas <= 3){
        tarifa = 10;
    } else if (horas >= 4){
        tarifa = 15;
    }
    System.out.println("La tarifa de estacionamiento es: $" + tarifa);
 }

/* Escribe un programa que solicite una temperatura y la unidad de origen (Celsius o Fahrenheit). 
Convierte la temperatura a la unidad opuesta y muestra el resultado.
 Fórmulas:
 De Celsius a Fahrenheit: (C * 9/5) + 32
 De Fahrenheit a Celsius (F - 32) * 5/9 */

public static void main(String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Ingresa por favor la temperatura: ");
    double temperatura = Scanner.nextDouble();
    System.out.print("Ingresa por favor la unidad (Celsius o Fahrenheit): ");
    String unidad = Scanner.next().tolowerCase();
    double resultado;
    if (unidad.equals("Celsius")){
        resultado = (temperatura * 9 / 5) + 32;
        System.out.println(temperatura + "grado celsius equivalen a " + resultado + "grados fahrenheit ");
    } else if (unidad.equals("Fahrenheit")){
        resultado = (temperatura - 32) * 5 / 9;
        System.out.println(temperatura + "grados fahrenheit equivalen a " + resultado + "grados celsius");
    }
}

/* Solicita al usuario un número entero y muestra si es par o impar utilizando if - else. */

public static void mian(String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Ingresa por favor un numero que sea entero: ");
    int numero = Scanner.nextint();
    if ( numero % 2 == 0){
        System.out.println("El numero " + numero + "es par");
    } else {
        System.out.println("El numero " + numero + "es impar");
    }
}

/*  Crea un programa que reciba un número de mes (1-12) y determine a qué estación pertenece:
 Primavera: marzo (3) a mayo (5)
 Verano: junio (6) a agosto (8)
 Otoño: septiembre (9) a noviembre (11)
 Invierno: diciembre (12) a febrero (2) */

public static void main(String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Ingresa por favor el numero del mes (1- 12): ");
    int mes = Scanner.nextint();
    if (mes == 3 || mes == 4 || mes == 5){
        System.out.println("La estacion es primavera");
    } else if (mes == 6 || mes == 7 ||  mes == 8){
        System.out.println("La estacion es verano");
    }else if (mes == 9 || mes == 10 || mes == 11){
        System.out.print("La estacion es otoño");
    } else (mes == 12 || mes == 1 || mes == 2){
        System.out.println("La estacion es invierno");
    }
}

/* Escribe un programa que recomiende una comida según el clima (
 soleado , lluvioso, frio) y la hora del día (mañana, tarde,noche ).Usa 
match para manejar el clima y if para la hora. */

public static void main(String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Ingrese por favor el clima (soleado, lluvioso, frio): ");
    String climac = Scanner.next().tolowerCase();
    System.out.print("Ingresa por favor la hora del día (mañana, tarde, noche): ");
    String hora = Scanner.next().tolowerCase();
    String comida = switch (climac){
        case "soleado" -> "una ensalda";
        case "lluvioso" -> "una sopa";
        case "frio" -> "un guiso";
    };
    String comidah;
    if (hora.equals ("mañana")){
        comidah = "un desayuno saludable";
    } else if (hora.equals ("tarde")){
        comidah = "una comida ligera";
    } else if (hora.equals ("noche")){
        comidah = "una cena ligera";
    }
    System.out.println("Te recomendamos: " + comida + "para el clima" + climac + "y" + comidah + "para la hora" + hora + ".");
}

/* Escribe un programa que convierta entre las siguientes unidades:
 Kilómetros a millas
 Celsius a Fahrenheit
 Kilogramos a libras
 Utiliza match para elegir la conversión y if para verificar valores negativos. */

public static void main(String[] args){
    Scanner Scanner = new scanner(Systen.in);
    System.out.print("Seleccione por favor la conversión que deseas: ");
    System.out.println("1. Kilómetros a millas");
    System.out.println("2. Celsius a fahrenheit");
    System.out.println("3. Kilogramos a libras");
    int opcion = Scanner.nextint();
    System.out.print("Ingresa por favor el valor a convertir: ");
    double valor = Scanner.nextDouble();
    if (valor < 0){
        System.out.println("Los valores no pueden ser negativos");
        return;
    }
    double resultado;
    String unidad;
    switch (opcion){
        case 1:
        resultado = valor * 0.621371;
        unidad = "millas";
        break;

        case 2:
        resultado = (valor * 9 / 5) + 32;
        unidad = "grados Fahrenheit";
        break;

        case 3:
        resultado = valor * 2.20462;
        unidad = "libras"; 
        break;
    }
    System.out.println("El valor convertido es: " + resultado + " " + unidad);
}

/* Crea un programa que determine si un año es:
 Bisiesto (divisible entre 4 pero no entre 100, excepto si también es divisible entre 400).
 Común. */

public static void main(String[] args){
Scanner Scanner = new scanner(System.in);
System.out.print("Ingresa por favor un año: ");
int año = Scanner.nextint();
if ((año % 4 == 0  && año % 100 != 0) ||    (año % 400 == 0)){
    System.out.println(año + "es un año bisiesto");
} else {
    System.out.println(año + "es un año común");
}
}

/* Crea un programa que convierta un monto en dólares a otra moneda. Usa las siguientes tasas de 
cambio:
 Euros: 0.85
 Pesos Colombianos: 4100
 Yenes: 110
 Utiliza 
match para manejar las conversiones. */
public static void mian(String[] args){
    Scanner Scanner = new scanner(System.in);
    System.out.print("Ingresa por favor el monto en dólares: ");
    double montod = Scanner.nextDouble();
    System.out.println("Elige la moneda que deseas convertir: ");
    System.out.println("1. Euros");
    System.out.println("2. Pesos Colombianos");
    System.out.println("3. Yenes");
    int opcion = Scanner.nextint();
    double monto;
    String moneda;
    switch (opcion){
        case 1:
        monto = montod * 0.85;
        moneda = "Euros";
        break;

        case 2:
        monto = montod * 4100;
        moneda = "Pesos Colombianos";
        break;

        case 3:
        monto = montod * 110;
        moneda = "Yenes";
        break;
    }
    System.out.println("El monto de " + montod + "dólares que equivalen a " + monto + " " + moneda);
}


/* Crea un programa que calcule el Índice de Masa Corporal (IMC) y clasifique el resultado según las 
categorías:
 Menos de 18.5: Bajo peso
 18.5 a 24.9: Peso normal
 25 a 29.9: Sobrepeso
 30 o más: Obesidad */

public static void main(String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Ingresa por favor tu peso en Kilogramos: ");
    double peso = Scanner.nextDouble();
    System.out.println("Ingresa por favor tu altura en metros: ");
    double altura = Scanner.nextDouble();
    double imc = peso / (altura * altura);
    System.out.println("Tu índice de masa corporal (IMC) es: " + imc);
    if (imc < 18.5){
        System.out.println("Clasificación: bajo peso");
    } else if (imc >= 18.5 && imc <= 24.9){
        System.out.println("Clasificación: peso normal");
    }else if (imc >= 25 && imc <=29.9){
        System.out.println("Clasificación: sobrepeso");
    }else (imc >= 30){
        System.out.println("Clasificación: obesidad");
    }
}

/* Crea un programa que permita a dos jugadores ingresar sus elecciones (piedra, papel o
 tijera ) y determine quién gana o si hay empate. */

public static void main(String[] args){
    Scanner Scanner = new scanner(System.in):
    System.out.print("Jugador 1 por favor ingresa tu elección (piera, papel o tijera): ");
    String jugador1 = Scanner.next().tolowerCase();
    System.out.print("Jugador 2 por favor ingresa tu elección (piera, papel o tijera): ");
    String jugador2 = Scanner.next().tolowerCase();
    if (!jugador1.equals ("piedra") && !jugador1.equals("papel") && !jugador1.equals("tijera")){
        System.out.println("Elección invalida para el jugador 1");
    } else if (!jugador2.equals("piedra") && !jugador2.equals("papel") && !jugador2.equals("tijera")){
        System.out.println("Elección invalida para el jugador 2");
    } else {
        if (jugador1.equals(jugador2)){
            System.out.println("Empate");
        } else if ((jugador1.equals("piedra") && jugador2.equals("tijera"))
                  (jugador1.equals("papel") && jugador2.equals("piedra"))
                  (jugador1.equals("yijera") && jugador2.equals("papel"))){
            System.out.println("¡Jugador 1 gana!");
        } else {
            System.out.print("¡Jugador 2 gana!");
        }
    }
}

/* Crea un programa que solicite un número entero y determine:
 Si es divisible por 2 y por 3.
 Si es divisible solo por 2.
 Si es divisible solo por 3.
 Si no es divisible por ninguno de los dos. */

public static void main(String[] args){
    Scanner Scanner = new scanner(System.in);
    System.out.print("Ingresa por favor un número entero: ");
    int numero = Scanner.nextint();
    if (numero % 2 == 0 && numero % 3 == 0){
        System.out.println("El número es divisible por 2 y por 3");
    } else if (numero % 2 == 0){
        System.out.println("El numero es divisible solo por 2");
    } else if (numero % 3 == 0){
        System.out.println("El numero es divisible solo por 3");
    } else {
        System.out.println("El numero no es divisible por ninguno de los dos");
    }
}

/* Escribe un programa que solicite la velocidad de un vehículo (en km/h) y clasifique:
 0-20 km/h: Muy lento
 21-60 km/h: Moderado
 61-120 km/h: Rápido
 Más de 
120 km/h: Muy rápido */

public static void main(String[] args){
    Scanner Scanner = new scanner(System.in);
    System.out.print("Ingresa la velocidad del vehículo en km / h: ");
    int velocidad = Scanner.nextint();
    if (velocidad >= 0 && velocidad <= 20){
        System.out.println("Clasificación: muy lento");
    } else if (velocidad >= 21 && velocidad <= 60){
        System.out.println("clasificacón: moderado");
    } else if (velocidad >= 61 && velocidad <=120){
        System.out.print("Clasificación: rápida");
    } else if (velocidad >= 120){
        System.out.println("Clasificación: muy rápido");
    }
}

/* Crea un programa que solicite la edad de una persona y determine:
 Si es un bebé (0-2 años).
 Si es un niño (3-12 años).
 Si es un adolescente (13-17 años).
 Si es un adulto (18-64 años).
 Si es un adulto mayor (65 años o más). */

public static void main(String[] args){
    Scanner Scanner = new scanner(System.in);
    System.out.print("Ingresa por favor tu edad: ");
    int edad = Scanner.nextint();
    if (edad >= 0 && edad <= 2){
        System.out.println("Eres un bebé");
    } else if (edad >= 3 && edad <= 12){
        System.out.println("Eres un niño");
    } else if (edad >= 13 && edad <= 17){
        System.out.print("Eres un adolescente");
    } else if (edad >= 18 && edad <= 64){
        System.out.print("Eres un adulto");
    } else  (edad >=65){
        System.out.println("Eres un adulto mayor");
    }
}

/* Crea un programa que solicite la cantidad de sensores activados y el nivel de alerta:
 1-2 sensores: Alerta baja.
 3-5 sensores: Alerta media.
 6 o más sensores: Alerta alta. */

public static void main(String[] args){
    Scanner Scanner = new scanner(System.in);
    System.out.print("Ingresa por favor la cantidad de sensores activados: ");
    int cantidad = Scanner.nextint();
    System.out.print("Ingresa por favor el nivel de alerta (baja, media, alta): ");
    String nivel = Scanner.next().tolowerCase();
    if (cantidad >= 1 && cantidad <= 2){
        System.out.println("Alerta baja");
    } else if (cantidad >= 3 && cantidad <= 5){
        System.out.print("Alerta media");
    } else (cantidad >= 6){
        System.out.println("Alerta alta");
    }
}

/* Crea un programa que reciba el número de un mes (1-12) y determine a qué trimestre del año 
pertenece:
 1-3 : Primer trimestre.
 4-6 : Segundo trimestre.
 7-9 : Tercer trimestre.
 10-12 : Cuarto trimestre. */

public static void main(String[] args){
    Scanner Scanner = new scanner(System.in);
    System.out.print("Ingresa por favor el numero del mes (1 - 12): ");
    int mes = Scanner.nextint();
    if (mes >= 1 && mes <= 3){
        System.out.println("El mes pertenece al primer trimestre");
    } else if (mes >= 4 && mes <= 6){
        System.out.println("El mes pertenece al segundo trimestre");
    } else if (mes >= 7 && mes <= 9){
        System.out.println("El mes pertenece al tercer trimestre");
    } else if (mes > 10 && mes <= 12){
        System.out.println("El mes pertenece al cuarto trimestre");
    }
}

/* Crea un programa que reciba el número de lados de una figura geométrica y clasifique:
 3 lados: Triángulo.
 4 lados: Cuadrado o rectángulo.
 5 lados: Pentágono.
 6 lados: Hexágono.
 Otros: Figura no soportada. */

public static void main(String[] args){
    Scanner Scanner = new scanner(System.in);
    System.out.print("Ingresa por favor el numero de lados de la figura geometrica: ");
    int lados = Scanner.nextint();
    switch (lados) {
        case 3: 
        System.out.println("Es un triangulo");
        break;

        case 4:
        System.out.println("Es un cuadrado o rectangulo");
        break;

        case 5:
        System.out.println("Es un pentagono");
        break;

        case 6:
        System.out.println("Es un hexagono");
        break;

        default:
        System.out.println("Figura no soportada");
        break;
    }
}