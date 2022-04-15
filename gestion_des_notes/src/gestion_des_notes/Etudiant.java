package gestion_des_notes;

import aiac.gi18.java.complexe.Complexe;

public class Etudiant {
	private int id ;
	private String nom ;
	private double note ;
	Etudiant(int id, String nom, double note){
		this.id = id;
		this.nom = nom;
		this.note = 10;
		
	}
	public String toString()
	{
		return this.nom+ " + i"+this.note;
	}
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Etudiant) ){
			return false;
		}
	return	((Etudiant)obj).id==this.id ;
	}
	@Override
	public int compareTo(Etudiant o) {
		
		if(this.note==o.note) return 0;
		if(this.note>o.note) return 1;
		return -1;
	}


}
