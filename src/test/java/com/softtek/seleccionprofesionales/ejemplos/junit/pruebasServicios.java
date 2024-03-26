package com.softtek.seleccionprofesionales.ejemplos.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class pruebasServicios {
@BeforeAll
public static void primero() {
	System.out.println("primero");
}
@AfterAll
public static void ultimo() {
	System.out.println("ultimo");
}

}
