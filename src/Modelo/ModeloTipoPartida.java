/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class ModeloTipoPartida {

    private int idTipoPartida;
    private String tipoPartida;

    public int getIdTipoPartida() {
        return idTipoPartida;
    }

    public void setIdTipoPartida(int idTipoPartida) {
        this.idTipoPartida = idTipoPartida;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    public ModeloTipoPartida(int idTipoPartida, String tipoPartida) {
        this.idTipoPartida = idTipoPartida;
        this.tipoPartida = tipoPartida;
    }
}
