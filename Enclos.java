class Enclos {
	final List<Pingouins> pingouins = new ArrayList();

	private Enclos() {
	}

	static Enclos createEnclos() {
		return new Enclos()
	}

	Enclos addPingouin(Pingouin pingouin) {
		pingouins.add(pingouin);
		return this;
	}

	List<Pingouins> getMale() {
		List<Pingouins> males = new ArrayList();
		for(Pingouin pingouin : pingouins) {
			if (pingouin.isMale) {
				males.add(pingouin);
			}
		}
		return males;
		
	void deletePingouin(Pingouin pingouin) {
		pingouins.remove(pingouin);
	}

	int countPingouins() {
		return pingouins.size();
	}
}
