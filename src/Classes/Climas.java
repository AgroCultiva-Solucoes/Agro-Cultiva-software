/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Hello
 */

import java.time.LocalDate;
import java.time.LocalTime;


public class Climas {
    private int idClima;
   private int IdSafra;
    private String clima;
    private LocalDate data;
    private LocalTime hora;
    private float temperatura;
    private float umidade;
    private float precipitacao;
    private float velocidade_vento;

    public int getIdClima() {
        return idClima;
    }

    public void setIdClima(int idClima) {
        this.idClima = idClima;
    }

   public int getIdSafra() {
        return IdSafra;
    }

    public void setIdSafra(int IdSafra) {
        this.IdSafra = IdSafra;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }

    public float getPrecipitacao() {
        return precipitacao;
    }

    public void setPrecipitacao(float precipitacao) {
        this.precipitacao = precipitacao;
    }

    public float getVelocidade_vento() {
        return velocidade_vento;
    }

    public void setVelocidade_vento(float velocidade_vento) {
        this.velocidade_vento = velocidade_vento;
    }

    

    
    }
