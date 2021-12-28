package koperasi;

import java.util.*;
import javafx.beans.property.*;

public abstract class Nasabah {
    protected IntegerProperty ID;
    protected StringProperty name;
    protected StringProperty address;
    protected IntegerProperty numAccount;
    protected ArrayList<Rekening> rekening;

    public Nasabah(int ID, String name, String address, ArrayList<Rekening> rekening) {
        this.ID = new SimpleIntegerProperty(ID);
        this.name = new SimpleStringProperty(name);
        this.address = new SimpleStringProperty(address);
        this.rekening = rekening;
        this.numAccount = new SimpleIntegerProperty(this.rekening.size());
    }
    
    public Nasabah(int ID, String name, String address, Rekening rekening) {
        this.rekening = new ArrayList<>();
        this.ID = new SimpleIntegerProperty(ID);
        this.name = new SimpleStringProperty(name);
        this.address = new SimpleStringProperty(address);
        this.rekening.add(rekening);
        this.numAccount = new SimpleIntegerProperty(this.rekening.size());
    }
    

