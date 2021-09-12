package models;

import models.valueobjects.Company;
import models.valueobjects.Ram;

import java.io.Serializable;

public class Smartphone implements Serializable {
    // Оперативная память
    private Ram ram;
    // внутренняя память
    private int rom;
    // Производитель
    private Company company;
    // Модель
    private String model;

    public Smartphone(){

    }

    public Smartphone(Ram ram, Company company){
        this.ram = ram;
        this.company = company;
    }

    public void setRam(Ram ram){
        this.ram = ram;
    }

    public Ram getRam(){
        return this.ram;
    }

    public void setRom(int rom){
        this.rom = rom;
    }

    public int getRom(){
        return this.rom;
    }

    public void setCompany(Company company){
        this.company = company;
    }

    public Company getCompany(){
        return this.company;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
}
