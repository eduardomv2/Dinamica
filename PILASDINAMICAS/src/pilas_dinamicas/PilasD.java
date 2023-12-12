package pilas_dinamicas;
import java.util.Scanner;
import java.util.Stack;

public class PilasD {
	public static void main(String[] args) {
        MiPila<Integer> pilaEnteros = new MiPila<>(5);
        pilaEnteros.push(1);
        pilaEnteros.push(2);
        pilaEnteros.push(3);

        System.out.println("Elementos en la pila de enteros:");
        while (pilaEnteros.count() > 0) {
            System.out.println(pilaEnteros.pop());
        }

        MiPila<String> pilaCadenas = new MiPila<>(3);
        pilaCadenas.push("Hola");
        pilaCadenas.push("Mundo");

        System.out.println("Elementos en la pila de cadenas:");
        while (pilaCadenas.count() > 0) {
            System.out.println(pilaCadenas.pop());
        }
    }

    public static class MiPila<T> {
        private T[] elementos;
        private int capacidad;
        private int contador;

        public MiPila(int capacidad) {
            this.capacidad = capacidad;
            this.elementos = (T[]) new Object[capacidad];
            this.contador = 0;
        }

        public void push(T elemento) {
            if (contador < capacidad) {
                elementos[contador] = elemento;
                contador++;
            } else {
                System.out.println("La pila está llena. No se pueden agregar más elementos.");
            }
        }

        public T pop() {
            if (contador > 0) {
                contador--;
                T elemento = elementos[contador];
                elementos[contador] = null; // Restablecer el valor a null
                return elemento;
            } else {
                System.out.println("La pila está vacía. No se pueden sacar más elementos.");
                return null;
            }
        }

        public T peek() {
            if (contador > 0) {
                return elementos[contador - 1];
            } else {
                System.out.println("La pila está vacía. No hay elementos para ver.");
                return null;
            }
        }

        public int count() {
            return contador;
        }
    }
}

