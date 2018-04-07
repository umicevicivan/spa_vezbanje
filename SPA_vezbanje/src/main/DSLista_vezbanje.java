package main;

import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;

public class DSLista_vezbanje extends ADSLista {

	// oleee radi
	public CvorDSListe zameniPrvaDva(CvorDSListe prvi) throws LabisException {

		if (prvi == null) {
			throw new LabisException("Lista ne postoji");
		}
		if (prvi.sledeci == null) {
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

	public int vratiProizvod(CvorDSListe prvi) throws LabisException {

		if (prvi == null) {
			throw new LabisException("Lista ne postoji");
		}
		if (prvi.sledeci == null) {
			throw new LabisException("Lista ima samo jedan element");
		}
		if (prvi.sledeci.sledeci == null) {
			throw new LabisException("Lista ima dva elementa");
		}

		CvorDSListe pom = prvi.sledeci;
		int b = 0;
		int proizvod = 1;
		while (pom.sledeci != null) {

			if (pom.podatak % 2 == 1 && pom.sledeci.podatak % 2 == 0 && pom.prethodni.podatak % 2 == 0) {
				proizvod = proizvod * pom.podatak;
				b++;
			}

			pom = pom.sledeci;
		}

		if (b == 0) {
			throw new LabisException("Lista je super ali nema takav element");
		}

		return proizvod;

	}

	public CvorDSListe kloniraj(CvorDSListe prvi) throws LabisException{
		
		if(prvi == null) {
			throw new LabisException("Lista ne postoji");
		}
		
		ADSLista lista  = new ADSLista() {
		};
		
		//ubaujem prvi element koji znam da postoji 100%
		CvorDSListe novi = new CvorDSListe(prvi.podatak, null, null);
		lista.prvi = novi;
		
		CvorDSListe pom = prvi.sledeci;
		CvorDSListe pom2 = lista.prvi;
		while(pom != null) {
			CvorDSListe novi1 = new CvorDSListe(pom.podatak, pom2, null);
			pom2.sledeci = novi1;
			pom2 = novi1;
			pom = pom.sledeci;
		}
		
		return lista.prvi;
			
	}
	
	public CvorDSListe invertujBezNovih(CvorDSListe prvi) throws LabisException{
		
		if(prvi == null || prvi.sledeci == null) {
			return prvi;
		}
		
		CvorDSListe pom = prvi;
		CvorDSListe pom2 = prvi;
		
		while(pom2.sledeci.sledeci != null) {
			pom = pom2.sledeci;
			pom2.sledeci = pom.sledeci;
			pom.sledeci.prethodni = pom2; // ovde ce da vrati null poin ako u uslovu ostane samo po2.sledeci != null, zato na kraju moram da dodam poslednji
			pom.sledeci = prvi;
			pom.prethodni = prvi.prethodni;
			prvi.prethodni = pom;
			
			prvi = pom;
		}
		//poslednji ubacujem na pocetak
		pom = pom2.sledeci;
		pom2.sledeci = null;
		pom.sledeci = prvi;
		pom.prethodni = null;
		prvi.prethodni = pom;
		prvi = pom;
		
		
		return prvi;
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
