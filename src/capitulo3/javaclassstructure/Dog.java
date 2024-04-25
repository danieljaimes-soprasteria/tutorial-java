/**
 * Copyright 2018.
 */
package capitulo3.javaclassstructure;

/**
 * Capítulo 3: Bloques básicos en Java
 * <p>
 * Esta clase define objetos tipo Dog
 *
 * @author SopraSteria
 */

public class Dog {
    /*
     * Atributos de la case Dog
     */
    String breed;
    int age;
    String color;

    /**
     * Método que realiza un ladrido
     *
     * @param bark contiene el número de ladridos
     * @return bark
     * un entero con el número de ladridos modificado
     */
    public int barking(int bark) {
        bark = bark + 1;
        return bark;
    }

    void hungry() {
    }

    void sleeping() {
    }


}