package test;

import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;
import labis.test.ListGenerator;
import main.JSLista_vezbanje;

public class JSLista_test extends ListGenerator{

	public static void main(String[] args) {
		
		int[] niz = new int[] {1,2,3,4,5,6};	
		AJSLista lista = new AJSLista() {
		};
		CvorJSListe a;
		ListGenerator.napraviJSListuCommon(lista, niz, false);
		
		JSLista_vezbanje o = new JSLista_vezbanje();
		ListGenerator.ispisiJSListu(lista.prvi);
		
//		try {
//			int a = o.vratiNajduzuNeopadajucuPodlistu(lista.prvi);
//			System.out.println(a);
//			
//		} catch (LabisException e) {
//			System.out.println(e);
//		}
		
		
//		try {
//			a = o.izbaci2i3odpozadi(lista.prvi);
//			System.out.println("________________");
//			ListGenerator.ispisiJSListu(a);
//		} catch (LabisException e) {
//			System.out.println(e);
//		}
		
//		try {
//			double b = o.prosekpozitivnih(lista.prvi);
//			System.out.println("________________");
//			System.out.println(b);
//		} catch (LabisException e) {
//			System.out.println(e);
//		}
		

		try {
			a = o.noviPrePrvog(lista.prvi, 4);
			System.out.println("________________");
			ListGenerator.ispisiJSListu(a);

		} catch (LabisException e) {
			System.out.println(e);
		}
		
		
		
	}
}
