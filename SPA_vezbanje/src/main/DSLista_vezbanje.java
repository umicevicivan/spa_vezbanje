package main;

import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;

public class DSLista_vezbanje extends ADSLista{
	
	//oleee radi
	public CvorDSListe zameniPrvaDva(ADSLista a) throws LabisException{
		
		if(a.prvi == null) {
			throw new LabisException("Lista ne postoji");
		}
		if(a.prvi.sledeci == null) {
			throw new LabisException("U listi je samo jedan element");
		}
		
		a.prvi = a.prvi.sledeci;

		a.prvi.prethodni.sledeci = a.prvi.sledeci;
		
		a.prvi.sledeci = a.prvi.prethodni;
		
		a.prvi.prethodni = a.prvi.sledeci.prethodni;
		
		a.prvi.sledeci.prethodni = a.prvi;
		
		a.prvi.sledeci.sledeci.prethodni = a.prvi.sledeci;
		
		return a.prvi;
	}

}
