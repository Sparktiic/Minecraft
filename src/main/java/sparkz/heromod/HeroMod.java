package sparkz.heromod;

import sparkz.heromod.item.ItemDarkQuartzAxe;
import sparkz.heromod.item.ItemDarkQuartzHoe;
import sparkz.heromod.item.ItemDarkQuartzPickaxe;
import sparkz.heromod.item.ItemDarkQuartzShovel;
import sparkz.heromod.item.ItemDarkQuartzSword;
import sparkz.heromod.item.ItemDawnbreaker;
import sparkz.heromod.item.ItemHeroBlade;
import sparkz.heromod.item.ItemLegendAxe;
import sparkz.heromod.item.ItemLegendBat;
import sparkz.heromod.item.ItemQuartzAxe;
import sparkz.heromod.item.ItemQuartzHoe;
import sparkz.heromod.item.ItemQuartzPickaxe;
import sparkz.heromod.item.ItemQuartzShovel;
import sparkz.heromod.item.ItemQuartzSword;
import sparkz.heromod.item.ItemironBat;
import sparkz.heromod.item.ItemlegendSpear;
import sparkz.heromod.item.ItemlegendSword;
import sparkz.heromod.item.ItemquartzSpear;
import sparkz.heromod.item.ItemroyalShield;
import sparkz.heromod.item.ItemroyalStaff;
import sparkz.heromod.item.Itemstaff;
import sparkz.heromod.item.ItemwoodenBat;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "hero", name = "HeroStorm", version = "1.0")
public class HeroMod {
	
	//Items
	public static Item itemHardenedQuartz;
	public static Item itemQuartzIngot;
	public static Item itemDarkQuartz;
	public static Item itemDarkQuartzIngot;
	public static Item itemRoyalIngot;
	public static Item itemLegenditeIngot;
	public static Item itemSapphire;
	public static Item itemSapphireShard;
	public static Item itemDarkEmerald;
	public static Item itemWhiteDiamond;
	
	//Tools
	public static Item quartzPickaxe;
	public static Item quartzAxe;
	public static Item quartzShovel;
	public static Item quartzHoe;
	public static Item quartzSword;
	public static Item darkquartzPickaxe;
	public static Item darkquartzAxe;
	public static Item darkquartzShovel;
	public static Item darkquartzHoe;
	public static Item darkquartzSword;
	public static final Item.ToolMaterial quartzToolMaterial = EnumHelper.addToolMaterial("quartzToolMaterial", 3, 750, 7.5F, 3.0F, 10);
	public static final ItemArmor.ArmorMaterial quartzArmorMaterial = EnumHelper.addArmorMaterial("quartzArmorMaterial", 1000, new int[]{2,6,4,2}, 10);
	public static final ItemArmor.ArmorMaterial darkquartzArmorMaterial = EnumHelper.addArmorMaterial("darkquartzArmorMaterial", 1000, new int[]{2,6,4,2}, 10);
	
	
	//Armor
	//diamond is armor of 2/7/5/3
	public static Item quartzHelmet;
	public static Item quartzChestplate;
	public static Item quartzLeggings;
	public static Item quartzBoots;
	public static Item darkquartzHelmet;
	public static Item darkquartzChestplate;
	public static Item darkquartzLeggings;
	public static Item darkquartzBoots;
	
	//Legend Gear
	public static Item lightningBlade;
	public static Item dawnbreaker;
	public static Item legendAxe;
	public static Item heroBlade;
	public static Item legendSword;
	public static Item legendBat;
	public static Item legendSpear;
	public static Item nubAxe;
	public static Item royalStaff;
	public static Item royalShield;

