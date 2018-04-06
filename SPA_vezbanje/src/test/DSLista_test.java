package test;

import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;
import labis.test.ListGenerator;
import main.DSLista_vezbanje;

public class DSLista_test extends ListGenerator{

	public static void main(String[] args) {
		
		int[] niz = new int[] {1};
		ADSLista lista = new ADSLista() {
		};
		ListGenerator.napraviDSListuCommon(lista, niz, false);
		
		DSLista_vezbanje o = new DSLista_vezbanje();
		ListGenerator.ispisiDSListu(lista.prvi);
		
		
		
		try {
			CvorDSListe a = o.zameniPrvaDva(lista.prvi);
			System.out.println("________________");
			ListGenerator.ispisiDSListu(a);
		} catch (LabisException e) {
			System.out.println(e);
		}
		

	}

}
