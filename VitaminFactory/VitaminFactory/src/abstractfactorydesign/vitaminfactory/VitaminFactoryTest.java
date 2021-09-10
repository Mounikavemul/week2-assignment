package abstractfactorydesign.vitaminfactory;

public class VitaminFactoryTest {

	public static void main(String[] args) {

SourceVitaminFactory utype=FactoryCreator.getSourceVitaminFactory("usertype");
System.out.println("Used For: "+utype.getUserType("Kids").getUser());

SourceVitaminFactory mtype=FactoryCreator.getSourceVitaminFactory("medicinetype");
System.out.println("Medicine Form: "+mtype.getMedicineType("Liquid").getForm());

SourceVitaminFactory dosage=FactoryCreator.getSourceVitaminFactory("dosage");
System.out.println("Dosage: "+dosage.getDosageInformation("SpecialPurpose").getDose());

	}

}
