package com.matheuslipk.sistemaacademia.values;

/**
 *
 * @author h4ck3r
 */
public class Strings {
    
    public final String[] diaSemana = new String[7];
    public final String[] mesDoAno = new String[12];
    
    public Strings(){
        setDiaDemada();
        setMesAno();
    }
    
    private void setDiaDemada(){
        diaSemana[0] = "Dom";
        diaSemana[1] = "Seg";
        diaSemana[2] = "Ter";
        diaSemana[3] = "Qua";
        diaSemana[4] = "Qui";
        diaSemana[5] = "Sex";
        diaSemana[6] = "Sab";
    }
    
    private void setMesAno(){
        mesDoAno[0] = "Jan";
        mesDoAno[1] = "Fev";
        mesDoAno[2] = "Mar";
        mesDoAno[3] = "Abr";
        mesDoAno[4] = "Mai";
        mesDoAno[5] = "Jun";
        mesDoAno[6] = "Jul";
        mesDoAno[7] = "Ago";
        mesDoAno[8] = "Set";
        mesDoAno[9] = "Out";
        mesDoAno[10] = "Nov";
        mesDoAno[11] = "Dez";
    }
}
