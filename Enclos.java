class Enclos {
	List<Pingouins> pingouins = new ArrayList();

	Enclos(List<Pingouins> pingouins) {
		this.pingouins.addAll(pingouins);
	}

	void addPingouin(Pingouin pingouin) {
		pingouins.add(pingouin);
	}

	int countPingouins() {
		return pingouins.size();
	}
}
