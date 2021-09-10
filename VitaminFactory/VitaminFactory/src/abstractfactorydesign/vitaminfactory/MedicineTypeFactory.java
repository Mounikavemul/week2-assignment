package abstractfactorydesign.vitaminfactory;

public class MedicineTypeFactory extends SourceVitaminFactory{

	@Override
	public UserType getUserType(String usertype) {
			return null;
	}

	@Override
	public MedicineType getMedicineType(String form) {
		if(form.equals("Chewables"))
			 return new Chewables();
		else if(form.equals("Pills"))
			 return new Pills();
		else if(form.equals("Liquid"))
			 return new Liquid();
		else
			return null;
	}

	@Override
	public Dosage getDosageInformation(String dosage) {
		return null;
	}

}
