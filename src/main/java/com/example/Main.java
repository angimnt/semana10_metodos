package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }
            
            switch (opcion) {
                case 1:
                    ejercicio1(scanner);
                    break;
                case 2:
                    ejercicio2(scanner);
                    break;
                case 3:
                    ejercicio3(scanner);
                    break;
                case 4:
                    ejercicio4(scanner);
                    break;
                case 5:
                    ejercicio5(scanner);
                    break;
                case 6:
                    ejercicio6(scanner);
                    break;
                case 7:
                    ejercicio7(scanner);
                    break;
                case 8:
                    ejercicio8(scanner);
                    break;
                case 9:
                    ejercicio9(scanner);
                    break;
                case 10:
                    ejercicio10(scanner);
                    break;
                default:
                    System.out.println("Opción Inválida");
            }

        }
        System.out.println("Fin del programa");
        scanner.close();
    }

    public static void menu() {
        System.out.println("--------------------------------");
        System.out.println("Bienvenido a la aplicación de la semana 10");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("0. para salir");
        System.out.println("Selecciona una opción: ");
        System.out.println("--------------------------------");
    }

    public static void ejercicio1(Scanner scanner) {
        System.out.println("Ejercicio 1: Calculadora de descuentos en Tienda");
        System.out.println("por favor ingresa la cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();

        System.out.println("ahora ingresa el valor total de la compra: ");
        double precioTotal = scanner.nextDouble();

        double descuentoPorCantidad = 0.0;

        if (cantidadProductos > 20) {
            descuentoPorCantidad = 0.20;
        }
            else if (cantidadProductos >= 10) {
                descuentoPorCantidad = 0.15;
            } else if (cantidadProductos > 5) {
                descuentoPorCantidad = 0.10;
        }

        double montoDescuentoCantidad = precioTotal * descuentoPorCantidad;
        double subtotal = precioTotal - montoDescuentoCantidad;
        double precioFinal = subtotal;

        if (subtotal > 100000) {
            System.out.println("Felicidades tienes un 5% de descuneto  adicional por compras mayores a 100000");
            double descuentoAdicional = subtotal * 0.05;
            precioFinal = subtotal - descuentoAdicional;

            System.out.println("-------------------------------");
            System.out.println("Resumen de la compra:");
            System.out.println("precio original: $" + precioTotal);
            System.out.println("Descuento por cantidad (" + (descuentoPorCantidad * 100) + "%): -$" + montoDescuentoCantidad);
            if (subtotal > 100000) {
                System.out.println("Descuento adicional (5%): -$" + (descuentoAdicional));
            }
            System.out.println("------------------------------");
            System.out.println("Pecio final a pagar: $" + precioFinal);
            System.out.println("------------------------------");
        }
        
    }

    public static void ejercicio2(Scanner scanner) {
        System.out.println("Ejercicio 2: Sistema de Calificación Crediticia");
        System.out.println("Ingrese los ingresos mensuales del cliente: ");
        double ingresosMensuales = scanner.nextDouble();

        System.out.println("ingrese la edad del cliente: ");
        int edad = scanner.nextInt();

        System.out.println("ingrese los gastos mensuales del cliente: ");
        double gastosMensuales = scanner.nextDouble();

        boolean ingresosSuficientes = ingresosMensuales >= 2000000;
        boolean edadValida = edad >= 18 && edad <= 65;
        boolean gastosControlados = gastosMensuales <= (ingresosMensuales * 0.70);
        if (ingresosSuficientes && edadValida && gastosControlados) {
            
            double montoMaximoCredito = ingresosMensuales * 0.5;

            System.out.println("--------------------------------");
            System.out.println("Crédito Aprobado");
            System.out.println("El monto maximo del credito que se le puede otorgar es: $" + montoMaximoCredito);
            System.out.println("--------------------------------");
        } else {
            System.out.println("--------------------------------");
            System.out.println("Crédito No Aprobado");
            System.out.println("El cliente no cumple con los requisitos para obtener el crédito.");

            if (!ingresosSuficientes) {
                System.out.println("los ingresos mensuales son menores a $2,000,000.");
            }
            if (!edadValida) {
                System.out.println("La edad del cliente no está entre 18 y 65 años.");
            }
            if (!gastosControlados) {
                System.out.println("Los gastos mensuales exceden el 70% de los ingresos mensuales.");
            }
            System.out.println("--------------------------------");
        }
    }

    public static void ejercicio3(Scanner scanner) {
        System.out.println("Ejercicio 3 Control de Inventario de Mercado");
        System.out.println("Ingrese el inventario inicial de la fruta: ");
        int inventario = scanner.nextInt();
        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("\n-------------- DIA " + dia + " --------------");
            System.out.println("Inventario actual: " + inventario + " unidades");

            System.out.println("Ingrese la cantidad de fruta vendida hoy: ");
            int ventas = scanner.nextInt();

            System.out.println("Cuantas unidades nuevas llegaron hoy: ");
            int llegada = scanner.nextInt();

            inventario = inventario - ventas + llegada;
            System.out.println("Al final del dia, el inventario es de: " + inventario + " unidades");

            if (inventario < 10) {
                System.out.println("ALERTA: inventario bajo (" + inventario + " unidades.).");
                System.out.println("Se ha realizado un pedido automatico de 50 unidades.");

                inventario = inventario + 50;
                System.out.println("Nuevo inventario despues del pedido: " + inventario + " unidades.");

            }
        }
        System.out.println("\n======================================");
        System.out.println("FIN DE SEMANA");
        System.out.println("Inventario final de la semana: " + inventario + " unidades.");
        System.out.println("======================================");
    }

    public static void ejercicio4(Scanner scanner) {
        System.out.println("Ejercicio 4 Calculadora de Tiempo de Viaje en Transporte Público");
        double tiempoBus = 20;
    double tiempoMetro = 15;
    double tiempoCaminar = 10;

    System.out.print("¿Hay tráfico pesado? (responda si o no): ");
    String respuestaTrafico = scanner.next();

    System.out.print("¿Está lloviendo? (responda si o no): ");
    String respuestaLluvia = scanner.next();

    if (respuestaTrafico.equalsIgnoreCase("si")) {
        System.out.println("-> Se aplica aumento del 50% al tiempo del bus por tráfico.");
        tiempoBus = tiempoBus * 1.5;
    }

    if (respuestaLluvia.equalsIgnoreCase("si")) {
        System.out.println("-> Se aplica aumento del 100% al tiempo de caminata por lluvia.");
        tiempoCaminar = tiempoCaminar * 2.0;
    }

    double tiempoTotal = tiempoBus + tiempoMetro + tiempoCaminar;

    System.out.println("\n------------------------------------------");
    System.out.println("Resumen del Tiempo de Viaje:");
    System.out.println("- Tiempo en Bus: " + tiempoBus + " minutos.");
    System.out.println("- Tiempo en Metro: " + tiempoMetro + " minutos.");
    System.out.println("- Tiempo Caminando: " + tiempoCaminar + " minutos.");
    System.out.println("------------------------------------------");
    System.out.println("TIEMPO TOTAL ESTIMADO DE VIAJE: " + tiempoTotal + " minutos.");
    System.out.println("------------------------------------------");

    }

    public static void ejercicio5(Scanner scanner) {
        System.out.println("Ejercicio 5 Sistema de Gestión de Vuelos");
        System.out.print("¿Hay mal clima general? (si/no): ");
    String malClima = scanner.next();
    int retrasoAdicional = 0;

    if (malClima.equalsIgnoreCase("si")) {
        retrasoAdicional = 30;
        System.out.println("-> Alerta: Se suma un retraso de 30 min a todos los vuelos por mal clima.");
    }

    for (int i = 1; i <= 5; i++) {
        System.out.println("\n--- Vuelo #" + i + " ---");
        System.out.print("Ingrese el retraso programado del vuelo en minutos (use -1 si está cancelado): ");
        int retrasoProgramado = scanner.nextInt();
        String estadoVuelo;

        if (retrasoProgramado == -1) {
            estadoVuelo = "CANCELADO";
        } else {
            int retrasoTotal = retrasoProgramado + retrasoAdicional;
            if (retrasoTotal > 15) {
                estadoVuelo = "RETRASADO (" + retrasoTotal + " min)";
            } else {
                estadoVuelo = "A TIEMPO";
            }
        }
        System.out.println("Estado del Vuelo #" + i + ": " + estadoVuelo);
    }

    }

    public static void ejercicio6(Scanner scanner) {
        System.out.println("Ejercicio 6 Optimizador de Rutas de Entrega");
        int tiempoTotalTrabajo = 8 * 60;
    int tiempoRestante = tiempoTotalTrabajo;
    int entregasRealizadas = 0;

    while (tiempoRestante > 0) {
        System.out.println("\nTiempo restante en la jornada: " + tiempoRestante + " minutos.");
        System.out.print("Ingrese la zona de la siguiente entrega (centro, periferia, rural) o 'fin' para terminar: ");
        String zona = scanner.next();

        if (zona.equalsIgnoreCase("fin")) {
            break;
        }

        int tiempoEntrega = 0;
        switch (zona.toLowerCase()) {
            case "centro":
                tiempoEntrega = 30;
                break;
            case "periferia":
                tiempoEntrega = 45;
                break;
            case "rural":
                tiempoEntrega = 60;
                break;
            default:
                System.out.println("Zona no válida. Intente de nuevo.");
                continue;
        }

        if (tiempoRestante >= tiempoEntrega) {
            tiempoRestante -= tiempoEntrega;
            entregasRealizadas++;
            System.out.println("-> Entrega en zona '" + zona + "' realizada. Quedan " + tiempoRestante + " minutos.");
        } else {
            System.out.println("-> No hay tiempo suficiente para esta entrega. Finalizando jornada.");
            break;
        }
    }

    System.out.println("\n==========================================");
    System.out.println("Jornada Finalizada.");
    System.out.println("Total de entregas realizadas hoy: " + entregasRealizadas);
    System.out.println("==========================================");
}

    public static void ejercicio7(Scanner scanner) {
        System.out.println("Ejercicio 7 Monitor de Rutina de Ejercicios");
        System.out.print("Ingrese los minutos de ejercicio de Cardio: ");
    int minutosCardio = scanner.nextInt();

    System.out.print("Ingrese los minutos de ejercicio de Pesas: ");
    int minutosPesas = scanner.nextInt();

    System.out.print("Ingrese los minutos de ejercicio de Yoga: ");
    int minutosYoga = scanner.nextInt();

    int caloriasCardio = minutosCardio * 10;
    int caloriasPesas = minutosPesas * 8;
    int caloriasYoga = minutosYoga * 5;

    int caloriasTotales = caloriasCardio + caloriasPesas + caloriasYoga;
    int puntosGanados = 0;

    if (caloriasTotales > 500) {
        puntosGanados = 50;
    }

    System.out.println("\n------------------------------------------");
    System.out.println("Resumen de la Rutina:");
    System.out.println("Calorías quemadas en Cardio: " + caloriasCardio);
    System.out.println("Calorías quemadas en Pesas: " + caloriasPesas);
    System.out.println("Calorías quemadas en Yoga: " + caloriasYoga);
    System.out.println("------------------------------------------");
    System.out.println("CALORÍAS TOTALES QUEMADAS: " + caloriasTotales);
    if (puntosGanados > 0) {
        System.out.println("¡Felicidades! Has ganado " + puntosGanados + " puntos de bono.");
    }
    System.out.println("------------------------------------------");
}

    public static void ejercicio8(Scanner scanner) {
        System.out.println("Ejercicio 8 Sistema de Triaje Hospitalario");
        for (int i = 1; i <= 5; i++) {
        System.out.println("\n--- Evaluando Paciente #" + i + " ---");
        System.out.print("Ingrese la temperatura (°C): ");
        double temperatura = scanner.nextDouble();

        System.out.print("Ingrese la presión arterial (ej. 120/80): ");
        String presionInput = scanner.next();
        String[] presionPartes = presionInput.split("/");
        int presionSistolica = Integer.parseInt(presionPartes[0]);
        int presionDiastolica = Integer.parseInt(presionPartes[1]);

        System.out.print("Ingrese el nivel de dolor (1-10): ");
        int dolor = scanner.nextInt();

        String clasificacion;

        if (temperatura > 38.5 || presionSistolica > 140 || presionDiastolica > 90 || dolor >= 8) {
            clasificacion = "URGENTE";
        } else if (temperatura > 37.5 || dolor >= 5) {
            clasificacion = "PRIORITARIO";
        } else {
            clasificacion = "NORMAL";
        }

        System.out.println("Clasificación del Paciente #" + i + ": " + clasificacion);
    }

    }

    public static void ejercicio9(Scanner scanner) {
        System.out.println("Ejercicio 9 Calculadora de Notas y Promedio Estudiantil");
        for (int i = 1; i <= 3; i++) {
        System.out.println("\n--- Ingresando notas para el Estudiante #" + i + " ---");
        System.out.print("Ingrese la nota de Parciales (0.0 a 5.0): ");
        double parciales = scanner.nextDouble();

        System.out.print("Ingrese la nota del Proyecto Final (0.0 a 5.0): ");
        double proyecto = scanner.nextDouble();

        System.out.print("Ingrese la nota de Participación (0.0 a 5.0): ");
        double participacion = scanner.nextDouble();

        double promedioFinal = (parciales * 0.30) + (proyecto * 0.40) + (participacion * 0.30);
        String resultado;

        if (promedioFinal >= 4.0) {
            resultado = "APRUEBA";
        } else if (promedioFinal >= 3.5) {
            resultado = "VA A SUPLETORIO";
        } else {
            resultado = "REPRUEBA";
        }

        System.out.printf("El promedio final del Estudiante #%d es: %.2f\n", i, promedioFinal);
        System.out.println("Resultado: " + resultado);
    }


    }

    public static void ejercicio10(Scanner scanner) {
        System.out.println("Ejercicio 10 Sistema de Riego Automático para Cultivos");
        for (int dia = 1; dia <= 7; dia++) {
        System.out.println("\n--- Día " + dia + " de la Semana ---");

        System.out.print("¿Llovió en las últimas 24 horas? (si/no): ");
        String llovio = scanner.next();

        if (llovio.equalsIgnoreCase("si")) {
            System.out.println("-> Riego no necesario debido a lluvia reciente.");
            continue;
        }

        System.out.print("Ingrese la humedad del suelo (%): ");
        int humedad = scanner.nextInt();

        System.out.print("Ingrese la temperatura actual (°C): ");
        int temperatura = scanner.nextInt();

        if (humedad < 30) {
            System.out.println("-> Humedad baja. Activando riego por 60 minutos.");
        } else if (temperatura > 25 && humedad < 50) {
            System.out.println("-> Temperatura alta y humedad moderada. Activando riego por 30 minutos.");
        } else {
            System.out.println("-> Condiciones óptimas. No se requiere riego.");
        }
    }

    System.out.println("\n--- Simulación de la semana completada ---");
}
    }
