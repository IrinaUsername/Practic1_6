/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.autoservice;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class AutoService {

    public static void main(String[] args) {
        
        System.out.println("Zadanie 1.6 Milovantseva Irina RIBO-01-22 Variant 16(1)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the car brand: ");
        String brand = scanner.nextLine();
        Car car = new Car(brand);
        car.modify();

        System.out.println("Brand before change: " + brand);
        System.out.println("Brand after change: " + car.getBrand());
    }
}
