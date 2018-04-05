package test;

import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;
import labis.test.ListGenerator;
import main.JSLista_vezbanje;

public class JSLista_test extends ListGenerator{

	public static void main(String[] args) {
		
		int[] niz = new int[] {1,2,3,4,5,6,7,8,9};	
		AJSLista lista = new AJSLista() {
		};
		
		ListGenerator.napraviJSListuCommon(lista, niz, false);
		
		JSLista_vezbanje o = new JSLista_vezbanje();
		ListGenerator.ispisiJSListu(lista.prvi);
		
//		try {
//			int a = o.vratiNajduzuNeopadajucuPodlistu(lista);
//			System.out.println(a);
//			
//		} catch (LabisException e) {
//			System.out.println(e);
//		}
		
		CvorJSListe a;
		try {
			a = o.izbaci2i3odpozadi(lista);
			System.out.println("________________");
			ListGenerator.ispisiJSListu(a);
		} catch (LabisException e) {
			System.out.println(e);
		}
	}


}
