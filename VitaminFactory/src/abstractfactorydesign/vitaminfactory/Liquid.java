package abstractfactorydesign.vitaminfactory;

public class Liquid implements MedicineType {

	@Override
	public String getForm() {
		return "Liquid";
	}

}
