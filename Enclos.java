class Enclos {
	List<Pingouins> pingouins = new ArrayList();

	Enclos(List<Pingouins> pingouins) {
		this.pingouins.addAll(pingouins);
	}

	void addPingouin(Pingouin pingouin) {
		pingouins.add(pingouin);
	}

	List<Pingouins> getMale() {
		List<Pingouins> males = new ArrayList();
		for(Pingouin pingouin : pingouins) {
			if (pingouin.getSexe == Sexe.FEMELLE) {
				males.add(pingouin);
			}
		}
		return males;
	}
}
