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
}
