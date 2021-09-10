package abstractfactorydesign.vitaminfactory;

public class DosageTypeFactory extends  SourceVitaminFactory{

	@Override
	public UserType getUserType(String usertype) {
		return null;
	}

	@Override
	public MedicineType getMedicineType(String form) {
		return null;
	}

	@Override
	public Dosage getDosageInformation(String dosage) {
		if(dosage.equals("Dialy"))
			 return new Dialy();
		else if(dosage.equals("SpecialPurpose"))
			return new SpecialPurpose();
		else
			return null;
	}
	

}
