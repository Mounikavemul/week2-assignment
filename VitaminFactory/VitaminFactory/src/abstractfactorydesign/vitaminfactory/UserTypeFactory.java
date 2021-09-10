package abstractfactorydesign.vitaminfactory;

public class UserTypeFactory extends SourceVitaminFactory{

	@Override
	public UserType getUserType(String usertype) {
		if(usertype.equals("Adults"))
			 return new Adults();
		else if(usertype.equals("Kids"))
			 return new Kids();
		else
			 return null;
	}

	@Override
	public MedicineType getMedicineType(String form) {
		return null;
	}

	@Override
	public Dosage getDosageInformation(String dosage) {
		return null;
	}

		

}
