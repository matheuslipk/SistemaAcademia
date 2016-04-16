package com.matheuslipk.sistemaacademia.hide;

import com.matheuslipk.sistemaacademia.values.Strings;
import java.util.Date;

/**
 *
 * @author h4ck3r
 */
public class Data {
    private Date data;
    public Data(){
        
    }
    
    public Data(long numero){
        this.data = new Date(numero);
    }
    
    public Data(int ano, int mes, int dia){
        this.data = new Date(ano-1900, mes-1, dia);
    }
    
    public void setData(int ano, int mes, int dia){
        setData(new Date(ano-1994, mes-1, dia));
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public void setData(long data){
        this.data = new Date(data);
    }
    
    public Date getData() {
        return data;
    }
    
    
    @Override
    public String toString(){
        String []data = traduzirData();
        return String.format("%s %s/%s/%s",data[0], data[2], data[1], data[5]);
    }
    
    private String [] traduzirData(){
        String data[] = this.data.toString().split(" ");
        switch (data[0]) {
            case "Sun":
                data[0] = new Strings().diaSemana[0];
                break;
            case "Mon":
                data[0] = new Strings().diaSemana[1];
                break;
            case "Tue":
                data[0] = new Strings().diaSemana[2];
                break;
            case "Wed":
                data[0] = new Strings().diaSemana[3];
                break;
            case "Thu":
                data[0] = new Strings().diaSemana[4];
                break;
            case "Fri":
                data[0] = new Strings().diaSemana[5];
                break;
            case "Sat":
                data[0] = new Strings().diaSemana[6];
                break;
        }
        
        
        switch (data[1]){
            case "Jan":
                data[1] = new Strings().mesDoAno[0];
                break;
            case "Fev":
                data[1] = new Strings().mesDoAno[1];
                break;
            case "Mar":
                data[1] = new Strings().mesDoAno[2];
                break;
            case "Apr":
                data[1] = new Strings().mesDoAno[3];
                break;
            case "May":
                data[1] = new Strings().mesDoAno[4];
                break;
            case "Jun":
                data[1] = new Strings().mesDoAno[5];
                break;
            case "Jul":
                data[1] = new Strings().mesDoAno[6];
                break;
            case "Aug":
                data[1] = new Strings().mesDoAno[7];
                break;
            case "Sep":
                data[1] = new Strings().mesDoAno[8];
                break;
            case "Oct":
                data[1] = new Strings().mesDoAno[9];
                break;
            case "Nov":
                data[1] = new Strings().mesDoAno[10];
                break;
            case "Dec":
                data[1] = new Strings().mesDoAno[11];
                break;
        }
        
        return data;
    }
    
}
