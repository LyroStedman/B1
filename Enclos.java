class Enclos {
	List<Pingouins> pingouins = new ArrayList();

	Enclos(List<Pingouins> pingouins) {
		this.pingouins.addAll(pingouins);
	}

	int countPingouins() {
		return pingouins.size();
	void addPingouin(Pingouin pingouin) {
		pingouins.add(pingouin);
	}

	void deletePingouin(Pingouin pingouin) {
		pingouins.remove(pingouin);
	}

}
