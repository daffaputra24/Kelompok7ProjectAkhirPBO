package koperasi;

import java.util.ArrayList;
import javafx.beans.property.*;

public class Individu extends Nasabah{
    private LongProperty nik;
    private LongProperty npwp;

    public Individu(int ID, String name, String address, long nik, long npwp, ArrayList<Rekening> rekening) {
        super(ID, name, address, rekening);
        this.nik = new SimpleLongProperty(nik);
        this.npwp = new SimpleLongProperty(npwp);
    }

    public Individu(int ID, String name, String address, long nik, long npwp, Rekening rekening) {
        super(ID, name, address, rekening);
        this.nik = new SimpleLongProperty(nik);
        this.npwp = new SimpleLongProperty(npwp);
    }


