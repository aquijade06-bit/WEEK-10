package week10_grace_134176;

public class Main {
	  public static void main(String[] args) {
	    	
	        Pekerja pekerja = new Pekerja();
	        pekerja.tanyaIdentitas();

	    
	        pekerja = new CEO();
	        pekerja.tanyaIdentitas();

	       
	        Karyawan karyawan = new Karyawan();
	        pekerja = (Pekerja)karyawan;
	        pekerja.tanyaIdentitas();
	    }
	}

