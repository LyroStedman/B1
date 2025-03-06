class Pingouin {

String nom;
Sexe sexe;
String couleur;

Pingouin(String nom, Sexe sexe, String couleur) {
	this.nom = nom;
	this.sexe = sexe;
	this.couleur = couleur;
}

String getCouleur() {
return couleur;
}

String getSexe() {
return sexe;
}

boolean isMale() {
return sexe == Sexe.MALE
}
}
