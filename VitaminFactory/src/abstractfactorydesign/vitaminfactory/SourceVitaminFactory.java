package abstractfactorydesign.vitaminfactory;

public abstract class SourceVitaminFactory {
	
 public abstract UserType getUserType(String usertype);
 
 public abstract MedicineType getMedicineType(String form);
 
 public abstract Dosage getDosageInformation(String dosage);
 
}
