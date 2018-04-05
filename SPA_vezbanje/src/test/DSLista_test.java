package test;

import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;
import labis.test.ListGenerator;
import main.DSLista_vezbanje;

public class DSLista_test extends ListGenerator{

	public static void main(String[] args) {
		
		int[] niz = new int[] {1,2,3,4,5,6,7,8,9};
		ADSLista lista = new ADSLista() {
		};
		ListGenerator.napraviDSListuCommon(lista, niz, false);
		
		DSLista_vezbanje o = new DSLista_vezbanje();
		ListGenerator.ispisiDSListu(lista.prvi);
		
		
		
		try {
			CvorDSListe a = o.zameniPrvaDva(lista);
			System.out.println("________________");
			ListGenerator.ispisiDSListu(a);
		} catch (LabisException e) {
			System.out.println(e);
		}
		

	}

}
