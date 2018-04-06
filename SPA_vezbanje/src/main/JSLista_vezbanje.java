package main;

import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;

public class JSLista_vezbanje extends AJSLista{
	
	//zadaci za vezbanje 11
	public int vratiNajduzuNeopadajucuPodlistu(CvorJSListe prvi) throws LabisException{
		
		if(prvi == null) {
			throw new LabisException("Lista ne postoji");
		}
		if(prvi.sledeci == null) {
			return 1;
		}
		
		CvorJSListe pom = prvi;
		int brojac = 1;
		int najduzi = 0;
		while(pom.sledeci != null) {
			if(pom.sledeci.podatak >= pom.podatak) {
				brojac++;
			}
			else {
				if(brojac > najduzi) {
					najduzi = brojac;
					brojac = 1;
				}
			}
			pom = pom.sledeci;
		}
		if(brojac > najduzi) {
			najduzi = brojac;
			brojac = 1;
		}
		return najduzi;
	}
	
	//zadaci za vezbanje 14
	
	public CvorJSListe izbaci2i3odpozadi(CvorJSListe prvi) throws LabisException {
		
		if(prvi == null) {
			throw new LabisException("Lista ne postoji");
		}
		if( prvi.sledeci == null) {
			throw new LabisException("U lisit ima samo 1 element");
		}
		if(prvi.sledeci.sledeci == null) {
			throw new LabisException("U lisiti ima samo 2 elementa");
		}
		if(prvi.sledeci.sledeci.sledeci == null) {
			return prvi.sledeci.sledeci;
		}
		CvorJSListe pom = prvi;
		int brojac = 0;
		while(pom != null) {
			brojac++;
			pom = pom.sledeci;
		}
		System.out.println(brojac);
		pom = prvi;
		for(int i = 0; i<brojac - 3; i++) {
			pom = pom.sledeci;
		}
		pom.sledeci = pom.sledeci.sledeci;
		
		pom = prvi;
		for(int i = 0; i<brojac - 4; i++) {
			pom = pom.sledeci;
		}
		pom.sledeci = pom.sledeci.sledeci;
		
		return prvi;
	}
	
	public double prosekpozitivnih(CvorJSListe prvi) throws LabisException {
		
		if (prvi == null) {
			throw new LabisException("Lisa je prazna");
		}
		
		CvorJSListe pom = prvi;
		int suma = 0;
		int brojac = 0;
		
		while(pom != null) {
			if(pom.podatak % 2 == 0) {
				suma = suma + pom.podatak;
				brojac++;
			}
			pom = pom.sledeci;
		}
		if(brojac != 0) {
			return (double)(suma)/(double)(brojac);
		}
		
		throw new LabisException("U lisit nema parnih");
	}
	
	public CvorJSListe noviPrePrvog(CvorJSListe prvi, int p) throws LabisException{
		
		if (prvi == null) {
			throw new LabisException("Lisa je prazna");
		}
		
		CvorJSListe pom = prvi;
		int suma = prvi.podatak;
		
		while(pom.sledeci != null) {
			if(suma > p) {
				break;
			}
			pom = pom.sledeci;
			suma = suma + pom.podatak;
		}
		
		CvorJSListe abc = new CvorJSListe(p, pom.sledeci);
		pom.sledeci = abc;
		
		return prvi;
		
	}
	
	
	
}
