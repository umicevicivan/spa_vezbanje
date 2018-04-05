package test;

import labis.exception.LabisException;
import main.Nizovi_sam;

public class Nizovi_test {

	public static void main(String[] args) throws LabisException {
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 1;
		a[2] = 2;
		a[3] = 333;
		a[4] = 333;

		Nizovi_sam o = new Nizovi_sam();
		int[] b = new int[5];
		b[0] = 5;
		b[1] = 5;
		b[2] = 7;
		b[3] = 999;
		b[4] = 999;
		
		//try {
		//	o.zzv10(a);
		//} catch (LabisException e) {
		//	System.out.println(e);
		//}
		
		//try {
		//	o.zzv18(a);
		//} catch (LabisException e) {
		//	System.out.println(e);
		//}
		
		int[] novi = o.zzv22(a, b);
		for(int i = 0; i<novi.length; i++) {
			System.out.println(novi[i]);
		}
	}
}
