package me.ShermansWorld.HardcoreFarming;

public class Config {
	
	// Default values
	public static boolean disableBoneMeal = false;
	public static boolean enableGrowNerf = true;
	public static boolean enableFeedNerf = true;
	public static boolean enableHoeDurability = true;
	
	public static double bambooGrowthRate = 0.2;
	public static double beetrootGrowthRate = 0.2;
	public static double cactusGrowrthRate = 0.2;
	public static double carrotGrowthRate = 0.2;
	public static double chorusGrowthRate = 0.2;
	public static double cocoaGrowthRate = 0.2;
	public static double glowBerryGrowthRate = 0.2;
	public static double kelpGrowthRate = 0.2;
	public static double melonGrowthRate = 0.2;
	public static double netherWartGrowthRate = 0.2;
	public static double potatoGrowthRate = 0.2;
	public static double pumpkinGrowthRate = 0.2;
	public static double sweetBerryGrowthRate = 0.2;
	public static double sugarCaneGrowthRate = 0.2;
	public static double wheatGrowthRate = 0.2;
	
	public static double acaciaGrowthRate = 0.2;
	public static double azaleaGrowthRate = 0.2;
	public static double oakGrowthRate = 0.2;
	public static double birchGrowthRate = 0.2;
	public static double brownMushroomGrowthRate = 0.2;
	public static double crimsonFungusGrowthRate = 0.2;
	public static double darkOakGrowthRate = 0.2;
	public static double jungleGrowthRate = 0.2;
	public static double mangroveGrowthRate = 0.2;
	public static double redMushroomGrowthRate = 0.2;
	public static double spruceGrowthRate = 0.2;
	public static double warpedFungusGrowthRate = 0.2;
	public static double cherryGrowthRate = 0.2;
	
	public static int beeFeedAmount = 5;
	public static int catFeedAmount = 5;
	public static int chickenFeedAmount = 5;
	public static int cowFeedAmount = 5;
	public static int donkeyFeedAmount = 5;
	public static int frogFeedAmount = 5;
	public static int foxFeedAmount = 5;
	public static int goatFeedAmount = 5;
	public static int hoglinFeedAmount = 5;
	public static int horseFeedAmount = 5;
	public static int llamaFeedAmount = 5;
	public static int mooshroomFeedAmount = 5;
	public static int ocelotFeedAmount = 5;
	public static int pandaFeedAmount = 5;
	public static int pigFeedAmount = 5;
	public static int rabbitFeedAmount = 5;
	public static int sheepFeedAmount = 5;
	public static int striderFeedAmount = 5;
	public static int turtleFeedAmount = 5;
	public static int wolfFeedAmount = 5;
	
	public static void getConfigVals() {
		
		// Flags
		disableBoneMeal = HardcoreFarming.getInstance().getConfig().getBoolean("DisableBoneMeal");
		enableGrowNerf = HardcoreFarming.getInstance().getConfig().getBoolean("EnableGrowNerf");
		enableFeedNerf = HardcoreFarming.getInstance().getConfig().getBoolean("EnableFeedNerf");
		enableHoeDurability = HardcoreFarming.getInstance().getConfig().getBoolean("EnableHoeDurability");
		
		// Growth Rates
		bambooGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("BambooGrowthRate");
		beetrootGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("BeetrootGrowthRate");
		cactusGrowrthRate = HardcoreFarming.getInstance().getConfig().getDouble("CactusGrowrthRate");
		carrotGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("CarrotGrowthRate");
		chorusGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("ChorusGrowthRate");
		cocoaGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("CocoaGrowthRate");
		glowBerryGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("GlowBerryGrowthRate");
		kelpGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("KelpGrowthRate");
		melonGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("MelonGrowthRate");
		netherWartGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("NetherWartGrowthRate");
		potatoGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("PotatoGrowthRate");
		pumpkinGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("PumpkinGrowthRate");
		sweetBerryGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("SweetBerryGrowthRate");
		sugarCaneGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("SugarCaneGrowthRate");
		wheatGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("WheatGrowthRate");
		acaciaGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("AcaciaGrowthRate");
		azaleaGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("AzaleaGrowthRate");
		oakGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("OakGrowthRate");
		birchGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("BirchGrowthRate");
		brownMushroomGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("BrownMushroomGrowthRate");
		crimsonFungusGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("CrimsonFungusGrowthRate");
		darkOakGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("DarkOakGrowthRate");
		jungleGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("JungleGrowthRate");
		mangroveGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("MangroveGrowthRate");
		redMushroomGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("RedMushroomGrowthRate");
		spruceGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("SpruceGrowthRate");
		warpedFungusGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("WarpedFungusGrowthRate");
		cherryGrowthRate = HardcoreFarming.getInstance().getConfig().getDouble("CherryGrowthRate");
		
		
		// Feed Amounts
		beeFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("BeeFeedAmount");
		catFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("CatFeedAmount");
		chickenFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("ChickenFeedAmount");
		cowFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("CowFeedAmount");
		donkeyFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("DonkeyFeedAmount");
		frogFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("FrogFeedAmount");
		foxFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("FoxFeedAmount");
		goatFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("GoatFeedAmount");
		hoglinFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("HoglinFeedAmount");
		horseFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("HorseFeedAmount");
		llamaFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("LlamaFeedAmount");
		mooshroomFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("MooshroomFeedAmount");
		ocelotFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("OcelotFeedAmount");
		pandaFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("PandaFeedAmount");
		pigFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("PigFeedAmount");
		rabbitFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("RabbitFeedAmount");
		sheepFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("SheepFeedAmount");
		striderFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("StriderFeedAmount");
		turtleFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("TurtleFeedAmount");
		wolfFeedAmount = HardcoreFarming.getInstance().getConfig().getInt("WolfFeedAmount");


	}
}
