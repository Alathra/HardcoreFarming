package me.ShermansWorld.HardcoreFarming;

public class ConfigVals {
	
	// Default values
	public static boolean disableBoneMeal = false;
	public static boolean enableGrowNerf = true;
	public static boolean enableFeedNerf = true;
	
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
		disableBoneMeal = Main.getInstance().getConfig().getBoolean("DisableBoneMeal");
		enableGrowNerf = Main.getInstance().getConfig().getBoolean("EnableGrowNerf");
		enableFeedNerf = Main.getInstance().getConfig().getBoolean("EnableFeedNerf");
		
		// Growth Rates
		bambooGrowthRate = Main.getInstance().getConfig().getDouble("BambooGrowthRate");
		beetrootGrowthRate = Main.getInstance().getConfig().getDouble("BeetrootGrowthRate");
		cactusGrowrthRate = Main.getInstance().getConfig().getDouble("CactusGrowrthRate");
		carrotGrowthRate = Main.getInstance().getConfig().getDouble("CarrotGrowthRate");
		chorusGrowthRate = Main.getInstance().getConfig().getDouble("ChorusGrowthRate");
		cocoaGrowthRate = Main.getInstance().getConfig().getDouble("CocoaGrowthRate");
		glowBerryGrowthRate = Main.getInstance().getConfig().getDouble("GlowBerryGrowthRate");
		kelpGrowthRate = Main.getInstance().getConfig().getDouble("KelpGrowthRate");
		melonGrowthRate = Main.getInstance().getConfig().getDouble("MelonGrowthRate");
		netherWartGrowthRate = Main.getInstance().getConfig().getDouble("NetherWartGrowthRate");
		potatoGrowthRate = Main.getInstance().getConfig().getDouble("PotatoGrowthRate");
		pumpkinGrowthRate = Main.getInstance().getConfig().getDouble("PumpkinGrowthRate");
		sweetBerryGrowthRate = Main.getInstance().getConfig().getDouble("SweetBerryGrowthRate");
		sugarCaneGrowthRate = Main.getInstance().getConfig().getDouble("SugarCaneGrowthRate");
		wheatGrowthRate = Main.getInstance().getConfig().getDouble("WheatGrowthRate");
		acaciaGrowthRate = Main.getInstance().getConfig().getDouble("AcaciaGrowthRate");
		azaleaGrowthRate = Main.getInstance().getConfig().getDouble("AzaleaGrowthRate");
		oakGrowthRate = Main.getInstance().getConfig().getDouble("OakGrowthRate");
		birchGrowthRate = Main.getInstance().getConfig().getDouble("BirchGrowthRate");
		brownMushroomGrowthRate = Main.getInstance().getConfig().getDouble("BrownMushroomGrowthRate");
		crimsonFungusGrowthRate = Main.getInstance().getConfig().getDouble("CrimsonFungusGrowthRate");
		darkOakGrowthRate = Main.getInstance().getConfig().getDouble("DarkOakGrowthRate");
		jungleGrowthRate = Main.getInstance().getConfig().getDouble("JungleGrowthRate");
		mangroveGrowthRate = Main.getInstance().getConfig().getDouble("MangroveGrowthRate");
		redMushroomGrowthRate = Main.getInstance().getConfig().getDouble("RedMushroomGrowthRate");
		spruceGrowthRate = Main.getInstance().getConfig().getDouble("SpruceGrowthRate");
		warpedFungusGrowthRate = Main.getInstance().getConfig().getDouble("WarpedFungusGrowthRate");
		
		// Feed Amounts
		beeFeedAmount = Main.getInstance().getConfig().getInt("BeeFeedAmount");
		catFeedAmount = Main.getInstance().getConfig().getInt("CatFeedAmount");
		chickenFeedAmount = Main.getInstance().getConfig().getInt("ChickenFeedAmount");
		cowFeedAmount = Main.getInstance().getConfig().getInt("CowFeedAmount");
		donkeyFeedAmount = Main.getInstance().getConfig().getInt("DonkeyFeedAmount");
		frogFeedAmount = Main.getInstance().getConfig().getInt("FrogFeedAmount");
		foxFeedAmount = Main.getInstance().getConfig().getInt("FoxFeedAmount");
		goatFeedAmount = Main.getInstance().getConfig().getInt("GoatFeedAmount");
		hoglinFeedAmount = Main.getInstance().getConfig().getInt("HoglinFeedAmount");
		horseFeedAmount = Main.getInstance().getConfig().getInt("HorseFeedAmount");
		llamaFeedAmount = Main.getInstance().getConfig().getInt("LlamaFeedAmount");
		mooshroomFeedAmount = Main.getInstance().getConfig().getInt("MooshroomFeedAmount");
		ocelotFeedAmount = Main.getInstance().getConfig().getInt("OcelotFeedAmount");
		pandaFeedAmount = Main.getInstance().getConfig().getInt("PandaFeedAmount");
		pigFeedAmount = Main.getInstance().getConfig().getInt("PigFeedAmount");
		rabbitFeedAmount = Main.getInstance().getConfig().getInt("RabbitFeedAmount");
		sheepFeedAmount = Main.getInstance().getConfig().getInt("SheepFeedAmount");
		striderFeedAmount = Main.getInstance().getConfig().getInt("StriderFeedAmount");
		turtleFeedAmount = Main.getInstance().getConfig().getInt("TurtleFeedAmount");
		wolfFeedAmount = Main.getInstance().getConfig().getInt("WolfFeedAmount");


	}
}
