class Pingouin {

String nom;
Sexe sexe;
String couleur;


Pingouin(String nom, Sexe sexe, String couleur) {
	this.nom = nom;
	this.sexe = sexe;
	this.couleur = couleur;

	Pingouin(String nom, Sexe sexe, Couleur couleur) {
		this.nom = nom;
		this.sexe = sexe;
		this.couleur = couleur;
	}

	Couleur getCouleur() {
		return couleur;
	}

	
