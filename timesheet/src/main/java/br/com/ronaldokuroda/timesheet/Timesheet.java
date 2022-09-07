package br.com.ronaldokuroda.timesheet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "timesheet")
public class Timesheet {

    @Id
    private String id;
    private String Funcionario;
    private String Data;
    private String HoraEntrada;
    private String HoraSaida;

    public Timesheet(){

    }

    public Timesheet(String funcionario, String data, String horaentrada, String horasaida) {
        this.Funcionario = funcionario;
        this.Data = data;
        this.HoraEntrada = horaentrada;
        this.HoraSaida = horasaida;
    }

    public String getFuncionario() {
        return Funcionario;
    }

    public String getData() {
        return Data;
    }

    public String getHoraEntrada() {
        return HoraEntrada;
    }

    public String getHoraSaida() {
        return HoraSaida;
    }

}