	//Other Gear
	public static Item woodenBat;
	public static Item ironBat;
	public static Item staff;
	public static Item quartzSpear;
	
	
@EventHandler
public void preInit(FMLPreInitializationEvent event) {
	//Item/Block init and registering
	//Config handling /Type newItemxxxx(); then create new class
	itemHardenedQuartz = new ItemHardenedQuartz().setUnlocalizedName("ItemHardenedQuartz").setTextureName("hero:itemhardenedquartz").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(itemHardenedQuartz, itemHardenedQuartz.getUnlocalizedName().substring(5));
	itemQuartzIngot = new ItemQuartzIngot().setUnlocalizedName("ItemQuartzIngot").setTextureName("hero:itemquartzingot").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(itemQuartzIngot, itemQuartzIngot.getUnlocalizedName().substring(5));
	itemDarkQuartz = new ItemDarkQuartz().setUnlocalizedName("ItemDarkQuartz").setTextureName("hero:itemdarkquartz").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(itemDarkQuartz, itemDarkQuartz.getUnlocalizedName().substring(5));
	itemDarkQuartzIngot = new ItemDarkQuartzIngot().setUnlocalizedName("ItemDarkQuartzIngot").setTextureName("hero:itemdarkquartzingot").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(itemDarkQuartzIngot, itemDarkQuartzIngot.getUnlocalizedName().substring(5));
	itemRoyalIngot = new ItemRoyalIngot().setUnlocalizedName("ItemRoyalIngot").setTextureName("hero:itemroyalingot").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(itemRoyalIngot, itemRoyalIngot.getUnlocalizedName().substring(5));
	itemLegenditeIngot = new ItemLegenditeIngot().setUnlocalizedName("ItemLegenditeIngot").setTextureName("hero:itemlegendite").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(itemLegenditeIngot, itemLegenditeIngot.getUnlocalizedName().substring(5));
	itemSapphire = new ItemSapphire().setUnlocalizedName("ItemSapphire").setTextureName("hero:itemsapphire2").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(itemSapphire, itemSapphire.getUnlocalizedName().substring(5));
	itemSapphireShard = new ItemSapphireShard().setUnlocalizedName("ItemSapphireShard").setTextureName("hero:itemsapphireshard2").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(itemSapphireShard, itemSapphireShard.getUnlocalizedName().substring(5));
	itemDarkEmerald = new ItemDarkEmerald().setUnlocalizedName("ItemDarkEmerald").setTextureName("hero:itemdarkemerald2").setCreativeTab(tabHeroStorm); 
	GameRegistry.registerItem(itemDarkEmerald, itemDarkEmerald.getUnlocalizedName().substring(5));
	itemWhiteDiamond = new ItemWhiteDiamond().setUnlocalizedName("ItemWhiteDiamond").setTextureName("hero:itemwhitediamond3").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(itemWhiteDiamond, itemWhiteDiamond.getUnlocalizedName().substring(5));
	
	
	
	//Tools
	quartzPickaxe = new ItemQuartzPickaxe(quartzToolMaterial).setUnlocalizedName("ItemQuartzPickaxe").setTextureName("hero:itemquartzpickaxe").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(quartzPickaxe, quartzPickaxe.getUnlocalizedName().substring(5));
	quartzAxe = new ItemQuartzAxe(quartzToolMaterial).setUnlocalizedName("ItemQuartzAxe").setTextureName("hero:itemquartzaxe").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(quartzAxe, quartzAxe.getUnlocalizedName().substring(5));
	quartzShovel = new ItemQuartzShovel(quartzToolMaterial).setUnlocalizedName("ItemQuartzShovel").setTextureName("hero:itemquartzshovel").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(quartzShovel, quartzShovel.getUnlocalizedName().substring(5));
	quartzHoe = new ItemQuartzHoe(quartzToolMaterial).setUnlocalizedName("ItemQuartzHoe").setTextureName("hero:itemquartzhoe").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(quartzHoe, quartzHoe.getUnlocalizedName().substring(5));
	quartzSword = new ItemQuartzSword(quartzToolMaterial).setUnlocalizedName("ItemQuartzSword").setTextureName("hero:itemquartzsword").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(quartzSword, quartzSword.getUnlocalizedName().substring(5));
	darkquartzPickaxe = new ItemDarkQuartzPickaxe(quartzToolMaterial).setUnlocalizedName("ItemDarkQuartzPickaxe").setTextureName("hero:itemdarkquartzpickaxe").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(darkquartzPickaxe, darkquartzPickaxe.getUnlocalizedName().substring(5));
	darkquartzAxe = new ItemDarkQuartzAxe(quartzToolMaterial).setUnlocalizedName("ItemDarkQuartzAxe").setTextureName("hero:itemdarkquartzaxe").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(darkquartzAxe, darkquartzAxe.getUnlocalizedName().substring(5));
	darkquartzShovel = new ItemDarkQuartzShovel(quartzToolMaterial).setUnlocalizedName("ItemDarkQuartzShovel").setTextureName("hero:itemdarkquartzshovel").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(darkquartzShovel, darkquartzShovel.getUnlocalizedName().substring(5));
	darkquartzHoe = new ItemDarkQuartzHoe(quartzToolMaterial).setUnlocalizedName("ItemDarkQuartzHoe").setTextureName("hero:itemdarkquartzhoe").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(darkquartzHoe, darkquartzHoe.getUnlocalizedName().substring(5));
	darkquartzSword = new ItemDarkQuartzSword(quartzToolMaterial).setUnlocalizedName("ItemDarkQuartzSword").setTextureName("hero:itemdarkquartzsword").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(darkquartzSword, darkquartzSword.getUnlocalizedName().substring(5));
	
	//Armor
	quartzHelmet = new ItemQuartzArmor(quartzArmorMaterial, 0, 0).setUnlocalizedName("ItemQuartzHelmet").setTextureName("hero:itemquartzhelmet").setCreativeTab(tabHeroStorm);	
	GameRegistry.registerItem(quartzHelmet, quartzHelmet.getUnlocalizedName().substring(5));
	quartzChestplate = new ItemQuartzArmor(quartzArmorMaterial, 0, 1).setUnlocalizedName("ItemQuartzChestplate").setTextureName("hero:itemquartzchestplate").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(quartzChestplate, quartzChestplate.getUnlocalizedName().substring(5));
	quartzLeggings = new ItemQuartzArmor(quartzArmorMaterial, 0, 2).setUnlocalizedName("ItemQuartzLeggings").setTextureName("hero:itemquartzleggings").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(quartzLeggings, quartzLeggings.getUnlocalizedName().substring(5));
	quartzBoots = new ItemQuartzArmor(quartzArmorMaterial, 0, 3).setUnlocalizedName("ItemQuartzBoots").setTextureName("hero:itemquartzboots").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(quartzBoots, quartzBoots.getUnlocalizedName().substring(5));
	
	darkquartzHelmet = new ItemDarkQuartzArmor(darkquartzArmorMaterial, 0, 0).setUnlocalizedName("ItemDarkQuartzHelmet").setTextureName("hero:itemdarkquartzhelmet").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(darkquartzHelmet, darkquartzHelmet.getUnlocalizedName().substring(5));
	darkquartzChestplate = new ItemDarkQuartzArmor(darkquartzArmorMaterial, 0, 1).setUnlocalizedName("ItemDarkQuartzChestplate").setTextureName("hero:itemdarkquartzchestplate").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(darkquartzChestplate, darkquartzChestplate.getUnlocalizedName().substring(5));
	darkquartzLeggings = new ItemDarkQuartzArmor(darkquartzArmorMaterial, 0, 2).setUnlocalizedName("ItemDarkQuartzLeggings").setTextureName("hero:itemdarkquartzleggings").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(darkquartzLeggings, darkquartzLeggings.getUnlocalizedName().substring(5));
	darkquartzBoots = new ItemDarkQuartzArmor(darkquartzArmorMaterial, 0, 3).setUnlocalizedName("ItemDarkQuartzBoots").setTextureName("hero:itemdarkquartzboots").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(darkquartzBoots, darkquartzBoots.getUnlocalizedName().substring(5));
	
	
	//Lendends
	lightningBlade = new ItemLightningBlade().setUnlocalizedName("ItemLightningBlade").setTextureName("hero:itemlightningblade2").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(lightningBlade, lightningBlade.getUnlocalizedName().substring(5));
	dawnbreaker = new ItemDawnbreaker().setUnlocalizedName("ItemDawnbreaker").setTextureName("hero:itemdawnbreaker2").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(dawnbreaker, dawnbreaker.getUnlocalizedName().substring(5));
	legendAxe = new ItemLegendAxe().setUnlocalizedName("ItemLegendAxe").setTextureName("hero:itemlegendaxe").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(legendAxe, legendAxe.getUnlocalizedName().substring(5));
	heroBlade = new ItemHeroBlade().setUnlocalizedName("ItemHeroBlade").setTextureName("hero:itemheroblade").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(heroBlade, heroBlade.getUnlocalizedName().substring(5));
	legendSword = new ItemlegendSword().setUnlocalizedName("ItemlegendSword").setTextureName("hero:itemlegendsword2").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(legendSword, legendSword.getUnlocalizedName().substring(5));
	legendBat = new ItemLegendBat().setUnlocalizedName("ItemLegendBat").setTextureName("hero:itemlegendbat").setCreativeTab(tabHeroStorm); 
	GameRegistry.registerItem(legendBat, legendBat.getUnlocalizedName().substring(5));
	
	legendSpear = new ItemlegendSpear().setUnlocalizedName("ItemlegendSpear").setTextureName("hero:itemlegendspear").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(legendSpear, legendSpear.getUnlocalizedName().substring(5));
	royalStaff = new ItemroyalStaff().setUnlocalizedName("ItemroyalStaff").setTextureName("hero:itemroyalstaff").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(royalStaff, royalStaff.getUnlocalizedName().substring(5));
	royalShield = new ItemroyalShield().setUnlocalizedName("ItemroyalShield").setTextureName("hero:itemroyalShield").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(royalShield, royalShield.getUnlocalizedName().substring(5));
	
	
	
	//other items
	woodenBat = new ItemwoodenBat().setUnlocalizedName("ItemwoodenBat").setTextureName("hero:itemwoodenbat").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(woodenBat, woodenBat.getUnlocalizedName().substring(5));
	ironBat = new ItemironBat().setUnlocalizedName("ItemironBat").setTextureName("hero:itemironbat").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(ironBat, ironBat.getUnlocalizedName().substring(5));
	staff = new Itemstaff().setUnlocalizedName("Itemstaff").setTextureName("hero:itemstaff").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(staff, staff.getUnlocalizedName().substring(5));
	quartzSpear = new ItemquartzSpear().setUnlocalizedName("ItemquartzSpear").setTextureName("hero:itemquartzSpear").setCreativeTab(tabHeroStorm);
	GameRegistry.registerItem(quartzSpear, quartzSpear.getUnlocalizedName().substring(5));
	
	
}

@EventHandler
public void init(FMLInitializationEvent event){
	//Proxy, TileEntity, entitiy, GUI and Packet Registering
	
}


@EventHandler
public void postInit(FMLPostInitializationEvent event) {
	
}

public static CreativeTabs tabHeroStorm = new CreativeTabs("tabHeroStorm"){
	@Override
	public Item getTabIconItem(){
		return new ItemStack(legendSword).getItem();
	}
};

}