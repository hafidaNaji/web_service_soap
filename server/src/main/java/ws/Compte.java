package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date date_Creation;

    public Compte() {
    }

    public Compte(int code, double solde, Date date_Creation) {
        this.code = code;
        this.solde = solde;
        this.date_Creation = date_Creation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDate_Creation() {
        return date_Creation;
    }

    public void setDate_Creation(Date date_Creation) {
        this.date_Creation = date_Creation;
    }
}
