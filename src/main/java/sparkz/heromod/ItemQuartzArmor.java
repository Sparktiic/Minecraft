package sparkz.heromod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemQuartzArmor extends ItemArmor {

	public ItemQuartzArmor(ArmorMaterial armorMaterial, int renderIndex_,
			int armorType) {
		super(armorMaterial, renderIndex_, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2){
			return "hero:textures/models/armor/quartz_layer_2.png";
		}
		
		return "hero:textures/models/armor/quartz_layer_1.png";
	}
}