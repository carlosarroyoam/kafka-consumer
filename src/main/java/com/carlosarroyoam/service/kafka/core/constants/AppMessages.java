package com.carlosarroyoam.service.kafka.core.constants;

/**
 * Constantes centralizadas con los mensajes de error usados en las excepciones de la API,
 * reutilizadas entre los distintos servicios para mantener consistencia en las respuestas de error.
 */
public class AppMessages {
  public static final String ILLEGAL_ACCESS_EXCEPTION = "Illegal access to utility class";

  /** Constructor privado que impide instanciar la clase. */
  private AppMessages() {
    throw new IllegalAccessError(ILLEGAL_ACCESS_EXCEPTION);
  }
}
