class Pingouin {

	String nom;
	Sexe sexe;
<<<<<<< HEAD
	Couleur couleur;

	Pingouin(String nom, Sexe sexe, Couleur couleur) {
=======
	String couleur;

	Pingouin(String nom, Sexe sexe, String couleur) {
>>>>>>> 2900dca (indent)
		this.nom = nom;
		this.sexe = sexe;
		this.couleur = couleur;
	}

<<<<<<< HEAD
	Couleur getCouleur() {
		return couleur;
	}

	Sexe getSexe() {
		return sexe;
	}
}
=======
	String getCouleur() {
	return couleur;
	}

	String getSexe() {
	return sexe;
	}
>>>>>>> 2900dca (indent)

	boolean isMale() {
		return sexe == Sexe.MALE
	}
}
