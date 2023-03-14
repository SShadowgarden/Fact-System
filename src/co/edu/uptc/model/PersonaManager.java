package co.edu.uptc.model;

import co.edu.uptc.model.dinamic.UptcList;
import co.edu.uptc.pojo.Persona;

public class PersonaManager {
    private UptcList<Persona> uptcList = new UptcList<Persona>();

    public UptcList<Persona> getUptcList() {
        return uptcList;
    }

    public void setUptcList(UptcList<Persona> uptcList) {
        this.uptcList = uptcList;
    }

    public boolean AddPersona(Persona persona) {
        boolean isPossible = false;
        int aux = searchPersona(persona.getDocNumber());
         if (aux==-1) {
            uptcList.add(persona);
            isPossible = true;
            System.out.println("añadido joven" + persona.toString());

        }else if(aux != -1&& uptcList.get(aux).getDocType().equals(persona.getDocType())==false){

            uptcList.add(persona);
            System.out.println("añadido joven" + persona.toString());

            isPossible = true;
            
        }
        return isPossible;
    }
    public void editPerson(String docNumber, String docType, String newDocNumber, String names, String surNames, String adress, String city) {
        int index = searchPersona(docNumber);
        if (index != 1) {
        	Persona person = uptcList.get(index);
            person.setDocType(docType);
            person.setDocNumber(newDocNumber);
            person.setNames(names);
            person.setSurNames(surNames);
            person.setAdress(adress);
            person.setCity(city);
        }
    }
    
    public boolean DeletePersona(String docNum, String docType) {
    	int index = searchPersona(docNum);
        if (index != -1) {
            if(uptcList.get(index).getDocType().equals(docType)) {
                Persona personaEliminada = uptcList.remove(index);
                System.out.println("Se eliminó la persona con número de documento " + personaEliminada.getDocNumber());
                return true;
            }
        }
        return false;
    }
    
    private int searchPersona(String docNum) {
        for (int i = 0; i < uptcList.size(); i++) {
            if (docNum.equals(uptcList.get(i).getDocNumber())) {
                return i;
            }
        }
        return -1;
    }
    
    public Persona getPerson(String docNum) {
    	int index = searchPersona(docNum);
    	return index != -1 ? uptcList.get(index) : null;
    }
    
   
    
    public void xd() {
    	for (int i = 0; i < uptcList.size(); i++) {
			System.out.println(uptcList.get(i).getDocNumber());
		}
    }
    
}
