package abstractfactorydesign.vitaminfactory;

public class FactoryCreator {
  
	public static SourceVitaminFactory getSourceVitaminFactory(String type)
	{
		if(type.equals("usertype"))
			return new UserTypeFactory();
		else if(type.equals("medicinetype"))
			return new MedicineTypeFactory();
		else if(type.equals("dosage"))
			return new DosageTypeFactory();
		else
			return null;
	}
}
