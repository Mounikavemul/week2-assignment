package abstractfactorydesign.vitaminfactory;

public class Pills implements MedicineType {

	@Override
	public String getForm() {
		return "Pills";
	}

}
