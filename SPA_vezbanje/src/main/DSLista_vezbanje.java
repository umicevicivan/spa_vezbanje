package main;

import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;

public class DSLista_vezbanje extends ADSLista{
	
	//oleee radi
	public CvorDSListe zameniPrvaDva(CvorDSListe prvi) throws LabisException{
		
		if(prvi == null) {
			throw new LabisException("Lista ne postoji");
		}
		if(prvi.sledeci == null) {
			throw new LabisException("U listi je samo jedan element");
		}
		
		prvi = prvi.sledeci;

		prvi.prethodni.sledeci = prvi.sledeci;
		
		prvi.sledeci = prvi.prethodni;
		
		prvi.prethodni = prvi.sledeci.prethodni;
		
		prvi.sledeci.prethodni = prvi;
		
		prvi.sledeci.sledeci.prethodni = prvi.sledeci;
		
		return prvi;
	}

}
