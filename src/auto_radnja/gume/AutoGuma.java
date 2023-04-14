package auto_radnja.gume;

/**
 * Klasa AutoGuma predstavlja gumu automobila.
 * 
 * @author ANA
 * @version 0.0.1
 */

public class AutoGuma {

	/**
	 * Marka i model gume automobila kao String. Podrazumevana vrednost je null.
	 */
	private String markaModel = null;
	/**
	 * Precnik gume automobila kao integer. Podrazumevana vrednost je -1.
	 */
	private int precnik = -1;
	/**
	 * Sirina gume automobila kao integer. Podrazumevana vrednost je -1.
	 */
	private int sirina = -1;
	/**
	 * Visina gume automobila kao integer. Podrazumevana vrednost je -1.
	 */
	private int visina = -1;

	/**
	 * Podrazumevani, besparametarski kontruktor klase AutoGuma.
	 * Ne prima parametre i ima prazno telo.
	 */
	
	public AutoGuma() {
	}

	/**
	 * Parametrizovani kontruktor klase AutoGuma koji inicijalizuje sve atribute klase AutoGuma.
	 * 
	 * @param markaModel je vrednost na koju se postavlja atribut markaModel
	 * @param precnik je vrednost na koju se postavlja atribut precnik
	 * @param sirina je vrednost na koju se postavlja atribut sirina
	 * @param visina je vrednost na koju se postavlja atribut visina
	 */
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);
	}

	/**
	 * Vraca marku i model gume automobila.
	 * @return markaModel kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja vrednost atributa markaModel.
	 * 
	 * markaModel ne sme biti null i mora biti duze od 3 karaktera.
	 * 
	 * @param markaModel je vrednost na koju se postavlja atribut markaModel
	 * 
	 * @throws NullPointerException ako je vrednost parametra markaModel jednaka null
	 * @throws IllegalArgumentException ako je duzina parametra markaModel kraca od 3
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length() < 3)
			throw new IllegalArgumentException("Marka i model moraju sadrzati bar 3 znaka");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca precnik gume automobila.
	 * 
	 * @return precnik kao int
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja vrednost atributa precnik.
	 * 
	 * precnik ne sme biti manji od 13 i veci od 22.
	 * 
	 * @param precnik je vrednost na koju se postavlja atribut precnik
	 * 
	 * @throws IllegalArgumentException ako je precnik van opsega [13,22]
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new IllegalArgumentException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca sirinu gume automobila.
	 * 
	 * @return sirina kao int
	 */
	public int getSirina() {
		return sirina;

	}

	/**
	 * Postavlja vrednost atributa sirina.
	 * 
	 * sirina ne sme biti manja od 135 i veci od 355.
	 * 
	 * @param sirina je vrednost na koju se postavlja atribut sirina
	 * 
	 * @throws IllegalArgumentException ako je sirina van opsega [135,355]
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new IllegalArgumentException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca visinu gume automobila.
	 * 
	 * @return visina kao int
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Postavlja vrednost atributa visina.
	 * 
	 * visina ne sme biti manja od 25 i veci od 95.
	 * 
	 * @param visina je vrednost na koju se postavlja atribut visina
	 * 
	 * @throws IllegalArgumentException ako je visina van opsega [25,95]
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new IllegalArgumentException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
