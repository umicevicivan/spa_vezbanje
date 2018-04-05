package main;

import labis.exception.LabisException;
import labis.niz.ANiz;

public class Nizovi_sam extends ANiz {
	
	//ispisuje elemente koji se NE pojavljuju vise od jednom
	public void zzv10(int niz[]) throws LabisException {

		if (niz == null || niz.length == 0) {
			throw new LabisException("Niz ili ne postoji ili je prazan");
		}
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				if (niz[i] == niz[j]) {
					brojac++;
				}
			}
			if (brojac == 1) {
				System.out.println(niz[i]);
			}
			brojac = 0;
		}

	}
	
	//vraca dvocifreni iz niza jednocifrenih, dvocifrenih i trocifrenih
	public int zzv18(int niz[]) throws LabisException {
		
		if (niz == null || niz.length == 0) {
			throw new LabisException("Niz ili ne postoji ili je prazan");
		}
		int brojac = 0;
		int pom = 0;
		
		for(int i = 0; i<niz.length; i++) {
			pom = niz[i];
			while(pom >= 1) {
				pom = pom / 10;
				brojac++;
			}
			
			if(brojac == 2) {
				System.out.println(niz[i]);
				return niz[i];
			}
			brojac = 0;
		}
		
		throw new LabisException("Ne postoji dvocifreni");
		
	}
	
	//Od dva napravi jedan koji je u rastucem redosledu ( nije uradjen sort)
	public int[] zzv22(int a[], int b[]) {
		
		if (a == null || a.length == 0) {
			return b;
		}
		if (b == null || b.length == 0) {
			return a;
		}

		int[] novi = new int[a.length + b.length];
		int brojac = 0;
		for (int i = 0; i < a.length; i++) {
			novi[i] = a[i];
			brojac++;
		}
		for (int i = 0; i < b.length; i++) {
			novi[brojac] = b[i];
			brojac++;
		}

		return novi;
	}

}

