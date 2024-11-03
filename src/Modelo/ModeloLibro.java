/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class ModeloLibro {

    private int idPartida;
    private String nPartida;
    private String nombres;
    private String apellidoPat;
    private String apellidoMat;
    private String folio;

    public ModeloLibro(int idPartida, String nPartida, String nombres, String apellidoPat, String apellidoMat, String folio, int idLibro, int idTipoPartida) {
        this.idPartida = idPartida;
        this.nPartida = nPartida;
        this.nombres = nombres;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.folio = folio;
        this.idLibro = idLibro;
        this.idTipoPartida = idTipoPartida;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public String getnPartida() {
        return nPartida;
    }

    public void setnPartida(String nPartida) {
        this.nPartida = nPartida;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdTipoPartida() {
        return idTipoPartida;
    }

    public void setIdTipoPartida(int idTipoPartida) {
        this.idTipoPartida = idTipoPartida;
    }
    private int idLibro;
    private int idTipoPartida;
}
