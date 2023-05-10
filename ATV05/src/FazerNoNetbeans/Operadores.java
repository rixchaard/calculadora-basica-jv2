/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FazerNoNetbeans;

/**
 *
 * @author alunos
 */
public class Operadores {

    public float adicao(float v1, float v2) {
        return v1 + v2;
    }

    public float subtracao(float v1, float v2) {
        return v1 - v2;
    }

    public float multiplicacao(float v1, float v2) {
        return v1 * v2;
    }

    public float divisao(float v1, float v2) {
        return v1 / v2;
    }

    public String men10(float v1, float v2) {
    float resultado = v1 + v2;
    if (resultado <= 10) {
        return "Menor ou igual a 10";
    } else {
        return "Maior que 10";
    }
}


}
