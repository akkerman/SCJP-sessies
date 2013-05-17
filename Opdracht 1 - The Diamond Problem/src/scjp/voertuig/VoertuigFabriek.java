package scjp.voertuig;


public final class VoertuigFabriek {
	
	private VoertuigFabriek() {
		// cannot instantiate factory class
	}

	public static Auto createAuto(String naam) {
		return new AutoImpl(naam);
	}

	public static Boot createBoot(String naam) {
		return new BootImpl(naam);
	}

	public static Amfibie createAmfibie(String naam) {
		return new AmfibieImpl(naam);
	}
}

class VoertuigImpl implements Voertuig {
	private String naam;
	private int snelheid;
	
	public VoertuigImpl(String naam) {
		this.naam = naam;
	}

	@Override
	public String getNaam() {
		return naam;
	}

	@Override
	public int getSnelheid() {
		return snelheid;
	}

	@Override
	public void setSnelheid(int snelheid) {
		this.snelheid = snelheid;
		if (snelheid < 0)
			snelheid = 0;
	}
}

class AutoImpl extends VoertuigImpl implements Auto {

	public AutoImpl(String naam) {
		super(naam);
	}

	@Override
	public void rij() {
		System.out.println(getNaam() + " rijdt met " + getSnelheid());
	}
	
	@Override
	public void setSnelheid(int snelheid) {
		if (snelheid > 150)
			snelheid = 150;
		super.setSnelheid(snelheid);
	}

}

class BootImpl extends VoertuigImpl implements Boot {
	public BootImpl(String naam) {
		super(naam);
	}

	@Override
	public void vaar() {
		System.out.println(getNaam() + " vaart met " + getSnelheid());
	}
	
	@Override
	public void setSnelheid(int snelheid) {
		if (snelheid > 30)
			snelheid = 30;
		super.setSnelheid(snelheid);
	}
}

class AmfibieImpl extends VoertuigImpl implements Amfibie {
	private final Auto auto;
	private final Boot boot;
    private Voertuig mode;

	public AmfibieImpl(String naam) {
		super(naam);
		auto = new AutoImpl(naam);
		boot = new BootImpl(naam);
        setMode(auto);
	}

    @Override
	public void vaar() {
        setMode(boot);
		boot.vaar();
	}

	@Override
	public void rij() {
        setMode(auto);
		auto.rij();
	}
	
	@Override
	public void setSnelheid(int snelheid) {
        mode.setSnelheid(snelheid);
	}

    @Override
    public int getSnelheid() {
        return mode.getSnelheid();
    }

    private void setMode(Voertuig voertuig) {
        if (mode == voertuig) return;
        voertuig.setSnelheid(0);
        mode = voertuig;
    }
}