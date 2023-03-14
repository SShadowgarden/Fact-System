package co.edu.uptc.pojo;


public class Persona {
private String docType;
private String docNumber;
private String names;
private String surNames;
private String Adress;
private String city;
public String getDocType() {
    return docType;
}
public void setDocType(String docType) {
    this.docType = docType;
}
public String getDocNumber() {
    return docNumber;
}
public void setDocNumber(String docNumber) {
    this.docNumber = docNumber;
}
public String getNames() {
    return names;
}
public void setNames(String names) {
    this.names = names;
}
public String getSurNames() {
    return surNames;
}
public void setSurNames(String surNames) {
    this.surNames = surNames;
}
public String getAdress() {
    return Adress;
}
public void setAdress(String adress) {
    Adress = adress;
}
public String getCity() {
    return city;
}
public void setCity(String city) {
    this.city = city;
}
public Persona(String docType, String docNumber, String names, String surNames, String adress, String city) {
    this.docType = docType;
    this.docNumber = docNumber;
    this.names = names;
    this.surNames = surNames;
    Adress = adress;
    this.city = city;
}
@Override
public String toString() {
    return " doktaip "+ docType + ", docNumber=" + docNumber + ", names=" + names + ", surNames=" + surNames
            + ", Adress=" + Adress + ", city=" + city ;
}


}
