package Plants;

public class Grasses {
	public static void main(String[] args) throws InterruptedException{
		//static void getGrass() {

	String plantName = null;
	String plantDescription = null;
	String plantUse = null;
	//--Land--
	//Chaparral
	//Deciduous Forest
	//Desert
	//Savanna
	//Taiga
	int plantPickedTaiga  = 1 + (int) (Math.random() * 5);
	switch (plantPickedTaiga) {
	case 1: plantName = "Siberian Wheatgrass";
	 plantDescription = "A tall grass with many spiked seed pods on the top. Usually found in clusters.";
	 plantUse = "";
	 break;
	case 2: plantName = "Siberian Frost Evergreen";
	 plantDescription = "An evergreen grass commonly found with dew atop its leaves.";
	 plantUse = "";
	 break;
	case 3: plantName = "Siberian Evergreen";
	 plantDescription = "A common evergreen grass home to the taiga.";
	 plantUse = "";
	 break;
	case 4: plantName = "Quartz Bamboo";
	 plantDescription = "A mostly transparent bamboo commonly referred to as glass reed.";
	 plantUse = "";
	 break;
	case 5: plantName = "Frost Stem";
	 plantDescription = "Small light blue needle shaped blades. Cold to the touch.";
	 plantUse = "";
	 break;
	case 6: plantName = "";
	 plantDescription = "";
	 plantUse = "";
	 break;
	case 7: plantName = "";
	 plantDescription = "";
	 plantUse = "";
	 break;
	case 8: plantName = "";
	 plantDescription = "";
	 plantUse = "";
	 break;
	case 9: plantName = "";
	 plantDescription = "";
	 plantUse = "";
	 break;
	case 10: plantName = "";
	 plantDescription = "";
	 plantUse = "";
	 break;
	}
	//Temperate Grassland
	//Temperate Rainforest
	//Tropical Rainforest
	//Tundra
	//--Water/Land--
	//Lake
	//River
	//Wetlands
	//--Oceanic--
	//Coral Reef
	System.out.println(plantName);
	System.out.println(plantDescription);
		
	}
}
